package com.rishu.assignment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatResult {

	public String id;
	public String url;
	
	@Override
	public String toString() {
		return "CatResult [id=" + id + ", url=" + url + "]";
	}
	
}
