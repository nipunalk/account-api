package com.igreendata.accountapi.config;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
//test
public class Configuration {
	 private static final Logger log = LoggerFactory.getLogger(Configuration.class);

	@Bean
	public ModelMapper modelMapper() {
		log.debug("starting modele mapper bean");
		return new ModelMapper();
	}

}
