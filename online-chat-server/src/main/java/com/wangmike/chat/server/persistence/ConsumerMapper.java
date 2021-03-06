package com.wangmike.chat.server.persistence;

import com.wangmike.chat.common.entity.Consumer;
import com.wangmike.chat.common.response.ConsumerForAdmin;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConsumerMapper {
    int judgeIsRegistry(String paramString);

    int insert(Consumer paramConsumer);

    int updateByPrimaryKeySelective(Consumer paramConsumer);

    Map<String, Object> getRestAmount(String paramString);

    int updateStateToWaitConfirm(@Param("orderId") String paramString1, @Param("openId") String paramString2);

    int updateStateToChatting(@Param("orderId") String paramString1, @Param("openId") String paramString2);

    String getProviderWalletId(String paramString);

    int getIsExist(String paramString);

    List<ConsumerForAdmin> getAllConsumerList();

    BigDecimal findConsumerBalance(String paramString);

  ConsumerForAdmin getConsumerData(String openId);
}

