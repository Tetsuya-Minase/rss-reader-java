package minase.rss.reader.domains.repository;

import minase.rss.reader.domains.model.RssFeedModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RssReaderRepository {
    List<RssFeedModel> fetchRss();
}
