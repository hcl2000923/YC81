package com.yc.C81S3PHclblog;   
   


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.C81S3PHclblog.dao")
public class C81S3PHclBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(C81S3PHclBlogApplication.class, args);
	}

}
