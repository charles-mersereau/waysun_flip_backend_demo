package com.waysuninc.flipbackendapi.api

import com.waysuninc.flipbackendapi.entities.User
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

class PokeApi() : UserApi {

    private val url: String = "https://pokeapi.co/api/v2/"
    private val pokemonExtension: String = "pokemon/"

    override suspend fun getUser(name: String): User {

        val httpClient = HttpClient()

        val response: String = httpClient.get(url + pokemonExtension + name)

        val result = Json { ignoreUnknownKeys = true }.decodeFromString(User.serializer(),response)

        return result
    }


}