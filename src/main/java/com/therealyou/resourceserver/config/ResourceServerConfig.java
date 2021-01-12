package com.therealyou.resourceserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
public class ResourceServerConfig {

    @Value(value = "${jwt.secret.key}")
    private String secret;


    @Bean
    public JwtAccessTokenConverter converter(){
        var converter = new JwtAccessTokenConverter();
        converter.setSigningKey(secret);
        return converter;
    }

    @Bean
    public TokenStore tokenStore(){
        return new JwtTokenStore(converter());
    }

}
