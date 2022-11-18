package com.byteplus.model.live.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class EnableAuthResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
