package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 10000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
