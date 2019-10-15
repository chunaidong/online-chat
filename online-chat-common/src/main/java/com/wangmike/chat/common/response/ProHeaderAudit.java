 package com.wangmike.chat.common.response;

 import java.util.List;




 public class ProHeaderAudit
 {
   private String providerId;
   private String providerNickName;
   private String auditType;
   private List<String> headerList;

/* 15 */   public String getProviderId() { return this.providerId; }



/* 19 */   public void setProviderId(String providerId) { this.providerId = providerId; }



/* 23 */   public String getProviderNickName() { return this.providerNickName; }



/* 27 */   public void setProviderNickName(String providerNickName) { this.providerNickName = providerNickName; }



/* 31 */   public String getAuditType() { return this.auditType; }



/* 35 */   public void setAuditType(String auditType) { this.auditType = auditType; }



/* 39 */   public List<String> getHeaderList() { return this.headerList; }



/* 43 */   public void setHeaderList(List<String> headerList) { this.headerList = headerList; }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\response\ProHeaderAudit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */