package io.lh.bitcoinexplorer0612;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.lh.bitcoinexplorer0612.dao")
public class Bitcoinexplorer0612Application {

    public static void main(String[] args) {
        SpringApplication.run(Bitcoinexplorer0612Application.class, args);
    }

}
