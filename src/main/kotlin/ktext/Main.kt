package ktext

import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfReader
import com.itextpdf.kernel.pdf.PdfWriter
import kotlin.jvm.JvmStatic

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val pdfDoc = PdfDocument(PdfReader(args[0]), PdfWriter(Util.getOutputName(args[0])))

            for (p in 1..pdfDoc.numberOfPages) {
                val page = pdfDoc.getPage(p)
                val rotate = page.rotation
                if (rotate == 0) {
                    page.rotation = 90
                }
                else {
                    page.rotation = (rotate + 90) % 360
                }
            }

            pdfDoc.close()
        }
    }
}