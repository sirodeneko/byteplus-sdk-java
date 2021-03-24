// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest}
 */
public final class VodDeleteTranscodesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest)
    VodDeleteTranscodesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDeleteTranscodesRequest.newBuilder() to construct.
  private VodDeleteTranscodesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDeleteTranscodesRequest() {
    vid_ = "";
    fileIds_ = "";
    callbackArgs_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDeleteTranscodesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDeleteTranscodesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            vid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fileIds_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            callbackArgs_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.request.VodDeleteTranscodesRequest.class, com.volcengine.model.vod.request.VodDeleteTranscodesRequest.Builder.class);
  }

  public static final int VID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vid_;
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  @java.lang.Override
  public java.lang.String getVid() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *视频ID
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVidBytes() {
    java.lang.Object ref = vid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILEIDS_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileIds_;
  /**
   * <pre>
   *转码视频ID列表
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The fileIds.
   */
  @java.lang.Override
  public java.lang.String getFileIds() {
    java.lang.Object ref = fileIds_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileIds_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *转码视频ID列表
   * </pre>
   *
   * <code>string FileIds = 2;</code>
   * @return The bytes for fileIds.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileIdsBytes() {
    java.lang.Object ref = fileIds_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileIds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLBACKARGS_FIELD_NUMBER = 3;
  private volatile java.lang.Object callbackArgs_;
  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  @java.lang.Override
  public java.lang.String getCallbackArgs() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callbackArgs_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *回调回传参数
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallbackArgsBytes() {
    java.lang.Object ref = callbackArgs_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callbackArgs_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getVidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vid_);
    }
    if (!getFileIdsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileIds_);
    }
    if (!getCallbackArgsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, callbackArgs_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vid_);
    }
    if (!getFileIdsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileIds_);
    }
    if (!getCallbackArgsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, callbackArgs_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.model.vod.request.VodDeleteTranscodesRequest)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.request.VodDeleteTranscodesRequest other = (com.volcengine.model.vod.request.VodDeleteTranscodesRequest) obj;

    if (!getVid()
        .equals(other.getVid())) return false;
    if (!getFileIds()
        .equals(other.getFileIds())) return false;
    if (!getCallbackArgs()
        .equals(other.getCallbackArgs())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VID_FIELD_NUMBER;
    hash = (53 * hash) + getVid().hashCode();
    hash = (37 * hash) + FILEIDS_FIELD_NUMBER;
    hash = (53 * hash) + getFileIds().hashCode();
    hash = (37 * hash) + CALLBACKARGS_FIELD_NUMBER;
    hash = (53 * hash) + getCallbackArgs().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.model.vod.request.VodDeleteTranscodesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest)
      com.volcengine.model.vod.request.VodDeleteTranscodesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.request.VodDeleteTranscodesRequest.class, com.volcengine.model.vod.request.VodDeleteTranscodesRequest.Builder.class);
    }

    // Construct using com.volcengine.model.vod.request.VodDeleteTranscodesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      vid_ = "";

      fileIds_ = "";

      callbackArgs_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.request.VodRequest.internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodDeleteTranscodesRequest getDefaultInstanceForType() {
      return com.volcengine.model.vod.request.VodDeleteTranscodesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodDeleteTranscodesRequest build() {
      com.volcengine.model.vod.request.VodDeleteTranscodesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.request.VodDeleteTranscodesRequest buildPartial() {
      com.volcengine.model.vod.request.VodDeleteTranscodesRequest result = new com.volcengine.model.vod.request.VodDeleteTranscodesRequest(this);
      result.vid_ = vid_;
      result.fileIds_ = fileIds_;
      result.callbackArgs_ = callbackArgs_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.model.vod.request.VodDeleteTranscodesRequest) {
        return mergeFrom((com.volcengine.model.vod.request.VodDeleteTranscodesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.request.VodDeleteTranscodesRequest other) {
      if (other == com.volcengine.model.vod.request.VodDeleteTranscodesRequest.getDefaultInstance()) return this;
      if (!other.getVid().isEmpty()) {
        vid_ = other.vid_;
        onChanged();
      }
      if (!other.getFileIds().isEmpty()) {
        fileIds_ = other.fileIds_;
        onChanged();
      }
      if (!other.getCallbackArgs().isEmpty()) {
        callbackArgs_ = other.callbackArgs_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.model.vod.request.VodDeleteTranscodesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.request.VodDeleteTranscodesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vid_ = "";
    /**
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The vid.
     */
    public java.lang.String getVid() {
      java.lang.Object ref = vid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return The bytes for vid.
     */
    public com.google.protobuf.ByteString
        getVidBytes() {
      java.lang.Object ref = vid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The vid to set.
     * @return This builder for chaining.
     */
    public Builder setVid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVid() {
      
      vid_ = getDefaultInstance().getVid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *视频ID
     * </pre>
     *
     * <code>string Vid = 1;</code>
     * @param value The bytes for vid to set.
     * @return This builder for chaining.
     */
    public Builder setVidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fileIds_ = "";
    /**
     * <pre>
     *转码视频ID列表
     * </pre>
     *
     * <code>string FileIds = 2;</code>
     * @return The fileIds.
     */
    public java.lang.String getFileIds() {
      java.lang.Object ref = fileIds_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileIds_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *转码视频ID列表
     * </pre>
     *
     * <code>string FileIds = 2;</code>
     * @return The bytes for fileIds.
     */
    public com.google.protobuf.ByteString
        getFileIdsBytes() {
      java.lang.Object ref = fileIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *转码视频ID列表
     * </pre>
     *
     * <code>string FileIds = 2;</code>
     * @param value The fileIds to set.
     * @return This builder for chaining.
     */
    public Builder setFileIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileIds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *转码视频ID列表
     * </pre>
     *
     * <code>string FileIds = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileIds() {
      
      fileIds_ = getDefaultInstance().getFileIds();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *转码视频ID列表
     * </pre>
     *
     * <code>string FileIds = 2;</code>
     * @param value The bytes for fileIds to set.
     * @return This builder for chaining.
     */
    public Builder setFileIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileIds_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object callbackArgs_ = "";
    /**
     * <pre>
     *回调回传参数
     * </pre>
     *
     * <code>string CallbackArgs = 3;</code>
     * @return The callbackArgs.
     */
    public java.lang.String getCallbackArgs() {
      java.lang.Object ref = callbackArgs_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callbackArgs_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *回调回传参数
     * </pre>
     *
     * <code>string CallbackArgs = 3;</code>
     * @return The bytes for callbackArgs.
     */
    public com.google.protobuf.ByteString
        getCallbackArgsBytes() {
      java.lang.Object ref = callbackArgs_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callbackArgs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *回调回传参数
     * </pre>
     *
     * <code>string CallbackArgs = 3;</code>
     * @param value The callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgs(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callbackArgs_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *回调回传参数
     * </pre>
     *
     * <code>string CallbackArgs = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallbackArgs() {
      
      callbackArgs_ = getDefaultInstance().getCallbackArgs();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *回调回传参数
     * </pre>
     *
     * <code>string CallbackArgs = 3;</code>
     * @param value The bytes for callbackArgs to set.
     * @return This builder for chaining.
     */
    public Builder setCallbackArgsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callbackArgs_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Request.VodDeleteTranscodesRequest)
  private static final com.volcengine.model.vod.request.VodDeleteTranscodesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.request.VodDeleteTranscodesRequest();
  }

  public static com.volcengine.model.vod.request.VodDeleteTranscodesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDeleteTranscodesRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodDeleteTranscodesRequest>() {
    @java.lang.Override
    public VodDeleteTranscodesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDeleteTranscodesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDeleteTranscodesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDeleteTranscodesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.request.VodDeleteTranscodesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

