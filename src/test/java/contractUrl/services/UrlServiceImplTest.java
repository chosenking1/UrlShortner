package contractUrl.services;

import contractUrl.data.models.Url;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UrlServiceImplTest {
//    @Autowired
//    UrlRepository urlRepository;
//    private Url url;
//
//    @Autowired
//    private  UrlService urlService;
//    @BeforeEach
//    void setUp(){
//        urlService = new UrlServiceImpl();
//        RegisterUrlRequest request = new RegisterUrlRequest();
//        request.setWebsiteUrl("Facebook.com");
//        request.setWebsiteName("facebook");
////        String name = "facebook")
////        urlService.set("test.com");
////        url.setWebsiteName("test");
//        Url url = urlService.saveUrl(request);
//         urlRepository.save(url);
//    }

//    @AfterEach
//    void tearDown(){
//        urlRepository.delete(urlRepository);
//    }
    @Test
    void saveUrl() {

//        Optional<Url> foundUrl = urlRepository.findById(url.getId());
//        log.info("found url -->{}", foundUrl.get());
//
//        assertEquals(foundUrl.get().getWebsiteName(), "test");
//        assertEquals(foundUrl.get().getWebsiteUrl(), "test.com");
    }

    @Test
    void getRepository() {
    }

    @Test
    void findContactByContractedUrl() {
    }
}