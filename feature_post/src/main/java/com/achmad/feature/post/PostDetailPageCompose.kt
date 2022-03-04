package com.achmad.feature.post

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.achmad.feature.post.data.model.User
import com.astro.achmad.theme.component.BaseToolbar

@Composable
fun PostDetailPageCompose(
    model: User,
) {
    Column {
        BaseToolbar(
            title = "Detail",
            showLeftButton = false
        )
        RowPost(model) { }
    }
}
