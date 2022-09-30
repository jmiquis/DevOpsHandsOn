package es.upm.miw.iwvg_devops;

import es.upm.miw.iwvg_devops.code.Searches;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import java.util.stream.Stream;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not API: /error
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);// mvnw clean spring-boot:run
       Stream<Integer> sample = new Searches().findFractionNumeratorByUserFamilyName("Torres");
        System.out.println("Result");
       sample.forEach(item->System.out.println(item));
        
    }
}
