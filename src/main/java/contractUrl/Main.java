package contractUrl;

import contractUrl.data.models.Url;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {

    public static void main(String[]args){
                Url url = new Url();
        SpringApplication.run(Main.class, args);
    }
}
