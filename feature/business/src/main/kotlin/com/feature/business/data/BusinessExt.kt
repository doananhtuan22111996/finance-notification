package com.feature.business.data

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

internal const val EMPTY_STRING = ""

internal const val DATE_FORMAT = "HH:mm dd/MM/yyyy"

fun String.format2Date(): LocalDateTime = if (this.isNotEmpty()) {
    LocalDateTime.parse(
        this,
        DateTimeFormatter.ISO_DATE_TIME,
    )
} else {
    LocalDateTime.now()
}

fun String.format2StringDate(pattern: String = DATE_FORMAT): String = format2Date().format(DateTimeFormatter.ofPattern(pattern))
