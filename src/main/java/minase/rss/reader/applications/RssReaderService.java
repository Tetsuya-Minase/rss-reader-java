package minase.rss.reader.applications;

import minase.rss.reader.domains.model.RssFeedResponse;

public interface RssReaderService {
    RssFeedResponse fetchRss();
}
