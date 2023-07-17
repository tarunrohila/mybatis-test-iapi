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

package com.rohila.api.mybatis.mapper;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: INTERFACE DEFINITION --------------------------------*/

import com.rohila.api.mybatis.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Interface which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 13-07-2023 20:49
 */
public interface CustomerMapper {

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/

    /**
     *
     * Method which is used to
     * @param params - params
     * @return Customer
     */
    Customer getCustomerById(@Param("params") Map params);
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/
    /* @@_END: METHODS ----------------------------------------------*/
} // TestMapper
/* @@_END: INTERFACE DEFINITION ----------------------------------*/
