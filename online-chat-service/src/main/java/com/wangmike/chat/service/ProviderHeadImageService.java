package com.wangmike.chat.service;

import com.wangmike.chat.common.entity.ProviderHeadImage;
import java.util.List;

public interface ProviderHeadImageService {
  int insert(ProviderHeadImage paramProviderHeadImage);
  
  List<String> getProHeadsById(String paramString);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\ProviderHeadImageService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */