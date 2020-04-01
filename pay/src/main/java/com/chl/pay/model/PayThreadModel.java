package com.chl.pay.model;

import com.chl.common.entity.Merchant;
import com.chl.common.model.TransactionModel;

/**
 * @Description: TODO()
 * @Author: Xiao V
 * @Date: 2020/3/20 14:29
 */
public class PayThreadModel {
    private TransactionModel transactionModel;
    private Merchant merchant;

    public TransactionModel getTransactionModel() {
        return transactionModel;
    }

    public void setTransactionModel(TransactionModel transactionModel) {
        this.transactionModel = transactionModel;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }
}
