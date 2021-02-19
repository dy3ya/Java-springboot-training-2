package com.bootcamp.springboot.service;

import com.bootcamp.springboot.config.dbConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dbService {

    dbConfig databaseConfig;

    @Autowired
    public dbService(dbConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    public String getDatabaseConnection() {
        // implementation
        return "conn";
    }

    public dbConfig getDatabaseConfig() {
        return this.databaseConfig;
    }


}
