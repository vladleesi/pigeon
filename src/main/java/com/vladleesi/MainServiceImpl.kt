package com.vladleesi

import com.vladleesi.grpc.MainServiceGrpc
import com.vladleesi.grpc.MainServiceOuterClass.MainRequest
import com.vladleesi.grpc.MainServiceOuterClass.MainResponse
import io.grpc.stub.StreamObserver

class MainServiceImpl : MainServiceGrpc.MainServiceImplBase() {

    override fun process(request: MainRequest, responseObserver: StreamObserver<MainResponse>) {
        val response =
            MainResponse.newBuilder()
                .setResult("Processed text: ${request.text}")
                .build()

        responseObserver.onNext(response)
        responseObserver.onCompleted()
    }
}