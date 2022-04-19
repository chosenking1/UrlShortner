package contractUrl.util;

import contractUrl.data.models.SaveUrl;
import contractUrl.dtos.requests.RegisterUrlRequest;
import contractUrl.dtos.responses.FindUrlResponse;
import contractUrl.dtos.responses.RegisterUrlResponse;

public class ModelMapper {
    public static SaveUrl map(RegisterUrlRequest request) {
        SaveUrl theContact = new SaveUrl();
        theContact.setWebsiteName(request.getWebsiteName());
        theContact.setWebsiteUrl(request.getWebsiteUrl());

        return theContact;
    }
    public static RegisterUrlResponse map (SaveUrl theUrl){
        RegisterUrlResponse response = new RegisterUrlResponse();
        response.setWebsiteName(theUrl.getWebsiteName());
        response.setWebsiteUrl(theUrl.getWebsiteUrl());
        response.setContractedUrl("Contact Saved");
        return response;
    }

    public static FindUrlResponse contractedUrlToFindContractedUrl(SaveUrl url) {
        FindUrlResponse response = new FindUrlResponse();
        response.setWebsiteName(url.getWebsiteName());
        response.setWebsiteUrl(url.getWebsiteUrl());

        return response;
    }
}
