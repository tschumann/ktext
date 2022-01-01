package ktext

import com.itextpdf.kernel.pdf.*
import jtext.Util

class PdfFile(fileName: String, write: Boolean) {

    private val fileName: String = fileName
    private val document: PdfDocument =  if (write) PdfDocument(PdfReader(fileName), PdfWriter(Util.getOutputName(fileName))) else PdfDocument(PdfReader(fileName))

    fun rotate() {
        val numberOfPages: Int = document.numberOfPages
        println("Rotating $numberOfPages pages in $fileName 90 degrees clockwise")

        for (p in 1..numberOfPages) {
            val page: PdfPage = document.getPage(p)
            val rotation: Int = page.rotation

            page.rotation = (rotation + 90) % 360
        }
    }

    fun printInfo() {
        val info: PdfDocumentInfo = document.documentInfo
        println("Author: " + (info.author ?: ""))
        println("Subject: " + (info.subject ?: ""))
        println("Keywords: " + (info.keywords ?: ""))
        println("Creator: " + (info.creator ?: ""))
        println("Producer: " + (info.producer ?: ""))
    }

    fun close() {
        document.close()
    }
}