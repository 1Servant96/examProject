package com.peaksoft.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServlet extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[0];
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{WebAppConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }
    }

