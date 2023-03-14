package com.byteplus.service.translate.impl;

import com.alibaba.fastjson.JSON;
import com.byteplus.error.SdkError;
import com.byteplus.helper.Const;
import com.byteplus.model.request.translate.*;
import com.byteplus.model.response.*;
import com.byteplus.model.response.translate.*;
import com.byteplus.service.BaseServiceImpl;
import com.byteplus.service.translate.ITranslateService;
import com.byteplus.service.translate.TranslateConfig;


public class TranslateServiceImpl extends BaseServiceImpl implements ITranslateService {

    private TranslateServiceImpl() {
        super(TranslateConfig.serviceInfo, TranslateConfig.apiInfoList);
    }

    public static ITranslateService getInstance() {
        return new TranslateServiceImpl();
    }


    /**
     * @param langDetectRequest LangDetectRequest
     * @return LangDetectResponse
     * @throws Exception the exception
     */
    @Override
    public LangDetectResponse langDetect(LangDetectRequest langDetectRequest) throws Exception {
        RawResponse response = json(Const.LangDetect, null, JSON.toJSONString(langDetectRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), LangDetectResponse.class);
    }

    /**
     * @param translateTextRequest TranslateTextRequest
     * @return TranslateTextResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateTextResponse translateText(TranslateTextRequest translateTextRequest) throws Exception {
        RawResponse response = json(Const.TranslateText, null, JSON.toJSONString(translateTextRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateTextResponse.class);
    }

    /**
     * @param translateImageRequest translateImageRequest
     * @return TranslateImageResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateImageResponse translateImage(TranslateImageRequest translateImageRequest) throws Exception {
        RawResponse response = json(Const.TranslateImage, null, JSON.toJSONString(translateImageRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateImageResponse.class);
    }

    /**
     * @param translateAudioSubmitRequest translateAudioSubmitRequest
     * @return TranslateAudioSubmitResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateAudioSubmitResponse translateAudioSubmit(TranslateAudioSubmitRequest translateAudioSubmitRequest) throws Exception {
        RawResponse response = json(Const.TranslateAudioSubmit, null, JSON.toJSONString(translateAudioSubmitRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateAudioSubmitResponse.class);
    }

    /**
     * @param translateAudioQueryRequest translateAudioQueryRequest
     * @return TranslateAudioQueryResponse
     * @throws Exception the exception
     */
    @Override
    public TranslateAudioQueryResponse translateAudioQuery(TranslateAudioQueryRequest translateAudioQueryRequest) throws Exception {
        RawResponse response = json(Const.TranslateAudioQuery, null, JSON.toJSONString(translateAudioQueryRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), TranslateAudioQueryResponse.class);
    }

    @Override
    public GlossaryPublishResponse glossaryPublish(GlossaryPublishRequest glossaryPublishRequest) throws Exception {
        RawResponse response = json(Const.GlossaryPublish, null, JSON.toJSONString(glossaryPublishRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        return JSON.parseObject(response.getData(), GlossaryPublishResponse.class);
    }
}
