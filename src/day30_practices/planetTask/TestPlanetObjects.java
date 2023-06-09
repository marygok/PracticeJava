package day30_practices.planetTask;

public class TestPlanetObjects {

    public static void main(String[] args) {

        Earth earth = new Earth("Earth",5.972e24,6.371e6, 9.81, 5.1e8, 1.08e12,(long) 7.9e9);
        System.out.println(earth);
        System.out.println("--------------------");

        Moon moon = new Moon ("Moon", 7.342e22, 1.737e6, 1.62, 3.8e7, 2.2e10, 0 );
        System.out.println(moon);
        System.out.println("--------------------");

        Mercury mercury = new Mercury("Mercury", 3.301e23, 2.439e6, 3.7, 7.5e7, 6.1e10, 0);
        System.out.println(mercury);
        System.out.println("--------------------");

        Venus venus = new Venus("Venus", 4.867e24, 6.052e6, 8.87, 4.6e8, 9.3e11, 0);
        System.out.println(venus);








    }
}
