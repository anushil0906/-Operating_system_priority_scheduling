//os question 18
/*
 Ten students (a,b,c,d,e,f,g,h,i,j) are going to attend an event.
 There are lots of gift shops, they all are going to the gift shops and randomly picking the gifts.
 After picking the gifts they are randomly arriving in the billing counter.
 The accountant gives the preference to that student who has maximum number of gifts.
  Create a C or Java program to define order of billed students?
 */
//so we have then students a,b,c,d,e,f,g,h,i,j;
import java.util.*;
class Event
{
   static int gift[]=new int[10];//array for counting of gift for particular individual.
   static char std[]=new char[10];
  static ArrayList<Integer> max_gift=new ArrayList<Integer>();
  static  ArrayList<Character>max_std=new ArrayList<Character>();
   static int pos=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("entering gift picked by particular student");
        System.out.println("               "+"               ");
        for(int i=0;i<gift.length;i++)
        {
            System.out.println("gift  picked by student: "+i);
            int a=sc.nextInt();
                gift[i] = a;


       }
        System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
        char ch='a';
        System.out.println("Storing name of student into a character array");
        for(int i=0;i<std.length;i++)
        {
            System.out.print(" "+ch);
            std[i]=ch;
            ch++;
        }
        System.out.println("\n"+"------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
        System.out.println("Gifts picked by students:------------------->>>>>>>>>>>>>>");
        System.out.println("                     "+"                  ");
        System.out.println();
        for(int i=0;i<10;i++)
        {
         System.out.println("gifts picked by student: "+std[i]+" no of gifts picked: "+gift[i]);
        }
        System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
        System.out.println("comparing the max value and find out the maximum");
        System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
          for(int i=0;i<10;i++)
          {
              max();
          }
          System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
          System.out.println("                                                                    "+"                                                       ");
          System.out.println("billing will take place in order: "+max_std);
          System.out.println("gifts picked by particular student following above order:"+max_gift);
         
        System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
        System.out.println("Moving further process of billing if we consider each gift cost for 50 rupees");
        System.out.println("                                                                    "+"                                                       ");
         System.out.println("gifts picked by student: "+"          "+" total no of perchased gifts: "+"          "+" the cost for it: ");
          for (int i=0;i<10;i++)
          {
              System.out.println("    "+max_std.get(i)+"                                      "+max_gift.get(i)+"                                   "+max_gift.get(i)*50);
          }


    }
   static void max()
    {
        System.out.println("checking the position of max value");
        int max=gift[0];//<<<<<<----------------------------------------------------------------------------------initially assigned value of max


        for(int j=0;j<10;j++)
        {
            if(max>=gift[j])
            {
                System.out.println("assigned value of max is maximum till position :"+j);
            }
            else
            {
                max = gift[j];
                pos = j;
            }
        }
        System.out.println("                                                                    "+"                                                       ");
        System.out.println("maximum value is:"+max+" at position:"+pos+" for student: "+std[pos]);
        System.out.println("------------------------------------------------->>>>>>>>>>>>>>>>>>>");
        System.out.println("                                                                    "+"                                                       ");
        max_gift.add(max);
        max_std.add(std[pos]);
        gift[pos]=0;
        pos=0;
    }
}