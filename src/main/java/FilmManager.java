public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addNew(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
