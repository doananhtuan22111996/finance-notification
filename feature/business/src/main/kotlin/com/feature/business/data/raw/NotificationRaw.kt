package com.feature.business.data.raw

import com.feature.business.data.EMPTY_STRING
import com.feature.business.domain.model.NotificationModel
import vn.core.data.model.BaseRaw

class NotificationRaw(
    private val id: Int? = -1,
    private val title: String? = EMPTY_STRING,
    private val description: String? = EMPTY_STRING,
    val date: String? = EMPTY_STRING,
    private val type: String? = EMPTY_STRING,
) : BaseRaw() {
    override fun raw2Model(): NotificationModel = NotificationModel(
        id = id ?: -1,
        title = title ?: EMPTY_STRING,
        description = description ?: EMPTY_STRING,
        date = date ?: EMPTY_STRING,
        type = type ?: EMPTY_STRING,
    )
}
