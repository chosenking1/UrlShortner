package contractUrl.services;

import contractUrl.data.models.Url;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
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

@DataMongoTest
@Slf4j
class UrlServiceImplTest {
    @Autowired
    UrlRepository urlRepository;
    @Autowired
    private Url url;

    @Autowired
    private  UrlService urlService;
    @BeforeEach
    void setUp(){
        urlService = new UrlServiceImpl();
        RegisterUrlRequest request = new RegisterUrlRequest();
        request.setWebsiteUrl("Facebook.com");
        request.setWebsiteName("facebook");
         urlService.saveUrl(request);
    }

//    @AfterEach
//    void tearDown(){
//        urlRepository.delete(urlRepository);
//    }
    @Test
    void saveUrl() {

        Optional<Url> foundUrl = urlRepository.findById(url.getId());
        log.info("found url -->{}", foundUrl.get());

        assertEquals(foundUrl.get().getWebsiteName(), "test");
        assertEquals(foundUrl.get().getWebsiteUrl(), "test.com");
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