fun main(){
    val ifMeloman = true
    val exValue = 850
    val value = 450000
    val discountIfTenThousantMore  = 0.05
    val discountIfOneThousantMore = 10000
    val melomanDiscount = 0.01
    val offThousant = value * discountIfTenThousantMore

    if (exValue > 10000 ){
        val priceInCent = value - offThousant
        if (ifMeloman == true) {
            val melomanPriceInCent:Int = (priceInCent - (priceInCent * melomanDiscount) ).toInt()
            val melomanPrice = melomanPriceInCent / 100
            val cent = melomanPrice % 100
            println("Цена составит:  $melomanPrice рублей $cent копеек.")
        } else {
            val price = priceInCent/100
            val cent: Int = (priceInCent % 100 ).toInt()
            println("Цена составит:  $price рублей $cent копеек.")
        }

    }else if (exValue > 1000 ){
        val price = value - discountIfOneThousantMore
        if (ifMeloman == true) {
            val melomanPriceInCent:Int = (price - (price * melomanDiscount) ).toInt()
            val melomanPrice = melomanPriceInCent / 100
            val cent: Int = (price % 100 ).toInt()
            println("Цена составит:  $melomanPrice рублей $cent копеек.")
        } else {
            val cent = price % 100
            println("Цена составит:  $price рублей $cent копеек.")
        }

    } else if (ifMeloman == true) {
        val priceInCent = value  - (value * melomanDiscount)
        val price = priceInCent / 100
        val cent: Int = (price % 100 / 100).toInt()
        println("Цена составит:  $price рублей $cent копеек.")
    } else {
        val price = value / 100
        val cent: Int = (value % 100 ).toInt()
        println("Цена составит: $price рублей $cent копеек.")
    }
}