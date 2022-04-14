package com.penatabahasa.chapter5topic4.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Email(
    val email: String
):Parcelable