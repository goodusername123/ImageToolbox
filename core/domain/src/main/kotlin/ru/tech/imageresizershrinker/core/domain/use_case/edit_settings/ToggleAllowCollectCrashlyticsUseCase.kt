package ru.tech.imageresizershrinker.core.domain.use_case.edit_settings

import ru.tech.imageresizershrinker.core.domain.repository.SettingsRepository
import javax.inject.Inject

class ToggleAllowCollectCrashlyticsUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {
    suspend operator fun invoke() = settingsRepository.toggleAllowCrashlytics()
}