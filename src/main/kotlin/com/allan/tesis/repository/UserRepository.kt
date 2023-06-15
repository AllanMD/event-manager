package com.allan.tesis.repository

import com.allan.tesis.dto.User

class UserRepository {

    fun findById(id: Long): User {
        return User(id)
    }
}