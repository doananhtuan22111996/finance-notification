package com.feature.business.domain.model

import vn.core.domain.BaseModel

data class NotificationModel(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val type: String,
) : BaseModel()
