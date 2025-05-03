package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWnenAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWnenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1_000;
        int actual = service.remain(1_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWnenAmountOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(1_800);

        Assertions.assertEquals(expected, actual);
    }
}
