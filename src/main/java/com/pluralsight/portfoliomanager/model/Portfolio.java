package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {
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

    @Override
    public BigDecimal getValue() {
        BigDecimal total = BigDecimal.ZERO;

        for (Valuable asset : assets) {
            total = total.add(asset.getValue());
        }
        return total;
    }

    public Valuable getMostValuable() {
        Valuable best = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(best.getValue()) > 0) {
                best = asset;
            }
        }
        return best;
    }

    public Valuable getLeastValuable() {
        Valuable least = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue().compareTo(least.getValue()) < 0) {
                least = asset;
            }
        }
        return least;
    }

}
