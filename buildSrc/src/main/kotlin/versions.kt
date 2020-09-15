import org.gradle.kotlin.dsl.DependencyHandlerScope

/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

object Versions {
    object Mirai {
        const val consoleWrapper = "1.3.0"
    }

    object Kotlin {
        // const val stdlib = "1.3.72"
        const val stdlib = "1.4.10"
        const val coroutines = "1.3.5"
        const val serialization = "0.20.0"
        const val ktor = "1.3.2"
    }
}

@Suppress("unused")
fun DependencyHandlerScope.kotlinx(id: String, version: String) = "org.jetbrains.kotlinx:kotlinx-$id:$version"

@Suppress("unused")
fun DependencyHandlerScope.ktor(id: String, version: String = Versions.Kotlin.ktor) = "io.ktor:ktor-$id:$version"
