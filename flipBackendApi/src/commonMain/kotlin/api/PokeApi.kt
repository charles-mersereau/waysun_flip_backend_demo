package com.waysuninc.flipbackendapi.api

import com.waysuninc.flipbackendapi.entities.User
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class PokeApi() : UserApi {

    private val url: String = "https://pokeapi.co/api/v2/"
    private val pokemonExtension: String = "pokemon/"

    override suspend fun getUser(username: String): User {

        val httpClient = HttpClient()

        val response: HttpResponse = httpClient.get(url + pokemonExtension + username)

        val parser = Json {
            ignoreUnknownKeys = true
        }

        return parser.decodeFromString(User.serializer(), response.readText())
    }

}