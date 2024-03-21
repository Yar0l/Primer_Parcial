package `interface`

interface IPromotion {
    val discount: Float //
    val typeDiscount: Int //

    fun getDiscountPrice(amount: Int): Float{
        return if (typeDiscount == 0){ //0 es porcentaje
            (amount* (100-discount))/100.0f
        }else{ //cantidad especifica
            amount-discount
        }
    }
}