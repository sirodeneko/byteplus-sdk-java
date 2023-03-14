package com.byteplus.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Audio & video translation - query result
 *
 * {
 *     "TaskId": "xxx"
 * }
 */
@Data
public class TranslateAudioQueryRequest {
    @JSONField(name = "TaskId")
    String taskId;
}
