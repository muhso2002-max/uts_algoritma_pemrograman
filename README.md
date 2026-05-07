# UTS Algoritma Pemrograman

## Program Pengurutan Array Ascending dan Descending

### Deskripsi

Program ini dibuat menggunakan bahasa **Java** untuk menampilkan proses
pengurutan data dalam sebuah array.

Data awal berupa beberapa bilangan bulat, lalu program akan: -
Menampilkan **array awal** - Mengurutkan data dari **kecil ke besar
(ascending)** - Mengurutkan data dari **besar ke kecil (descending)**

## Data Array

``` java
int[] A = {200, 50, 10, 4, 300, 1};
```

## Penjelasan Program

### 1. Membuat Array

``` java
int[] A = {200, 50, 10, 4, 300, 1};
```

Array `A` berisi data awal yang akan diurutkan.

### 2. Menyalin Array

``` java
int[] ascending = A.clone();
```

Method `clone()` digunakan agar data asli pada array `A` tidak berubah.

### 3. Mengurutkan Secara Ascending

``` java
Arrays.sort(ascending);
```

Method `Arrays.sort()` mengurutkan elemen array dari nilai terkecil ke
terbesar.

Hasil:

``` text
[1, 4, 10, 50, 200, 300]
```

### 4. Menyalin Array untuk Descending

``` java
int[] descending = ascending.clone();
```

### 5. Membalik Isi Array

``` java
for (int i = 0; i < descending.length / 2; i++) {
    int temp = descending[i];
    descending[i] = descending[descending.length - 1 - i];
    descending[descending.length - 1 - i] = temp;
}
```

Perulangan ini menukar elemen depan dengan elemen belakang sehingga
urutan menjadi dari besar ke kecil.

Hasil:

``` text
[300, 200, 50, 10, 4, 1]
```

### 6. Menampilkan Hasil

``` java
System.out.println("Array awal  : " + Arrays.toString(A));
System.out.println("Ascending   : " + Arrays.toString(ascending));
System.out.println("Descending  : " + Arrays.toString(descending));
```

## Output Program

``` text
Array awal  : [200, 50, 10, 4, 300, 1]
Ascending   : [1, 4, 10, 50, 200, 300]
Descending  : [300, 200, 50, 10, 4, 1]
```

## Kesimpulan

Program ini menunjukkan cara: - membuat array di Java - menyalin array
menggunakan `clone()` - mengurutkan data menggunakan `Arrays.sort()` -
membalik urutan array menggunakan perulangan

Program ini cocok digunakan untuk memahami konsep dasar algoritma
pengurutan array dalam Java.



## Hasil Capture ##
<img width="1907" height="886" alt="Cuplikan layar 2026-05-07 194250" src="https://github.com/user-attachments/assets/9439a5e8-2c2b-47f5-b2d3-a332b9719970" />
