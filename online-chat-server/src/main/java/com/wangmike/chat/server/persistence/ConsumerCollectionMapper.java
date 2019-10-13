package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.ConsumerCollection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerCollectionMapper {
  int insert(ConsumerCollection paramConsumerCollection);
  
  void unmarkProvider(@Param("providerId") String paramString1, @Param("consumerId") String paramString2);
  
  int queryIsMark(@Param("consumerId") String paramString1, @Param("providerId") String paramString2);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\ConsumerCollectionMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */