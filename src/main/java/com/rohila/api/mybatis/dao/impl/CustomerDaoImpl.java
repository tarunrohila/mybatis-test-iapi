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

package com.rohila.api.mybatis.dao.impl;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import com.rohila.api.mybatis.dao.CustomerDao;
import com.rohila.api.mybatis.domain.Customer;
import com.rohila.api.mybatis.mapper.CustomerMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 17-07-2023 18:07
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /**
     * Logger declaration
     */
    private static final Logger LOGGER = LogManager.getLogger(CustomerDaoImpl.class);


    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/

    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private CustomerMapper customerMapper;
    /* @@_END: MEMBERS ----------------------------------------------*/

    /* @@_BEGIN: CONSTRUCTION ---------------------------------------*/
    /* @@_END: CONSTRUCTION -----------------------------------------*/

    /* @@_BEGIN: PROPERTIES -----------------------------------------*/
    /* @@_END: PROPERTIES -------------------------------------------*/

    /* @@_BEGIN: METHODS --------------------------------------------*/
    /**
     * Method which is used to
     * @param id
     * @return Customer
     */
    @Override
    public Customer getCustomer(Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return customerMapper.getCustomerById(id);
    }
    /* @@_END: METHODS ----------------------------------------------*/

    /* @@_BEGIN: GETTERS --------------------------------------------*/
    /* @@_END: GETTERS ----------------------------------------------*/

    /* @@_BEGIN: SETTERS --------------------------------------------*/
    /* @@_END: SETTERS ----------------------------------------------*/
} // CustomerDaoImpl
/* @@_END: CLASS DEFINITION --------------------------------------*/