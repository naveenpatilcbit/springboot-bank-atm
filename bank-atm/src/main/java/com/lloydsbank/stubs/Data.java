package com.lloydsbank.stubs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Data {

	@JsonAlias("Brand")
private List<Brand> brand = null;
private final static long serialVersionUID = 2609808851107022106L;

public List<Brand> getBrand() {
return brand;
}

public void setBrand(List<Brand> brand) {
this.brand = brand;
}
}
