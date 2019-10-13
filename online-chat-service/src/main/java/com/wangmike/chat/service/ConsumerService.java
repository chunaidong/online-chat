package com.wangmike.chat.service;

import com.wangmike.chat.common.constant.CommonResponse;
import com.wangmike.chat.common.entity.Consumer;
import com.wangmike.chat.common.request.ConsumerOrderListRequest;
import com.wangmike.chat.common.request.ConsumerOrderRequest;
import com.wangmike.chat.common.request.ConsumerRequest;
import com.wangmike.chat.common.request.MarkedRequest;
import javax.servlet.http.HttpServletRequest;

public interface ConsumerService {
  CommonResponse registry(ConsumerRequest paramConsumerRequest, HttpServletRequest paramHttpServletRequest);
  
  void updateByPrimaryKeySelective(Consumer paramConsumer);
  
  CommonResponse orderProvider(ConsumerOrderRequest paramConsumerOrderRequest, HttpServletRequest paramHttpServletRequest);
  
  void cancelOrder(String paramString);
  
  CommonResponse getAllOrderList(ConsumerOrderListRequest paramConsumerOrderListRequest, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getAllMarkedList(MarkedRequest paramMarkedRequest, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getAllFlowerList(HttpServletRequest paramHttpServletRequest);
  
  CommonResponse updateStateToWaitConfirm(HttpServletRequest paramHttpServletRequest, String paramString);
  
  CommonResponse updateStateToChatting(HttpServletRequest paramHttpServletRequest, String paramString);
  
  void finishOrder(String paramString);
  
  void cancelOrder2(String paramString);
  
  CommonResponse findConsumerBalance(HttpServletRequest paramHttpServletRequest);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\ConsumerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */