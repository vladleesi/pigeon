package com.vladleesi

import io.grpc.ServerBuilder
import java.io.IOException

/**
 * Hello world!
 */
object App {
    @Throws(InterruptedException::class, IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("Server is starting..")
        val server = ServerBuilder.forPort(8080)
            .addService(MainServiceImpl())
            .build()
        server.start()
        println("Server started")
        server.awaitTermination()
    }
}
