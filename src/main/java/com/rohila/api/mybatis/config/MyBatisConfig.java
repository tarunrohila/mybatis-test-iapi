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
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.Properties;
/* @@_END: IMPORTS -----------------------------------------------*/

/* @@_BEGIN: CLASS DEFINITION ------------------------------------*/


/**
 * Class which is used to
 *
 * @author Tarun Rohila
 * @version 1.0
 * @since 13-07-2023 20:14
 */
@Configuration
@ConditionalOnProperty(name = "app.mybatis.sessionfactory.enabled", havingValue = "true")
public class MyBatisConfig {

    /* @@_BEGIN: LOGGING --------------------------------------------*/
    /**
     * Logger declaration
     */
    private static final Logger LOGGER = LogManager.getLogger(MyBatisConfig.class);
    /* @@_END: LOGGING ----------------------------------------------*/

    /* @@_BEGIN: STATIC ---------------------------------------------*/
    /* @@_END: STATIC -----------------------------------------------*/

    /* @@_BEGIN: MEMBERS --------------------------------------------*/

    /**
     *
     * Method which is used to
     * @param config - config
     * @param configProperties - configProperties
     * @param sqlDialect - sqlDialect
     * @param dataSource - dataSource
     * @param plugins - plugins
     * @return SqlSessionFactory
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory allocateSqlSessionFactory(
            final @Value("${app.mybatis.config}") Resource config,
            final @Value("${app.mybatis.configProperties:{}}") Properties configProperties,
            final @Value("${app.mybatis.sqlDialect}") String sqlDialect,
            final DataSource dataSource,
            final Interceptor[] plugins
            ) throws Exception {
        configProperties.setProperty("sqlDialect", sqlDialect);
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setConfigurationProperties(configProperties);
        factoryBean.setConfigLocation(config);
        factoryBean.setDataSource(dataSource);
        factoryBean.setPlugins(plugins);
        return factoryBean.getObject();
    }

    /**
     *
     * Method which is used to
     * @param sqlSessionFactory - sqlSessionFactory
     * @return SqlSessionTemplate
     */
    @Bean
    public SqlSessionTemplate allocateSqlSessionTemplate(final SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
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
} // MyBatisConfig
/* @@_END: CLASS DEFINITION --------------------------------------*/