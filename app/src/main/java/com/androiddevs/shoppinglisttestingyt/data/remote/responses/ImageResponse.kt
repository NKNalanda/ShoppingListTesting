package com.androiddevs.shoppinglisttestingyt.data.remote.responses

/**
 * Created by Nishant Kumar on 07-April-2022.
 */

data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)