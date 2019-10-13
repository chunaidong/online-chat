/*    */ package com.wangmike.chat.common.response;
/*    */ 
/*    */ import com.github.pagehelper.PageInfo;
/*    */ import java.io.Serializable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProviderAllResponseForOrderList
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -1L;
/*    */   private PageInfo<ProviderResponseForOrderList> page;
/*    */   private int totalWaitAccess;
/*    */   private int totalWaitChat;
/*    */   private int totalChatting;
/*    */   
/* 29 */   public PageInfo<ProviderResponseForOrderList> getPage() { return this.page; }
/*    */ 
/*    */ 
/*    */   
/* 33 */   public void setPage(PageInfo<ProviderResponseForOrderList> page) { this.page = page; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public int getTotalWaitAccess() { return this.totalWaitAccess; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setTotalWaitAccess(int totalWaitAccess) { this.totalWaitAccess = totalWaitAccess; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public int getTotalWaitChat() { return this.totalWaitChat; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setTotalWaitChat(int totalWaitChat) { this.totalWaitChat = totalWaitChat; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public int getTotalChatting() { return this.totalChatting; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public void setTotalChatting(int totalChatting) { this.totalChatting = totalChatting; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProviderAllResponseForOrderList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */