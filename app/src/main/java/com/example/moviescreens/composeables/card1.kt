import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviescreens.R


@Preview
@Composable
fun card() {
        Image(

            painter = painterResource(id = R.drawable.placeholder),
            contentDescription = "image holder",
            alignment = Alignment.Center,
            modifier = Modifier.height(360.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop

        )
    }
