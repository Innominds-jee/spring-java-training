package com.innominds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.innominds.conditional.WindowsMailCondition;
import com.innominds.conditional.WindowMailServiceImpl;

@Configuration
public class AdvancedConfiguration {

    @Bean
    @Conditional(WindowsMailCondition.class)
    public WindowMailServiceImpl studentService() {
        return new WindowMailServiceImpl();
    }
}
