package com.scoremg;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.scoremg"})
@EnableTransactionManagement //事务
@EnableScheduling //定时任务
@EnableAsync //异步调用
@MapperScan(basePackages = {"com.scoremg.mappers"})
public class ScoremgApplication {
    private static Logger log = LoggerFactory.getLogger(ScoremgApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ScoremgApplication.class, args);
        log.info("服务启动成功，可以愉快的开始开发了");
    }

}
