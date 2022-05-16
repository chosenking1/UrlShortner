package contractUrl.data.repositories;

import contractUrl.data.models.Url;
import contractUrl.services.UrlService;
import contractUrl.services.UrlServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
@DataMongoTest
@Slf4j
class UrlRepositoryTest {

    @Autowired
    UrlRepository urlRepository;
    private Url url;
    @BeforeEach
    void setUp(){
        url = new Url();
        url.setWebsiteUrl("test.com");
        url.setWebsiteName("test");

        url = urlRepository.save(url);
    }

    @AfterEach
    void tearDown(){
        urlRepository.delete(url);
    }

    @Test
    void findSiteBySiteIdTest() {
       Optional<Url> foundUrl = urlRepository.findById(url.getId());
       log.info("found url -->{}", foundUrl.get());

       assertEquals(foundUrl.get().getWebsiteName(), "test");
       assertEquals(foundUrl.get().getWebsiteUrl(), "test.com");
    }

    @Test
    void findContactByContractedUrl() {
    }

    @Test
    void findContactBySiteIdAndContractedUrl() {
    }
}