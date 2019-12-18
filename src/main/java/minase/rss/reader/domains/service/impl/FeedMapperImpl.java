package minase.rss.reader.domains.service.impl;

import com.rometools.rome.feed.synd.SyndEntry;
import minase.rss.reader.domains.model.RssFeedModel;
import minase.rss.reader.domains.service.FeedMapper;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class FeedMapperImpl implements FeedMapper {
    @Override
    public RssFeedModel toRssFeedModel(final SyndEntry syndEntry) {

        return RssFeedModel.builder()
                .title(syndEntry.getTitle())
                .link(syndEntry.getLink())
                .publishedDate(toOffsetDateTime(syndEntry.getPublishedDate()))
                .build();
    }

    private OffsetDateTime toOffsetDateTime(final Date date) {
        final Instant instant = date.toInstant();
        final ZoneOffset offset = ZoneOffset.ofHours(9);
        return instant.atOffset(offset);
    }
}
