package br.com.challenge.pizzaria.service

import br.com.challenge.pizzaria.client.PizzaClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PizzaServiceImpl : PizzaService {

    @Autowired
    lateinit var pizzaClient: PizzaClient

    override fun getAllPizzas(): String {
        return pizzaClient.getAllPizzas()
    }
}