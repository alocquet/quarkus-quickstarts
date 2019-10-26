package org.acme.elasticsearchrestclient.model.elastic;

import javax.json.bind.annotation.JsonbProperty;

public class Hit<T> {
    @JsonbProperty("_id")
    private String id;

    @JsonbProperty("_source")
    private T source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }
}
