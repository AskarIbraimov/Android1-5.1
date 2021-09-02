package com.example.android1_51.ui.model;

public class CoinBase {
    private String status,coinName;
    private  int coin;

    public CoinBase(String status, String coinName, int coin) {
        this.status = status;
        this.coinName = coinName;
        this.coin = coin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
