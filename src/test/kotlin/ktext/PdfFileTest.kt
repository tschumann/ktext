package ktext

import kotlin.test.Test
import kotlin.test.assertNotNull

class PdfFileTest {

    @Test
    fun testOpenPdf() {
        val pdf: PdfFile = PdfFile("test_cases/blank_page.pdf")

        assertNotNull(pdf)

        pdf.close()
    }

    @Test
    fun testPrintInfo() {
        val pdf: PdfFile = PdfFile("test_cases/blank_page.pdf")

        assertNotNull(pdf)

        pdf.printInfo()

        pdf.close()
    }
}