package ktext

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

            when (args[1]) {
                "--rotate" -> {
                    val pdf: PdfFile = PdfFile(args[0], true)
                    pdf.rotate()
                    pdf.close()
                }
                "--info" -> {
                    val pdf: PdfFile = PdfFile(args[0], false)
                    pdf.printInfo()
                    pdf.close()
                }
            }
        }
    }
}