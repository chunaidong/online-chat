package com.wangmike.chat.service;

import java.math.BigDecimal;

public interface WalletService {
  String insertWallet(String paramString);
  
  void decreaseMoney(String paramString, BigDecimal paramBigDecimal);
  
  void increasMoney(String paramString, BigDecimal paramBigDecimal);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\WalletService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */