package com.allan.tesis.routes

import com.allan.tesis.service.UserService
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import org.koin.ktor.ext.inject

fun Application.userRoutes() {

    val userService by inject<UserService>()

    routing {
        route("/users") {

            post {
                call.respond("TODO!")
            }

            get("/{userId}") {
                val userId = call.parameters["userId"]?.toLongOrNull()

                requireNotNull(userId) {"path param userId is required"}

                val response = userService.getById(userId)

                call.respond(response)
            }

        }
    }
}