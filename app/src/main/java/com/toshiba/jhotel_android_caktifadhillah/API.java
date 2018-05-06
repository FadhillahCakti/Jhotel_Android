package com.toshiba.jhotel_android_caktifadhillah;

public interface API {
    String base = "http://192.168.1.101:8080/";
    String loginURL = base+"logincust";
    String registerURL = base+"newcustomer";
    String bookURL = base+"bookpesanan";
    String vacantRoomsURL = base+"vacantrooms";
    String fetchPesananURL = base+"pesanancustomer/";
    String finishPesananURL = base+"finishpesanan";
    String cancelPesananURL = base+"cancelpesanan";
}
