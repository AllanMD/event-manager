package com.allan.tesis

import io.ktor.http.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.allan.tesis.routes.healthRoutes

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            healthRoutes()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello World!", bodyAsText())
        }
    }
}