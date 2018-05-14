package com.shell.geodetic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.shell.geodetic.service.ConversionService;
import com.shell.geodetic.utils.RestClient;

@Service
public class BlueMarbleConversionService implements ConversionService{

	@Autowired
	private RestClient restClient;
	
	@Value("${bluemarble.url}")
	private String URL;

	@Override
	public void convertCRS() {
		restClient.post(URL+"/rest/ConvertPoints",null);
	}
	
	
}
