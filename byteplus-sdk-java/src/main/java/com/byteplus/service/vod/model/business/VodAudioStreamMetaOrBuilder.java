// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.byteplus.service.vod.model.business;

public interface VodAudioStreamMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Byteplus.Vod.Models.Business.VodAudioStreamMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *音频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   *音频编码格式
   * </pre>
   *
   * <code>string Codec = 1;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   *音频时长
   * </pre>
   *
   * <code>float Duration = 2;</code>
   * @return The duration.
   */
  float getDuration();

  /**
   * <pre>
   *音频采样率
   * </pre>
   *
   * <code>int32 SampleRate = 3;</code>
   * @return The sampleRate.
   */
  int getSampleRate();

  /**
   * <pre>
   *音频码率(Kbps)
   * </pre>
   *
   * <code>int32 Bitrate = 4;</code>
   * @return The bitrate.
   */
  int getBitrate();
}
