# Quick Start : ElasticSearch Rest Client

## First step : Basic query to Elastic Search with Rest Client


* Start ElasticSearch
```
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.4.2
```

* Create a Resource
```
Paste code here
```

* Create a Service
```
Paste code here
```

* Configure your ElasticSearch host name
```
Paste code here
```

* Start app
```
Paste code here
```

* Call sercies
```
Paste curl commands here
```

## Second step : Start ElasticSearch secured by a username / password

* Kill previous Elasticsearch and start a new one
```
docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" -v "$PWD/src/main/docker/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml" -e "ELASTIC_PASSWORD=changeme" docker.elastic.co/elasticsearch/elasticsearch:7.4.2
```

* Configure your username and your password
```
Paste code here
```

* Start app
```
Paste code here
```

* Call sercies
```
Paste curl commands here
```