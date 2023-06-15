package com.allan.tesis.service

import com.allan.tesis.dto.User
import com.allan.tesis.repository.UserRepository

class UserService(private val userRepository: UserRepository) {

    fun getById(id: Long): User {
        return userRepository.findById(id)
    }
}