package training.adv.team.GFINet.team5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(value = {"training.adv.team.GFINet.team5"})
@EntityScan("training.adv.team.GFINet.team5.model")
public class Application {

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}