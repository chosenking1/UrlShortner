package contractUrl.controllers;


import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;
import contractUrl.services.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Urls")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @PostMapping("/save")
    public RegisterUrlResponse saveUrl(@RequestBody RegisterUrlRequest request) {
        return urlService.saveUrl(request);
    }

    @GetMapping("/{keyword}")
    public List<FindUrlResponse> findUrlByContractedUrl(@PathVariable("keyword") String contractedUrl) {
        return urlService.findUrlByContractedUrl(contractedUrl);
    }
}