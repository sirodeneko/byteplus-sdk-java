package com.volcengine.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class SmsSendRequest {
    @JSONField(name = "SmsAccount")
    String smsAccount;
    @JSONField(name = "Sign")
    String sign;
    @JSONField(name = "TemplateId")
    String templateId;
    @JSONField(name = "TemplateParam")
    String templateParam;
    @JSONField(name = "PhoneNumbers")
    String phoneNumbers;
    @JSONField(name = "Tag")
    String tag;
}
