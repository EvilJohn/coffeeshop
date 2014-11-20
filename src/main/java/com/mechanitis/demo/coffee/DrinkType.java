package com.mechanitis.demo.coffee;

/**
 * Created by jcarney on 11/6/14.
 */
public class DrinkType {
    private String name;
    private String family;

    public DrinkType(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public DrinkType() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "DrinkType{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DrinkType drinkType = (DrinkType) o;

        if (family != null ? !family.equals(drinkType.family) : drinkType.family != null) return false;
        if (name != null ? !name.equals(drinkType.name) : drinkType.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (family != null ? family.hashCode() : 0);
        return result;
    }
}
