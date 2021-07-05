package br.com.challenge.pizzaria

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class PizzariaApplication

fun main(args: Array<String>) {
    runApplication<PizzariaApplication>(*args)
}
