package br.com.releases.java8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Explanation
// In Java, both Comparable and Comparator interfaces are used for sorting
// objects. The main difference between Comparable and Comparator is:
//        Comparable: It is used to define the natural ordering of the objects within the class.
//        Comparator: It is used to define custom sorting logic externally.
public class ComparableComparator {

    public Movie comparable() {
        // Create a list of movies
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("Empire Strikes Back", 8.8, 1980));
        l.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort movies using Comparable's
        // compareTo method by year
        Collections.sort(l);

        // Display the sorted list of movies
        System.out.println("Movies after sorting by year:");
        l.stream().forEach(a -> System.out.println(a.getName() + " (" + a.getYear() + ") - Rating: " + a.getRating()));

        return l.getFirst();
    }

    public Movie Comparator() {
        // Create a list of movies
        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Force Awakens", 8.3, 2015));
        m.add(new Movie("Star Wars", 8.7, 1977));
        m.add(new Movie("Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        m.stream().forEach(a -> System.out.println(a.getRating() + " " + a.getName() + " (" + a.getYear() + ")"));

        // Sort movies by name and display all
        Collections.sort(m, new NameCompare());
        System.out.println("Movies sorted by name:");
        m.stream().forEach(a -> System.out.println(a.getRating() + " " + a.getName() + " (" + a.getYear() + ")"));

        return m.getFirst();
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Implementation of the compareTo method
    // for default sorting by year
    public int compareTo(Movie m) {
        return this.year - m.year;
    }
}

// Comparator to sort movies by rating
class Rating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {

        // Sort by rating in descending order
        return Double.compare(m2.getRating(), m1.getRating());
    }
}

// Comparator to sort movies by name
class NameCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {

        // Sort by name in alphabetical order
        return m1.getName().compareTo(m2.getName());
    }
}
