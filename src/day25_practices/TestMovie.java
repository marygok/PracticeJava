package day25_practices;

import java.time.LocalDate;

public class TestMovie {

    public static void main(String[] args) {

        String genre = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] casts = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", "Java Developer: Zero to Hero","Adventure","Kuzzat Altay",
                LocalDate.of(2023,4,30));

        movie1.addCast("");
        movie1.addCasts(casts);

        System.out.println(movie1);



    }

}
