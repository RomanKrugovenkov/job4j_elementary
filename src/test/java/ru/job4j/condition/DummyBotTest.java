package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String rsl = DummyBot.answer("Привет, Бот.");
        String exected = "Привет, умник.";
        assertEquals(exected, rsl);
    }

    @Test
    public void whenByeBot() {
        String rsl = DummyBot.answer("Пока.");
        String exected = "До скорой встречи.";
        assertEquals(exected, rsl);
    }

    @Test
    public void whenUnknownBot() {
        String rsl = DummyBot.answer("Сколько будет 2 + 2?");
        String exected = "Это ставит меня в тупик. Задайте другой вопрос.";
        assertEquals(exected, rsl);
    }
}