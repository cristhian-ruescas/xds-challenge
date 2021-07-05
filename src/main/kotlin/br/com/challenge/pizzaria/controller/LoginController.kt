package br.com.challenge.pizzaria.controller

import br.com.challenge.pizzaria.dto.Credentials
import br.com.challenge.pizzaria.dto.Login
import br.com.challenge.pizzaria.service.LoginService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1")
class LoginController {

    @Autowired
    lateinit var loginService: LoginService

    @PostMapping("/signin")
    fun login(@RequestBody user: Login): Credentials {
        return loginService.signin(user)
    }
}