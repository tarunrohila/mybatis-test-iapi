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

package com.rohila.api.mybatis.config;
/* @@_BEGIN: IMPORTS ---------------------------------------------*/

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/

/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 17-07-2023 20:52
 */
@Configuration
//@EnableCaching
public class CacheConfig {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /**
     * Logger declaration
     */
    private static final Logger LOGGER = LogManager.getLogger(CacheConfig.class);
    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("getCustomer");
    }
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
} // CacheConfig
/* @@_END: CLASS DEFINITION --------------------------------------*/