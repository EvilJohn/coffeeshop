package com.mechanitis.demo.coffee;

import com.mongodb.MongoClient;
import com.yammer.dropwizard.lifecycle.Managed;
import org.eclipse.jetty.util.component.LifeCycle;

/**
 * Created by jcarney on 11/6/14.
 */
public class MongoClientManager implements Managed {
    MongoClient mongoClient;
    public MongoClientManager(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void start() throws Exception {

    }

    @Override
    public void stop() throws Exception {
        mongoClient.close();
    }
}
