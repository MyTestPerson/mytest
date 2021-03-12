package com.mytest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletRegistration;


public final class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected final Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected final Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { Config.class };
    }

    @Override
    protected final String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    public void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");
    }

}
