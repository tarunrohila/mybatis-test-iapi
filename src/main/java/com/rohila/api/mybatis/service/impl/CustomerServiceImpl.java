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

package com.rohila.api.mybatis.service.impl;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import com.rohila.api.mybatis.dao.CustomerDao;
import com.rohila.api.mybatis.domain.Customer;
import com.rohila.api.mybatis.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 17-07-2023 18:06
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /**
     * Logger declaration
     */
    private static final Logger LOGGER = LogManager.getLogger(CustomerServiceImpl.class);


    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/
    @Autowired
    private CustomerDao customerDao;
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: CONSTRUCTION ---------------------------------------*/
    /* @@_END: CONSTRUCTION -----------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/
    /**
     * @param id
     * @return
     */
    @Override
    public Customer getCustomer(Long id) {
        return customerDao.getCustomer(id);
    }
    /* @@_END: METHODS ----------------------------------------------*/

    /* @@_BEGIN: GETTERS --------------------------------------------*/
    /* @@_END: GETTERS ----------------------------------------------*/

    /* @@_BEGIN: SETTERS --------------------------------------------*/
    /* @@_END: SETTERS ----------------------------------------------*/
} // CustomerService
/* @@_END: CLASS DEFINITION --------------------------------------*/