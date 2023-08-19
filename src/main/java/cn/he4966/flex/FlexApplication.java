package cn.he4966.flex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.he4966.test.mapper")
public class FlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexApplication.class, args);
    }

}
