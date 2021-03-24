// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

public interface VodDeleteTranscodesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   *转码视频ID列表
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The fileIds.
   */
  java.lang.String getFileIds();
  /**
   * <pre>
   *转码视频ID列表
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The bytes for fileIds.
   */
  com.google.protobuf.ByteString
      getFileIdsBytes();

  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();
}
