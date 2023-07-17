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

package com.rohila.api.mybatis.dao;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: INTERFACE DEFINITION --------------------------------*/

import com.rohila.api.mybatis.domain.Customer;

/**
 * Interface which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 17-07-2023 18:07
 */
public interface CustomerDao {


    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/

    /**
     * @param id
     * Method which is used to
     * @return Customer
     */
    Customer getCustomer(Long id);
    /* @@_END: METHODS ----------------------------------------------*/
} // CustomerDao
/* @@_END: INTERFACE DEFINITION ----------------------------------*/
