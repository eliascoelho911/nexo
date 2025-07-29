package com.eliascoelho911.nexo.presentation.icons

import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eliascoelho911.nexo.data.model.DynamicTheme
import com.eliascoelho911.nexo.data.model.ThemeMode
import com.eliascoelho911.nexo.presentation.theme.NexoTheme

val NexoStartScreen: ImageVector
    @Composable
    get() {
        // It should be recomposed when theme is changed. So calculate every time (Expensive, but only used in get started screen)
        return Builder(
            name = "NexoStartScreen",
            defaultWidth = 488.61.dp,
            defaultHeight = 317.24.dp,
            viewportWidth = 488.61f,
            viewportHeight =
            317.24f
        ).apply {
            path(
                fill = SolidColor(MaterialTheme.colorScheme.onBackground),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(152.57f, 80.51f)
                curveTo(142.37f, 88.79f, 136.7f, 103.0f, 139.69f, 118.31f)
                curveTo(138.12f, 120.65f, 136.89f, 123.18f, 135.97f, 125.87f)
                curveTo(131.19f, 135.62f, 131.19f, 146.46f, 135.97f, 156.21f)
                curveTo(136.89f, 158.9f, 138.12f, 161.43f, 139.69f, 163.77f)
                curveTo(136.7f, 179.08f, 142.37f, 193.29f, 152.57f, 201.57f)
                curveTo(152.26f, 203.63f, 152.04f, 205.69f, 151.9f, 207.76f)
                curveTo(151.26f, 219.85f, 156.87f, 231.36f, 166.25f, 239.04f)
                curveTo(167.92f, 240.43f, 169.68f, 241.71f, 171.53f, 242.86f)
                curveTo(179.95f, 254.56f, 193.59f, 261.85f, 208.07f, 262.78f)
                curveTo(209.64f, 262.88f, 211.22f, 262.9f, 212.8f, 262.83f)
                curveTo(230.45f, 263.85f, 247.43f, 256.51f, 259.21f, 243.26f)
                curveTo(261.26f, 242.1f, 263.19f, 240.76f, 264.98f, 239.26f)
                curveTo(274.36f, 231.58f, 279.97f, 220.07f, 279.33f, 207.98f)
                curveTo(279.19f, 205.91f, 278.97f, 203.85f, 278.66f, 201.79f)
                curveTo(288.86f, 193.51f, 294.53f, 179.3f, 291.54f, 163.99f)
                curveTo(293.11f, 161.65f, 294.34f, 159.12f, 295.26f, 156.43f)
                curveTo(300.04f, 146.68f, 300.04f, 135.84f, 295.26f, 126.09f)
                curveTo(294.34f, 123.4f, 293.11f, 120.87f, 291.54f, 118.53f)
                curveTo(294.53f, 103.22f, 288.86f, 89.01f, 278.66f, 80.73f)
                curveTo(278.97f, 78.67f, 279.19f, 76.61f, 279.33f, 74.54f)
                curveTo(279.97f, 62.45f, 274.36f, 50.94f, 264.98f, 43.26f)
                curveTo(263.19f, 41.76f, 261.26f, 40.42f, 259.21f, 39.26f)
                curveTo(247.43f, 26.01f, 230.45f, 18.67f, 212.8f, 19.69f)
                curveTo(211.22f, 19.62f, 209.64f, 19.64f, 208.07f, 19.74f)
                curveTo(193.59f, 20.67f, 179.95f, 27.96f, 171.53f, 39.66f)
                curveTo(169.68f, 40.81f, 167.92f, 42.09f, 166.25f, 43.48f)
                curveTo(156.87f, 51.16f, 151.26f, 62.67f, 151.9f, 74.76f)
                curveTo(152.04f, 76.83f, 152.26f, 78.89f, 152.57f, 80.95f)
                close()
            }
            path(
                fill = SolidColor(MaterialTheme.colorScheme.surface),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(212.8f, 35.69f)
                curveTo(201.71f, 35.1f, 190.8f, 38.76f, 181.89f, 45.2f)
                curveTo(174.68f, 50.37f, 169.04f, 57.41f, 165.56f, 65.62f)
                curveTo(162.09f, 73.84f, 160.92f, 82.84f, 162.19f, 91.71f)
                curveTo(163.45f, 100.57f, 167.09f, 108.94f, 172.67f, 115.88f)
                curveTo(174.89f, 118.79f, 177.43f, 121.42f, 180.25f, 123.74f)
                curveTo(177.43f, 126.06f, 174.89f, 128.69f, 172.67f, 131.6f)
                curveTo(167.09f, 138.54f, 163.45f, 146.91f, 162.19f, 155.77f)
                curveTo(160.92f, 164.64f, 162.09f, 173.64f, 165.56f, 181.86f)
                curveTo(169.04f, 190.07f, 174.68f, 197.11f, 181.89f, 202.28f)
                curveTo(190.8f, 208.72f, 201.71f, 212.38f, 212.8f, 211.79f)
                curveTo(223.89f, 212.38f, 234.8f, 208.72f, 243.71f, 202.28f)
                curveTo(250.92f, 197.11f, 256.56f, 190.07f, 260.04f, 181.86f)
                curveTo(263.51f, 173.64f, 264.68f, 164.64f, 263.41f, 155.77f)
                curveTo(262.15f, 146.91f, 258.51f, 138.54f, 252.93f, 131.6f)
                curveTo(250.71f, 128.69f, 248.17f, 126.06f, 245.35f, 123.74f)
                curveTo(248.17f, 121.42f, 250.71f, 118.79f, 252.93f, 115.88f)
                curveTo(258.51f, 108.94f, 262.15f, 100.57f, 263.41f, 91.71f)
                curveTo(264.68f, 82.84f, 263.51f, 73.84f, 260.04f, 65.62f)
                curveTo(256.56f, 57.41f, 250.92f, 50.37f, 243.71f, 45.2f)
                curveTo(234.8f, 38.76f, 223.89f, 35.1f, 212.8f, 35.69f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun IconPreview() {
    NexoTheme(
        dynamicTheme = DynamicTheme.OFF,
        themeMode = ThemeMode.LIGHT
    ) {
        Image(
            imageVector = NexoStartScreen,
            contentDescription = null
        )
    }
}