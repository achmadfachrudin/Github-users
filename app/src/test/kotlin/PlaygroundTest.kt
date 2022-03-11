import com.astro.achmad.Playground
import org.junit.Assert.assertEquals
import org.junit.Test

internal class PlaygroundTest {

    private val testSample: Playground = Playground()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}
