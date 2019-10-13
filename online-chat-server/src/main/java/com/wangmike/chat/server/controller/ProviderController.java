/*     */ package com.wangmike.chat.server.controller;
/*     */ import com.wangmike.chat.common.constant.AuditStateEnum;
        import com.wangmike.chat.common.constant.CommonResponse;
/*     */ import com.wangmike.chat.common.constant.ErrorCodeEnum;
/*     */ import com.wangmike.chat.common.entity.ProviderHeadImage;
/*     */ import com.wangmike.chat.common.entity.TypeCollection;
/*     */ import com.wangmike.chat.common.request.ProviderOrderListRequest;
/*     */ import com.wangmike.chat.common.request.ProviderRequest;
/*     */ import com.wangmike.chat.common.response.ProviderResponseForMy;
/*     */ import com.wangmike.chat.server.controller.ProviderController;
/*     */ import com.wangmike.chat.server.utils.ResponseUtils;
/*     */ import com.wangmike.chat.service.ProviderHeadImageService;
/*     */ import com.wangmike.chat.service.ProviderService;
/*     */ import io.swagger.annotations.Api;
/*     */ import io.swagger.annotations.ApiImplicitParam;
/*     */ import io.swagger.annotations.ApiImplicitParams;
/*     */ import io.swagger.annotations.ApiOperation;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.List;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.validation.Valid;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.beans.factory.annotation.Value;
/*     */ import org.springframework.validation.BindingResult;
/*     */ import org.springframework.validation.ObjectError;
/*     */ import org.springframework.web.bind.annotation.*;
/*     */
/*     */
/*     */
import org.springframework.web.multipart.MultipartFile;
/*     */ 
/*     */ @RestController
/*     */ @RequestMapping({"/provider"})
/*     */ @Api(value = "ProviderController", tags = {"B端服务员 入口"})
/*     */ public class ProviderController {
/*  41 */   private Logger logger = LoggerFactory.getLogger(ProviderController.class);
/*     */   
/*     */   @Autowired
/*     */   private ProviderService providerService;
/*     */   
/*     */   @Autowired
/*     */   private ProviderHeadImageService providerHeadImageService;
/*     */   
/*     */   @Value("${file.upload.path}")
/*     */   private String filePath;
/*     */ 
/*     */   
/*     */   @PostMapping({"/registry"})
/*     */   @ApiOperation("B端用户注册 入口")
/*     */   public CommonResponse registry(@Valid @RequestBody ProviderRequest providerRequest, BindingResult errors, HttpServletRequest request) {
/*  56 */     if (errors.hasErrors()) {
/*  57 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/*  58 */           .getAllErrors().get(0)).getDefaultMessage());
/*     */     }
/*  60 */     return this.providerService.registry(providerRequest, request);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/upload"})
/*     */   public CommonResponse uploadFile(HttpServletRequest request, MultipartFile file) {
/*  70 */     this.logger.info("上传附件开始");
/*  71 */   String  openId = request.getHeader("openId");
/*     */     
/*  73 */     String uploadPath = this.filePath + "/" + openId + "/head";
/*     */     
/*  75 */    FileOutputStream fileOutputStream = null;
/*  76 */     InputStream inputStream = null;
/*     */     
/*  78 */     String fileName = file.getOriginalFilename();
/*     */     
/*  80 */     String finalFacePath = uploadPath + "/" + fileName;
/*     */     
/*  82 */     File outFile = new File(finalFacePath);
/*  83 */     if (outFile.getParentFile() != null || !outFile.getParentFile().isDirectory())
/*     */     {
/*  85 */       outFile.getParentFile().mkdirs();
/*     */     }
/*     */     try {
/*  88 */       fileOutputStream = new FileOutputStream(outFile);
/*  89 */       inputStream = file.getInputStream();
/*  90 */       IOUtils.copy(inputStream, fileOutputStream);
/*     */     }
/*  92 */     catch (FileNotFoundException e) {
/*  93 */       e.printStackTrace();
/*  94 */     } catch (IOException e) {
/*  95 */       e.printStackTrace();
/*     */     } finally {
/*  97 */       if (fileOutputStream != null) {
/*     */         try {
/*  99 */           fileOutputStream.flush();
/* 100 */           fileOutputStream.close();
/* 101 */           String insertPath = "http://47.103.125.154:8080/" + openId + "/head/" + fileName;
/* 102 */           ProviderHeadImage providerHeadImage = new ProviderHeadImage();
/* 103 */           providerHeadImage.setProviderId(openId);
/* 104 */           providerHeadImage.setHearImage(insertPath);
/* 105 */           providerHeadImage.setHearImage(AuditStateEnum.PROVIDER_HEAD_WAIT_AUDIT.getCode());
/* 106 */           this.providerHeadImageService.insert(providerHeadImage);
/* 107 */         } catch (IOException e) {
/* 108 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 114 */     return ResponseUtils.buildSuccessResoonse("success");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/uploadVoice"})
/*     */   public CommonResponse uploadVoice(HttpServletRequest request, MultipartFile file) {
/* 124 */     this.logger.info("上传声音附件开始");
/* 125 */     String openId = request.getHeader("openId");
/* 126 */     String typeId = request.getHeader("typeId");
/*     */     
/* 128 */     String uploadPath = this.filePath + "/" + openId + "/audio";
/*     */     
/* 130 */     FileOutputStream fileOutputStream = null;
/* 131 */     InputStream inputStream = null;
/*     */
/* 133 */     String fileName = file.getOriginalFilename();
/*     */     
/* 135 */     String finalFacePath = uploadPath + "/" + fileName;
/*     */     
/* 137 */     File outFile = new File(finalFacePath);
/* 138 */     if (outFile.getParentFile() != null || !outFile.getParentFile().isDirectory())
/*     */     {
/* 140 */       outFile.getParentFile().mkdirs();
/*     */     }
/*     */     try {
/* 143 */       fileOutputStream = new FileOutputStream(outFile);
/* 144 */       inputStream = file.getInputStream();
/* 145 */       IOUtils.copy(inputStream, fileOutputStream);
/*     */     }
/* 147 */     catch (FileNotFoundException e) {
/* 148 */       e.printStackTrace();
/* 149 */     } catch (IOException e) {
/* 150 */       e.printStackTrace();
/*     */     } finally {
/* 152 */       if (fileOutputStream != null) {
/*     */         try {
/* 154 */           fileOutputStream.flush();
/* 155 */           fileOutputStream.close();
/* 156 */           String insertPath = "http://47.103.125.154:8080/" + openId + "/audio/" + fileName;
/* 157 */           TypeCollection typeCollection = new TypeCollection();
/* 158 */           typeCollection.setFilePath(insertPath);
/* 159 */           typeCollection.setVoiceAudit("0");
/* 160 */           typeCollection.setProviderId(openId);
/* 161 */           typeCollection.setTypeId(typeId);
/* 162 */           this.providerService.updateType(typeCollection);
/* 163 */         } catch (IOException e) {
/* 164 */           e.printStackTrace();
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 170 */     return ResponseUtils.buildSuccessResoonse("success");
/*     */   }
/*     */ 
/*     */   
/*     */   @GetMapping({"/getMyData"})
/*     */   @ApiOperation("我的个人资料")
/* 176 */   public CommonResponse getMyData(HttpServletRequest request) { return this.providerService.getMyData(request); }
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/getMyFlower"})
/*     */   @ApiOperation("我的余额")
/* 182 */   public CommonResponse getMyFlower(HttpServletRequest request) { return this.providerService.getMyFlower(request); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/getProviderTypeList"})
/*     */   @ApiOperation("获取所有服务列表")
/* 192 */   public CommonResponse getProviderTypeList() { return this.providerService.getProviderTypeList(); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/getFlowerPoolList"})
/*     */   @ApiOperation("我的鲜花池")
/* 199 */   public CommonResponse getFlowerPoolList(HttpServletRequest request) { return this.providerService.getFlowerPoolList(request); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/updateProviderData"})
/*     */   @ApiOperation("修改服务员资料")
/*     */   public CommonResponse updateProviderData(@RequestBody ProviderResponseForMy providerResponseForMy, HttpServletRequest request) {
/* 210 */     providerResponseForMy.setProviderId(request.getHeader("openId"));
/* 211 */     return this.providerService.updateProviderData(providerResponseForMy);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/updateTypeList"})
/*     */   @ApiOperation("修改服务员服务类型集合")
/* 221 */   public CommonResponse updateTypeList(@RequestBody List<String> types, HttpServletRequest request) { return this.providerService.updateTypeList(types, request.getHeader("openId")); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/getSortList"})
/*     */   @ApiOperation("获取排行榜")
/* 231 */   public CommonResponse getSortList(HttpServletRequest request) { return this.providerService.getSortList(request); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @GetMapping({"/getAllOrderList"})
/*     */   @ApiOperation("获取获取订单列表")
/*     */   public CommonResponse getAllOrderList(@Valid ProviderOrderListRequest providerOrderListRequest, BindingResult errors, HttpServletRequest request) {
/* 241 */     if (errors.hasErrors()) {
/* 242 */       return ResponseUtils.buildErrorResponse(ErrorCodeEnum.PARAM_IS_BLANK.getCode(), ((ObjectError)errors
/* 243 */           .getAllErrors().get(0)).getDefaultMessage());
/*     */     }
/* 245 */     return this.providerService.getAllOrderList(providerOrderListRequest, request);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @PostMapping({"/accessOrder"})
/*     */   @ApiOperation("服务员点击接入按钮，订单由待接入，该成接入")
/*     */   @ApiImplicitParams({@ApiImplicitParam(name = "orderId", value = "订单id", dataType = "String", required = true)})
/* 254 */   public CommonResponse accessOrder(HttpServletRequest httpServletRequest, String orderId) { return this.providerService.accessOrder(orderId, httpServletRequest); }
/*     */ }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\server\controller\ProviderController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */