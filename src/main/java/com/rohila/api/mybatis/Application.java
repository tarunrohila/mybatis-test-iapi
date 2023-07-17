/*
 * Copyright (c) 2023-present Tech Rohila, All Rights Reserved.
 *
 * This code is confidential to Rohila Technologies and shall not be disclosed
 * outside the organisation without the prior written permission of the IT Director of
 * the organisation.
 *
 * In the event that such disclosure is permitted the code shall not be copied
 * or disclosed other than a need-to-know basis and any recipients may be
 * required to sign a confidentiality undertaking in favour of Tech Rohila
 */

package com.rohila.api.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.rohila.api.mybatis.mapper")
public class Application {

	/**
	 *
	 * Method which is used to
	 * @param args - args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
