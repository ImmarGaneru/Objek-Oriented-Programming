Nama    : Lalu Immaratul Ardhi Ganeru
Kelas   : TI-2C
NIM     : 2241720169

Percobaan 1
1. Class apa sajakah yang merupakan turunan dari class Employee?
class internshipEmployee dan PermanentEmployee
2. Class apa sajakah yang implements ke interface Payable?
class PermanentEmployee dan class ElectricityBill
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee)  dan objek iEmp (merupakan objek dari class InternshipEmploye) ?
baris 10 dan 11 menunjukkan konsep polimorfisme dimana variable e yang merupakan onjek dari class Employee diisi dengan objek dari kelas PermanentEmployee dan InternshipEmployee yang merupakan subclass dari class Employee
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi denganobjekpEmp (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ?
hal ini mirip seperti baris 10 dan 11 tetapi merupakan penggunaan konsep interface 
5. Coba tambahkan sintaks:
    p = iEmp;
    e = eBill;
    pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
error terjadi karena Payable tidak diturunkan ke internshipEmployee dan superclass Employee tidak diturunkan ke class ElecticityBill
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
polimorfisme memungkinkan kita untuk menggunakan metode dengan nama yang sama pada class yang berbeda atau dengan fugnsi yang berbeda. Hal ini memberikan kita fleksibilitas dalam desain dan pengembangan perangkat lunak.

Percobaan 2
1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
karena objek e diisi dengan objek pEmp sehingga menghasilkan output yang sama
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan pEmp.getEmployeeInfo() tidak?
karena dalam pemrograman berorientasi objek, pemanggilan metode pada variabel yang dideklarasikan menggunakan tipe kelas induk dapat mereferensikan pada metode kelas yang ditunjuk oleh objek saat dijalankan
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?
Virtual Method Invocation mengacu pada pemanggilan metode pada variabel yang dideklarasikan menggunakan tipe kelas induk, di mana implementasi metode yang sesuai dipilih pada saat runtime berdasarkan objek yang sebenarnya ditunjuk oleh variabel tersebut

Percobaan 3
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?
karena kedua objek tersebut merupakan subclass dari class Employee
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
karena kedua class tersebut mengimplementasikan interface payable
3. Perhatikan baris ke-10, mengapa terjadi error?
karena baris tersebut memasukkan objek eBill ke dalam objek e yang dimana bukan merupakan parent class dari objek eBill

Percobaan 4
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable?
karena objek eBill dan objek pEmp mengimplementasikan interface payable
2. Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee? Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?
agar metode tersebut dapat digunakan oleh objek yang mengimplementasikan interface payable
3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);
    Mengapa terjadi error?
karena objek iEmp tidak mengimplementasikan interface payable yang membuatnya tidak cocok dengan parameter pada metode
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?
sintaks tersebut digunakan untuk mengecek apakah objek pada parameter merupakan instance dari class ElectricityBill
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?
hal ini karena metode pay menerima parameter bertipe payable yang merupakan tipe objek yang mengimplementasikan interface Payable
