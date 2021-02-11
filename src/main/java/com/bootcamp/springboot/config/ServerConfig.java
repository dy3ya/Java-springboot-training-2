package com.bootcamp.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@ConfigurationProperties("server")

public class ServerConfig {

    public String server;
    public String port;


    public void setServer(){
        this.server = server;
    }
    public String getServer(){
        return server;
    }
    public void setPort(){
        this.port = port;
    }
    public String getPort(){
        return port;
    }

    @Profile("profileOne")
    @Bean
    public void profileOneConnection(){
        System.out.println(this.server);
        System.out.println(this.port);
    }
    @Profile("profileTwo")
    @Bean
    public void profileTwoConnection(){
        System.out.println(this.server);
        System.out.println(this.port);
    }

}
