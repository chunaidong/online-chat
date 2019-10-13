/*    */ package com.wangmike.chat.server.impl;
/*    */ 
/*    */ import com.wangmike.chat.common.entity.ConsumerCollection;
/*    */ import com.wangmike.chat.server.impl.ConsumerCollectionServiceImpl;
/*    */ import com.wangmike.chat.server.persistence.ConsumerCollectionMapper;
/*    */ import com.wangmike.chat.service.ConsumerCollectionService;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ConsumerCollectionServiceImpl
/*    */   implements ConsumerCollectionService
/*    */ {
/*    */   @Autowired
/*    */   private ConsumerCollectionMapper consumerCollectionMapper;
/*    */   
/*    */   public void markProvider(String providerId, String consumerId) {
/* 23 */     ConsumerCollection consumerCollection = new ConsumerCollection();
/* 24 */     consumerCollection.setProviderId(providerId);
/* 25 */     consumerCollection.setConsumerId(consumerId);
/* 26 */     this.consumerCollectionMapper.insert(consumerCollection);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void unmarkProvider(String providerId, String openId) { this.consumerCollectionMapper.unmarkProvider(providerId, openId); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public int queryIsMark(String openId, String providerId) { return this.consumerCollectionMapper.queryIsMark(openId, providerId); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\ConsumerCollectionServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */