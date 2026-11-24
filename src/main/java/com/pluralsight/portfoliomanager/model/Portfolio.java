package com.pluralsight.portfoliomanager.model;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name, owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public void add(Valuable valuable) {
        assets.add(valuable);
    }


}
