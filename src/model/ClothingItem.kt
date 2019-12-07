package model

data class ClothingItem(private var _type: String?, val size: String, var price: Double) {
    init {
        _type = _type?.toUpperCase() ?: "UNKNOWN"
    }

//    var type: String? = _type
//        get() = field ?: "Unknown"

    constructor( size: String, price: Double) : this( null, size, price) {
//        type = "Unknown"
    }
}