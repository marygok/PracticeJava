package day12_practices;

    public class EligibleToVote {

        public static void main(String[] args) {

            eligibleToVote(20,true);

            eligibleToVote(15,true);

            eligibleToVote(17,false);
        }



        public static void eligibleToVote(int age, boolean isAmerican) {

            if (age >= 18 && isAmerican) {
                System.out.println("You are eligible to vote");
            } else {
                System.err.println("You are not eligible to vote");
            }

        }


    }