package contractUrl.services;

import contractUrl.data.models.Url;
import contractUrl.data.repositories.UrlRepository;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;
import contractUrl.util.ModelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlRepository urlRepository;

    @Override
    public RegisterUrlResponse saveUrl(RegisterUrlRequest request) {
    if (request.getContractedUrl() == null){
        request.setContractedUrl(contractedUrlGenerator());}
       Url url = ModelMapper.map(request);

        Url savedUrl = urlRepository.save(url);
        return ModelMapper.map(savedUrl);
    }


    @Override
    public List<FindUrlResponse> findUrlByContractedUrl(String contractedUrl) {
//        Optional<Url> urls = urlRepository.findByContractedUrl(contractedUrl);
//        if (urls.isEmpty()) throw new IllegalArgumentException(contractedUrl + "not found");
//        List<FindUrlResponse> responses = new ArrayList<>();
//
//        urls.forEach(site -> {
//            responses.add(new FindUrlResponse(site));
//        });
        return null;

    }

    @Override
    public Optional<Url> findById(String id) {
        log.info("repo is-->{}", urlRepository);
        Optional<Url> foundUrl = urlRepository.findById(id);
        log.info("found url-->{}", foundUrl.get());
        return foundUrl;
    }

    @Override
    public UrlRepository getRepository() {
        return urlRepository;
    }

    private String contractedUrlGenerator() {
        Random random = new Random();

        SecureRandom random2 = new SecureRandom();

        for (int i = 0; i < 6; i++) {

            int alphabet = random.nextInt(26) + 97;
            int number = random.nextInt(10);

            switch (1 + random2.nextInt(2)) {
                case 1 -> setContractedUrl((char) alphabet);
                case 2 -> setContractedUrl(number);
            }
        }
        return contractedUrl;
    }
    private String contractedUrl;
    private void setContractedUrl(char alphabet) {
        contractedUrl += alphabet;
    }
    private void setContractedUrl(int number) {
    contractedUrl += number;
    }






}