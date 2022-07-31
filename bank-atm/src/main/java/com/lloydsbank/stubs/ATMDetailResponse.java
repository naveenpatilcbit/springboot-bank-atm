package com.lloydsbank.stubs;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Generated("jsonschema2pojo")
@JsonIgnoreProperties
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class ATMDetailResponse implements Serializable
{
 
	@JsonAlias("meta")
private Meta meta;
	@JsonAlias("data")
private List<Data> data = null;
private final static long serialVersionUID = 4257481850954502303L;

public Meta getMeta() {
return meta;
}

public void setMeta(Meta meta) {
this.meta = meta;
}

public List<Data> getData() {
	return data;
}

public void setData(List<Data> data) {
	this.data = data;
}

}
