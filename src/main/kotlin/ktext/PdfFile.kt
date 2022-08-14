package ktext

import com.itextpdf.kernel.geom.PageSize
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
        val documentInfo: PdfDocumentInfo = document.documentInfo
        println("Author: " + (documentInfo.author ?: ""))
        println("Subject: " + (documentInfo.subject ?: ""))
        println("Keywords: " + (documentInfo.keywords ?: ""))
        println("Creator: " + (documentInfo.creator ?: ""))
        println("Producer: " + (documentInfo.producer ?: ""))
        val pdfVersion: PdfVersion = document.pdfVersion
        println("PDF version: $pdfVersion")
        // this returns page size in points where a point is 1/72 inch
        val pageSize: PageSize = document.defaultPageSize
        println("Default page size: $pageSize")
    }

    fun close() {
        document.close()
    }
}