PERCOBAAN 1

1. cara memperbaiki kode program adalah dengan menambahkan extends ClassA pada ClassB
2. karena kita memanggil method dari ClassA melalui ClassB sedangkan kedua Class belum terhubung

PERCOBAAN 2

1. Menambahkan extends pada ClassB dan merubah variabel pada ClassA menjadi public
2. Karena belum ada hubungan antara ClassB dan ClassA dan variabel pada Class A bersifat private sehingga tidak dapat digunakan ClassB

PERCOBAAN 3

1. fungsi super digunakan untuk mengakses atribut dari parent class
2. fungsi super mengambil nilai r dari class parent dan fungsi this mengambil nilai dari class pemilik method tersebut
3. karena kita telah menghubungkan kedua class tersebut menggunakan extends dimana bangun sebagai class parent dan kita menggunakan fungsi super untuk memanggil nilai atributnya

PERCOBAAN 4
1. pada percobaan 4, ClassA adalah superclass dari ClassB, ClassB adalah subclass bagi ClassA dan superClass bagi ClassC, dan ClassC adalah subclass bagi ClassB
3. perilaku default dalam pewarisan kelas java untuk memanggil konstruktor superclass ketika kita membuat objek pada subclass. ketika kita memberi ClassC super();, ClassC akan memanggil superclassnya yaitu ClassB yang kemudian memanggil superclassnya yaitu ClassA dimana ClassA adalah yang pertama dieksekusi. Hal ini merupakan proses yang sama ketika super(); berlum diberi kepada ClassC 
4. super(); berfungsi untuk memanggil konstruktor dari superclass sebuah subclass