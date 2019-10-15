 package com.wangmike.chat.common.entity;

 import java.io.Serializable;
 import java.math.BigDecimal;
 import java.util.Date;









 public class WalletDetail
   implements Serializable
 {
   private String detailId;
   private BigDecimal amount;
   private String tradeType;
   private Date createTime;
   private String createUser;
   private String createRole;
   private String walletId;
   private String outTradeNo;
   private String tradeState;
   private String orderId;

/*  29 */   public String getOrderId() { return this.orderId; }



/*  33 */   public void setOrderId(String orderId) { this.orderId = orderId; }



/*  37 */   public String getDetailId() { return this.detailId; }



/*  41 */   public void setDetailId(String detailId) { this.detailId = (detailId == null) ? null : detailId.trim(); }



/*  45 */   public BigDecimal getAmount() { return this.amount; }



/*  49 */   public void setAmount(BigDecimal amount) { this.amount = amount; }



/*  53 */   public String getTradeType() { return this.tradeType; }



/*  57 */   public void setTradeType(String tradeType) { this.tradeType = (tradeType == null) ? null : tradeType.trim(); }



/*  61 */   public Date getCreateTime() { return this.createTime; }



/*  65 */   public void setCreateTime(Date createTime) { this.createTime = createTime; }



/*  69 */   public String getCreateUser() { return this.createUser; }



/*  73 */   public void setCreateUser(String createUser) { this.createUser = (createUser == null) ? null : createUser.trim(); }



/*  77 */   public String getCreateRole() { return this.createRole; }



/*  81 */   public void setCreateRole(String createRole) { this.createRole = (createRole == null) ? null : createRole.trim(); }



/*  85 */   public String getWalletId() { return this.walletId; }



/*  89 */   public void setWalletId(String walletId) { this.walletId = (walletId == null) ? null : walletId.trim(); }



/*  93 */   public String getOutTradeNo() { return this.outTradeNo; }



/*  97 */   public void setOutTradeNo(String outTradeNo) { this.outTradeNo = (outTradeNo == null) ? null : outTradeNo.trim(); }



/* 101 */   public String getTradeState() { return this.tradeState; }



/* 105 */   public void setTradeState(String tradeState) { this.tradeState = (tradeState == null) ? null : tradeState.trim(); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\entity\WalletDetail.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */