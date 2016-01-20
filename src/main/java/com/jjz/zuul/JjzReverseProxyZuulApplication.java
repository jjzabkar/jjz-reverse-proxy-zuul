package com.jjz.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class JjzReverseProxyZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(JjzReverseProxyZuulApplication.class, args);
	}
}
