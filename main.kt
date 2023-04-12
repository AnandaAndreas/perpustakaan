package perpustakaan

fun main() {
    val toko = TokoBuku()
    do {
        print("Apakah anda ingin menambahkan buku. Y/N ? ")
        var pilih = readln()
        if (pilih.equals("Y", ignoreCase = true)){
            print("Masukan Judul : ")
            val judul = readln()
            print("Masukan Penulis : ")
            val penulis = readln()
            print("Masukan Harga : ")
            val harga = readln().toInt()

            val masukanBuku = Buku(judul, penulis, harga)
            toko.tambahBuku(masukanBuku)
        }
    }while (pilih.equals("y", ignoreCase = true))

    do {
        println("\nIsi Daftar Buku : ")
        for ((i, buku) in toko.daftarBuku.withIndex()){
            println("${i+1}. ${buku.judul} oleh ${buku.penulis} harga Rp.${buku.harga}")
        }
        print("Apakah anda ingin menghapus buku Y/N ? ")
        var pilih = readln()
        if (pilih.equals("Y", ignoreCase = true)){
            print("Nomer yang ingin anda hapus : ")
            var nomer = readln().toInt()
            toko.daftarBuku.removeAt(index = nomer-1)
        }
    }while (pilih.equals("y", ignoreCase = true))
    println("Program Selesai")
}