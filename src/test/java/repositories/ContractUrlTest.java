package repositories;

import contractUrl.data.models.SaveUrl;
import contractUrl.data.repositories.UrlRepository;
import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataMongoTest

public class ContractUrlTest {


    private UrlRepository repository;



    @Test
    public void saveContactTest(){
        SaveUrl details = new SaveUrl();
        details.setWebsiteUrl("WWW.facebook.com");
        details.setWebsiteName("Facebook");


        SaveUrl savedDetails = repository.save(details);
        assertNotNull(savedDetails.getId());
        assertThat(savedDetails.getId(),is(notNullValue()));
        assertThat(String.valueOf(repository.count()),is(1L));
        assertEquals(1,repository.count());

    }
    private void assertThat(String id, ElementMatcher.Junction<Object> objectJunction) {
    }



    @Test
    void findContactByFirstName() {
    }

    @Test
    void findContactByLastName() {
    }

}