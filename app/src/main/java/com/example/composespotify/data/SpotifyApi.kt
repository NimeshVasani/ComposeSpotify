package com.example.composespotify.data

import retrofit2.http.GET


interface SpotifyApi {

    @GET("artists")
    suspend fun getArtists(
    )
}