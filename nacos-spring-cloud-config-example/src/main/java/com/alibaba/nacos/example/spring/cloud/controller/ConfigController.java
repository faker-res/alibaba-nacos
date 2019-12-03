package com.alibaba.nacos.example.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

	@Value("${useLocalCache}")
	private boolean useLocalCache;

	@Value("${server.port}")
	private Integer port;

	@Value("${env}")
	private String env;

	@RequestMapping("/get")
	public boolean get() {
		return useLocalCache;
	}

	@RequestMapping("/getPort")
	public Integer getPort() {
		return port;
	}

	@RequestMapping("/getEnv")
	public String getEnv() {
		return env;
	}

}