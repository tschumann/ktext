package ktext

import com.itextpdf.kernel.pdf.*
import jtext.Util
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
                    println("Rotating $numberOfPages pages in ${args[0]} 90 degrees clockwise")

                    for (p in 1..numberOfPages) {
                        val page: PdfPage = document.getPage(p)
                        val rotation: Int = page.rotation

                        page.rotation = (rotation + 90) % 360
                    }
                }
                "--info" -> {
                    val info: PdfDocumentInfo = document.documentInfo
                    println("Author: " + (info.author ?: ""))
                    println("Subject: " + (info.subject ?: ""))
                    println("Keywords: " + (info.keywords ?: ""))
                    println("Creator: " + (info.creator ?: ""))
                    println("Producer: " + (info.producer ?: ""))
                }
            }

            document.close()
        }
    }
}