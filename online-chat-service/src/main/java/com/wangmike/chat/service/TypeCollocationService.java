package com.wangmike.chat.service;

import com.wangmike.chat.common.entity.ProviderType;
import com.wangmike.chat.common.entity.TypeCollection;
import java.util.List;

public interface TypeCollocationService {
  void insertList(List<TypeCollection> paramList);
  
  List<ProviderType> getProviderTypes(String paramString);
  
  void deleteTypes(String paramString);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\TypeCollocationService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */