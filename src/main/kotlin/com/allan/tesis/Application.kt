package com.allan.tesis

import com.allan.tesis.config.appModule
import io.ktor.server.application.*
import com.allan.tesis.plugins.*
import com.allan.tesis.routes.healthRoutes
import com.allan.tesis.routes.userRoutes
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger


fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    healthRoutes()
    userRoutes()

    install(Koin){
        slf4jLogger()
        modules(appModule)
    }

}
