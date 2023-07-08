import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviescreens.R


@Preview
@Composable
fun card() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.placeholder),
            contentDescription = "image holder",
            alignment = Alignment.Center,
            modifier = Modifier.weight(0.5f),
            contentScale = ContentScale.Crop

        )
        Box(modifier = Modifier.weight(0.5f))
    }

}
