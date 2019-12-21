package com.thanhhnguyen23.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Web app initializes configurations
 *      - retrieves root app config (AppConfig.java)
 *      - retrieves web servlet config (WebConfig.java)
 *      - retrieves servlet URI
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer { // TODO -- explore internals
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
