package br.com.challenge.pizzaria.service

import br.com.challenge.pizzaria.dto.Credentials
import br.com.challenge.pizzaria.dto.Login

interface LoginService {
    fun signin(user: Login): Credentials
}