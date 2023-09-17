package com.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Configuration
public class BeanBag {
@Bean
    public List<User> getDataSource1(){
        return new ArrayList<>();
    }
}
