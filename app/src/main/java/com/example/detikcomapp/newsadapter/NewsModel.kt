import com.example.detikcomapp.R

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel {
    val newslists = listOf<news>(
        news("Fakta-fakta Menarik tentang Kopi yang perlu kalian ketahui",
            "detikNews | 1 Jam Yang Lalu",
            R.drawable.img_news1),

        news("Bentrok supoter Bola Akibatkan Korban Luka di Bogor, 26 Oran Diamankan",
            "detikNews | 1 Jam Yang Lalu",
            R.drawable.img_news2),

        news("Resep Makanan Enak tapi Sehat Wajib dicoba",
            "detikNews | 2 Jam Yang Lalu",
            R.drawable.img_news3),

        news("Pengelola Bicara soal Kampung Cina di Cibubur yang terlihat sepi",
            "detikNews | 3 Jam Yang Lalu",
            R.drawable.img_news4),

        news("Berikut cara atau Tips agar lolos UTBK SBMPTN 2022",
            "detikNews | 4 Jam Yang Lalu",
            R.drawable.img_news5),

        news("Efek Pandemi Wisata Candi Borobudur Ditutup",
            "detikNews | 5 Jam Yang Lalu",
            R.drawable.img_news6),

        news("Keindahan Alam Indonesia yang Tak Kala dengan Luar Negeri",
            "detikNews | 6 Jam Yang Lalu",
            R.drawable.img_news7),

        news("Ini Kronologi Perang Rusia-Ukraina Apa Penyebab Putin Murka?",
            "detikNews | 7 Jam Yang Lalu",
            R.drawable.img_news8),

        news("Penyebab Kemacetan di Puncak Bogor Pada Akir Pekan",
            "detikNews | Minggu,13 Febuari 2022 12.53 WIB",
            R.drawable.img_news9)



    )
}