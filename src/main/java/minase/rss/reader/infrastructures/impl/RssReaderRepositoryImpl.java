package minase.rss.reader.infrastructures.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import minase.rss.reader.domains.model.RssFeedModel;
import minase.rss.reader.domains.repository.RssReaderRepository;
import minase.rss.reader.domains.service.FeedMapper;
import minase.rss.reader.infrastructures.library.RssReaderLibrary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class RssReaderRepositoryImpl implements RssReaderRepository {

    @NonNull
    private final RssReaderLibrary rssReader;
    @NonNull
    private final FeedMapper mapper;

    @Value("${rss.url}")
    private String url;

    @Override
    public List<RssFeedModel> fetchRss() {

        final var feed = rssReader.fetchRss(url);
        return feed.getEntries().stream().map(mapper::toRssFeedModel).collect(Collectors.toList());
    }
}
