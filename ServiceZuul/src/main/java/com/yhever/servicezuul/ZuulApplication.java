package com.yhever.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
public class ZuulApplication 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(	 ZuulApplication.class, args);
    }
}
