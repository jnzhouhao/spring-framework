package com.candy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zh0809
 * @date 2021/1/8 13:47
 **/
public class Test {

	public static void main(String[] args) {
		System.out.println("注入配置类方式：");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = context.getBean(TestService.class);
		testService.test();

		System.out.println("========================================");

		System.out.println("注入包路径方式：");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("com.candy");
		TestService testService1 = (TestService) context1.getBean("testService");
		testService1.test();
	}
}
