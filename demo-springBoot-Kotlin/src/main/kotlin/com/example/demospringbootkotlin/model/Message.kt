package com.example.demospringbootkotlin.model

import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGES")
data class Message (val id: String?, val text: String) {
}