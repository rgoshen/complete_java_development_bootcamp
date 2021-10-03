package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public Movie getMovie(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                return new Movie(this.movies.get(i));
            }
        }

        return null;
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }
    
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action(String name, String action) {
        if (movies.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be blank/null");
        }

        if (!(action.equals("sell") || action.equals("rent") || action.equals("return"))) {
            throw new IllegalArgumentException("action must be 'sell', 'rent' or 'return' only");
        }

        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                switch (action) {
                    case "sell":
                        if (!(movies.get(i).isAvailable())) {
                            throw new IllegalStateException("Cannot sell movie that has already been rented out");
                        }
                        this.movies.remove(i);
                        break;
                    case "rent":
                        if (!(movies.get(i).isAvailable())) {
                            throw new IllegalStateException("Cannot rent movie that has already been rented out");
                        }
                        this.movies.get(i).setAvailable(false);
                        break;
                    case "return":
                        this.movies.get(i).setAvailable(true);
                        break;
                    default:
                        break;
                }
            }
        };
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i) == null) {
                temp += "Empty\n\n";
            } else {
                temp += this.movies.get(i).toString();
            }
            temp += "\n\n";
        };

        return temp;
    }

}
