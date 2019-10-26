package com.wangmike.chat.common.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotBlank;


@ApiModel("用户对象")
public class ConsumerRequest {
    @ApiModelProperty(value = "昵称", name = "consumerNickName", required = true)
    @NotBlank(message = "昵称不允许为空")
    private String consumerNickName;
    @ApiModelProperty(value = "用户头像", name = "consumerHeadImage", required = true)
    @NotBlank(message = "用户头像不允许为空")
    private String consumerHeadImage;
    @ApiModelProperty(value = "用户性别", name = "consumerSex", required = true)
    @NotBlank(message = "用户性别不允许为空")
    private String consumerSex;
    @ApiModelProperty(value = "用户登录经度", name = "consumerLastLoginLat")
    private BigDecimal consumerLastLoginLat;
    @ApiModelProperty(value = "用户登录维度", name = "consumerLastLoginLng")
    private BigDecimal consumerLastLoginLng;

    private String birthDay;



    /* 33 */
    public String getConsumerNickName() {
        return this.consumerNickName;
    }


    /* 37 */
    public void setConsumerNickName(String consumerNickName) {
        this.consumerNickName = consumerNickName;
    }


    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /* 41 */
    public String getConsumerHeadImage() {
        return this.consumerHeadImage;
    }


    /* 45 */
    public void setConsumerHeadImage(String consumerHeadImage) {
        this.consumerHeadImage = consumerHeadImage;
    }


    /* 49 */
    public String getConsumerSex() {
        return this.consumerSex;
    }


    /* 53 */
    public void setConsumerSex(String consumerSex) {
        this.consumerSex = consumerSex;
    }


    /* 57 */
    public BigDecimal getConsumerLastLoginLat() {
        return this.consumerLastLoginLat;
    }


    /* 61 */
    public void setConsumerLastLoginLat(BigDecimal consumerLastLoginLat) {
        this.consumerLastLoginLat = consumerLastLoginLat;
    }


    /* 65 */
    public BigDecimal getConsumerLastLoginLng() {
        return this.consumerLastLoginLng;
    }


    /* 69 */
    public void setConsumerLastLoginLng(BigDecimal consumerLastLoginLng) {
        this.consumerLastLoginLng = consumerLastLoginLng;
    }
}


/* Location:              C:\Users\wangchun\Desktop\online-chat-server-1.0.0.jar!\BOOT-INF\lib\online-chat-common-1.0.0.jar!\com\wangmike\chat\common\request\ConsumerRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */