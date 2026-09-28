* * * * * 
*       * 
*       *   by simple java ...
* * * * * 

answer:

import java.util.*;

public class Main{
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        
        int r,c;
        
        System.out.print("enter the number of row:");
        r=sc.nextInt();
        
        System.out.print("enter the number of column:");
        c=sc.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            
        }
         System.out.println();
        }
        
    }
}

* * * * * 
*       * 
*       * 
* * * * * ...by using function

import java.util.*;

public class Main{
    
    public static void hollow_rectangle(int r,int c){
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||i==r || j==1 || j==c){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            }
            
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int r,c;
       
       System.out.print("enter the number of row: ");
       r=sc.nextInt();
       
       System.out.print("enter the number of column: ");
       c=sc.nextInt();
       
       
       hollow_rectangle(r,c);
       
    }
}

*****
 ****
  ***
   **.....using functions...
    *

👉 Exactly inverted pyramid ✔️

import java.util.*;

public class Main{
    
    public static void inverted_pyramid(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            
            for(int k=i;k<=n;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
       inverted_pyramid(n);
       
    }
}

    *
   **
  ***
 ****
*****......using function ...(half pyramid)

import java.util.*;

public class Main{
    
    public static void half_pyramid(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
       half_pyramid(n);
       
    }
}

enter the number : 5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

using function..

import java.util.*;

public class Main{
    
    public static void inverted_pyramid(int n){
        
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
       inverted_pyramid(n);
       
    }
}

enter the number : 5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 ...by using fuction...
import java.util.*;

public class Main{
    
    public static void half_pyramid(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 && (i==2 || i==4) || j==2 && (i==3 || i==5) || j==3 && i==4 || j==4 && i==5){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
       half_pyramid(n);
       
    }
}....ye meri idea se kiya hai wese toh sab mene khud se kiya but ye tarika thoda atpata hai so

AB YE MAM KA TARIKA HAI ...SAME QUESTION UPPER WALA ...

import java.util.*;

public class Main{
    
    public static void half_pyramid(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
       half_pyramid(n);
       
    }
}

enter the number : 5     
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15...by using function...

import java.util.*;

public class Main{
    
    public static void floyds_triangle(int n){
        
        int num = 1;
         
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print(num + " ");
              num++;
          }
          System.out.println();
      }

    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
      floyds_triangle(n);
       
    }
}

enter the number : 4
 *                    * 
 *  *              *  * 
 *  *  *        *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  * 
 *  *  *        *  *  * 
 *  *              *  * 
 *                    * ...by using function 


import java.util.*;

public class Main{
    
    public static void butterfly_triangle(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        
        for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
      butterfly_triangle(n);
       
    }
}

enter the number : 5
          * * * * * 
        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * .....by using function
  
import java.util.*;

public class Main{
    
    public static void solid_rhombus(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=n;k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
       
      solid_rhombus(n);
       
    }
}


enter the number : 5
    *****
   *   *
  *   *
 *   *
*****...yaha ye question me ham same hallow rectangle ka 
method/code likhte btu as hum isme pehle hi spaces print
 kara dete so hamara row toh sahi rehte but column ki line 
 tilt ho jati hai...so hame ye nai sochna ki colume me kuch 
 star hai aur kuch space balki colume teda ho gaya aur colume 
 me star hi hai spaces nai hai...baki wahi kiya ki agar row and 
 colume birder pr ho toh star print karo aur agar na ho toh spaces
  print karo...

import java.util.*;

public class Main{
    
    public static void hollow_rhombus(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        System.out.println();
    }
    
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
      
       
      hollow_rhombus(n);
       
    }
}

enter the number : 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *...using function ....as to remind that isme odd number
     pr hi star print hona iska {(2*i)-1} iss logic se kiya hai ..

import java.util.*;

public class Main{
    
    public static void diamond_star(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
        System.out.println();
    }
    
    for(int i=n;i>=1;i--){
            for(int j=i;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
        System.out.println();
    }
    
    
    }
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);
       
       int n;
       
       System.out.print("enter the number : ");
       n=sc.nextInt();
      
       
      diamond_star(n);
       
    }
}

