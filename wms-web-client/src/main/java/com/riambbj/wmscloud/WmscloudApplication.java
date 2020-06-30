package com.riambbj.wmscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class WmscloudApplication extends ServletInitializer {

//    20200629 加此段重新，解决tomcat404问题
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder WmscloudApplication){
         return WmscloudApplication.sources(WmscloudApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WmscloudApplication.class, args);
    }

}
