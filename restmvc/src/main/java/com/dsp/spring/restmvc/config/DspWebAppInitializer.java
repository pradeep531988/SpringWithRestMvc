package com.dsp.spring.restmvc.config;

/**
 * 
 * @author psubrama
 *
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DspWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    
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
        return new String[] {"/"};
    }
    // Create a DspWebAppInitializer class, which will replace our traditional web.xml, to initialize the Servlet container.
    
}
