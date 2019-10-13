package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.WalletDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WalletDetailMapper {
  void insert(WalletDetail paramWalletDetail);
  
  String getWalletDetailByOrderId(String paramString);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\WalletDetailMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */