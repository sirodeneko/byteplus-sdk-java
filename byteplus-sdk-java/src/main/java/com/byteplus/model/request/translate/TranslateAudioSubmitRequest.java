package com.byteplus.model.request.translate;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * Audio & video translation - submit a task
 *
 * {
 *     "SourceLanguage": "en",
 *     "TargetLanguage": "zh",
 *     "Uri": "http://xx/xx.mp4"
 * }
 */
@Data
public class TranslateAudioSubmitRequest {
    @JSONField(name = "SourceLanguage")
    String sourceLanguage;

    @JSONField(name = "TargetLanguage")
    String targetLanguage;

    @JSONField(name = "Uri")
    String uri;
}
