// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.model.vod.request;

public final class VodRequest {
  private VodRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodGetPlayInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodGetPlayInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodGetOriginalPlayInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodGetOriginalPlayInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodQueryUploadTaskInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodQueryUploadTaskInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodApplyUploadInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodApplyUploadInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodUploadMediaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodUploadMediaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodCommitUploadInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodCommitUploadInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadJsonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodUrlUploadJsonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodGetRecommendedPosterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodGetRecommendedPosterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaPublishStatusRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaPublishStatusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodDeleteMediaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodDeleteMediaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Models_Vod_Request_VodStartWorkflowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Models_Vod_Request_VodStartWorkflowRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035vod/request/request_vod.proto\022\035Volceng" +
      "ine.Models.Vod.Request\032\036google/protobuf/" +
      "wrappers.proto\032\037vod/business/vod_workflo" +
      "w.proto\032\035vod/business/vod_upload.proto\"\254" +
      "\001\n\025VodGetPlayInfoRequest\022\013\n\003Vid\030\001 \001(\t\022\016\n" +
      "\006Format\030\002 \001(\t\022\r\n\005Codec\030\003 \001(\t\022\022\n\nDefiniti" +
      "on\030\004 \001(\t\022\020\n\010FileType\030\005 \001(\t\022\020\n\010LogoType\030\006" +
      " \001(\t\022\016\n\006Base64\030\007 \001(\t\022\013\n\003Ssl\030\010 \001(\t\022\022\n\nNee" +
      "dThumbs\030\t \001(\t\"I\n\035VodGetOriginalPlayInfoR" +
      "equest\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Base64\030\002 \001(\t\022\013\n\003S" +
      "sl\030\003 \001(\t\"m\n\023VodUrlUploadRequest\022\021\n\tSpace" +
      "Name\030\001 \001(\t\022C\n\007URLSets\030\002 \003(\01322.Volcengine" +
      ".Models.Vod.Business.VodUrlUploadURLSet\"" +
      "/\n\035VodQueryUploadTaskInfoRequest\022\016\n\006JobI" +
      "ds\030\001 \001(\t\"T\n\031VodApplyUploadInfoRequest\022\021\n" +
      "\tSpaceName\030\001 \001(\t\022\022\n\nSessionKey\030\002 \001(\t\022\020\n\010" +
      "FileSize\030\003 \001(\001\"e\n\025VodUploadMediaRequest\022" +
      "\021\n\tSpaceName\030\001 \001(\t\022\020\n\010FilePath\030\002 \001(\t\022\024\n\014" +
      "CallbackArgs\030\003 \001(\t\022\021\n\tFunctions\030\004 \001(\t\"l\n" +
      "\032VodCommitUploadInfoRequest\022\021\n\tSpaceName" +
      "\030\001 \001(\t\022\022\n\nSessionKey\030\002 \001(\t\022\024\n\014CallbackAr" +
      "gs\030\003 \001(\t\022\021\n\tFunctions\030\004 \001(\t\"=\n\027VodUrlUpl" +
      "oadJsonRequest\022\021\n\tSpaceName\030\001 \001(\t\022\017\n\007URL" +
      "Sets\030\002 \001(\t\".\n\036VodGetRecommendedPosterReq" +
      "uest\022\014\n\004Vids\030\001 \001(\t\"A\n\"VodUpdateMediaPubl" +
      "ishStatusRequest\022\013\n\003Vid\030\001 \001(\t\022\016\n\006Status\030" +
      "\002 \001(\t\"\345\001\n\031VodUpdateMediaInfoRequest\022\013\n\003V" +
      "id\030\001 \001(\t\022/\n\tPosterUri\030\002 \001(\0132\034.google.pro" +
      "tobuf.StringValue\022+\n\005Title\030\003 \001(\0132\034.googl" +
      "e.protobuf.StringValue\0221\n\013Description\030\004 " +
      "\001(\0132\034.google.protobuf.StringValue\022*\n\004Tag" +
      "s\030\005 \001(\0132\034.google.protobuf.StringValue\"\'\n" +
      "\027VodGetMediaInfosRequest\022\014\n\004Vids\030\001 \001(\t\";" +
      "\n\025VodDeleteMediaRequest\022\014\n\004Vids\030\001 \001(\t\022\024\n" +
      "\014CallbackArgs\030\002 \001(\t\"P\n\032VodDeleteTranscod" +
      "esRequest\022\013\n\003Vid\030\001 \001(\t\022\017\n\007FileIds\030\002 \001(\t\022" +
      "\024\n\014CallbackArgs\030\003 \001(\t\"\241\001\n\027VodStartWorkfl" +
      "owRequest\022\013\n\003Vid\030\001 \001(\t\022\022\n\nTemplateId\030\002 \001" +
      "(\t\022=\n\005Input\030\003 \001(\0132..Volcengine.Models.Vo" +
      "d.Business.WorkflowParams\022\020\n\010Priority\030\004 " +
      "\001(\005\022\024\n\014CallbackArgs\030\005 \001(\tB\250\001\n com.volcen" +
      "gine.model.vod.requestB\nVodRequestP\001Z8gi" +
      "thub.com/volcengine/volc-sdk-golang/mode" +
      "ls/vod/request\240\001\001\330\001\001\312\002\027Volc\\Models\\Vod\\R" +
      "equest\342\002\033Volc\\Models\\Vod\\GPBMetadatab\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.volcengine.model.vod.business.VodWorkflow.getDescriptor(),
          com.volcengine.model.vod.business.VodUpload.getDescriptor(),
        });
    internal_static_Volcengine_Models_Vod_Request_VodGetPlayInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Models_Vod_Request_VodGetPlayInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodGetPlayInfoRequest_descriptor,
        new java.lang.String[] { "Vid", "Format", "Codec", "Definition", "FileType", "LogoType", "Base64", "Ssl", "NeedThumbs", });
    internal_static_Volcengine_Models_Vod_Request_VodGetOriginalPlayInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Models_Vod_Request_VodGetOriginalPlayInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodGetOriginalPlayInfoRequest_descriptor,
        new java.lang.String[] { "Vid", "Base64", "Ssl", });
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodUrlUploadRequest_descriptor,
        new java.lang.String[] { "SpaceName", "URLSets", });
    internal_static_Volcengine_Models_Vod_Request_VodQueryUploadTaskInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Models_Vod_Request_VodQueryUploadTaskInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodQueryUploadTaskInfoRequest_descriptor,
        new java.lang.String[] { "JobIds", });
    internal_static_Volcengine_Models_Vod_Request_VodApplyUploadInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Models_Vod_Request_VodApplyUploadInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodApplyUploadInfoRequest_descriptor,
        new java.lang.String[] { "SpaceName", "SessionKey", "FileSize", });
    internal_static_Volcengine_Models_Vod_Request_VodUploadMediaRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Models_Vod_Request_VodUploadMediaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodUploadMediaRequest_descriptor,
        new java.lang.String[] { "SpaceName", "FilePath", "CallbackArgs", "Functions", });
    internal_static_Volcengine_Models_Vod_Request_VodCommitUploadInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Models_Vod_Request_VodCommitUploadInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodCommitUploadInfoRequest_descriptor,
        new java.lang.String[] { "SpaceName", "SessionKey", "CallbackArgs", "Functions", });
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadJsonRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Volcengine_Models_Vod_Request_VodUrlUploadJsonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodUrlUploadJsonRequest_descriptor,
        new java.lang.String[] { "SpaceName", "URLSets", });
    internal_static_Volcengine_Models_Vod_Request_VodGetRecommendedPosterRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Volcengine_Models_Vod_Request_VodGetRecommendedPosterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodGetRecommendedPosterRequest_descriptor,
        new java.lang.String[] { "Vids", });
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaPublishStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaPublishStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaPublishStatusRequest_descriptor,
        new java.lang.String[] { "Vid", "Status", });
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodUpdateMediaInfoRequest_descriptor,
        new java.lang.String[] { "Vid", "PosterUri", "Title", "Description", "Tags", });
    internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodGetMediaInfosRequest_descriptor,
        new java.lang.String[] { "Vids", });
    internal_static_Volcengine_Models_Vod_Request_VodDeleteMediaRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_Volcengine_Models_Vod_Request_VodDeleteMediaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodDeleteMediaRequest_descriptor,
        new java.lang.String[] { "Vids", "CallbackArgs", });
    internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodDeleteTranscodesRequest_descriptor,
        new java.lang.String[] { "Vid", "FileIds", "CallbackArgs", });
    internal_static_Volcengine_Models_Vod_Request_VodStartWorkflowRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_Volcengine_Models_Vod_Request_VodStartWorkflowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Models_Vod_Request_VodStartWorkflowRequest_descriptor,
        new java.lang.String[] { "Vid", "TemplateId", "Input", "Priority", "CallbackArgs", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.volcengine.model.vod.business.VodWorkflow.getDescriptor();
    com.volcengine.model.vod.business.VodUpload.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
