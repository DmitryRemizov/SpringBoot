package ru.netology.springdemoboot.Profile;

public class ProductionProfile implements SystemProfile{

    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}