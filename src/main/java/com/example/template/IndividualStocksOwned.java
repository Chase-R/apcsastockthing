package com.example.template;

public class IndividualStocksOwned {

    private Stock stock;
    private  int SharesOwned;
    public IndividualStocksOwned(Stock stock, int Shares){
        this.stock = stock;
        this.SharesOwned = Shares;

    }

    public int getSharesOwned() {
        return SharesOwned;
    }

    public Stock getStock() {
        return stock;
    }

    public int addstock(int shares){
        SharesOwned += shares;
        return SharesOwned;
    }
}
