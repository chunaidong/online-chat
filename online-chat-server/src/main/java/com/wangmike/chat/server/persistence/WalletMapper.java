package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.Wallet;
import java.math.BigDecimal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WalletMapper {
  int insert(Wallet paramWallet);
  
  void decreaseMoney(@Param("walletId") String paramString, @Param("totalAmount") BigDecimal paramBigDecimal);
  
  void increasMoney(@Param("walletId") String paramString, @Param("totalAmount") BigDecimal paramBigDecimal);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\WalletMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */