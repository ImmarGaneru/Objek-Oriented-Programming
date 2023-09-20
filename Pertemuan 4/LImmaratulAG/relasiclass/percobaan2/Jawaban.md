1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
pada baris 5 dan 6 yaitu baris dimana atribut mobil dan sopir dideklarasikan 
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?
karena object sopir belum memiliki atribut hari
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
untuk menghitung biaya masing masing dari mobil dan sopir 
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ?
memberi nilai untuk atribut sopir dan mobil pada class pelanggan 
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ?
proses untuk memanggil method hitingbiayatotal pada class pelanggan yang mengembalikan nilai dari hitungbiayamobil dan hitungbiayamobil
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run!
System.out.println(p.getMobil().getMerk());
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?
digunakan untuk mengambil nilai merk dari class mobil melalui class pelanggan
