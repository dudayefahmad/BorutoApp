package com.ahmaddudayef.borutoapp.data.repository

import com.ahmaddudayef.borutoapp.data.local.BorutoDatabase
import com.ahmaddudayef.borutoapp.domain.model.Hero
import com.ahmaddudayef.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {
    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}