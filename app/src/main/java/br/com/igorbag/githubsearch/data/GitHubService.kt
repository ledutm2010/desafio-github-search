package br.com.igorbag.githubsearch.data

import br.com.igorbag.githubsearch.domain.Repository
import retrofit2.Call
import retrofit2.http.GET

interface GitHubService {

    @GET("users/{user}/repos")
    fun getAllRepositoriesByUser(): Call<List<Repository>>
}
