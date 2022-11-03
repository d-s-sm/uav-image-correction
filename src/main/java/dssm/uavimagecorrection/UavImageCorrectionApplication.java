package dssm.uavimagecorrection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class UavImageCorrectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(UavImageCorrectionApplication.class, args);
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
