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
/*    */ 
/*    */ public class ConsumerAllResponseForOrder
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -1L;
/*    */   private PageInfo<ConsumerResponseForOrderList> page;
/*    */   private int totalWaitAccess;
/*    */   private int totalWaitChat;
/*    */   private int totalChatting;
/*    */   private int totalFinished;
/*    */   
/* 31 */   public PageInfo<ConsumerResponseForOrderList> getPage() { return this.page; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setPage(PageInfo<ConsumerResponseForOrderList> page) { this.page = page; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public int getTotalWaitAccess() { return this.totalWaitAccess; }
/*    */ 
/*    */ 
/*    */   
/* 43 */   public void setTotalWaitAccess(int totalWaitAccess) { this.totalWaitAccess = totalWaitAccess; }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public int getTotalWaitChat() { return this.totalWaitChat; }
/*    */ 
/*    */ 
/*    */   
/* 51 */   public void setTotalWaitChat(int totalWaitChat) { this.totalWaitChat = totalWaitChat; }
/*    */ 
/*    */ 
/*    */   
/* 55 */   public int getTotalChatting() { return this.totalChatting; }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public void setTotalChatting(int totalChatting) { this.totalChatting = totalChatting; }
/*    */ 
/*    */ 
/*    */   
/* 63 */   public int getTotalFinished() { return this.totalFinished; }
/*    */ 
/*    */ 
/*    */   
/* 67 */   public void setTotalFinished(int totalFinished) { this.totalFinished = totalFinished; }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ConsumerAllResponseForOrder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */