package minase.rss.reader.applications.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import minase.rss.reader.applications.RssReaderService;
import minase.rss.reader.domains.model.RssFeedResponse;
import minase.rss.reader.domains.repository.RssReaderRepository;
import minase.rss.reader.domains.service.RssConverter;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RssReaderServiceImpl implements RssReaderService {

    @NonNull
    private final RssReaderRepository repository;
    @NonNull
    private final RssConverter converter;

    @Override
    public RssFeedResponse fetchRss() {
        final var rssList = repository.fetchRss();
        return converter.toResponse(rssList);
    }
}
