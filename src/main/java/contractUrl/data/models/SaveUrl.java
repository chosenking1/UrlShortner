package contractUrl.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor
@EqualsAndHashCode
@Document("Urls")
@NoArgsConstructor
public class SaveUrl {
    @Id
    private String id;

    @NonNull
    private String websiteUrl;


    private String websiteName;

    @NonNull
    private String contractedUrl;

}