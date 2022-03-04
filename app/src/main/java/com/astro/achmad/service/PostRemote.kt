package com.astro.achmad.service

import com.achmad.feature.post.data.entity.SearchUserEntity
import com.achmad.feature.post.data.entity.UserEntity
import com.skydoves.sandwich.ApiResponse
import javax.inject.Inject

class PostRemote @Inject constructor(
    private val service: PostService
) {

    suspend fun fetchUser(username: String): ApiResponse<UserEntity> = service.fetchUser(username)

    suspend fun searchUser(
        query: String,
        order: String,
        page: Int
    ): ApiResponse<SearchUserEntity> =
        service.searchUser(
            query = query,
            order = order,
            page = page
        )
}
