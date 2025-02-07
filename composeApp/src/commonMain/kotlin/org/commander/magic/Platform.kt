package org.commander.magic

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform