package ru.netology.service;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;

//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWnenAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWnenAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1_000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainWnenAmountOverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(1_800);

        Assert.assertEquals(expected, actual);
    }
}
