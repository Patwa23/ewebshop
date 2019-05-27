package com.test.configclient.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@Configuration
@Order(200)
public class SecurityConfiguration extends  WebSecurityConfigurerAdapter  {

   @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
            .authorizeRequests()
                .antMatchers("/","/login**")
                .permitAll()
            .anyRequest()
                .authenticated();
    }

}
