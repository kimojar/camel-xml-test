/**
 * ==============================================================================
 * PROJECT caml-xml-test
 * PACKAGE com.mongoosej.camel.config
 * FILE TestConfiguration.java
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
package com.mongoosej.camel.config;

import javax.jms.TextMessage;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.jms.JmsMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author KiMoJar
 * @date 2023-04-09
 */
@Configuration
public class TestConfiguration {
	
	@Bean
	public Processor testActiveMQProcessor() {
		return new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				JmsMessage message = exchange.getIn(JmsMessage.class);
				TextMessage textJMS = (TextMessage) message.getJmsMessage();
				System.out.println(textJMS.getText());
			}
		};
	}
}
