// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/response/response_vod.proto

package com.byteplus.service.vod.model.response;

public interface VodGetMediaInfosResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Response.VodGetMediaInfosResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.byteplus.service.vod.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <code>.Byteplus.Vod.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.byteplus.service.vod.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>.Byteplus.Vod.Models.Business.VodGetMediaInfosData Result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodGetMediaInfosData Result = 2;</code>
   * @return The result.
   */
  com.byteplus.service.vod.model.business.VodGetMediaInfosData getResult();
  /**
   * <code>.Byteplus.Vod.Models.Business.VodGetMediaInfosData Result = 2;</code>
   */
  com.byteplus.service.vod.model.business.VodGetMediaInfosDataOrBuilder getResultOrBuilder();
}
