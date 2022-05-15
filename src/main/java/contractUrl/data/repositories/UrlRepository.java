package contractUrl.data.repositories;

import contractUrl.data.models.SaveUrl;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends MongoRepository<SaveUrl,String> {
    List<SaveUrl> findContactByContractedUrl(String contactedUrl);
    List<SaveUrl> findContactBySiteIdAndContractedUrl(String siteId, String contactedUrl);
}