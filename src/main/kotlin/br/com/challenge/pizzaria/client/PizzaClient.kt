package br.com.challenge.pizzaria.client

import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("pizza", url = "https://p3teufi0k9.execute-api.us-east-1.amazonaws.com")
@RibbonClient(name = "pizza")
interface PizzaClient {
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/v1/pizza"]
    )
    fun getAllPizzas(): String
}