package com.squareup.sqldelight.internal

internal actual fun currentThreadId(): Long = Thread.currentThread().id
