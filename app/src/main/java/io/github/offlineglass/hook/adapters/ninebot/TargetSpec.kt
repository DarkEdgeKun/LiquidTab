package io.github.offlineglass.hook.adapters.ninebot

import io.github.offlineglass.targets.AdapterSource
import io.github.offlineglass.targets.TargetSpec

internal val targetSpec: TargetSpec = TargetSpec(
    "ninebot", "cn.ninebot.ninebot", "九号出行", AdapterSource.GENERIC_FALLBACK,
    activityHints = setOf(
        "cn.ninebot.ninebot.mainshell.MainActivity",
        "cn.ninebot.ninebot.mainshell.SplashActivity",
    ),
    classHints = setOf("MainActivity", "ConstraintLayout", "FrameLayout"),
    textHints = setOf("设备", "发现", "商城", "服务", "我的"),
    preferredSlots = 5..5,
    supportsPostButton = false,
    defaultAccentColor = 0xFF00B4D8.toInt(),
    entryLabels = listOf("设备", "发现", "商城", "服务", "我的"),
)
