import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController - Spring assumes this as REST Style Service.
// It is a convenience annotation which is annotated with @Controller and @ResponseBody
@RestController
// Let the SpringBoot assume the Configurations.
@EnableAutoConfiguration
public class MicroServiceController {

    // RequestMapping - Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures
    @RequestMapping("/")
    String getMainHome(){
        return "MicroService Example achieved";
    }

    public static void main(String[] args) throws Exception {
        // This command will start the auto-configured Tomcat web server.
        SpringApplication.run(MicroServiceController.class, args);
    }

}
