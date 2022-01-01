package ktext

import kotlin.test.Test
import kotlin.test.assertNotNull

class PdfFileTest {

    @Test
    fun testOpenPdf() {
        val pdf: PdfFile = PdfFile("test_cases/blank_page.pdf", false)

        assertNotNull(pdf)
    }

    @Test
    fun testPrintInfo() {
        val pdf: PdfFile = PdfFile("test_cases/blank_page.pdf", false)

        assertNotNull(pdf)

        pdf.printInfo()
    }
}