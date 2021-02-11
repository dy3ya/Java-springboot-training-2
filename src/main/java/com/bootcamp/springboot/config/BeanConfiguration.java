package com.bootcamp.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.bootcamp.springboot.service.todoService;

@Component
public class BeanConfiguration {

    @Bean
    public ServerConfig getServerConfig(){
        return new ServerConfig();
    }
    @Bean
    public todoService getTodoService(){

        return new todoService();
    }
}
