package com.allan.tesis.config

import com.allan.tesis.repository.UserRepository
import com.allan.tesis.service.UserService
import org.koin.dsl.module

val appModule = module {
    single { UserRepository() }
    single { UserService(get()) }
}