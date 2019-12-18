package minase.rss.reader.domains.service;

import minase.rss.reader.domains.model.RssFeedModel;
import minase.rss.reader.domains.model.RssFeedResponse;

import java.util.List;

/**
 * convert Model into Response.
 */
public interface RssConverter {
    /**
     * to RssFeed Response.
     *
     * @param feedModelList feed result rests.
     * @return {@link RssFeedResponse}
     */
    RssFeedResponse toResponse(List<RssFeedModel> feedModelList);
}
