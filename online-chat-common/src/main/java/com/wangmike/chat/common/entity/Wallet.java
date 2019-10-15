 package com.wangmike.chat.common.entity;

 import java.io.Serializable;
 import java.math.BigDecimal;


 public class Wallet
   implements Serializable
 {
   private String walletId;
   private BigDecimal totalAmount;
   private String walletType;

/* 14 */   public String getWalletType() { return this.walletType; }



/* 18 */   public void setWalletType(String walletType) { this.walletType = walletType; }



/* 22 */   public String getWalletId() { return this.walletId; }



/* 26 */   public void setWalletId(String walletId) { this.walletId = (walletId == null) ? null : walletId.trim(); }



/* 30 */   public BigDecimal getTotalAmount() { return this.totalAmount; }



/* 34 */   public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\Wallet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */