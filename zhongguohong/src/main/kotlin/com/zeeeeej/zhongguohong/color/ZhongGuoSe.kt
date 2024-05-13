package com.zeeeeej.zhongguohong.color

sealed interface ZhongGuoSe {
    val a: Int
        get() = 0xff
    val r: Int
    val g: Int
    val b: Int

}

//data class ARGB(val alpha: Int, val red: Int, val green: Int, val blue: Int)
//data class YUV(val y: Int, val u: Int, val v: Int)
//data class CMYK(val c: Int, val m: Int, val y: Int, val k: Int)
//
//val ZhongGuoSe.toARGB: ARGB
//    get() = ARGB(
//        alpha = (this.a * 100f).toInt(),
//        red = (this.r * 255f).toInt(),
//        green = (this.r * 255f).toInt(),
//        blue = (this.b).toInt()
//    )
//
//val ZhongGuoSe.toYUV: YUV
//    get() = YUV(
//        y = (this.a * 255f).toInt(),
//        u = (this.r * 255f).toInt(),
//        v = (this.r * 255f).toInt(),
//    )
//
//val ZhongGuoSe.toCMYK: CMYK
//    get() = CMYK(
//        c = (this.a * 100f).toInt(),
//        m = (this.r * 255f).toInt(),
//        y = (this.g * 255f).toInt(),
//        k = (this.b * 255f).toInt(),
//    )
