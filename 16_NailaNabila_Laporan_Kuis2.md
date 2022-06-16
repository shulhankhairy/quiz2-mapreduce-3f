# LAPORAN MINGGU 12 - MATAKULIAH BIG DATA (  KUIS 2 )

## Dosen Pengampu : 
- Muhammad Shulhan Khairy, S.Kom., M.Kom.

## Disusun Oleh :
- Naila Nabila - 1941720130 ( TI-3F / 16 )

## Link Github : 
- https://github.com/nailanabilaaaaaa/quiz2-mapreduce-3f.git

## Studi Kasus
Pada sebuah toko NellaCelluler, terdapat beberapa data HP yang memiliki field Merek, Tipe, dan Harga HP. Data HP pada NellaCelluler, yaitu :
1. Samsung – Galaxy Z Flip3 ( 15.999.000 ) 
2. iPhone – 13 Pro ( 18.199.000 ) 
3. Samsung – Galaxy Z Fold3 ( 26.999.000 ) 
4. OPPO – Find X2  ( 11.999.000 )
5. Samsung – Galaxy S22+ ( 15.999.000 ) 
6. OPPO – Reno7 ( 7.499.000 ) 
7. Samsung – Galaxy S21+ ( 14.999.000 ) 
8. OPPO – Reno4 ( 4.999.000 ) 
9. iPhone – XS Max ( 12.999.000 ) 
10. OPPO – A96 ( 4.299.000 ) 
11. iPhone – 11 ( 7.999.000 ) 
12. Vivo – T1 Pro ( 4.499.000 ) 
13. iPhone – 12 Pro Max ( 17.799.000 ) 
14. Vivo – X70 Pro ( 10.999.000 )

## Langkah - Langkah

1. Memastikan Hadoop berjalan

    ![Kuis 2](img/1.jpg)

2. Membuat Projek pada Intelij

    ![Kuis 2](img/2.jpg)

3. Menambahkan Kode Program berikut pada file pom.xml

    ![Kuis 2](img/3.jpg)

4. Membuat 2 Class baru, yaitu MainMapper.java dan MainReducer.java

    ![Kuis 2](img/4.jpg)

5. Membuat Folder Quiz2, dan File dataHP untuk mengisi data HP yang terdapat pada NellaCelluler

    ![Kuis 2](img/5.jpg)

    ![Kuis 2](img/6.jpg)

6. Membuat Folder HDFS

    ![Kuis 2](img/7.jpg)

7. Memindahkan File dataHP kedalam Folder HDFS

    ![Kuis 2](img/8.jpg)

8. Memodifikasi Class MainMapper.java

    ![Kuis 2](img/9.jpg)

    ![Kuis 2](img/10.jpg)

9. Memodifikasi Class MainReducer.java

    ![Kuis 2](img/11.jpg)

    ![Kuis 2](img/12.jpg)

10. Memodifikasi Class App.java

    ![Kuis 2](img/13.jpg)
    
11. Membuat File run-job.sh

    ![Kuis 2](img/14.jpg)

    ![Kuis 2](img/15.jpg)

12. Compile dan Build Project

    ![Kuis 2](img/16.jpg)

13. Mengeksekusi run-job.sh

    ![Kuis 2](img/17.jpg)

14. Hasil
    - Hasil MainMapper – Daftar HP

        ![Kuis 2](img/18.jpg)

    - Hasil MainReduce – Daftar HP

        ![Kuis 2](img/19.jpg)

    - Hasil MainReducer – Daftar HP Terendah dan Tertinggi

        ![Kuis 2](img/20.jpg)

    - Hasil Agregasi

        ![Kuis 2](img/21.jpg)