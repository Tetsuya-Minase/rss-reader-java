package minase.rss.reader.domains.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RssFeedResponse {
    private int count;
    private List<RssFeedModel> result;
}
