package minase.rss.reader.domains.service;

import com.rometools.rome.feed.synd.SyndEntry;
import minase.rss.reader.domains.model.RssFeedModel;

/**
 * mapping SyndEntry into Model.
 */
public interface FeedMapper {
    /**
     * Mapping SyndEntry to RssFeedModel
     *
     * @param syndEntry feed result.
     * @return {@link RssFeedModel}
     */
    RssFeedModel toRssFeedModel(SyndEntry syndEntry);
}
