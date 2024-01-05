package ru.tech.imageresizershrinker.core.ui.widget.saver

import androidx.compose.runtime.saveable.Saver
import ru.tech.imageresizershrinker.core.domain.image.draw.DrawPathMode

val DrawPathModeSaver: Saver<DrawPathMode, Int> = Saver(
    save = { it.ordinal },
    restore = { DrawPathMode(it) }
)