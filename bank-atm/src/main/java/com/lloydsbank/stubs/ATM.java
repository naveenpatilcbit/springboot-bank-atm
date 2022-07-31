
package com.lloydsbank.stubs;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Generated("jsonschema2pojo")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ATM implements Serializable
{

private String identification;
private List<String> supportedCurrencies = null;
private Location location;
private final static long serialVersionUID = 8291292699395175729L;

public String getIdentification() {
return identification;
}

public void setIdentification(String identification) {
this.identification = identification;
}

public List<String> getSupportedCurrencies() {
return supportedCurrencies;
}

public void setSupportedCurrencies(List<String> supportedCurrencies) {
this.supportedCurrencies = supportedCurrencies;
}

public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

}