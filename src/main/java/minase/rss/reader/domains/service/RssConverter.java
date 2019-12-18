package minase.rss.reader.domains.service;

import minase.rss.reader.domains.model.RssFeedModel;
import minase.rss.reader.domains.model.RssFeedResponse;

import java.util.List;

public interface RssConverter {
    RssFeedResponse toResponse(List<RssFeedModel> feedModelList);
}
