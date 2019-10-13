/*    */ package com.wangmike.chat.server.impl;
/*    */ 
/*    */ import com.wangmike.chat.common.entity.ProviderHeadImage;
/*    */ import com.wangmike.chat.server.impl.ProviderHeadImageServiceImpl;
/*    */ import com.wangmike.chat.server.persistence.ProviderHeadImageMapper;
/*    */ import com.wangmike.chat.service.ProviderHeadImageService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class ProviderHeadImageServiceImpl
/*    */   implements ProviderHeadImageService
/*    */ {
/*    */   @Autowired
/*    */   private ProviderHeadImageMapper providerHeadImageMapper;
/*    */   
/* 19 */   public int insert(ProviderHeadImage record) { return this.providerHeadImageMapper.insert(record); }
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
/* 30 */   public List<String> getProHeadsById(String providerId) { return this.providerHeadImageMapper.getProHeadsById(providerId); }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\impl\ProviderHeadImageServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */