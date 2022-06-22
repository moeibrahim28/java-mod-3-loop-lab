public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;

        whileMethod(startingYear,targetYear);
        forMethod(startingYear,targetYear);
    }

        static void whileMethod(int start, int target){
            int currentYear = start+1;
            if(start==target){
                System.out.println("No years have passed.");
            }
            else if(start>target){
                System.out.println("Your start year is after your target year.");
            }
            while (currentYear <= target) {
            int difference=currentYear-start;
            if(difference==1){
                System.out.println(difference + " year has passed");
            }
            else{
                System.out.println(difference+ " years have passed");
            }
            // conditional logic based on the current year
            currentYear++;
        }
    }

        static void forMethod(int start, int target){
            
            if(start==target){
                System.out.println("No years have passed.");
            }
            else if(start>target){
                System.out.println("Your start year is after your target year.");
            }
            for(int currentYear=target;currentYear>start;currentYear--){
                int difference=target-currentYear+1;
                if(difference==1){
                    System.out.println(difference+" year has passed");
                }
                else{
                    System.out.println(difference+" years have passed");
            }
        }
            
        }
        }
    

