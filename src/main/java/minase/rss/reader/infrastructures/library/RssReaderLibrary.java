package minase.rss.reader.infrastructures.library;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import lombok.NonNull;
import minase.rss.reader.domains.model.FeedException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

/**
 * Fetching Rss Library.
 */
@Service
public class RssReaderLibrary {

    /**
     * fetch Rss.
     *
     * @param url fetch target url.
     * @return {@link SyndFeed}
     */
    public SyndFeed fetchRss(@NonNull final String url) {
        try {
            return new SyndFeedInput().build(new XmlReader(new URL(url)));
        } catch (final com.rometools.rome.io.FeedException e) {
            throw new FeedException(400, e.getMessage());
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
