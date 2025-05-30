package establish.observer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NewsChannel implements Channel {
    private String news;

    public void update(Object o) {
        this.setNews((String) o);
    }
}
