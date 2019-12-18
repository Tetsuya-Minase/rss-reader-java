package minase.rss.reader.domains.model;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

/**
 * rss model.
 */
@Data
@Builder
public class RssFeedModel {
    /**
     * article title.
     */
    private String title;
    /**
     * article link.
     */
    private String link;
    /**
     * article published date.
     */
    private OffsetDateTime publishedDate;
}
