package com.vinted.ds.workshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.vinted.bloom.compose.atom.BloomButton
import com.vinted.bloom.compose.atom.BloomSpacer
import com.vinted.bloom.compose.generated.theme.atom.BloomButtonStyling
import com.vinted.bloom.compose.generated.theme.atom.BloomSpacerStyling
import com.vinted.bloom.compose.generated.theme.molecule.BloomInfoBannerStyling
import com.vinted.bloom.compose.molecule.BloomInfoBanner
import com.vinted.bloom.compose.molecule.InfoBannerButton
import com.vinted.bloom.compose.molecule.list.BloomVerticalList
import com.vinted.bloom.compose.theme.BloomTheme
import com.vinted.ds.assets.BloomIcon
import com.vinted.imagesource.imageSourceModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BloomTheme {
                BloomVerticalList(
                    modifier = Modifier.padding(BloomTheme.dimensions.unit6.dp)
                ) {
                    BloomInfoBanner(
                        titleText = "Hello World!",
                        bodyText = "Please, have fun!",
                        style = BloomInfoBannerStyling.Style.TIGHT,
                        type = BloomInfoBannerStyling.Type.ERROR,
                        closable = true,
                        primaryButton = InfoBannerButton(
                            actionText = "Label",
                            actionContentDescription = null,
                        )
                    )

                    BloomSpacer(size = BloomSpacerStyling.Size.X_LARGER)

                    BloomButton(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Click me",
                        style = BloomButtonStyling.Style.FILLED,
                        theme = BloomButtonStyling.Theme.EXPOSE,
                        enabled = false,
                        startIcon = imageSourceModel(BloomIcon.LaughingFace24)
                    )
                }
            }
        }
    }
}