public class Triangle {


    public static void main(String[] args) {



        for ( int i = 1 ; i <= 5 ; i++) //設定行數
        {
            for (int j = 1; j <= 5-i; j++) //空格
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= 2*i-1 ; k++) //星星
            {
                System.out.print("*"); //不是ln
            }
            System.out.println();
        }
        //菱形下半部分
        for (int i =1 ; i<=4 ;i++){

            for (int j = 1; j <=i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= 2*(4-i)+1  ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }






}
