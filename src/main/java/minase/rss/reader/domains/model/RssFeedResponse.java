package minase.rss.reader.domains.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Rss Result Response.
 */
@Data
@Builder
public class RssFeedResponse {
    /**
     * total result count.
     */
    private int count;
    /**
     * rss result list.
     * {@link List<RssFeedModel>}
     */
    private List<RssFeedModel> result;
}
