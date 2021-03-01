package com.chl.pay.payload;

/**
 * 条形码支付请求载体
 */
public class BarcodePayRequestPayload extends RequestPayLoad{

    private String barcode; // 支付码
    private String channel; // 支付渠道

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
