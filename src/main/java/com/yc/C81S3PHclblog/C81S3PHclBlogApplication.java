package com.yc.C81S3PHclblog;   
   


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.yc.C81S3PHclblog.web.LoginInterceptor;

@SpringBootApplication
@MapperScan("com.yc.C81S3PHclblog.dao")
//SpringMVC 配置拦截器( SpringBoot 工程)
public class C81S3PHclBlogApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(C81S3PHclBlogApplication.class, args);
	}
	/**
	 * 注册拦截器的方法,  WebMvcConfigurer提供
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器地址要以 / 开头
		 */
		registry.addInterceptor(new LoginInterceptor())
				.addPathPatterns("/toAddArticle","/addArticle");
	}


}
