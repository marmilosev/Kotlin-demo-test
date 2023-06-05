package com.example.demospringbootkotlin.repository

import com.example.demospringbootkotlin.model.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
}