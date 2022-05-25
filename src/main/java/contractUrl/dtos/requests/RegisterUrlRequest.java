package contractUrl.dtos.requests;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUrlRequest {
        private String websiteUrl;
        private String websiteName;
        private String contractedUrl;
}