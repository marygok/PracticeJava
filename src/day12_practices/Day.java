package day12_practices;

public class Day{

    public static void main(String[] args) {

        day(5);
    }


    public static void day(int number){

            if(number>7 || number < 1){
                System.err.println("Invalid number");
                return; // exits the method. remaining codes of the method won't be executed
            }

            String day = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
                    :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)?"Saturday":"Sunday";

            System.out.println(day);

        }

}

