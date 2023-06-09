package day25_practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {

    public String country, title, Genre , director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;


    public Movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        casts = new ArrayList<>();
    }

    public void addCast(String name){
        this.casts.add(name);
    }


    public void addCasts(String[] names){
        this.casts.addAll(Arrays.asList(names));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate +
                ", casts=" + casts +
                '}';
    }
}


/*
Movie Task:

	    Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)
		Add a constructor to set the country, title, release date, and director of the Movie
	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
                addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */