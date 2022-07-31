package com.lloydsbank.stubs;

import java.io.Serializable;
import javax.annotation.Generated;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Generated("jsonschema2pojo")
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Location implements Serializable
{

private PostalAddress postalAddress;
private final static long serialVersionUID = 1616054984622865807L;

public PostalAddress getPostalAddress() {
return postalAddress;
}

public void setPostalAddress(PostalAddress postalAddress) {
this.postalAddress = postalAddress;
}

}