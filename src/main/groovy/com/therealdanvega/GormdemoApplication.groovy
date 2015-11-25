package com.therealdanvega

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.transaction.annotation.EnableTransactionManagement

@SpringBootApplication
@EnableTransactionManagement
class GormdemoApplication {

    static void main(String[] args) {
        SpringApplication.run GormdemoApplication, args
    }
}
