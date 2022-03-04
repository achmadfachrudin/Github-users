package com.astro.achmad.di

import android.content.SharedPreferences
import com.astro.achmad.cache.PostDao
import com.astro.achmad.service.PostRemote
import com.astro.achmad.service.PostRepository
import com.astro.achmad.service.PostService
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface FeaturePostDependencies {

    fun sharedPreferences(): SharedPreferences
    fun postRepository(): PostRepository
    fun postService(): PostService
    fun postRemote(): PostRemote
    fun postDao(): PostDao
}
