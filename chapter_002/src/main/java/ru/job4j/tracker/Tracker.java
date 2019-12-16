package ru.job4j.tracker;

import tracker.Item;

import java.util.Arrays;
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
        boolean result = false;
        for (int index = 0; index < this.position; index++) {
            Item item = this.items[index];
            if (item.getId().equals(id)) {
                System.arraycopy(items, index + 1, items, index, items.length - index - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    public  boolean replace(String id, Item item){
        boolean result = false;
        for( int index = 0; index < this.position; index ++){
            if(Item.getId().equals(id)){
                Item.setName(item.getName();
                result = true;
                break;
            }
        }
        return result;
    }

    public Item findById(String id) {
            Item result = null;
            for (int index = 0; index < this.position; index++) {
                if(items[index].getId().equals(id)){
                    result = this.items[index];
                break;
            }


        }

        return result;
    }

    public Item[] findAll(){
        return Arrays.copyOf(items, position);
    }



    public Item[] findByName(String key){
        Item[]result = new Item[this.position];
        int coint = 0;
        for (int index = 0; index < position; index ++){
            if ((items[index].getName().equals(key))) {
                result[coint++] = items[index];
            }


        }
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


}