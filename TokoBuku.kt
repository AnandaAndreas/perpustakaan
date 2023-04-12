package perpustakaan

class TokoBuku {
    var daftarBuku = mutableListOf<Buku>()

    fun tambahBuku(buku:Buku){
        daftarBuku.add(buku)
    }

    fun hapusBuku(buku: Buku){
        daftarBuku.remove(buku)
    }
}