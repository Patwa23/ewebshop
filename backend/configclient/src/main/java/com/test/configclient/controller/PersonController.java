package com.test.configclient.controller;

import com.test.configclient.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.Cipher;

@RestController
@RefreshScope
@EnableOAuth2Sso
public class PersonController {

    @Value("${name}")
    String name;

    @Value("${year}")
    String year;

    @Value("${starttime}")
    String starttime;

    @Value("${endtime}")
    String endtime;

    @Value("${connstring}")
    String connstring;

    @Autowired
    private OAuth2ClientContext clientContext;

    @GetMapping("/person")
    public Person getPerson() throws Exception{
        Person p=new Person(name,year,starttime,endtime,connstring);
        // To test whether Cipher has been install successfully
        // int maxKeyLen = Cipher.getMaxAllowedKeyLength("AES");
        // System.out.println(maxKeyLen);
        return p;
    }

    @RequestMapping("/hello")
    public String hello(OAuth2Authentication authentication) {
        return "hello:" + authentication.getName();
    }

    @RequestMapping("/details")
    public Object details(OAuth2Authentication authentication) {
        return authentication.getUserAuthentication();
    }

    @RequestMapping("/token")
    public String getToken() {
        OAuth2AccessToken t= clientContext.getAccessToken();
        return t.getValue();
    }



}
