package contractUrl.services;

import contractUrl.data.models.Url;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.RegisterUrlResponse;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;

//@
@SpringBootTest
@Slf4j
class UrlServiceImplTest {
    @Autowired
    private  UrlService urlService;
    private RegisterUrlResponse response;
    @BeforeEach
    void setUp(){
        RegisterUrlRequest request = new RegisterUrlRequest();
        request.setWebsiteUrl("Facebook.com");
        request.setWebsiteName("facebook");
         response = urlService.saveUrl(request);
    }

//    @AfterEach
//    void tearDown(){
//        urlRepository.delete(urlRepository);
//    }
    @Test
    void saveUrl() {

        Optional<Url> foundUrl = urlService.findById(response.getId());
        log.info("found url -->{}", foundUrl.get());

        assertEquals("facebook", foundUrl.get().getWebsiteName());
        assertEquals("Facebook.com", foundUrl.get().getWebsiteUrl());
//        Url savedContact = urlRepository.save(url);
//        assertNotNull(savedContact.getId());
//        MatcherAssert.assertThat(savedContact.getId(),is(notNullValue()));
//        MatcherAssert.assertThat(urlRepository.count(),is(1L));
    }

    @Test
    void getRepository() {
    }

    @Test
    void findContactByContractedUrl() {
    }
}