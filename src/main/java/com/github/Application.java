package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient  // springcloud 客户端
public class Application {

    /**
     * 说明： spring-cloud-config-client的配置文件为bootstrap.properties ， 配置如何获取配置信息
     *
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

