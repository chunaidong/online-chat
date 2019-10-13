/*    */ package com.wangmike.chat.server.controller;
/*    */ 
/*    */ import com.alibaba.fastjson.JSONObject;
/*    */ import com.wangmike.chat.common.request.OpenIdRequest;
/*    */ import com.wangmike.chat.server.utils.WeChatUtil;
/*    */ import io.swagger.annotations.Api;
/*    */ import io.swagger.annotations.ApiOperation;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.springframework.validation.BindingResult;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.RequestBody;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @RestController
/*    */ @RequestMapping({"/openId"})
/*    */ @Api(value = "OpenIdController", tags = {"获取openId 入口"})
/*    */ public class OpenIdController
/*    */ {
/*    */   private static final String APP_ID = "wx6fc4c3de88b4bd48";
/*    */   private static final String APP_SECRET = "f9505ea19a0184cc88cc40d4f988af49";
/*    */   
/*    */   @PostMapping({"/getUserInfo"})
/*    */   @ApiOperation("获取用户信息")
/*    */   public Map<String, Object> getOpenId(@RequestBody OpenIdRequest openIdRequest, BindingResult errors) throws Exception {
/* 35 */     if (errors.hasErrors()) {
/* 36 */       Map<String, Object> map = new HashMap<String, Object>();
/* 37 */       map.put("error", "参数不能为空");
/* 38 */       return map;
/*    */     } 
/* 40 */     String openId = "";
/*    */ 
/*    */     
/* 43 */     String url = "https://api.weixin.qq.com/sns/jscode2session?appid=wx6fc4c3de88b4bd48&secret=f9505ea19a0184cc88cc40d4f988af49&js_code=" + openIdRequest.getCode() + "&grant_type=authorization_code";
/*    */     
/* 45 */     String str = WeChatUtil.httpRequest(url, "GET", null);
/*    */     
/* 47 */     JSONObject jsonObject = JSONObject.parseObject(str);
/*    */     
/* 49 */     openId = jsonObject.get("openid").toString();
/* 50 */     Map<String, Object> map = new HashMap<String, Object>();
/* 51 */     map.put("openId", openId);
/*    */     
/* 53 */     return map;
/*    */   }
/*    */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\controller\OpenIdController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */