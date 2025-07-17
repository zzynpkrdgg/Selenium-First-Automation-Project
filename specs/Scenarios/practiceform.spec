# Öğrenci Formu Spesifikasyonu

Form alanının açılması
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.

Tüm Alanları Geçerli Verilerle Doldurma
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

// Diğer senaryoları da aynı şekilde parametreli ve güncel step isimleriyle bırakıyoruz.

Gerekli Alanları Eksik Bırakma - First Name
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Gerekli Alanları Eksik Bırakma - Last Name
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Gerekli Alanları Eksik Bırakma - Email
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Gerekli Alanları Eksik Bırakma - Mobile Number
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Geçersiz Email Formatı
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_invalid_email" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.
Geçersiz Mobil Telefon Numarası Formatı - Çok Kısa
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_invalid_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.
Geçersiz Mobil Telefon Numarası Formatı - Sayısal Olmayan Karakterler
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_invalid_mobile2" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Cinsiyet Seçimi - Female
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "reading" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Cinsiyet Seçimi - Other
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender3" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "music" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Tüm Hobileri Seçme
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "Data_hobbies_all" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Konu Seçmeden Form Gönderme
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth1" olarak seçer.
* Kullanıcı Subjects alanına "" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Doğum Tarihi - Gelecek Tarih
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth2" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.

Doğum Tarihi - Bugünün Tarihi
------
* Öğrenci kayıt formununu "Data_url" url bağlantısı ile açar.
* Kullanıcı First Name alanına "Data_firstname" yazar.
* Kullanıcı Last Name alanına "Data_lastname" yazar.
* Kullanıcı Email alanına "Data_email1" yazar.
* Kullanıcı "Data_gender1" cinsiyet butonunu seçer.
* Kullanıcı Mobile alanına "Data_mobile1" yazar.
* Kullanıcı Date of Birth alanını "Data_dateOfBirth3" olarak seçer.
* Kullanıcı Subjects alanına "subject" yazar.
* Kullanıcı "hobbies" hobby checkbox'ını seçer.
* Kullanıcı Current Address alanına "Data_address" yazar.
* Formu gönderir.
* Formun başarıyla gönderildiği doğrulanır.