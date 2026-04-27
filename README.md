# 📱 Vibes - Social Media Minimalis (Tugas Praktikum Deployment)

Vibes adalah aplikasi media sosial minimalis berbasis web yang dibangun menggunakan **Spring Boot** dan antarmuka **Thymeleaf**. Aplikasi ini merupakan hasil transformasi dari sistem informasi mahasiswa menjadi platform *micro-blogging* dengan tema **Dark Moon** (Desktop Layout). Proyek ini dibuat untuk memenuhi tugas mata kuliah **Software Deployment Pertemuan 6**.

---

## 🚀 Fitur Utama
1. **Autentikasi Sederhana**: Sistem login dengan username dan password yang sudah ditentukan (hardcoded).
2. **Beranda (Feed Lini Masa)**: Menampilkan daftar postingan secara berurutan, lengkap dengan informasi pembuat, waktu tayang, konten teks, dan foto (dengan dukungan gambar hingga 10MB melalui konversi Base64).
3. **Eksplor (Galeri)**: Menampilkan koleksi foto-foto unggahan pengguna dalam bentuk *Grid* yang responsif.
4. **Buat Postingan**: Antarmuka untuk mengunggah foto dan menulis status yang akan dipublikasikan ke Lini Masa.
5. **Profil Pengguna**: Menampilkan informasi detail pengguna, metrik pengikut, serta rekam jejak foto yang telah diunggah.

---

## 🛠️ Teknologi yang Digunakan
* **Backend**: Java 25, Spring Boot 3.x
* **Frontend**: HTML5, Vanilla CSS3 (Tema Desktop Dark Moon), Thymeleaf
* **Database**: H2 Database (In-Memory / File-based)
* **Deployment**: Docker & Docker Hub

---

## 📸 Dokumentasi Antarmuka (Screenshots)

> **Catatan untuk Pengguna:** Silakan masukkan (Replace) file screenshot yang sesuai ke dalam folder `screenshot` atau ganti URL gambar di bawah ini dengan nama file screenshot milik Anda.

### 1. Halaman Login
![Halaman Login](screenshoots/login.png)
*Antarmuka login dengan tema Dark Moon.*

### 2. Halaman Beranda (Feed)
![Halaman Beranda](screenshoots/home.png)
*Menampilkan lini masa (feed) tempat pengguna melihat status dan foto terbaru.*

### 3. Halaman Buat Postingan
![Halaman Posting](screenshoots/post.png)
*Formulir untuk membagikan momen (mendukung unggahan gambar lokal hingga 10MB).*

### 4. Halaman Eksplor & Profil
![Halaman Eksplor](screenshoots/explore.png)
*Galeri foto grid.*

---

## 🐳 Dokumentasi Docker

Aplikasi ini telah di-*containerization* menggunakan Docker agar dapat diakses dan dijalankan dengan mudah pada lingkungan apapun.

### 1. Docker Images
Berikut adalah *screenshot* dari image `demo6-app` yang telah di-build di lokal dan siap di-push ke Docker Hub:
![Docker Images](screenshoots/docker_images.png)

*(Atau via CLI)*
```bash
$ docker images
REPOSITORY             TAG       IMAGE ID       CREATED          SIZE
demo6-app              latest    ea540fd11083   10 minutes ago   385MB
pijunbae/demo6-app     latest    ...            ...              ...
```

### 2. Docker Containers
Berikut adalah *screenshot* container `demo6-container` yang sedang berjalan mem-binding port 8080:
![Docker Containers](screenshoots/docker_containers.png)

*(Atau via CLI)*
```bash
$ docker ps
CONTAINER ID   IMAGE       COMMAND                  CREATED          STATUS          PORTS                    NAMES
ea540fd11083   demo6-app   "java -jar /app.jar"     10 minutes ago   Up 10 minutes   0.0.0.0:8080->8080/tcp   demo6-container
```

---

## ⚙️ Cara Menjalankan Aplikasi (Instruksi Tarik dari Docker Hub)

Untuk menjalankan aplikasi ini di komputer teman atau mesin lain, cukup gunakan perintah Docker berikut:

**1. Jalankan Container (Akan otomatis Pull dari Docker Hub jika belum ada)**
```bash
docker run -d -p 8080:8080 --name vibes-app pijunbae/demo6-app:latest
```
*(Catatan: pastikan Anda sudah melakukan `docker push pijunbae/demo6-app` terlebih dahulu).*

**2. Akses Aplikasi**
Buka browser dan kunjungi:
👉 [http://localhost:8080](http://localhost:8080)

**3. Kredensial Login**
* **Username**: `admin`
* **Password**: `20240140024`

---
*Dibuat oleh Hafiz Kurniawan (20240140024) - 2024*