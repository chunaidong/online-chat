 package com.wangmike.chat.server.utils;
 import java.io.BufferedReader;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.io.OutputStream;
 import java.io.UnsupportedEncodingException;
 import java.net.URL;
 import java.security.AlgorithmParameters;
 import java.security.InvalidAlgorithmParameterException;
 import java.security.InvalidKeyException;
 import java.security.NoSuchAlgorithmException;
 import java.security.spec.InvalidParameterSpecException;
 import javax.crypto.BadPaddingException;
 import javax.crypto.Cipher;
 import javax.crypto.IllegalBlockSizeException;
 import javax.crypto.NoSuchPaddingException;
 import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 import javax.net.ssl.HttpsURLConnection;
 import org.apache.tomcat.util.codec.binary.Base64;

 public class WeChatUtil {
   public static String httpRequest(String requestUrl, String requestMethod, String output) {
     try {
/* 24 */       URL url = new URL(requestUrl);
/* 25 */       HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();
/* 26 */       connection.setDoOutput(true);
/* 27 */       connection.setDoInput(true);
/* 28 */       connection.setUseCaches(false);
/* 29 */       if (null != output) {
/* 30 */         OutputStream outputStream = connection.getOutputStream();
/* 31 */         outputStream.write(output.getBytes("utf-8"));
/* 32 */         outputStream.close();
       }

/* 35 */       InputStream inputStream = connection.getInputStream();
/* 36 */       InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
/* 37 */       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
/* 38 */       String str = null;
/* 39 */       StringBuffer buffer = new StringBuffer();
/* 40 */       while ((str = bufferedReader.readLine()) != null) {
/* 41 */         buffer.append(str);
       }
/* 43 */       bufferedReader.close();
/* 44 */       inputStreamReader.close();
/* 45 */       inputStream.close();
/* 46 */       inputStream = null;
/* 47 */       connection.disconnect();
/* 48 */       return buffer.toString();
/* 49 */     } catch (Exception e) {
/* 50 */       e.printStackTrace();

/* 52 */       return "";
     }
   }



   public static String decrypt(String encryptedData, String key, String iv, String encodingFormat) throws Exception {
/* 59 */     byte[] dataByte = Base64.decodeBase64(encryptedData);

/* 61 */     byte[] keyByte = Base64.decodeBase64(key);

/* 63 */     byte[] ivByte = Base64.decodeBase64(iv);


     try {
/* 67 */       Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

/* 69 */       SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");

/* 71 */       AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
/* 72 */       parameters.init(new IvParameterSpec(ivByte));
/* 73 */       cipher.init(2, spec, parameters);
/* 74 */       byte[] resultByte = cipher.doFinal(dataByte);
/* 75 */       if (null != resultByte && resultByte.length > 0) {
/* 76 */         return new String(resultByte, encodingFormat);
       }

/* 79 */       return null;
/* 80 */     } catch (NoSuchAlgorithmException e) {
/* 81 */       e.printStackTrace();
/* 82 */     } catch (NoSuchPaddingException e) {
/* 83 */       e.printStackTrace();
/* 84 */     } catch (InvalidParameterSpecException e) {
/* 85 */       e.printStackTrace();
/* 86 */     } catch (InvalidKeyException e) {
/* 87 */       e.printStackTrace();
/* 88 */     } catch (InvalidAlgorithmParameterException e) {
/* 89 */       e.printStackTrace();
/* 90 */     } catch (IllegalBlockSizeException e) {
/* 91 */       e.printStackTrace();
/* 92 */     } catch (BadPaddingException e) {
/* 93 */       e.printStackTrace();
/* 94 */     } catch (UnsupportedEncodingException e) {
/* 95 */       e.printStackTrace();
     }
/* 97 */     return null;
   }
 }


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\classes\com\wangmike\chat\serve\\utils\WeChatUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */