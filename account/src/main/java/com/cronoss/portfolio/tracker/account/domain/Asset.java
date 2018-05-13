package com.cronoss.portfolio.tracker.account.domain;

/**
 * Domain class to define an Asset in a portfolio
 */
public class Asset {

    private String assetTicker;
    private String assetName;
    private AssetClass assetClass;
    private double quantityInPortfolio;

    public Asset(String assetTicker, String assetName, AssetClass assetClass, double quantityInPortfolio) {
        this.assetTicker = assetTicker;
        this.assetName = assetName;
        this.assetClass = assetClass;
        this.quantityInPortfolio = quantityInPortfolio;
    }

    public String getAssetTicker() {
        return assetTicker;
    }

    public String getAssetName() {
        return assetName;
    }

    public AssetClass getAssetClass() {
        return assetClass;
    }

    public double getQuantityInPortfolio() {
        return quantityInPortfolio;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "assetTicker='" + assetTicker + '\'' +
                ", assetName='" + assetName + '\'' +
                ", assetClass=" + assetClass +
                ", quantityInPortfolio=" + quantityInPortfolio +
                '}';
    }
}
