package minase.rss.reader.domains.service;

import com.rometools.rome.feed.synd.SyndEntry;
import minase.rss.reader.domains.model.RssFeedModel;

public interface FeedMapper {
    RssFeedModel toRssFeedModel(SyndEntry syndEntry);
}
