package minase.rss.reader.domains.service.impl;

import minase.rss.reader.domains.model.RssFeedModel;
import minase.rss.reader.domains.model.RssFeedResponse;
import minase.rss.reader.domains.service.RssConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RssConverterImpl implements RssConverter {

    @Override
    public RssFeedResponse toResponse(final List<RssFeedModel> feedModelList) {
        return RssFeedResponse.builder()
                .count(feedModelList.size())
                .result(feedModelList)
                .build();
    }
}
