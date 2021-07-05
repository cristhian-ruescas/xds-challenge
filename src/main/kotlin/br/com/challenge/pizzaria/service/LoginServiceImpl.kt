package br.com.challenge.pizzaria.service

import br.com.challenge.pizzaria.client.LoginClient
import br.com.challenge.pizzaria.dto.Credentials
import br.com.challenge.pizzaria.dto.Login
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LoginServiceImpl : LoginService {
    @Autowired
    lateinit var loginClient: LoginClient

    override fun signin(user: Login): Credentials {
        return loginClient.signin(user)
    }
}