package com.example.toshiba.jhotel_android_caktifadhillah;
/**
 * Class Room
 *
 * @author Cakti Fadhillah
 * @version 1.2
 * @since 03-05-18
 */
public class Room {
    private String roomNumber;
    private String statusKamar;
    private double dailyTariff;
    private String tipeKamar;

    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar) {
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.tipeKamar = tipeKamar;
        this.dailyTariff = dailyTariff;
    }

    public void setroomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setstatusKamar(String statusKamar) {
        this.statusKamar = statusKamar;
    }

    public void setDailyTariff(double dailyTariff) {
        this.dailyTariff = dailyTariff;
    }

    public void settipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public String getroomNumber() {
        return roomNumber;
    }

    public String getstatusKamar() {
        return statusKamar;
    }

    public String gettipeKamar() {
        return tipeKamar;
    }

    public double getDailyTariff() {
        return dailyTariff;
    }
}

