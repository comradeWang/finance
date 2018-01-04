package com.team.finance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
* @author: WangXinYu
* @param:
* @describe:
* @create: 2017/12/26 0026 14:01
**/
@SpringBootApplication
@MapperScan("com.team.finance.*.dao")
public class FinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
	}
}
