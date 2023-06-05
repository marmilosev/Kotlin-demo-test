package com.example.demospringbootkotlin.controller

import com.example.demospringbootkotlin.model.Message
import com.example.demospringbootkotlin.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service:MessageService) {
    @GetMapping("/")
    fun index(@RequestParam("name") name : String) = "Hello, $name"
    @GetMapping("/list")
    fun index() = listOf<Message>(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!")
    )
    @GetMapping("/findMessages")
    fun find(): List<Message> = service.findMessages()
    @PostMapping("/")
    fun post(@RequestBody message: Message){
        service.save(message)
    }
    @GetMapping("/{id}")
    fun findId(@PathVariable id: String): List<Message> = service.findMessageById(id)
}