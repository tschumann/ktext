package ktext

import com.itextpdf.kernel.pdf.*
import java.io.File
import kotlin.jvm.JvmStatic

class Main {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val input: File = File(args[0])
            if (!input.exists()) {
                println("No such file ${args[0]}")
                return
            }

            val document: PdfDocument = PdfDocument(PdfReader(args[0]), PdfWriter(Util.getOutputName(args[0])))

            when (args[1]) {
                "--rotate" -> {
                    val numberOfPages: Int = document.numberOfPages
                    println("Rotating $numberOfPages pages in ${args[0]} 90 degrees")

                    for (p in 1..numberOfPages) {
                        val page: PdfPage = document.getPage(p)
                        val rotation: Int = page.rotation
                        if (rotation == 0) {
                            page.rotation = 90
                        }
                        else {
                            page.rotation = (rotation + 90) % 360
                        }
                    }
                }
                "--info" -> {
                    val info: PdfDocumentInfo = document.documentInfo
                    println(info.author)
                    println(info.subject)
                    println(info.keywords)
                    println(info.creator)
                    println(info.producer)
                }
            }

            document.close()
        }
    }
}