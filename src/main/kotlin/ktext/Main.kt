package ktext

import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfPage
import com.itextpdf.kernel.pdf.PdfReader
import com.itextpdf.kernel.pdf.PdfWriter
import java.io.File
import kotlin.jvm.JvmStatic

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val input: File = File(args[0])
            if (!input.exists()) {
                kotlin.io.println("No such file ${args[0]}")
                return
            }

            val document: PdfDocument = PdfDocument(PdfReader(args[0]), PdfWriter(Util.getOutputName(args[0])))

            when (args[1]) {
                "--rotate" -> {
                    val numberOfPages: Int = document.getNumberOfPages()
                    kotlin.io.println("Rotating ${numberOfPages} pages in ${args[0]} 90 degrees")

                    for (p in 1..numberOfPages) {
                        val page: PdfPage = document.getPage(p)
                        val rotation: Int = page.getRotation()
                        if (rotation == 0) {
                            page.rotation = 90
                        }
                        else {
                            page.rotation = (rotation + 90) % 360
                        }
                    }
                }
            }

            document.close()
        }
    }
}