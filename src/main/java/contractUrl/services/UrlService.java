package contractUrl.services;

import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;

import java.util.List;

public interface UrlService {
    RegisterUrlResponse saveUrl(RegisterUrlRequest request);

    UrlRepository getRepository();


    List<FindUrlResponse> findUrlByContractedUrl(String contractedUrl);


//    RegisterUrlResponse deleteContact(String name, String mobile);
}
