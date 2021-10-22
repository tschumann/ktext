package ktext

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UtilTest {

    @Test
    fun testGetOutputName() {
        Assertions.assertEquals("out_modified.pdf", Util.getOutputName("out"))
    }
}