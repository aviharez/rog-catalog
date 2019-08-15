package com.aviharez.submispemula;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Laptop implements Parcelable {

    private String name;
    private String price;
    private String photo;
    private String processor;
    private String gpu;
    private String ram;
    private String memori;
    private String tipe;
    private String hdd;

    Laptop(Parcel in) {
        name = in.readString();
        price = in.readString();
        photo = in.readString();
        processor = in.readString();
        gpu = in.readString();
        ram = in.readString();
        memori = in.readString();
        tipe = in.readString();
        hdd = in.readString();
    }

    public static final Creator<Laptop> CREATOR = new Creator<Laptop>() {
        @Override
        public Laptop createFromParcel(Parcel in) {
            return new Laptop(in);
        }

        @Override
        public Laptop[] newArray(int size) {
            return new Laptop[size];
        }
    };

    Laptop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemori() {
        return memori;
    }

    public void setMemori(String memori) {
        this.memori = memori;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(price);
        parcel.writeString(photo);
        parcel.writeString(processor);
        parcel.writeString(gpu);
        parcel.writeString(ram);
        parcel.writeString(memori);
        parcel.writeString(tipe);
        parcel.writeString(hdd);
    }
}
