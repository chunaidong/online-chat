/*    */ package com.wangmike.chat.server.impl;
/*    */ 
/*    */ import com.wangmike.chat.common.entity.ProviderType;
/*    */ import com.wangmike.chat.common.entity.TypeCollection;
/*    */ import com.wangmike.chat.server.impl.TypeCollocationServiceImpl;
/*    */ import com.wangmike.chat.server.persistence.TypeCollectionMapper;
/*    */ import com.wangmike.chat.service.TypeCollocationService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ import org.springframework.transaction.annotation.Transactional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class TypeCollocationServiceImpl
/*    */   implements TypeCollocationService
/*    */ {
/*    */   @Autowired
/*    */   private TypeCollectionMapper typeCollectionMapper;
/*    */   
/*    */   @Transactional
/* 27 */   public void insertList(List<TypeCollection> collectionList) { collectionList.stream().forEach(typeCollection -> this.typeCollectionMapper.insert(typeCollection)); }
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
/* 38 */   public List<ProviderType> getProviderTypes(String providerId) { return this.typeCollectionMapper.getProviderTypes(providerId); }
/*    */ 
/*    */ 
/*    */   
/*    */   @Transactional
/* 43 */   public void deleteTypes(String openId) { this.typeCollectionMapper.deleteTypes(openId); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\TypeCollocationServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */