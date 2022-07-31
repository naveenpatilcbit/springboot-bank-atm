package com.lloydsbank.stubs;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Meta {
	private String lastUpdated;
	private Long totalResults;
	private String agreement;
	private String license;
	private String termsOfUse;
	private final static long serialVersionUID = -5725469747020616255L;

	public String getLastUpdated() {
	return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
	this.lastUpdated = lastUpdated;
	}

	public Long getTotalResults() {
	return totalResults;
	}

	public void setTotalResults(Long totalResults) {
	this.totalResults = totalResults;
	}

	public String getAgreement() {
	return agreement;
	}

	public void setAgreement(String agreement) {
	this.agreement = agreement;
	}

	public String getLicense() {
	return license;
	}

	public void setLicense(String license) {
	this.license = license;
	}

	public String getTermsOfUse() {
	return termsOfUse;
	}

	public void setTermsOfUse(String termsOfUse) {
	this.termsOfUse = termsOfUse;
	}
}
