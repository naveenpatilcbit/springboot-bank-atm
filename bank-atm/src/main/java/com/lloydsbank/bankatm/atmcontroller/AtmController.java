package com.lloydsbank.bankatm.atmcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lloydsbank.stubs.ATM;
import com.lloydsbank.stubs.ATMDetailResponse;
import com.lloydsbank.stubs.Brand;
import com.lloydsbank.stubs.Data;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController

@Api(produces = "application/json", value = "Operations Pertaining to Bank-ATMß")
public class AtmController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/atm/{Identification}")
	 @ApiOperation(value = "Fetches Bank ATM information by matching the identification")
   @ApiResponses(value = {@ApiResponse(code = 200, message = "Found matching atm information ")})
   
	public ResponseEntity<List<ATM>> getAtmDetails(@PathVariable("Identification") String identifier) {
		return ResponseEntity.ok().body(getAllAtmDetails(identifier));

	}

	private List<ATM> getAllAtmDetails(String identification) {

		ResponseEntity<ATMDetailResponse> response = restTemplate
				.getForEntity("https://api.lloydsbank.com/open-banking/v2.2/atms", ATMDetailResponse.class);
		System.out.println(response.getBody());

		List<ATM> filteredAtmsList = new ArrayList<>();
		List<Data> dataList = response.getBody().getData();
		for (Data data : dataList) {
			List<Brand> brands = data.getBrand();
			if (brands != null && brands.size() > 0) {
				for (Brand brand : brands) {
					filteredAtmsList.addAll(brand.getAtm().stream()
							.filter(atm -> atm.getIdentification().equalsIgnoreCase(identification))
							.collect(Collectors.toList()));

				}
			}
		}

		return filteredAtmsList;
	}
}
