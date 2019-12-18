package minase.rss.reader.interfaces.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import minase.rss.reader.applications.RssReaderService;
import minase.rss.reader.domains.model.RssFeedResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/rss")
@RequiredArgsConstructor
public class RssReaderController {
    @NonNull
    private final RssReaderService rssReaderService;

    @GetMapping("")
    public RssFeedResponse getRss() {
        return rssReaderService.fetchRss();
    }

}
