package contractUrl.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@Document("Urls")
@NoArgsConstructor
public class Url {
    @Id
    private String id;

    @NonNull
    private String websiteUrl;


    private String websiteName;

    @NonNull
    private String contractedUrl;

}