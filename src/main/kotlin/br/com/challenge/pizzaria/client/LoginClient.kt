package br.com.challenge.pizzaria.client

import br.com.challenge.pizzaria.dto.Credentials
import br.com.challenge.pizzaria.dto.Login
import feign.Body
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.*

@FeignClient("signin", url = "https://p3teufi0k9.execute-api.us-east-1.amazonaws.com")
@RibbonClient(name = "signin")
interface LoginClient {

    @RequestMapping(method = [RequestMethod.POST], value = ["/v1/signin"], consumes = ["application/json"])
    fun signin(@RequestBody user: Login): Credentials

}