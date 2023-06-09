package day08_practices;

    public class CydeoBatches {

        public static void main(String[] args) {
            String batchType = "US morning";
            String result = "";

            switch (batchType){
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S.";
                    break;

                case "EU":
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;

                default:
                    result = "Invalid Batch";
            }

            System.out.println(result);


        }

    }

