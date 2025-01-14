package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwonly = new RWOnly();
        rwonly.setName("Shravankumar");
        //'name' has private access in 'com. driver. RWOnly'
       // System.out.println(rwonly.name);
        System.out.println(rwonly.getName());


    }
  
}