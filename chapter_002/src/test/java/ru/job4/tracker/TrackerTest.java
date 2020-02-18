package ru.job4.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item item = new Item("test 2");
        tracker.add(item);
        Item itemToReplase = new Item("replased");
        boolean result = tracker.replace(item.getId(), itemToReplase);
        assertThat(itemToReplase.getName(), is("replased"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("test 3");
        tracker.add(item);
        boolean result = tracker.delete(item.getId());
        assertNull(tracker.findById(item.getId()));
    }
}
