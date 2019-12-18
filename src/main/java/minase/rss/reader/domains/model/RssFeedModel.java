package minase.rss.reader.domains.model;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class RssFeedModel {
    private String title;
    private String link;
    private OffsetDateTime publishedDate;
}
