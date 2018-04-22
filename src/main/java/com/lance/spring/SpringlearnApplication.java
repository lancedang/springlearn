package com.lance.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringlearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringlearnApplication.class, args);

		//MyApp2 app = (MyApp2)applicationContext.getBean("myApp2");
		//MyApp app = new MyApp();
		//app.testIntercept();
	}
}
