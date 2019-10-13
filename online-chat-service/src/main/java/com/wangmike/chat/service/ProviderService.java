package com.wangmike.chat.service;

import com.wangmike.chat.common.constant.CommonResponse;
import com.wangmike.chat.common.entity.TypeCollection;
import com.wangmike.chat.common.request.ProviderListRequest;
import com.wangmike.chat.common.request.ProviderOrderListRequest;
import com.wangmike.chat.common.request.ProviderRequest;
import com.wangmike.chat.common.response.ProviderResponseForMy;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface ProviderService {
  CommonResponse registry(ProviderRequest paramProviderRequest, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getProviderList(ProviderListRequest paramProviderListRequest, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getProviderDetail(String paramString, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse markProvider(String paramString, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse unmarkProvider(String paramString, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getMyData(HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getMyFlower(HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getProviderTypeList();
  
  CommonResponse getFlowerPoolList(HttpServletRequest paramHttpServletRequest);
  
  CommonResponse updateProviderData(ProviderResponseForMy paramProviderResponseForMy);
  
  CommonResponse getSortList(HttpServletRequest paramHttpServletRequest);
  
  CommonResponse getAllOrderList(ProviderOrderListRequest paramProviderOrderListRequest, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse accessOrder(String paramString, HttpServletRequest paramHttpServletRequest);
  
  CommonResponse updateTypeList(List<String> paramList, String paramString);
  
  void updateType(TypeCollection paramTypeCollection);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-service-1.0.0.jar!\com\wangmike\chat\service\ProviderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */