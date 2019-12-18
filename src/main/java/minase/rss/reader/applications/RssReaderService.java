package minase.rss.reader.applications;

import minase.rss.reader.domains.model.RssFeedResponse;

/**
 * rss reader service.
 */
public interface RssReaderService {
    /**
     * fetch rss response.
     *
     * @return {@link RssFeedResponse}
     */
    RssFeedResponse fetchRss();
}
