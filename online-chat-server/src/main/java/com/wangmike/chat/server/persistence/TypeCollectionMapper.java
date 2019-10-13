package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.ProviderType;
import com.wangmike.chat.common.entity.TypeCollection;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TypeCollectionMapper {
  int insert(TypeCollection paramTypeCollection);
  
  List<ProviderType> getProviderTypes(String paramString);
  
  void deleteTypes(String paramString);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\TypeCollectionMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */