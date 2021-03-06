package com.thoughtworks.training.banking;

import com.thoughtworks.training.banking.accounts.AccountStorage;
import com.thoughtworks.training.banking.accounts.AccountStorageFactory;
import com.thoughtworks.training.banking.common.IdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public IdGenerator getAtomicLong() {
    return new IdGenerator();
  }

  @Bean
  public AccountStorage getAccountStorage() {
    return new AccountStorageFactory().generate();
  }

}
