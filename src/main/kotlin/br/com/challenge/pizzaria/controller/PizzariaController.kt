package br.com.challenge.pizzaria.controller

import br.com.challenge.pizzaria.service.PizzaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class PizzariaController {

    @Autowired
    lateinit var pizzaService: PizzaService

    @GetMapping("/pizza")
    fun getPizza(): String {
        return pizzaService.getAllPizzas()
    }

}
