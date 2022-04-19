package contractUrl.dtos.responses;

import contractUrl.data.models.SaveUrl;
import lombok.Data;

@Data
public class FindUrlResponse {
    private String websiteName;
    private String websiteUrl;
    private String contractedUrl;


    public FindUrlResponse (SaveUrl url){
        contractedUrl =url.getContractedUrl();
        websiteUrl= url.getWebsiteUrl();
        websiteName=url.getWebsiteName();

    }

    public  FindUrlResponse() {

    }
}