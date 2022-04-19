package contractUrl.services;

import contractUrl.data.models.SaveUrl;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;
import contractUrl.util.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlRepository urlRepository;

    @Override
    public RegisterUrlResponse saveUrl(RegisterUrlRequest request) {
        SaveUrl url = ModelMapper.map(request);
        SaveUrl url1 = urlRepository.save(url);
        return ModelMapper.map(url1);
    }

    @Override
    public UrlRepository getRepository() {
        return null;
    }

    @Override
    public List<FindUrlResponse> findContactByContractedUrl(String contractedUrl) {
        return null;
    }
}