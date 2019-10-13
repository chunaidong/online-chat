package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.ProviderType;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProviderTypeMapper {
  BigDecimal getTypeAmount(String paramString);
  
  List<ProviderType> getAllFlowerList();
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\ProviderTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */