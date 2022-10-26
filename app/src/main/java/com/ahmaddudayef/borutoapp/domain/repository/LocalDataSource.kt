package com.ahmaddudayef.borutoapp.domain.repository

import com.ahmaddudayef.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}