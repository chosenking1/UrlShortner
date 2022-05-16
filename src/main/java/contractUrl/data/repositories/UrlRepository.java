package contractUrl.data.repositories;

import contractUrl.data.models.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends MongoRepository<Url,String> {
    List<Url> findContactByContractedUrl(String contactedUrl);
    List<Url> findContactByIdAndContractedUrl(String id, String contactedUrl);
}