1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
Setter digunakan untuk merubah nilai atribut yang bersifat private dari class lain dan getter digunakan untuk memanggil atribut yang brsifat private dari calss lain
2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?
konstruktor berparameter digunakan ketika kita ingin membuat objek baru sekaligus memberinya nilai, sedangkan konstruktor default digunakan untuk membuat objek yang belum memiliki nilai 
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?
atribut proc
4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?
pada baris ke 5 yaitu pada bagian deklarasi atribut proc dengan tipe Processor
5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
untuk memanggil method info dari class processor
6. Pada class MainPercobaan1, terdapat baris kode: Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ? Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?
program bisa dijalankan dan menghasilkan hasil yang sama