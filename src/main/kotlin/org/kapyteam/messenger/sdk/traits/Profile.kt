package org.kapyteam.messenger.sdk.traits

data class Profile(
    var nickname: String,
    var firstname: String,
    var surname: String,
    var phone: String,
    val uuid: Int
)
