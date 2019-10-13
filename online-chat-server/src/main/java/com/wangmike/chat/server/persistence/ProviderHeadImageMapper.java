package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.ProviderHeadImage;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProviderHeadImageMapper {
  int insert(ProviderHeadImage paramProviderHeadImage);
  
  List<String> getProHeadsById(String paramString);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\ProviderHeadImageMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */