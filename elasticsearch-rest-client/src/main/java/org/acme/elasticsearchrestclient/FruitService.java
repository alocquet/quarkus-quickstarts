package org.acme.elasticsearchrestclient;

import org.acme.elasticsearchrestclient.model.Fruit;
import org.acme.elasticsearchrestclient.model.elastic.Hit;
import org.acme.elasticsearchrestclient.model.elastic.SearchResponse;
import org.apache.commons.io.IOUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;
import java.util.List;

@ApplicationScoped
public class FruitService {

    @Inject
    RestClient restClient;

    public List<Hit<Fruit>> list() {
        try {
            Response result = restClient.performRequest(new Request("GET", "/fruit/_search"));
            final SearchResponse searchResponse = JsonbBuilder.create().fromJson(result.getEntity().getContent(), new SearchResponse<Fruit>() {
            }.getClass().getGenericSuperclass());

            return searchResponse.getHits().getHits();
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String add(final Fruit fruit) {
        try {
            final Request creationRequest = new Request("POST", "/fruit/_doc");
            creationRequest.setJsonEntity(JsonbBuilder.create().toJson(fruit));
            final Response result = restClient.performRequest(creationRequest);
            return IOUtils.toString(result.getEntity().getContent());
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

}