package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.config.JwtAuthenticationFilter;

@MapperScan("com.dao")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);// 实现调用1，不需要部署tomcat,直接run
	}

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
		registrationBean.setFilter(filter);
		return registrationBean;
	}

}
