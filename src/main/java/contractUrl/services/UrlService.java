package contractUrl.services;

import contractUrl.data.models.Url;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UrlService {
    RegisterUrlResponse saveUrl(RegisterUrlRequest request);

    UrlRepository getRepository();


    List<FindUrlResponse> findUrlByContractedUrl(String contractedUrl);

    Optional<Url> findById(String id);


//    RegisterUrlResponse deleteContact(String name, String mobile);
}
