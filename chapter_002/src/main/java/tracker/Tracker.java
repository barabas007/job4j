package ru.job4j.tracker;

import tracker.Item;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }


    public boolean delete(String id) {
        for (int index = 0; index < this.position; index++) {
            Item item = this.items[index];
            if (item.getId().equals(id)) {
                this.items[index] = null;
                item.remove(this.items[index]);
            }
        }
        return true;


        /**
         * Метод генерирует уникальный ключ для заявки.
         * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
         * @return Уникальный ключ.
         */
        private String generateId() {
            Random rm = new Random();
            return String.valueOf(rm.nextLong() + System.currentTimeMillis());
        }
    }
}