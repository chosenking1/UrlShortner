package contractUrl.util;

import contractUrl.data.models.Url;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;

public class ModelMapper {
    public static Url map(RegisterUrlRequest request) {
        Url theUrlDetails = new Url();
        theUrlDetails.setWebsiteName(request.getWebsiteName());
        theUrlDetails.setWebsiteUrl(request.getWebsiteUrl());
        theUrlDetails.setContractedUrl(request.getContractedUrl());

        return theUrlDetails;
    }
    public static RegisterUrlResponse map (Url theUrl){
        RegisterUrlResponse response = new RegisterUrlResponse();
        response.setId(theUrl.getId());
        response.setWebsiteName(theUrl.getWebsiteName());
        response.setWebsiteUrl(theUrl.getWebsiteUrl());
        response.setContractedUrl(theUrl.getContractedUrl());
        return response;
    }

    public static FindUrlResponse contractedUrlToFindContractedUrl(Url url) {
        FindUrlResponse response = new FindUrlResponse();
//        response.setWebsiteName(url.getWebsiteName());
        response.setWebsiteUrl(url.getWebsiteUrl());


        return response;
    }
}
