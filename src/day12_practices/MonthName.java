package day12_practices;

public class MonthName {

    public static void main(String[] args) {
        monthName(12);
    }




    public static void monthName(int number){

        if(number > 12 || number < 1){
            System.err.println("Invalid number");
            return; // exits the method. remaining codes of the method won't be executed
        }

        String month = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar"
                :(number==4)? "April" :(number==5)? "May" :(number==6)?"Jun" :(number==7)? "Jul"
                :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct" :(number==11)?"Nov" : "Dec";

        System.out.println(month);

    }

}

