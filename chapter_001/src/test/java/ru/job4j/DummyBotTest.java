package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.conditoin.DummyBot;

public class DummyBotTest {


    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        Assert.assertEquals(
                DummyBot.answer("Привет Бот."),
                ("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        Assert.assertEquals(
                DummyBot.answer("Пока."),
                ("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        Assert.assertEquals(
                DummyBot.answer("Сколько будет 2 + 2?"),
                ("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}

