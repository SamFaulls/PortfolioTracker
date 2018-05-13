import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main Spring Boot Application entry point for the Account Service
 *
 * This service application provides functionality for the administration and retrieval of account information
 */
@SpringBootApplication
public class AccountServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(AccountServiceApplication.class, args);
    }
}
