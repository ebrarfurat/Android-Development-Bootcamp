
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}


fun maasHesapla(gunSayisi: Int): Int {
    val saatUcreti = 10
    val mesaiUcreti = 20
    val saatlikCalisma = 8
    val toplamSaat = gunSayisi * saatlikCalisma

    return if (toplamSaat <= 160) {
        toplamSaat * saatUcreti
    } else {
        val normalSaat = 160
        val mesaiSaat = toplamSaat - 160
        (normalSaat * saatUcreti) + (mesaiSaat * mesaiUcreti)
    }
}


fun kotaUcretiHesapla(kullanilanGb: Int): Int {
    val standartUcret = 100
    val kotaSiniri = 50
    val asimUcret = 4

    return if (kullanilanGb <= kotaSiniri) {
        standartUcret
    } else {
        standartUcret + (kullanilanGb - kotaSiniri) * asimUcret
    }
}


fun dereceToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}


fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}


fun faktoriyel(sayi: Int): Int {
    var carpim = 1
    for (i in 1..sayi) {
        carpim *= i
    }
    return carpim
}


fun aHarfiSayisi(kelime: String): Int {
    return kelime.lowercase().count { it == 'a' }
}
