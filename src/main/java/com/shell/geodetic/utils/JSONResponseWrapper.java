package com.shell.geodetic.utils;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.shell.geodetic.response.SuccessResponse;

@ControllerAdvice
public class JSONResponseWrapper implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		ServletServerHttpResponse res = (ServletServerHttpResponse) response;
		int httpStatusCode = res.getServletResponse().getStatus();

		if (httpStatusCode == 200 | httpStatusCode == 201) {
			return new SuccessResponse<>(httpStatusCode, body);
		}

		return body;
	}

}
