package com.allan.tesis.routes

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.healthRoutes() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
    }
}
