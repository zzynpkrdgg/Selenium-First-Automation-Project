
/**
 * Project Name : DEMOQA-Practice-Form-Automation-Demo
 * Developer    : Zeynep Karadağ
 * Version      : 1.0.0
 * Date         :9/07/2025
 * Time         : 4.00 PM
 * Description  :
 **/
# Öğrenci Formu Spesifikasyonu
## Tüm Alanları Geçerli Verilerle Doldurma

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "ali.veli@example.com" "5551234567" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

## Gerekli Alanları Eksik Bırakma - First Name

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "" "Veli" "ali.veli@example.com" "5551234567" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun hata gösterdiğini doğrula "First Name".

---

## Gerekli Alanları Eksik Bırakma - Last Name

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "" "ali.veli@example.com" "5551234567" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun hata gösterdiğini doğrula "Last Name".

---

## Gerekli Alanları Eksik Bırakma - Email

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "" "5551234567" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun hata gösterdiğini doğrula "Email".

---

## Gerekli Alanları Eksik Bırakma - Mobile Number

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "ali.veli@example.com" "" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun hata gösterdiğini doğrula "Mobile Number".

---

## Geçersiz Email Formatı

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "gecersizemail" "5551234567" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Geçersiz email formatı hatasını doğrula.

---

## Geçersiz Mobil Telefon Numarası Formatı - Çok Kısa

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "ali.veli@example.com" "123" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Geçersiz mobil numara formatı hatasını doğrula "minimum basamak sayısı".

---

## Geçersiz Mobil Telefon Numarası Formatı - Sayısal Olmayan Karakterler

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ali" "Veli" "ali.veli@example.com" "abcde12345" "15 May 1990" "Test Address, Test City".
* Cinsiyet seçimi "Male".
* Konu girişi "Computer Science".
* Hobi seçimi "Sports".
* Formu gönder.
* Geçersiz mobil numara formatı hatasını doğrula "sadece sayısal giriş".

---

## Cinsiyet Seçimi - Female

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Ayşe" "Demir" "ayse.demir@example.com" "5559876543" "20 Jan 1995" "Örnek Sokak No:10".
* Cinsiyet seçimi "Female".
* Konu girişi "Art".
* Hobi seçimi "Reading".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

## Cinsiyet Seçimi - Other

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Can" "Kara" "can.kara@example.com" "5551112233" "01 Sep 1988" "Deneme Caddesi No:5".
* Cinsiyet seçimi "Other".
* Konu girişi "History".
* Hobi seçimi "Music".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

## Tüm Hobileri Seçme

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Efe" "Yılmaz" "efe.yilmaz@example.com" "5554445566" "05 Mar 2000" "Yeni Mahalle Sokak No:7".
* Cinsiyet seçimi "Male".
* Konu girişi "Physics".
* Hobi seçimi "Sports,Reading,Music".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

## Konu Seçmeden Form Gönderme

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Zeynep" "Aslan" "zeynep.aslan@example.com" "5557778899" "10 Dec 1992" "Gül Sokak No:1".
* Cinsiyet seçimi "Female".
* Konu girişi "".
* Hobi seçimi "Reading".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

## Doğum Tarihi - Gelecek Tarih

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Mehmet" "Şahin" "mehmet.sahin@example.com" "5552223344" "01 Jan 2030" "Ana Cadde No:20".
* Cinsiyet seçimi "Male".
* Konu girişi "Math".
* Hobi seçimi "Music".
* Formu gönder.
* Formun hata gösterdiğini doğrula "Date of Birth".

---

## Doğum Tarihi - Bugünün Tarihi

* Kullanıcı URL adresine "https://demoqa.com/automation-practice-form" gider.
* Öğrenci kayıt formunu doldur "Elif" "Kaya" "elif.kaya@example.com" "5556667788" "09 Jul 2025" "Lale Sokak No:3".
* Cinsiyet seçimi "Female".
* Konu girişi "Chemistry".
* Hobi seçimi "Sports".
* Formu gönder.
* Formun başarıyla gönderildiğini doğrula.

---

