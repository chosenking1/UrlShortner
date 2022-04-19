package contractUrl;

import contractUrl.data.models.SaveUrl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {

    public static void main(String[]args){
                SaveUrl url = new SaveUrl();
        SpringApplication.run(Main.class, args);
    }
}
