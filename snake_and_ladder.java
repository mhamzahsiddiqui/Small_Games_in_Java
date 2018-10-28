import java.awt.Color; 
import enigma.console.*; 
import enigma.core.Enigma;
import java.util.*;
class snake_and_ladder
{
    static void main()
    {
        TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);//Changes the color of background and text
        //s_console.setTextAttributes(attrs); //Sets the colors to the console
        TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);//Changes the color of background and text
        //s_console.setTextAttributes(attrs1); //Sets the colors to the console
        TextAttributes attrs2 = new TextAttributes(Color.WHITE, Color.BLACK);//Changes the color of background and text*
        TextAttributes attrs3 = new TextAttributes(Color.WHITE, Color.GRAY);//Changes the color of background and text
        TextAttributes attrs4 = new TextAttributes(Color.WHITE, Color.BLUE);//Changes the color of background and text
        TextAttributes attrs5 = new TextAttributes(Color.WHITE, Color.MAGENTA);//Changes the color of background and text
        TextAttributes attrs6 = new TextAttributes(Color.MAGENTA, Color.BLACK);//Changes the color of background and text
        Scanner y=new Scanner(System.in);
        int b=1;int h=0;int k=0;int yy=0,uu=0,od=0;
        String st[][]=new String[10][10];
        int plr1=0,plr2=0,r=0,c=0;char ch;
        System.out.println("Rules :");
        System.out.print("You Will be Penalised if you do not follow the instructions");
        System.out.println("\n");
        s_console.setTextAttributes(attrs4);
        System.out.println("Ladders Are As Follows:");
        System.out.println("From 7 to 26 ");
        System.out.println("From 9 to 55 ");
        System.out.println("From 21 to 97");
        System.out.println("From 36 to 64");
        System.out.println("From 41 to 93");
        System.out.println("From 44 to 65");
        System.out.println("From 47 to 68");
        System.out.println("From 50 to 92");
        System.out.println("From 66 to 86");
        System.out.println("From 67 to 88");
        System.out.println("From 77 to 96");
        System.out.println("\n");
        s_console.setTextAttributes(attrs3);
        System.out.println("Snakes Are As Follows:");
        System.out.println("From 32 to 5 ");
        System.out.println("From 35 to 16");
        System.out.println("From 43 to 17");
        System.out.println("From 52 to 11");
        System.out.println("From 73 to 3 ");
        System.out.println("From 91 to 51");
        System.out.println("From 95 to 65");
        System.out.println("From 99 to 10");
        System.out.println("\n\n");
        s_console.setTextAttributes(attrs2);
        System.out.println("Enter 1st Player name");
        String nam1=y.next();
        System.out.println("Enter 2nd Player name");
        String nam2=y.next();
        /**TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);//Changes the color of background and text
        //s_console.setTextAttributes(attrs); //Sets the colors to the console
        TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);//Changes the color of background and text
        //s_console.setTextAttributes(attrs1); //Sets the colors to the console
        TextAttributes attrs2 = new TextAttributes(Color.WHITE, Color.BLACK);//Changes the color of background and text*
        TextAttributes attrs3 = new TextAttributes(Color.WHITE, Color.ORANGE);//Changes the color of background and text
        TextAttributes attrs4 = new TextAttributes(Color.WHITE, Color.BLUE);//Changes the color of background and text*/
        s_console.setTextAttributes(attrs2); //Sets the colors to the console
        for(int i=9;i>=0;i--)
        {
            h++;
            if(h%2==1)
            { 
                for(int j=0;j<=9;j++)
                {
                    st[i][j]=Integer.toString(b++);
                }
            }
            if(h%2==0)
            { 
                for(int j=9;j>=0;j--)
                {
                    st[i][j]=Integer.toString(b++);
                }
            }
        }
        System.out.print("  _______ _______ _______ _______ _______ _______ _______ _______ _______ ______");
        System.out.println();
         for(int i=0;i<=9;i++)
        {
                for(int j=0;j<=9;j++)
                {
                    int mn=Integer.parseInt(st[i][j]);
                    if(mn==100)
                    System.out.print(" "+"|"+"__"+st[i][j]+"_");
                    if(mn>=10&&mn<=99)
                    System.out.print(" "+"|"+"__"+st[i][j]+"__");
                    if(mn>=1&&mn<=9)
                    System.out.print(" "+"|"+"___"+st[i][j]+"__");
                }
                System.out.print("|");
                System.out.print("\n");
            }
    

       while(plr1<=102&&plr2<=102)
           {
               
               k++;
               if(k%2==1)
               {
                   //yy=plr1;
                   for(int i=0;i<=9;i++)
                    {
                     for(int j=0;j<=9;j++)
                     {
                       if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)
                       {st[i][j]=Integer.toString(plr1);
                       } 
                     }
                   }
            s_console.setTextAttributes(attrs2);
           System.out.println("Player I Turn Press "+Character.toUpperCase(nam1.charAt(0))+" To Throw Dice");
           ch=y.next().charAt(0);
           s_console.setTextAttributes(attrs5); //Sets the colors to the console
           System.out.println("Scroll Up To See The Rules");
           s_console.setTextAttributes(attrs2); //Sets the colors to the console
           if(ch==Character.toUpperCase(nam1.charAt(0))||ch==Character.toLowerCase(nam1.charAt(0)))
           {
               r=1+(int)(Math.random()*6);
               plr1=plr1+r;
               System.out.println("Your Number ="+r);
               s_console.setTextAttributes(attrs6);
               switch (r)
               {
                  case 1:
                  System.out.println("|¯¯¯|");
                  System.out.println("| . |");
                  System.out.println("|___|");
                  break;
                  case 2:
                  System.out.println("|¯¯¯|");
                  System.out.println("|. .|");
                  System.out.println("|___|");
                  break;
                  case 3:
                  System.out.println("|¯¯¯|");
                  System.out.println("|...|");
                  System.out.println("|___|");
                  break;
                  case 4:
                  System.out.println("|.¯.|");
                  System.out.println("|   |");
                  System.out.println("|._.|");
                  break;
                  case 5:
                  System.out.println("|.¯.|");
                  System.out.println("| . |");
                  System.out.println("|._.|");
                  break;
                  case 6:
                  System.out.println("|.¯.|");
                  System.out.println("|. .|");
                  System.out.println("|._.|");
                  break;
                  default: 
                  System.out.println();
                }
                od=0;
                s_console.setTextAttributes(attrs2);
               if(plr1>=102)
               {
                   plr1=plr1-r;od=1;
                   System.out.println(" Skipped!!");
               }
               while(r==6&&od!=1)
               {
                   for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
                   System.out.println(" Another Chance");
                   r=1+(int)(Math.random()*6);
                   plr1=plr1+r;
                   System.out.println(" Your Number ="+r);
                   s_console.setTextAttributes(attrs6);
                  switch (r)
                  {
                    case 1:
                    System.out.println("|¯¯¯|");
                    System.out.println("| . |");
                    System.out.println("|___|");
                    break;
                    case 2:
                    System.out.println("|¯¯¯|");
                    System.out.println("|. .|");
                    System.out.println("|___|");
                    break;
                    case 3:
                    System.out.println("|¯¯¯|");
                    System.out.println("|...|");
                    System.out.println("|___|");
                    break;
                    case 4:
                    System.out.println("|.¯.|");
                    System.out.println("|   |");
                    System.out.println("|._.|");
                    break;
                    case 5:
                    System.out.println("|.¯.|");
                    System.out.println("| . |");
                    System.out.println("|._.|");
                    break;
                    case 6:
                    System.out.println("|.¯.|");
                    System.out.println("|. .|");
                    System.out.println("|._.|");
                    break;
                    default: 
                    System.out.println();
                  }
                  s_console.setTextAttributes(attrs2);
                   if(plr1>=102)
                   {
                   plr1=plr1-r;
                   System.out.print(" Skipped!!");
                   }
               }
               System.out.print(" Will Go To :"+plr1);/*********/
               for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
               s_console.setTextAttributes(attrs4);
               if(plr1==7)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=26;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==9)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=55;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==21)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=97;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==41)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=93;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==44)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=65;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==47)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=68;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==50)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=92;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==66)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=86;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==67)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=88;
                   System.out.print("Advanced To :"+plr1);
               }
               if(plr1==77)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr1=96;
                   System.out.print("Advanced To :"+plr1);
               }
               s_console.setTextAttributes(attrs3);
               if(plr1==32)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=5;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==35)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=16;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==43)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=17;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==52)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=11;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==73)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=3;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==91)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=51;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==95)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=65;
                   System.out.print("Retract To :"+plr1);
               }
               if(plr1==99)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr1=10;
                   System.out.print("Retract To :"+plr1);
               }
               System.out.println("\n");
               for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
               for(int i=0;i<=9;i++)
               {
                   for(int j=0;j<=9;j++)
                   {
                       if(st[i][j].compareTo(Integer.toString(plr1))==0)
                       {st[i][j]=Character.toString(Character.toUpperCase(nam1.charAt(0)));
                       } 
                        /**
                        if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0))))==0)
                       {st[i][j]=Character.toString(Character.toUpperCase(nam2.charAt(0)))+Character.toString(Character.toUpperCase(nam1.charAt(0)));
                        System.out.print(st[i][j]);}*/
                   }
               }
               System.out.println();
               for(int i=0;i<=9;i++)
               {
                for(int j=0;j<=9;j++)
                {
                    s_console.setTextAttributes(attrs2);
                    char ch1=st[i][j].charAt(0);
                    if(Character.isDigit(ch1)==true)
                    {
                        int mn=Integer.parseInt(st[i][j]);
                        if(mn==100)
                        System.out.print(" "+"|"+"__"+st[i][j]+"_");
                        if(mn>=10&&mn<=99)
                        System.out.print(" "+"|"+"__"+st[i][j]+"__");
                        if(mn>=1&&mn<=9)
                        System.out.print(" "+"|"+"___"+st[i][j]+"__");
                    } 
                    if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"__");
                        s_console.setTextAttributes(attrs);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }
                    if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"__");
                        s_console.setTextAttributes(attrs1);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }
                    /**if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0)))+Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"_");
                        s_console.setTextAttributes(attrs1);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }*/
                    /*else if(st[i][j]==Character.toString(Character.toUpperCase(nam1.charAt(0))))  
                    {//s_console.setTextAttributes(attrs);
                    System.out.print(" "+"|"+"__"+st[i][j]+"__");
                    }
                    else if(st[i][j]==Character.toString(Character.toUpperCase(nam2.charAt(0))))  
                    {//s_console.setTextAttributes(attrs1);
                    System.out.print(" "+"|"+"__"+st[i][j]+"__");
                    }*/
                    /**{System.out.print(" "+"|"+"__");
                    if(st[i][j]=="H"/*Character.toString((Character.toUpperCase(nam1.charAt(0)))))
                    {
                     s_console.setTextAttributes(attrs);
                    System.out.print(st[i][j]);
                    s_console2.setTextAttributes(attrs2);
                    System.out.print("__");
                    }
                    if(st[i][j]=="I"/*Character.toString((Character.toUpperCase(nam2.charAt(0)))))
                    {
                     s_console1.setTextAttributes(attrs1);
                    System.out.print(st[i][j]);
                    s_console2.setTextAttributes(attrs2);
                    System.out.print("__");
                    }
                    }*/
               }
               s_console.setTextAttributes(attrs2);
                System.out.print("|");
                System.out.print("\n");
            }
            }
            s_console.setTextAttributes(attrs2);
           if(plr1==101)
              {
                  System.out.print(nam1+" Wins!!");break;
              }
        }
        if(k%2==0)
               {
                   for(int i=0;i<=9;i++)
                    {
                     for(int j=0;j<=9;j++)
                     {
                       if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0))))==0)
                       {st[i][j]=Integer.toString(plr2);
                       } 
                     }
                   }
           s_console.setTextAttributes(attrs2);          
           System.out.println("Player II Turn Press "+Character.toUpperCase(nam2.charAt(0))+" To Throw Dice");
           ch=y.next().charAt(0);
           s_console.setTextAttributes(attrs5); //Sets the colors to the console
           System.out.println("Scroll Up To See The Rules");
           s_console.setTextAttributes(attrs2); //Sets the colors to the console
           
           if(ch==Character.toUpperCase(nam2.charAt(0))||ch==Character.toLowerCase(nam2.charAt(0)))
           {
               c=2+(int)(Math.random()*5);
               plr2=plr2+c;
               System.out.println("Your Number ="+c);
               s_console.setTextAttributes(attrs6);
               switch (c)
               {
                  case 1:
                  System.out.println("|¯¯¯|");
                  System.out.println("| . |");
                  System.out.println("|___|");
                  break;
                  case 2:
                  System.out.println("|¯¯¯|");
                  System.out.println("|. .|");
                  System.out.println("|___|");
                  break;
                  case 3:
                  System.out.println("|¯¯¯|");
                  System.out.println("|...|");
                  System.out.println("|___|");
                  break;
                  case 4:
                  System.out.println("|.¯.|");
                  System.out.println("|   |");
                  System.out.println("|._.|");
                  break;
                  case 5:
                  System.out.println("|.¯.|");
                  System.out.println("| . |");
                  System.out.println("|._.|");
                  break;
                  case 6:
                  System.out.println("|.¯.|");
                  System.out.println("|. .|");
                  System.out.println("|._.|");
                  break;
                  default: 
                  System.out.println();
                }
                od=0;
                s_console.setTextAttributes(attrs2);
               if(plr2>=102)
               {
                   od=1;
                   plr2=plr2-c;
                   System.out.print(" Skipped!!");
               }
               while(c==6&&od!=1)
               {
                   for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
                   System.out.println(" Another Chance");
                   c=1+(int)(Math.random()*6);
                   plr2=plr2+c;
                   System.out.println(" Your Number ="+c);
                   s_console.setTextAttributes(attrs6);
                   switch (c)
                  {
                    case 1:
                    System.out.println("|¯¯¯|");
                    System.out.println("| . |");
                    System.out.println("|___|");
                    break;
                    case 2:
                    System.out.println("|¯¯¯|");
                    System.out.println("|. .|");
                    System.out.println("|___|");
                    break;
                    case 3:
                    System.out.println("|¯¯¯|");
                    System.out.println("|...|");
                    System.out.println("|___|");
                    break;
                    case 4:
                    System.out.println("|.¯.|");
                    System.out.println("|   |");
                    System.out.println("|._.|");
                    break;
                    case 5:
                    System.out.println("|.¯.|");
                    System.out.println("| . |");
                    System.out.println("|._.|");
                    break;
                    case 6:
                    System.out.println("|.¯.|");
                    System.out.println("|. .|");
                    System.out.println("|._.|");
                    break;
                    default: 
                    System.out.println();
                  }
                  s_console.setTextAttributes(attrs2);
                   if(plr2>=101)
                   {
                   plr2=plr2-c;
                   System.out.println(" Skipped!!");
                   }
               }   
               System.out.print(" Will Go To :"+plr2);/**********/
               for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
               s_console.setTextAttributes(attrs4);
               if(plr2==7)
               {
                   System.out.println("  You Climbed a Ladder");
                   plr2=26;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==9)
               {
                   System.out.println("  You Climbed a Ladder");
                   plr2=55;
                   System.out.print(" Advanced To :"+plr2);
               }
               if(plr2==21)
               {
                   System.out.println("  You Climbed a Ladder");
                   plr2=97;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==41)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=93;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==44)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=65;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==47)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=68;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==50)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=92;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==66)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=86;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==67)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=88;
                   System.out.print("Advanced To :"+plr2);
               }
               if(plr2==77)
               {
                   System.out.println(" You Climbed a Ladder");
                   plr2=96;
                   System.out.print("Advanced To :"+plr2);
               }
               s_console.setTextAttributes(attrs3);
              if(plr2==32)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=5;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==35)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=16;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==43)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=17;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==52)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=11;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==73)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=3;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==91)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=51;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==95)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=65;
                   System.out.print("Retract To :"+plr2);
               }
               if(plr2==99)
               {
                   System.out.println("You Have been Bitten By a Snake");
                   plr2=10;
                   System.out.print("Retract To :"+plr2);
               }
               System.out.println("\n");
               for(int P=0;P<((int)Math.pow(2,23)+987*2500);P++);
               for(int i=0;i<=9;i++)
               {
                   for(int j=0;j<=9;j++)
                   {
                       if(st[i][j].compareTo(Integer.toString(plr2))==0)
                       {st[i][j]=Character.toString(Character.toUpperCase(nam2.charAt(0)));
                       }
                       /**if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)
                       st[i][j]=Character.toString(Character.toUpperCase(nam2.charAt(0)))+Character.toString(Character.toUpperCase(nam1.charAt(0)));*/
                   }
               }
               
                for(int i=0;i<=9;i++)
               {
                for(int j=0;j<=9;j++)
                {
                    s_console.setTextAttributes(attrs2);
                    char ch1=st[i][j].charAt(0);
                    if(Character.isDigit(ch1)==true)
                    {
                        int mn=Integer.parseInt(st[i][j]);
                        if(mn==100)
                        System.out.print(" "+"|"+"__"+st[i][j]+"_");
                        if(mn>=10&&mn<=99)
                        System.out.print(" "+"|"+"__"+st[i][j]+"__");
                        if(mn>=1&&mn<=9)
                        System.out.print(" "+"|"+"___"+st[i][j]+"__");
                    }
                    if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"__");
                        s_console.setTextAttributes(attrs);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }
                    if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"__");
                        s_console.setTextAttributes(attrs1);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }
                    /**if(st[i][j].compareTo(Character.toString(Character.toUpperCase(nam2.charAt(0)))+Character.toString(Character.toUpperCase(nam1.charAt(0))))==0)  
                    {
                        s_console.setTextAttributes(attrs2);
                        System.out.print(" "+"|"+"_");
                        s_console.setTextAttributes(attrs1);
                        System.out.print(st[i][j]);
                        s_console.setTextAttributes(attrs2);
                        System.out.print("__");
                    }*/
                    /*else if(st[i][j]=="H")  
                    {s_console.setTextAttributes(attrs);
                    System.out.print(" "+"|"+"__"+st[i][j]+"__");
                    }
                    else if(st[i][j]=="I")  
                    {s_console1.setTextAttributes(attrs1);
                    System.out.print(" "+"|"+"__"+st[i][j]+"__");
                    }*/
                    /**{System.out.print(" "+"|"+"__");
                    if(st[i][j]=="H"/*Character.toString((Character.toUpperCase(nam1.charAt(0)))))
                    {
                     s_console.setTextAttributes(attrs);
                    System.out.print(st[i][j]);
                    s_console2.setTextAttributes(attrs2);
                    System.out.print("__");
                    }
                    if(st[i][j]=="I"/*Character.toString((Character.toUpperCase(nam2.charAt(0)))))
                    {
                     s_console1.setTextAttributes(attrs1);
                    System.out.print(st[i][j]);
                    s_console2.setTextAttributes(attrs2);
                    System.out.print("__");
                    }
                    }*/
               }
                s_console.setTextAttributes(attrs2);
                System.out.print("|");
                System.out.print("\n");
            }
            }
            s_console.setTextAttributes(attrs1);
           if(plr2==101)
              {
                 System.out.print(nam2+" Wins!!");break;
              }
        }
        }
    }
    private static final Console s_console; //Declare the Console
    static
    {
        s_console = Enigma.getConsole("Hamzah's Game2"); //Sets the console to the Enigma console, named "Hamzah's Game"
    } 
    /*private static final Console s_console1; //Declare the Console
    static
    {
        s_console1 = Enigma.getConsole("Hamzah's Game2"); //Sets the console to the Enigma console, named "Hamzah's Game"
    } 
    private static final Console s_console2; //Declare the Console
    static
    {
        s_console2 = Enigma.getConsole("Hamzah's Game2"); //Sets the console to the Enigma console, named "Hamzah's Game"
    }*/
}
/**if(b==100)
                    st[i][j]="__"+Integer.toString(b++)+"_";
                    if(b>=10&&b<=99)
                    st[i][j]="__"+Integer.toString(b++)+"__";
                    if(b>=1&&b<=9)
                    st[i][j]="___"+Integer.toString(b++)+"__";*/