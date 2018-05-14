package com.shell.geodetic.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class SuccessResponse<T> {
	@JsonProperty
	private int status;
	@JsonProperty
	private String message = null;
	@JsonProperty		
	private final T data;		

	public SuccessResponse(int status,T data) {
		this.status = status;
		this.data = data;
	}
}