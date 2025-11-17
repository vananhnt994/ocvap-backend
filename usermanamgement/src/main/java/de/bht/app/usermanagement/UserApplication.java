package de.bht.app.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude={WebMvcAutoConfiguration.class},scanBasePackages = "de.bht.app.usermanagement")
@CrossOrigin(origins = "http://localhost:3000")
@EnableAspectJAutoProxy
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
