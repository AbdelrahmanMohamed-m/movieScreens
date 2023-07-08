import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviescreens.R

@Composable
fun FakeImageRow(fakeImages: List<Int>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
    ) {
        items(fakeImages) { imageResource ->
            FakeImageCard(imageResource)
        }
    }
}

@Composable
fun FakeImageCard(imageResource: Int) {

        Image(
            painter = painterResource(imageResource),
            contentDescription = null,
            modifier = Modifier
                .size(72.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.FillBounds

        )

}

@Preview
@Composable
fun FakeImageListPreview() {
    val fakeImages = listOf(
        R.drawable.prince,
        R.drawable.images,
        R.drawable.catchme,
        R.drawable.catchme,
        R.drawable.catchme,
        R.drawable.catchme,
        R.drawable.catchme,
        R.drawable.catchme,
        R.drawable.catchme,
    )
    FakeImageRow(fakeImages)
}
