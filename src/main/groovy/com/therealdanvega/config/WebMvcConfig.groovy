package com.therealdanvega.config

import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.orm.hibernate4.support.OpenSessionInViewInterceptor
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@Configuration
class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    SessionFactory sessionFactory

    @Override
    void addInterceptors(InterceptorRegistry registry) {
        OpenSessionInViewInterceptor openSessionInViewInterceptor = new OpenSessionInViewInterceptor()
        openSessionInViewInterceptor.setSessionFactory(sessionFactory)
        registry.addWebRequestInterceptor( openSessionInViewInterceptor )
    }

}
