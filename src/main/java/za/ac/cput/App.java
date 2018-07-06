package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        return "Docker Issues now Fixed See Readme file ";
    }


    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
