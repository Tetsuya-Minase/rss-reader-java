package minase.rss.reader.infrastructures.library;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;

@Service
public class RssReaderLibrary {

    public SyndFeed fetchRss(@NonNull final String url) {
        try {
            return new SyndFeedInput().build(new XmlReader(new URL(url)));
        } catch (final IOException | FeedException e) {
            e.printStackTrace();
            throw new Error();
        }
    }
}
