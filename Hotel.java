package com.example.toshiba.jhotel_android_caktifadhillah;

/**
 * Class Hotel.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 03-05-18
 */
public class Hotel
{
    private int ID;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.ID= ID;
    }

    public int getBintang()
    {
        return bintang;
    }

    public String getNama()
    {
        return nama;
    }

    public int getID() {
        return ID;
    }

    public Lokasi getLokasi()
    {
        return lokasi;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}