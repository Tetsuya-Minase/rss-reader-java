package minase.rss.reader.domains.repository;

import minase.rss.reader.domains.model.RssFeedModel;

import java.util.List;

/**
 * repository.
 */
public interface RssReaderRepository {
    /**
     * fetch rss.
     *
     * @return {@link List<RssFeedModel>}
     */
    List<RssFeedModel> fetchRss();
}
