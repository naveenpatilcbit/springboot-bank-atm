package com.lloydsbank.stubs;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Generated("jsonschema2pojo")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class PostalAddress implements Serializable
{

private List<String> addressLine = null;
private String streetName;
private String townName;
private List<String> countrySubDivision = null;
private String country;
private String postCode;
private final static long serialVersionUID = -1207406849460007057L;

public List<String> getAddressLine() {
return addressLine;
}

public void setAddressLine(List<String> addressLine) {
this.addressLine = addressLine;
}

public String getStreetName() {
return streetName;
}

public void setStreetName(String streetName) {
this.streetName = streetName;
}

public String getTownName() {
return townName;
}

public void setTownName(String townName) {
this.townName = townName;
}

public List<String> getCountrySubDivision() {
return countrySubDivision;
}

public void setCountrySubDivision(List<String> countrySubDivision) {
this.countrySubDivision = countrySubDivision;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getPostCode() {
return postCode;
}

public void setPostCode(String postCode) {
this.postCode = postCode;
}

}