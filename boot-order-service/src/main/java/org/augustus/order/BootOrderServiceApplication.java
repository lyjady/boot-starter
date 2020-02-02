package org.augustus.order;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootOrderServiceApplication.class, args);
	}

}
