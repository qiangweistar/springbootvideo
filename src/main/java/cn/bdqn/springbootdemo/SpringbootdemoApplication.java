package cn.bdqn.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("cn.bdqn.springbootdemo.dao")
public class SpringbootdemoApplication extends SpringBootServletInitializer{
    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }
    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootdemoApplication.class);
    }

}
