public class Main {



    public static void main(String[] args) {


//        Exam:1 Factorial
//        System.out.println("The factorial number is :"+ factorial(4));

//        Exam:1 sum
//        System.out.println("The sum number is :"+sum(5) );

//        Exam:2  Linearsum
//        int data[] =  { 1 ,2,3, 4 ,5, 6};
//        int result =Linearsum(data,5);
//        System.out.println("Sum of Array Elements:"+ result);

//        Exam:3  RecursiveFibonacci
          System.out.println(RecursiveFibonacci(3));


    }

//    public static int factorial(int num){
//        if (num==0)
//            return 1;
//        else
//            return num * factorial(num -1);
//    }

    static int sum (int num){
        int result;
        if (num==1)
            result=1;
        else {
            result = num + sum(num-1);
        }

        return result;



    }
    static int Linearsum (int data[] , int num){

        if (num==0)
            return data[num];
        else
            return Linearsum(data, num-1) +data[num];


    }
    static  int RecursiveFibonacci(int num){


        if (num<1)
            return num;
        else
            return RecursiveFibonacci(num-2) + RecursiveFibonacci(num-1);

    }



}
