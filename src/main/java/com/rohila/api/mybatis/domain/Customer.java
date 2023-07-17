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

package com.rohila.api.mybatis.domain;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 13-07-2023 20:29
 */
@Alias("Customer")
@Data
@Builder
@AllArgsConstructor
public class Customer {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /**
     * Logger declaration
     */
    private static final Logger LOGGER = LogManager.getLogger(Customer.class);
    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/
    private Long id;
    private String name;
    private String active;
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: CONSTRUCTION ---------------------------------------*/
    /* @@_END: CONSTRUCTION -----------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/
    /* @@_END: METHODS ----------------------------------------------*/

    /* @@_BEGIN: GETTERS --------------------------------------------*/
    /* @@_END: GETTERS ----------------------------------------------*/

    /* @@_BEGIN: SETTERS --------------------------------------------*/
    /* @@_END: SETTERS ----------------------------------------------*/
} // Test
/* @@_END: CLASS DEFINITION --------------------------------------*/