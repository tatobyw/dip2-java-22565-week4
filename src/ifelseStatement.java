public class ifelseStatement {
    //1.Java if Statement
    public static void testIf(){
        int number  = 10;
        if(number < 0){
            System.out.println("The number is negative");
        }
        System.out.println("Statement outside  if block");
    }
    //2.Java if
    public static void testIfelse(){
        String language = "Java";
        if(language == "Java"){
            System.out.println("Java Programming");
        }
    }

    //3.Java if..else
    public static void testIfElse2(){
        int number = -10;

        if(number > 0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative");
        }
    }

    //4.Java if..else..if
    public static void testIfElseifElse(){
        String day = "Monday";

        if(day == "Sunday"){
            System.out.println("Sunday");
        }
        else if(day == "Monday"){
            System.out.println("Monday");
        }
        else{
            System.out.print("ERROR Day");
        }
    }

    public static void nestedIfElse(){
        int age = 25;
        int weight = 48;

        if(age >= 18){
            if(weight >50 ){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.print("You are not eligible to donate blood");
            }
        }else{
            System.out.println("Age must be greater than 18");
        }
    }
}