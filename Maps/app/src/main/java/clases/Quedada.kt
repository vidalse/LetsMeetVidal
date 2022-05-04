package clases

import android.media.Image


class Quedada() {

    public final lateinit var idquedada:String
    var temática:String
        get() {
            TODO()
        }
        set(value) {}
    var nombreSala:String
        get() {
            TODO()
        }
        set(value) {}
    var ubicacionlongitud:Float
        get() {
            TODO()
        }
        set(value) {}
    var ubicacionlatitud:Float
        get() {
            TODO()
        }
        set(value) {}
    var descripcion:String
        get() {
            TODO()
        }
        set(value) {}
    var foto: Image
        get() {
            TODO()
        }
        set(value) {}


    constructor(
        ide: String,
        tema: String,
        nombresal: String,
        ubiclon: Float,
        ubiclati: Float,
        descrip: String,
        foto: Image
    ) : this()
}