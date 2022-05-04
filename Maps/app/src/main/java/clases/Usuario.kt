package clases


class Usuario {
    public final lateinit var nombre:String
    public final lateinit var apellido:String
    public final lateinit var dni:String
    public final lateinit var mail:String
    var direccion:String
    var edad:Int
    var subInform:Boolean

    constructor(
        nom: String,
        ape: String,
        dn: String,
        direcc: String,
        mai: String,
        eda: Int,
        subInf: Boolean,
        edad: Int,
        subInform: Boolean,
        direccion: String
    ) {
        this.edad = edad
        this.subInform = subInform
        this.direccion = direccion
    }

}