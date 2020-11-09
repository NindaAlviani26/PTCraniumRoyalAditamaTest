# Reviews

**Ceritakan apa itu OOP, object oriented programming**

*OOP (Object Oriented Programming) adalah metode pemrograman yang
 berorientasi object, yang memecahkan masalahnya dibagi berdasarkan objectobject yang berkaitan. Keunggulan dari oop itu, jika dia memiliki code yang sama,
 maka dia tidak perlu mengulangi code tersebut, kita bisa menggunakan kembali
 code yang telah ada dengan cara memanggil method nya.*

**Remark**

Jawaban terlalu dangkal. OOP mempunyai beberapa komponen penting. Hal ini tidak diterangkan.

**Score**

**2/4**

---

**Di java 8 ada dua komponen untuk implementasi abstraksi lebih baik, yaitu stream dan lambda. 
Ceritakan apa itu. Pada saat apakah kita membutuhkan stream atau lambda.**

*Stream adalah komponen implementasi abstraksi yang menawarkan alternatif
 untuk pengolahan collection, stream ini memberikan kita cara
 untuk memproses data lebih efisien, contoh ketika kita memproses data di dalam
 array, kita bisa mengubahnya menggunakan method stream*
 
*Lambda adalah sebuah ekspresi yang menggunakan fungsi anonim
 (anonymus function) fungsi yang didefinisikan tanpa menggunakan identifier
 tujuannya untuk menyederhanakan penggunaan interface yang hanya memiliki
 satu metode abstrak.*

*Penggunaan stream kita bisa implementasikan saat kita mengolah data
 yang membutuhkan iterator, dengan adanya stream kita bisa lakukan itu dengan
 lebih efisien
 sedangkan lambda bisa diimplementasikan saat ada sebuah interface yang hanya
 memiliki satu abstract method (functional interface)*

**Remark**

Jawaban terlalu dangkal.

**Score**

**2/4**

---

**Apa perbedaan antara interface, abstract kelas.**

- *Abstract class adalah sebuah class yang berisi abstract method atau non
 abstract method yang fungsinya untuk keperluan inheritance atau turunan,
 method-method yang ada di abstract class akan menjadi definisi umum bagi
 class-class turunannya.*
 - *sedangkan interface adalah sebuah class yang hanya menampung tipe data
 constan dan method abstract, dimana method-method ini hanya memuat
 deklarasi dan struktur method. Interface bisa di implementasikan oleh class
 turunan yang tidak memiliki method spesifik dari pewarisnya.*
 
 **Remark**
 
 Jawaban terlalu dangkal. Tidak menjawab prinsip mengapa dibutukan dua konsep diimplement dijava.
 
 **Score**
 
 **1/4**

___

**Apa itu functional interface, dibutuhkan pada saat apakah?**

*functional interface adalah class interface yang hanya memiliki satu method
 abstract. Jadi, setiap class interface yang kita buat hanya memiliki satu method
 abstract maka itu dinamakan functional interface. Kita bisa mengimplementasikan
 functional interface pada saat ekspresi lambda.*
 
**Remark**

Jawaban terlalu dangkal.

**Score**

**1/4**

---

**Terangkan apa itu SOLID principle. Apakah berguna?**

*solid principle adalah sebuah prinsip penulisan code dalam metode Object
 Oriented agar penulisan code lebih baik menurut prinsip penulisan code OOP*
 
*berikut saya jelaskan ringkasan dari SOLID principle ini*

*S = Single Responsibility Principle
 membagi kelas sesuai fungsinya, dan kelas itu hanya memiliki satu fungsi
 dan tanggung jawab, kelas itu dapat berubah sesuai dengan tugasnya*
 
*O = Open For extension, Closed For Modification Principle
 ini berguna untuk proses pewarisan, jadi kelas induk itu harus mudah untuk
 diwariskan dan tidak boleh diubah ubah lagi, dan untuk mengubahnya yaitu
 dengan cara mengubah pada kelas turunannya*
 
*L = Liskov Substitute Principle
kelas yang menjadi kelas turunan adalah kelas yang
menggunakan/mengimplementasikan behavior dari parentnya, jangan sampai
generate overide tapi kita mengosongkan codenya*

*I = Interface Segregation Principle
pembagian fungsi interface, ini berfungsi agar kelas interface mempunyai
tugas spesifik untuk setiap pengimplementasinya*

*D = Dependency inversion Principle
 ini prinsip ketergantungan, jadi modul level lebih tinggi tidak boleh
 mempunya ketergantungan kepada level yang lebih rendah, kedua level tersebut
 bergantung pada abstraksi*
 
*SOLID Principal ini sangat berguna sekali, agar penulisan code lebih baik menurut
 prinsipnnya*

 
**Remark**

Jawaban terlalu dangkal, beberapa prinsip dijawab kurang tepat.

**Score**

**1.5/4**

---

**Jika saya mempunyai integer : 1234567 , buat lah fungsi yang keluarannya 7654321 tanpa
  menggunakan library, atau string prosesing.**
  
**Remark**

Sesuai

**Score**

**2/2**

---

**Saya memiliki matrix sebagai berikut:**
  
 **Buat matrix class yang mempunya behavior untuk perkalian matrix. Coba untuk
  menyelesaikan perkalian matrix diatas.**
  
 **Remark**
 
Jawaban sesuai yang dimaksud, namun hasil perkalian matrixnya masih salah.
 
 **Score**
 
 **1/2**
 
 ---
 
**Apa itu unit testing. Bedakah dengan integration testing? Apa bedanya?**
 
 *Unit Testing adalah sebuah testing yang dilakukan terhadap objek-objek atau
  method-method yang dibuat untuk menguji kebenaran dan ketepatan code.
  Pengujian ini dilakukan di local code.
  Sedangkan Integration Testing adalah sebuah testing yang dilakukan terhadap
  kode yang sudah diimplementasikan. Pengujian ini cenderung menguji aplikasi
  apakah sudah berjalan sesuai yang diinginkan.*
 
 **Remark**
 
 Jawaban kurang tepat
 
 **Score**
 
 **1/4**
 
 ---
 
 **Terangkan apa itu TDD.**
 
 *TDD adalah singkatan dari Test-driven development merupakan sebuah siklus
  ppembangunan perangkat lunak yang sangat bergantung pada uji coba yang
  berulang dan issue yang perubahannya dinamis*
 
 **Remark**
 
 Jawaban dangkal dan kurang jelas.
 
 **Score**
 
 **2/4**
 
 ___
 ___
 
 **Total Score**
 
 (2 + 2 + 1 + 1 + 1.5 + 2 + 1 + 1 + 2) / (4 + 4 + 4 + 4 + 4 + 2 + 2 + 4 + 4) =
 12.5 / 30 = 0.23 * 100% = 42%
 
 **Nilai yang dicari**
 
 **80%**