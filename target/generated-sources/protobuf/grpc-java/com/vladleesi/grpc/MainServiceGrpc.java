package com.vladleesi.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: MainService.proto")
public final class MainServiceGrpc {

  private MainServiceGrpc() {}

  public static final String SERVICE_NAME = "com.vladleesi.grpc.MainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.vladleesi.grpc.MainServiceOuterClass.MainRequest,
      com.vladleesi.grpc.MainServiceOuterClass.MainResponse> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "process",
      requestType = com.vladleesi.grpc.MainServiceOuterClass.MainRequest.class,
      responseType = com.vladleesi.grpc.MainServiceOuterClass.MainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.vladleesi.grpc.MainServiceOuterClass.MainRequest,
      com.vladleesi.grpc.MainServiceOuterClass.MainResponse> getProcessMethod() {
    io.grpc.MethodDescriptor<com.vladleesi.grpc.MainServiceOuterClass.MainRequest, com.vladleesi.grpc.MainServiceOuterClass.MainResponse> getProcessMethod;
    if ((getProcessMethod = MainServiceGrpc.getProcessMethod) == null) {
      synchronized (MainServiceGrpc.class) {
        if ((getProcessMethod = MainServiceGrpc.getProcessMethod) == null) {
          MainServiceGrpc.getProcessMethod = getProcessMethod =
              io.grpc.MethodDescriptor.<com.vladleesi.grpc.MainServiceOuterClass.MainRequest, com.vladleesi.grpc.MainServiceOuterClass.MainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vladleesi.grpc.MainServiceOuterClass.MainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.vladleesi.grpc.MainServiceOuterClass.MainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MainServiceMethodDescriptorSupplier("process"))
              .build();
        }
      }
    }
    return getProcessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MainServiceStub newStub(io.grpc.Channel channel) {
    return new MainServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MainServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MainServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void process(com.vladleesi.grpc.MainServiceOuterClass.MainRequest request,
        io.grpc.stub.StreamObserver<com.vladleesi.grpc.MainServiceOuterClass.MainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.vladleesi.grpc.MainServiceOuterClass.MainRequest,
                com.vladleesi.grpc.MainServiceOuterClass.MainResponse>(
                  this, METHODID_PROCESS)))
          .build();
    }
  }

  /**
   */
  public static final class MainServiceStub extends io.grpc.stub.AbstractStub<MainServiceStub> {
    private MainServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceStub(channel, callOptions);
    }

    /**
     */
    public void process(com.vladleesi.grpc.MainServiceOuterClass.MainRequest request,
        io.grpc.stub.StreamObserver<com.vladleesi.grpc.MainServiceOuterClass.MainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MainServiceBlockingStub extends io.grpc.stub.AbstractStub<MainServiceBlockingStub> {
    private MainServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.vladleesi.grpc.MainServiceOuterClass.MainResponse process(com.vladleesi.grpc.MainServiceOuterClass.MainRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MainServiceFutureStub extends io.grpc.stub.AbstractStub<MainServiceFutureStub> {
    private MainServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.vladleesi.grpc.MainServiceOuterClass.MainResponse> process(
        com.vladleesi.grpc.MainServiceOuterClass.MainRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS:
          serviceImpl.process((com.vladleesi.grpc.MainServiceOuterClass.MainRequest) request,
              (io.grpc.stub.StreamObserver<com.vladleesi.grpc.MainServiceOuterClass.MainResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.vladleesi.grpc.MainServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MainService");
    }
  }

  private static final class MainServiceFileDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier {
    MainServiceFileDescriptorSupplier() {}
  }

  private static final class MainServiceMethodDescriptorSupplier
      extends MainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MainServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MainServiceFileDescriptorSupplier())
              .addMethod(getProcessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
