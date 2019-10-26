package org.acme.elasticsearchrestclient.model.elastic;

import java.util.List;

public class Hits<T> {

    private List<Hit<T>> hits;

    public List<Hit<T>> getHits() {
        return hits;
    }

    public void setHits(List<Hit<T>> hits) {
        this.hits = hits;
    }
}

