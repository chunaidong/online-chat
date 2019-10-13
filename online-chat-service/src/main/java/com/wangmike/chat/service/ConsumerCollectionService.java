package com.wangmike.chat.service;

public interface ConsumerCollectionService {
  void markProvider(String paramString1, String paramString2);
  
  void unmarkProvider(String paramString1, String paramString2);
  
  int queryIsMark(String paramString1, String paramString2);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\ConsumerCollectionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */