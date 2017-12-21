package com.dsp.spring.restmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author psubrama
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.dsp.spring.restmvc"})
public class WebConfig extends WebMvcConfigurerAdapter {
    
}
