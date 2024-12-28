package com.feature.buildSrc

object Configs {

    object BuildModule {
        const val FEATURE_PRESENTATION = ":feature:presentation"
        const val FEATURE_BUSINESS = ":feature:business"
        const val FEATURE_API = ":featureApi"
    }

    object Profile {
        const val PRESENTATION_NAMESPACE = "com.feature.presentation"
        const val BUSINESS_NAMESPACE = "com.feature.business"
        const val API_NAMESPACE = "com.feature.api"
    }

    object Demo {
        const val NAMESPACE = "com.feature.demo"
        const val APPLICATION_ID = "com.feature.demo"
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0.0"
    }

    object Artifact {
        const val GROUP_ID = "vn.finance.libs"
        const val ARTIFACT_PRESENTATION_ID = "feature-notification-presentation"
        const val ARTIFACT_BUSINESS_ID = "feature-notification-business"
        const val ARTIFACT_API_ID = "feature-notification-api"
        const val VERSION = "1.0.1"
    }
}
