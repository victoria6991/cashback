package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAdvice1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdvice999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAdvice() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotAdvice995() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1005;
        int actual = cashbackHackService.remain(amount);
        int expected = 995;
        assertEquals(actual, expected);
    }
}