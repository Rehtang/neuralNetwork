package ru.rehtang;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.rehtang.service.NeuralService;

import javax.annotation.PostConstruct;
import java.io.IOException;

@EnableFeignClients
@SpringBootApplication
@RequiredArgsConstructor
public class NeuralNetworkApplication {
    private final NeuralService service;

    @PostConstruct
    public void test() throws IOException {
        service.savePhoto("sad");
    }



    public static void main(String[] args) {
      SpringApplication.run(NeuralNetworkApplication.class, args);

  }
}
