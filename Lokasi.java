package com.example.toshiba.jhotel_android_caktifadhillah;
/**
 * Class Lokasi.
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 10-3-18
 */
public class Lokasi
{
    private double x_coord;
    private double y_coord;
    private String deskripsiLokasi;

    public Lokasi(double x_coord, double y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }


    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }


    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsiLokasi = deskripsi;
    }


    public float getX()
    {
        return x_coord;
    }


    public float getY()
    {
        return y_coord;
    }


    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }


 }