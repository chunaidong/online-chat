 package com.wangmike.chat.server.impl;
 
 import com.cgclecc.devarch.jsoncore.util.IdGenerator;
 import com.wangmike.chat.common.entity.Wallet;
 import com.wangmike.chat.server.impl.WalletServiceImpl;
 import com.wangmike.chat.server.persistence.WalletMapper;
 import com.wangmike.chat.service.WalletService;
 import java.math.BigDecimal;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;


 @Service
 public class WalletServiceImpl
   implements WalletService
 {
   @Autowired
   private WalletMapper walletMapper;
   
   @Transactional
   public String insertWallet(String type) {
/* 27 */     Wallet wallet = new Wallet();
/* 28 */     wallet.setWalletId(IdGenerator.getDefaultId() + "");
/* 29 */     wallet.setTotalAmount(new BigDecimal("0"));
/* 30 */     wallet.setWalletType(type);
/* 31 */     this.walletMapper.insert(wallet);
/* 32 */     return wallet.getWalletId();
   }
 
 
 
 
 
 
 
 
   
   @Transactional
/* 44 */   public void decreaseMoney(String walletId, BigDecimal totalAmount) { this.walletMapper.decreaseMoney(walletId, totalAmount); }
 
 
 
 
 
 
 
 
 
   
   @Transactional
/* 56 */   public void increasMoney(String walletId, BigDecimal totalAmount) { this.walletMapper.increasMoney(walletId, totalAmount); }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\WalletServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */