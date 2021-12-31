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

            val pdf: PdfFile = PdfFile(args[0])

            when (args[1]) {
                "--rotate" -> {
                    pdf.rotate()
                }
                "--info" -> {
                    pdf.printInfo()
                }
            }

            pdf.close()
        }
    }
}