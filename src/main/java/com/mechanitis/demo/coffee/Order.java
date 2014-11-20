package com.mechanitis.demo.coffee;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by jcarney on 11/6/14.
 */
public class Order {
    @Id
    private String id;
    private String size;
    private String drinker;

    private String[] selectedOptions;
    private DrinkType type;
    private long coffeeShopId;

    public Order(@JsonProperty("selectedOptions") String[] selectedOptions,
                 @JsonProperty("type") DrinkType type,
                 @JsonProperty("size") String size,
                 @JsonProperty("drinker") String drinker) {
        this.selectedOptions = selectedOptions;
        this.drinker = drinker;
        this.size = size;
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrinker(String drinker) {
        this.drinker = drinker;
    }

    public void setType(DrinkType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getDrinker() {
        return drinker;
    }

    public String[] getSelectedOptions() {
        return selectedOptions;
    }

    public DrinkType getType() {
        return type;
    }

    public void setCoffeeShopId(final long coffeeShopId) {
        this.coffeeShopId = coffeeShopId;
    }
}
