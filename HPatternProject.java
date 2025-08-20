import javax.swing.*;

public class HPatternProject {
    void gridpattern() {
        System.out.println("--- Basic Grid Pattern ---");
        int i, j ;
        for(i = 1 ; i <= 5 ; i++){
            for(j = 1 ; j<= 5 ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    void rowpattern() {
        System.out.println("----Row grid pattern----\n");
        int i, j, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void columnpattern() {
        System.out.println("----Column grid pattern----\n");
         int i, j, N=5 ;
        for( i = 1 ; i <= N ; i++){
            for( j = 1 ; j <= N ; j++){
                    System.out.print(j);
                }
            System.out.println();
        }
    }

    void Reversecolumnpattern() {
        System.out.println("----Reverse column grid pattern----\n");
        int i, j, N = 5;
        for (i = 1; i <= N; i++) {
            for (j = N; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void Reverserowpattern() {
        System.out.println("----Reverse row grid pattern----\n");
        int i, j, N = 5;
        for (i = N; i >= 1; i--) {
            for (j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

                       
        
    
    void BoxXpattern(){ 
       System.out.println("----Box X pattern----\n");
        int i, j, N =5;
        for(i = 1; i <= N ; i++ ){
            for(j = 1 ; j <= N ; j++){
                if( i == j || i == 1 || i == N || j == 1 ||
                 j == N || j == N-i+1 ){
                System.out.print("X ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
       }
       
       
       void starpattern(){
        System.out.println("----Star pattern----\n");
        int i, j, N =5;
        for(i = 1; i <= N ; i++){
            for(j = 1 ; j <= N ; j++){
                if( i == j ||j == N-i+1 || i == N - 2 || j == N-2){
                System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
       }


       void Boxpluspattern(){
          System.out.println("----Box plus pattern----\n");
           int i, j, N =5;
            for(i = 1; i <= N ; i++){
            for(j = 1 ; j <= N ; j++){
                if( i == 1 || i == N-2 || i == N || j == N ||
                j == 1 || j == N-2){
                System.out.print("X ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }
       }


      void Pluspattern(){
        System.out.println("----Plus pattern----\n");
        int i, j, N =5;
        for(i = 1; i <= N ; i++){
            for(j = 1 ; j <= N ; j++){
                if( i == 3 || j == 3){
                System.out.print("X ");
                }
                else{
                    System.out.print("  ");
                }
            } 
                    System.out.println();
        }
      }


      void Hollowsquarepattern(){
        System.out.println("-----Hollow square pattern-----\n");
        int i , j, N =5;
        for(i = 1 ; i <= N ; i++){
            for( j = 1 ; j <= N ; j++){
                if(i == N || i == N-4 || j == N || j== 1){
                System.out.print("X ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
      }


       void OXpattern(){
        System.out.println("-----OX pattern-----");
        int i, j, N =5;
        for(i = 1; i <= N ; i++){
            for(j = 1 ; j <= N ; j++){
                if( i == 3 || j == 3){
                System.out.print("X ");
                }
                else{
                    System.out.print("O ");
                }
            } 
                    System.out.println();
        }
       }



       void Rightangletrianglepattern(){
        System.out.println("-----Right angle triangle-----");
        int i, j, N = 6;
        for(i = 1 ; i < N ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       }


       void NumRAT(){
        System.out.println("-----Number RAT-----");
        int i, j, N = 6;
        for(i = 1 ; i < N ; i++){
            for(j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
       }


       void InverseNumRAT(){
       System.out.println("-----Inverse Num RAT-----");
       int i, j, N=6 ;
        for( i = 1 ; i <= N ; i++){
            for( j = 1 ; j <= N-i ; j++){
               System.out.print(j);
                }
            System.out.println();
        }
       }
        


        void rightalignedarrow(){
         System.out.println("-----right aligned arrow-----");
        int N = 5 , i , j ;
        for ( i = 1; i <= N+N-1; i++){
            for ( j = 1; j <= N+N-1; j++){
                if((i<=5 && j<=i ) || (i>=5 && j<=N-(i-N))){
                System.out.print("* ");
          }
            }
             System.out.println();
         }
        }
   

        void NumberRAA(){
            System.out.println("-----Number RAA-----");
          int N = 5 , i , j ;
          for ( i = 1; i <= N+N-1; i++){
            for ( j = 1; j <= N+N-1; j++){
                if((i<=5 && j<=i ) || (i>=5 && j<=N-(i-N))){
                System.out.print(j);
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }  
        }


        void pattern(){
            System.out.println("-----Pattern-----");
         int i , j , x = 5,N = 5;
        for(i = 1; i <= N;i++){
            for(j = 1, x = 5; j <= N ; j++,x--){
                if((i % 2) == 0){
                    System.out.print(x);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
     }


        void butterfly(){
            System.out.println("-----butterfly-----");
            int N = 5 , i , j ;
        for ( i = 1; i <= N+N-1; i++){
            for ( j = 1; j <= N+N-1; j++){
                System.out.print((i<=5)?(j<=i || j>=
                (N+N-i))?"X ":"  ":(j <=(N-(i-N)) ||
                 j>=(N+(i-N)))?"X ":"  ");
            }
            System.out.println();
        }
        }


         void HollowDintoBox()
    {
        System.out.println("---- Hollow diamond into box pattern----\n");
        int N=5,i , j ;
        for(i = 1; i <= N+N-1;i++){
            for(j = 1; j <= N+N-1;j++){
                System.out.print((j <= N-i+1 || j > (N+i-2) || (i >= N && (j <= (i-N+1) || j >= N+N-(i-N+1)))) ? "X " : "  ");
            }
            System.out.println();
        }
    }


        void sandclock(){
        System.out.println("-----sandclock-----");
        int N=5,i,j, x = N+N-1, s = 0,w;
       for(i = 1; i <= N+N-1; i++){
        s = i <= N ? ++s : --s;
        System.out.print("  ".repeat(s));
        for(j = 1 , w = 0; j<= x; j++){
         System.out.print((j <= N-s+1) ? (++w) + " " : (--w) + " ");
        }
        x = (i < N) ? (x-2) : (x + 2);
        System.out.println();
      }
        }


       void Boxpattern(){
       System.out.println("-----Box Pattern-----");
        int i ,j , n = 5 , k;
       for(i = 1; i <= n+n-1; i++){
        for(j = 1 ; j <= n+n-1;j++){
            if(i == 1 || i == n+n-1 || j == 1 || i > n && i < n+n-1 && j > 1 && j < n ||j == n+n-1 ||i == n ||j == n){
            System.out.print("X ");
            }
            else{
                System.out.print("  "); 
            }
        }
        System.out.println();
       }
       }


     static void MainModule() {
        System.out.println("\t\t\t-----Pattern Generator-----\n");
        System.out.println("\t-----Basic patterns-----\n");
        System.out.println("\t1. Basic grid\t\t\t\t2. Rows");
        System.out.println("\t3. Columns\t\t\t\t4. Reverse columns ");
        System.out.println("\t5. Reverse rows \n");

        System.out.println("\t-----Medium pattern-----\n");
        System.out.println("\t6. Box X  \t\t\t\t7. Star ");
        System.out.println("\t8. Box plus  \t\t\t\t9. plus "); 
        System.out.println("\t10. Hollow square  \t\t\t11. OX\n ");

        System.out.println("\t-----Hard Level pattern-----\n");
        System.out.println("\t12. Right angle triangle\t\t13. Num RAT "); 
        System.out.println("\t14. Inverse Num RAT \t\t\t15. Right aligned arrow ");
        System.out.println("\t16. NumberRAA \t\t\t\t17. Pattern ");
        System.out.println("\t18. butterfly \t\t\t\t18. HollowDintoBox ");
        System.out.println("\t20. sandclock \t\t\t\t21. Box Pattern");
        String c;
        System.out.println("Choose any one of them....\n");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        HPatternProject p = new HPatternProject();
        if (c.equals("1")) {
            p.gridpattern();
        } else if (c.equals("2")) {
            p.rowpattern();
        } else if (c.equals("3")) {
            p.columnpattern();
        } else if (c.equals("4")) {
            p.Reversecolumnpattern();
        } else if (c.equals("5")) {
            p.Reverserowpattern();
        } else if (c.equals("6")) {
            p.BoxXpattern();
        } else if (c.equals("7")) {
            p.starpattern();
        } else if (c.equals("8")) {
            p.Boxpluspattern();
        } else if (c.equals("9")) {
            p.Pluspattern();
        } else if (c.equals("10")){
            p.Hollowsquarepattern();
        } else if (c.equals("11")){
            p.OXpattern();
        } else if (c.equals("12")){
            p.Rightangletrianglepattern();
        } else if (c.equals("13")){
            p.NumRAT();
        } else if (c.equals("14")){
            p.InverseNumRAT();
        } else if (c.equals("15")){
            p.rightalignedarrow();
        } else if (c.equals("16")){
            p.NumberRAA();
        } else if (c.equals("17")){
            p.pattern();
        } else if (c.equals("18")){
            p.butterfly();
        } else if (c.equals("19")){
            p.HollowDintoBox();
        } else if (c.equals("20")){
            p.sandclock();
        } else if (c.equals("21")){
            p.Boxpattern();
        } else{
            System.out.print("\tWrong choice");
        }

        

        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        if (c.equals("1")) {
            MainModule();
        }
    }

    public static void main(String args[]) {
        MainModule();
    }
    }