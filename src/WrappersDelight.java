public class WrappersDelight {
    public static void main(String[]args){


        int num1 = 14;
        Integer num2 = new Integer(8);
        Double num3 = 2.5;
        Double num4 = num2+num3;
        num2-=3;
        num3+=num1+num2+num4;
        num1+=num2+num4;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);





    }

}
