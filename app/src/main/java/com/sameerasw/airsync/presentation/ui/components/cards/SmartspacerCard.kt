package com.sameerasw.airsync.presentation.ui.components.cards

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sameerasw.airsync.R

@Composable
fun SmartspacerCard(
    isSmartspacerShowWhenDisconnected: Boolean,
    onToggleSmartspacerShowWhenDisconnected: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    IconToggleItem(
        modifier = modifier,
        iconRes = R.drawable.rounded_asterisk_24,
        title = "Smartspacer",
        description = "Show Smartspacer when disconnected",
        isChecked = isSmartspacerShowWhenDisconnected,
        enabled = enabled,
        onCheckedChange = onToggleSmartspacerShowWhenDisconnected
    )
}


