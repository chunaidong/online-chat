package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.ConsumerOrder;
import com.wangmike.chat.common.request.ConsumerOrderListRequest;
import com.wangmike.chat.common.request.MarkedRequest;
import com.wangmike.chat.common.response.OrderForAdminResponse;
import com.wangmike.chat.common.response.ProviderResponseForList;
import com.wangmike.chat.common.response.ProviderResponseForOrderList;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerOrderMapper {
  void insert(ConsumerOrder paramConsumerOrder);
  
  ConsumerOrder queryOrderById(String paramString);
  
  void closeOrderById(String paramString);
  
  List<ProviderResponseForOrderList> getConsumerOrderList(ConsumerOrderListRequest paramConsumerOrderListRequest);
  
  Map<String, Object> queryCount(String paramString);
  
  List<ProviderResponseForList> getAllMarkedList(MarkedRequest paramMarkedRequest);
  
  void updateOrderState(ConsumerOrder paramConsumerOrder);
  
  String getOrderTime(String paramString);
  
  void incTotal(@Param("providerId") String paramString1, @Param("providerType") String paramString2);
  
  List<OrderForAdminResponse> getAllOrderList();
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\ConsumerOrderMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */