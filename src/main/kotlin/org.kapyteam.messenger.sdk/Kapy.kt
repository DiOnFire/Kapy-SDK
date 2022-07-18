package org.kapyteam.messenger.sdk

sealed class Kapy {
    private var server: String
        get() = server
        set(value) { server = value }

    fun connect() {

    }

    fun checkConnection(): Boolean = true

    fun sendMessage() {

    }

    fun getDialogues() {

    }

    fun getProfile() {

    }

    fun updateProfile() {

    }
}