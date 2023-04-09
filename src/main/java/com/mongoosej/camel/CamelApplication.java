/**
 * ==============================================================================
 * PROJECT caml-xml-test
 * PACKAGE com.mongoosej.camel
 * FILE CamelApplication.java
 * AUTHOR KSEC.TIMMS.WCS
 * CREATE 2023-04-09
 * ==============================================================================
 * Copyright (C) 2023
 * KSEC Intelligent Technology Co.,Ltd.
 * 昆船智能技术股份有限公司
 * ==============================================================================
 * THIS PROGRAM AND THE ACCOMPANYING MATERIALS ARE PROPERTIES OF KSEC.
 * ALL RIGHTS RESERVED.
 * ==============================================================================
 */
package com.mongoosej.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author KiMoJar
 * @date   2023-04-09
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring-camel.xml"})
public class CamelApplication {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(CamelApplication.class);
		app.setBannerMode(Mode.OFF);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}
	
}
