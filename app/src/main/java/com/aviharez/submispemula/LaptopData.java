package com.aviharez.submispemula;

import java.util.ArrayList;

public class LaptopData {

    public static String[][] data = new String[][] {
            {"ASUS ROG Strix GL503","Rp 14.255.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Strix_GL503/ASUS_ROG_Strix_GL503_L_1.jpg","Core i7-7700HQ","NVIDIA with 2GB/4GB GDDR5 VRAM GeForce GTX 1050","32GB","DDR4 SDRAM","HDD+SSD/eMMC , SSHD","2TB"},
            {"ASUS ROG GL553VD","Rp 13.999.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL553VD/ASUS_ROG_GL553VD_L_1.jpg","Core i7-7700HQ","NVIDIA GeForce GTX 1050 , with 2GB/4GB GDDR5 VRAM","8GB , 32GB","-","HDD , SSD","1TB"},
            {"ASUS ROG GL552JX","Rp 11.799.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL552JX/ASUS_ROG_GL552JX_L_1.jpg","Core i7-4720HQ","NVIDIA® GeForce® GTX 950M","4GB , 16GB","DDR3L","HDD","1TB"},
            {"ASUS ROG Zephyrus M (GM501)","Rp 26.999.250","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Zephyrus_M_GM501/ASUS_ROG_Zephyrus_M_GM501_L_1.jpg","Core i7-8750HQ","NVIDIA GeForce GTX 1060 6GB GDDR5 VRAM","32GB","DDR4 SDRAM","HDD , SSD","1TB"},
            {"ASUS ROG Zephyrus GX501","Rp 31.599.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Zephyrus_GX501/ASUS_ROG_Zephyrus_GX501_L_1.jpg","Core i7-7700HQ","NVIDIA GeForce GTX 1080 with Max-Q Design, with 8GB GDDR5 VRAM","16GB , 24GB","DDR4 SDRAM","SSD","256GB , 512GB , 1TB"},
            {"ASUS ROG GX800VH","Rp 90.187.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GX800VH/ASUS_ROG_GX800VH_L_1.jpg","Core i7-7820HK","NVIDIA GeForce GTX 1080 SLI","64GB","DDR4 SDRAM","SSD","-"},
            {"ASUS ROG GL552VX","Rp 12.453.100","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL552VX_DM018D/ASUS_ROG_GL552VX_DM018D_L_1.jpg","Core i7-6700HQ","NVIDIA GeForce GTX 950M 4GB VRAM DDR5","4GB , 8GB","DDR4","HDD","1TB"},
            {"ASUS ROG Strix Hero II GL504GM","Rp 22.977.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_STRIX_Hero_II_/ASUS_ROG_STRIX_Hero_II__L_1.jpg","Core i7-8750H","NVIDIA GeForce GTX 1060 (6GB GDDR5 VRAM)","8GB","DDR4","HDD , SSD , SSHD","1TB"},
            {"ASUS ROG GL552VW","Rp 13.999.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL552VW/ASUS_ROG_GL552VW_L_1.jpg","Core i7-6700HQ","NVIDIA GeForce GTX 960M with 2G/4G GDDR5 VRAM","16GB","DDR4","HDD , SSD , HDD+SSD/eMMC","1TB , 2TB"},
            {"ASUS ROG G703","Rp 62.988.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_G703/ASUS_ROG_G703_L_1.jpg","Core i7-7820HK","NVIDIA GeForce GTX 1080, with 8GB GDDR5X VRAM","32GB , 64GB","DDR4 SDRAM","HDD , SSD","1TB"},
            {"ASUS ROG GL553VE","Rp 14.540.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL553VE/ASUS_ROG_GL553VE_L_1.jpg","Core i7-7700HQ","NVIDIA","8GB , 16GB , 32GB","DDR4","HDD+SSD/eMMC","1TB"},
            {"ASUS ROG Zephyrus G GA502","Rp 19.495.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Zephyrus_G_GA502/ASUS_ROG_Zephyrus_G_GA502_L_1.jpg","AMD Ryzen 7 3750H","NVIDIA GeForce GTX 1660 Ti","32GB","DDR4 SDRAM","SSD","256GB , 512GB"},
            {"ASUS ROG G501JW","Rp 17.997.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_G501JW/ASUS_ROG_G501JW_L_1.jpg","Core i7-4720HQ","NVIDIA GeForce GTX 960M dengan 4GB GDDR5 VRAM","16GB","DDR3L SDRAM","HDD+SSD/eMMC","1TB"},
            {"ASUS ROG G550JX","Rp 14.999.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_G550JX/ASUS_ROG_G550JX_L_1.jpg","Core i7-4720HQ","NVIDIA GeForce GTX 950M dengan 2GB DDR3 VRAM","8GB","DDR3L SDRAM","HDD","1TB"},
            {"ASUS ROG Zephyrus S (GX531)","Rp 32.499.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Zephyrus_S_GX521/ASUS_ROG_Zephyrus_S_GX521_L_1.jpg","Core i7-8750H","NVIDIA GeForce GTX 1070 (Max-Q) 8GB GDDR5 VRAM (GX531GS)","8GB , 24GB","DDR4 SDRAM","SSD","256GB , 512GB , 1TB"},
            {"ASUS ROG G550JK","Rp 15.000.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_G550JK/ASUS_ROG_G550JK_L_1.jpg","Core i7-4710HQ","NVIDIA GeForce GTX850M 4GB DDR3 VRAM","8GB","DDR3L","HDD","1TB"},
            {"ASUS ROG Strix GL702ZC","Rp 19.949.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Strix_GL702ZC/ASUS_ROG_Strix_GL702ZC_L_1.jpg","AMD Ryzen 7 1700","AMD Radeon RX580, with 4GB, VRAM","16GB","DDR4 SDRAM","HDD+SSD/eMMC","1TB"},
            {"ASUS ROG GX700","Rp 79.999.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/Asus_ROG_GX700/Asus_ROG_GX700_L_1.jpg","Core i7-6820HK","NVIDIA GeForce GTX 980","64GB","DDR4","SSD","512GB"},
            {"ASUS ROG GL752VW","Rp 16.999.000","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_GL752VW/ASUS_ROG_GL752VW_L_1.jpg","Core i7-6700HQ","NVIDIA GeForce GTX 960M with 2G/4G GDDR5 VRAM","4GB","DDR4","HDD , SSD","1TB"},
            {"ASUS ROG Mothership (GZ700)","-","https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/ASUS_ROG_Mothership_GZ700_3/ASUS_ROG_Mothership_GZ700_3_L_1.jpg","Core i9-9980HK","NVIDIA GeForce RTX 2080 (Boost Clock: 1880MHz, 200W)","64GB","DDR4 SDRAM","SSD","512GB"}
    };

    public static ArrayList<Laptop> getListData() {
        ArrayList<Laptop> list = new ArrayList<>();
        for (String[] aData : data) {
            Laptop laptop = new Laptop();
            laptop.setName(aData[0]);
            laptop.setPrice(aData[1]);
            laptop.setPhoto(aData[2]);
            laptop.setProcessor(aData[3]);
            laptop.setGpu(aData[4]);
            laptop.setRam(aData[5]);
            laptop.setMemori(aData[6]);
            laptop.setTipe(aData[7]);
            laptop.setHdd(aData[8]);

            list.add(laptop);
        }

        return list;
    }

}
