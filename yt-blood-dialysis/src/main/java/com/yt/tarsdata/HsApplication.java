package com.yt.tarsdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;




@SpringBootApplication

@MapperScan("com.hs.mapper")

public class HsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsApplication.class, args);
	}
	
	protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(HsApplication.class);
    }

}
