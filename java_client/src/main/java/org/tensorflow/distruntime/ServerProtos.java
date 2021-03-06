// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/tensorflow_server.proto

package org.tensorflow.distruntime;

public final class ServerProtos {
  private ServerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_JobDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_JobDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_JobDef_TasksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_JobDef_TasksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ClusterDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ClusterDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ServerDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ServerDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0tensorflow/core/protobuf/tensorflow_se" +
      "rver.proto\022\ntensorflow\032%tensorflow/core/" +
      "protobuf/config.proto\"r\n\006JobDef\022\014\n\004name\030" +
      "\001 \001(\t\022,\n\005tasks\030\002 \003(\0132\035.tensorflow.JobDef" +
      ".TasksEntry\032,\n\nTasksEntry\022\013\n\003key\030\001 \001(\005\022\r" +
      "\n\005value\030\002 \001(\t:\0028\001\"-\n\nClusterDef\022\037\n\003job\030\001" +
      " \003(\0132\022.tensorflow.JobDef\"\245\001\n\tServerDef\022\'" +
      "\n\007cluster\030\001 \001(\0132\026.tensorflow.ClusterDef\022" +
      "\020\n\010job_name\030\002 \001(\t\022\022\n\ntask_index\030\003 \001(\005\0227\n" +
      "\026default_session_config\030\004 \001(\0132\027.tensorfl",
      "ow.ConfigProto\022\020\n\010protocol\030\005 \001(\tB/\n\032org." +
      "tensorflow.distruntimeB\014ServerProtosP\001\370\001" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.ConfigProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_JobDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_JobDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_JobDef_descriptor,
        new java.lang.String[] { "Name", "Tasks", });
    internal_static_tensorflow_JobDef_TasksEntry_descriptor =
      internal_static_tensorflow_JobDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_JobDef_TasksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_JobDef_TasksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_ClusterDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_ClusterDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ClusterDef_descriptor,
        new java.lang.String[] { "Job", });
    internal_static_tensorflow_ServerDef_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_ServerDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ServerDef_descriptor,
        new java.lang.String[] { "Cluster", "JobName", "TaskIndex", "DefaultSessionConfig", "Protocol", });
    org.tensorflow.framework.ConfigProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
