package com.example.mega.recycler_card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String nohp;

    public Mahasiswa(String nama, String npm, String nohp) {
        this.nama = nama;
        this.npm = npm;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
