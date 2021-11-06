package ktext

class Util {

    companion object {
        fun getOutputName(fileName: String): String {
            return fileName.plus("_modified.pdf")
        }
    }
}