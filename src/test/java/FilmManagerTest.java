import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testSix() {
        FilmManager manager = new FilmManager();
        manager.addNew("Episode I");
        manager.addNew("Episode II");
        manager.addNew("Episode III");
        manager.addNew("Episode IV");
        manager.addNew("Episode V");
        manager.addNew("Episode VI");


        String[] expected = {"Episode I", "Episode II", "Episode III", "Episode IV", "Episode V", "Episode VI"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOne() {
        FilmManager manager = new FilmManager();
        manager.addNew("Rogue One");


        String[] expected = {"Rogue One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testZero() {
        FilmManager manager = new FilmManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastLessTen() {
        FilmManager manager = new FilmManager();
        manager.addNew("Episode I");
        manager.addNew("Episode II");
        manager.addNew("Episode III");
        manager.addNew("Episode IV");
        manager.addNew("Episode V");
        manager.addNew("Episode VI");


        String[] expected = {"Episode VI", "Episode V", "Episode IV", "Episode III", "Episode II", "Episode I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastTen() {
        FilmManager manager = new FilmManager();
        manager.addNew("Episode I");
        manager.addNew("Episode II");
        manager.addNew("Episode III");
        manager.addNew("Rogue One");
        manager.addNew("Episode IV");
        manager.addNew("Episode V");
        manager.addNew("Episode VI");
        manager.addNew("Episode VII");
        manager.addNew("Episode VIII");
        manager.addNew("Episode IX");


        String[] expected = {"Episode IX","Episode VIII","Episode VII","Episode VI", "Episode V", "Episode IV","Rogue One", "Episode III", "Episode II", "Episode I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLastMoreTen() {
        FilmManager manager = new FilmManager();
        manager.addNew("Episode I");
        manager.addNew("Episode II");
        manager.addNew("Episode III");
        manager.addNew("Rogue One");
        manager.addNew("Solo");
        manager.addNew("Episode IV");
        manager.addNew("Episode V");
        manager.addNew("Episode VI");
        manager.addNew("Episode VII");
        manager.addNew("Episode VIII");
        manager.addNew("Episode IX");


        String[] expected = {"Episode IX","Episode VIII","Episode VII","Episode VI", "Episode V", "Episode IV","Solo","Rogue One", "Episode III", "Episode II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
