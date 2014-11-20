package com.mechanitis.demo.coffee;

import com.mongodb.MongoClient;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class CoffeeShopService extends Service<CoffeeShopConfiguration> {

    public static void main(String[] args) throws Exception {
        new CoffeeShopService().run(args);
    }



    @java.lang.Override
    public void initialize(Bootstrap<CoffeeShopConfiguration> bootstrap) {
        AssetsBundle bundle = new AssetsBundle("/html", "/");
        bootstrap.addBundle(bundle);
    }

    @java.lang.Override
    public void run(CoffeeShopConfiguration configuration, Environment environment) throws Exception {
        MongoClient mongoClient = new MongoClient();
        environment.manage(new MongoClientManager(mongoClient));
        environment.addResource(new CoffeeShopResource(mongoClient));

    }
}