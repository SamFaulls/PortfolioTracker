package com.cronoss.portfolio.tracker.account.domain;

import java.time.Instant;
import java.util.List;

public class Account {

    private String username;

    private String emailAddress;

    private Instant lastSeen;

    private List<Asset> assetList;

    public Account(String username, String emailAddress, Instant lastSeen, List<Asset> assetList) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.lastSeen = lastSeen;
        this.assetList = assetList;
    }

    public String getUsername() {
        return username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Instant getLastSeen() {
        return lastSeen;
    }

    public List<Asset> getAssetList() {
        return assetList;
    }
}
