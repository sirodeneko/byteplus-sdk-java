package com.byteplus.model.response.translate;

import com.alibaba.fastjson.annotation.JSONField;
import com.byteplus.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GlossaryPublishResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
}
