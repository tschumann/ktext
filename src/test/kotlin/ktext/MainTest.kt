package ktext

import kotlin.test.Test

class MainTest {

    @Test
    fun testNoSuchFile() {
        Main.main(arrayOf("no_such_file.pdf"))
    }

    @Test
    fun testNoSuchAction() {
        Main.main(arrayOf("test_cases/blank_page.pdf", "--refactor"))
    }
}