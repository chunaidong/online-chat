package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.Provider;
import com.wangmike.chat.common.entity.ProviderType;
import com.wangmike.chat.common.entity.TypeCollection;
import com.wangmike.chat.common.request.ProviderListRequest;
import com.wangmike.chat.common.request.ProviderOrderListRequest;
import com.wangmike.chat.common.response.ConsumerResponseForOrderList;
import com.wangmike.chat.common.response.FlowerPool;
import com.wangmike.chat.common.response.ProHeaderAudit;
import com.wangmike.chat.common.response.ProviderResponseDetail;
import com.wangmike.chat.common.response.ProviderResponseForAdmin;
import com.wangmike.chat.common.response.ProviderResponseForList;
import com.wangmike.chat.common.response.ProviderResponseForMy;
import com.wangmike.chat.common.response.ProviderResponseForSort;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProviderMapper {
  int judgeIsRegistry(String paramString);
  
  int insert(Provider paramProvider);
  
  List<ProviderResponseForList> getProviderListBylevel(ProviderListRequest paramProviderListRequest);
  
  List<ProviderResponseForList> getProviderListByDistance(ProviderListRequest paramProviderListRequest);
  
  ProviderResponseDetail getProviderDetail(String paramString);
  
  ProviderResponseForMy getProviderForMy(String paramString);
  
  BigDecimal getMyFlower(String paramString);
  
  List<ProviderType> getAllProviderTypeList();
  
  List<FlowerPool> getMyFlowerPool(String paramString);
  
  void updateData(Provider paramProvider);
  
  List<ProviderResponseForSort> getSortList(String paramString);
  
  List<ConsumerResponseForOrderList> getProviderOrderList(ProviderOrderListRequest paramProviderOrderListRequest);
  
  Map<String, Object> queryCount(String paramString);
  
  int accessOrder(@Param("orderId") String paramString1, @Param("openId") String paramString2);
  
  List<ProviderResponseForAdmin> getAllProviderList();
  
  int onlineState(String paramString);
  
  int offlineState(String paramString);
  
  List<String> queryWaitAuditList(String paramString);
  
  List<Map<String, Object>> queryWaitProvider();
  
  void removeHeadImage(String paramString);
  
  void auditHeadImage(@Param("providerId") String paramString1, @Param("type") String paramString2);
  
  void auditWechatNo(@Param("providerId") String paramString1, @Param("type") String paramString2);
  
  void auditContent(@Param("providerId") String paramString1, @Param("type") String paramString2);
  
  BigDecimal getRestAmount();
  
  BigDecimal getTotalReceive();
  
  BigDecimal getWithDrawTotal();
  
  BigDecimal getProReceive();
  
  List<ProviderType> queryProviderType();
  
  void insertProviderType(ProviderType paramProviderType);
  
  void updateProviderType(ProviderType paramProviderType);
  
  void deleteProviderType(String paramString);
  
  void updateType(TypeCollection paramTypeCollection);
  
  void providerPass(String paramString);
  
  void providerDeny(String paramString);
  
  List<ProHeaderAudit> getAllWaitHeaderList();
  
  List<Map<String, Object>> queryWaitContens();
  
  List<Map<String, Object>> queryVoiceLists();
  
  void providerViocePass(@Param("providerId") String paramString1, @Param("typeId") String paramString2);
  
  void providerVioceDeny(@Param("providerId") String paramString1, @Param("typeId") String paramString2);

  int getIsProvider(String openId);
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\persistence\ProviderMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */