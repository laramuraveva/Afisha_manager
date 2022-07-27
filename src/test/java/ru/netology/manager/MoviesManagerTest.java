package ru.netology.manager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoviesManagerTest {

    @Test
    public void shouldAddMovies() {
        MoviesManager manager = new MoviesManager();
        manager.add("mov1");
        manager.add("mov2");

        String[] expected = { "mov1", "mov2" };
        String [] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        MoviesManager manager = new MoviesManager();

        manager.add("mov1");
        manager.add("mov2");
        manager.add("mov3");
        manager.add("mov4");
        manager.add("mov5");
        manager.add("mov6");
        manager.add("mov7");
        manager.add("mov8");
        manager.add("mov9");
        manager.add("mov10");

        String[] expected = { "mov1", "mov2", "mov3", "mov4", "mov5", "mov6", "mov7", "mov8", "mov9", "mov10" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOverLimit() {
        MoviesManager manager = new MoviesManager();

        manager.add("mov1");
        manager.add("mov2");
        manager.add("mov3");
        manager.add("mov4");
        manager.add("mov5");
        manager.add("mov6");
        manager.add("mov7");
        manager.add("mov8");
        manager.add("mov9");
        manager.add("mov10");
        manager.add("mov11");

        String[] expected = { "mov1", "mov2", "mov3", "mov4", "mov5", "mov6", "mov7", "mov8", "mov9", "mov10", "mov11" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNullMovie() {
        MoviesManager manager = new MoviesManager();

        String[] expected = { };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("mov1");
        manager.add("mov2");
        manager.add("mov3");
        manager.add("mov4");
        manager.add("mov5");


        String[] expected = { "mov1", "mov2", "mov3", "mov4", "mov5" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovie() {
        MoviesManager manager = new MoviesManager();

        manager.add("mov1");
        manager.add("mov2");
        manager.add("mov3");
        manager.add("mov4");
        manager.add("mov5");

        String[] expected = { "mov5", "mov4", "mov3", "mov2", "mov1" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovie10() {
        MoviesManager manager = new MoviesManager();

        manager.add("mov1");
        manager.add("mov2");
        manager.add("mov3");
        manager.add("mov4");
        manager.add("mov5");
        manager.add("mov6");
        manager.add("mov7");
        manager.add("mov8");
        manager.add("mov9");
        manager.add("mov10");

        String[] expected = { "mov10", "mov9", "mov8", "mov7", "mov6", "mov5", "mov4", "mov3", "mov2", "mov1" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

}
