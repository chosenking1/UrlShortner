package contractUrl.dtos.responses;

import lombok.Data;

@Data
public class RegisterUrlResponse {

    private String id;
    private String websiteName;
    private String websiteUrl;
    private String contractedUrl;

}