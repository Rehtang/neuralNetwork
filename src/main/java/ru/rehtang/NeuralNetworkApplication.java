package ru.rehtang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NeuralNetworkApplication {
  public static void main(String[] args) {
      SpringApplication.run(NeuralNetworkApplication.class, args);
  }
}
