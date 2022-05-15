package contractUrl.data.repositories;

import contractUrl.data.models.SaveUrl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class UrlRepositoryTest {

    @Autowired
    UrlRepository urlRepository;
    private SaveUrl url;
    @BeforeEach
    void setUp(){
        url = new SaveUrl();
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
       Optional<SaveUrl> foundUrl = urlRepository.findById(url.getId());
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