package com.lloydsbank.stubs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Brand {
	private String brandName;
	@JsonAlias("ATM")
	private List<ATM> atm = null;
	private final static long serialVersionUID = 3947865811378511512L;

	public String getBrandName() {
	return brandName;
	}

	public void setBrandName(String brandName) {
	this.brandName = brandName;
	}

	public List<ATM> getAtm() {
	return atm;
	}

	public void setAtm(List<ATM> atm) {
	this.atm = atm;
	}
}
