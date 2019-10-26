package org.acme.elasticsearchrestclient.model.elastic;

public class SearchResponse<T> {

    private Hits<T> hits;

    public Hits<T> getHits() {
        return hits;
    }

    public void setHits(Hits<T> hits) {
        this.hits = hits;
    }
}
