package com.byteplus.service.translate;

import com.byteplus.model.request.translate.*;
import com.byteplus.model.response.translate.*;
import com.byteplus.service.IBaseService;

/**
 * The interface Translate service.
 */
public interface ITranslateService extends IBaseService {
    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception;

    /**
     * @param langDetectRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    TranslateTextResponse translateText(TranslateTextRequest langDetectRequest) throws Exception;

    /**
     *
     * @param translateImageRequest translateImageRequest
     * @return TranslateImageResponse
     * @throws Exception the exception
     */
    TranslateImageResponse translateImage(TranslateImageRequest translateImageRequest) throws Exception;

    /**
     *
     * @param translateAudioSubmitRequest translateAudioSubmitRequest
     * @return TranslateAudioSubmitResponse
     * @throws Exception the exception
     */
    TranslateAudioSubmitResponse translateAudioSubmit(TranslateAudioSubmitRequest translateAudioSubmitRequest) throws Exception;

    /**
     *
     * @param translateAudioQueryRequest translateAudioQueryRequest
     * @return TranslateAudioQueryResponse
     * @throws Exception the exception
     */
    TranslateAudioQueryResponse translateAudioQuery(TranslateAudioQueryRequest translateAudioQueryRequest) throws Exception;

    /**
     *
     * @param glossaryPublishRequest glossaryPublish
     * @return GlossaryPublishResponse
     * @throws Exception the exception
     */
    GlossaryPublishResponse glossaryPublish(GlossaryPublishRequest glossaryPublishRequest) throws Exception;
}
