package contractUrl.data.repositories;

import contractUrl.data.models.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UrlRepository extends MongoRepository<Url,String> {
    Optional<Url> findByContractedUrl(String contractedUrl);
    List<Url> findContactByIdAndContractedUrl(String id, String contactedUrl);
}