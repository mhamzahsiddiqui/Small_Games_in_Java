import java.awt.Color; 
import enigma.console.*; 
import enigma.core.Enigma;
import java.util.*;
class Tic_Tac_Toe
{
    public static void main()
    {
        Scanner y=new Scanner(System.in);
       int r=0,c=0;int k1=0;int kbc=0;
        String a[][]={{" "," "," "},{" "," "," "},{" "," "," "}};
        System.out.println("First Player's chance then Computer's");
        System.out.println("First Enter Row then Enter Coloumn Followed by 'Enter' Key");
        System.out.println("Enter Level '1' or '2'");
        int lev=y.nextInt();
        System.out.print("\n\n");
        TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);//Changes the color of background and text
        s_console.setTextAttributes(attrs); //Sets the colors to the console
        TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);//Changes the color of background and text
        s_console1.setTextAttributes(attrs1); //Sets the colors to the console
        TextAttributes attrs2 = new TextAttributes(Color.WHITE, Color.BLACK);//Changes the color of background and text*
        s_console2.setTextAttributes(attrs2); //Sets the colors to the console
        for(int i=1;i<=9;i++)
        {
            if(i%2==0)
            {
                //TextAttributes attrs2 = new TextAttributes(Color.WHITE, Color.BLACK);//Changes the color of background and text
                s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                System.out.println("Your Turn");
                System.out.println("Enter Row and coloumn");
                r=y.nextInt();
                c=y.nextInt();
                while(a[r-1][c-1]=="x"||a[r-1][c-1]=="0")
                {
                    System.out.println("Invalid Turn");
                    System.out.println("Enter Again");
                    System.out.println("Enter Row and coloumn");
                    r=y.nextInt();
                    c=y.nextInt(); 
                }
                a[r-1][c-1]="x";
                for(int k=0;k<3;k++)
                {
                    //TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);//Changes the color of background and text
                    //s_console.setTextAttributes(attrs); //Sets the colors to the console
                    //System.out.print("\u000C");
                    System.out.print(k+1);
/*System.out.print(k+1);
for(int m=0;m<4;m++)
    {
for(int n=0;n<4;n++)
{
    System.out.print(" "+"| ");
}
System.out.println();
}*/
                    /*for(int j=0;j<3;j++)
                    {System.out.print(" "+"| ");
                    System.out.print(a[k][j]+" ");}
                    System.out.print(" "+"| ");
                    System.out.println();*/
                    for(int j=0;j<3;j++)
                    {
                        if(a[k][j]=="x")
                        {
                            s_console2.setTextAttributes(attrs2);
                            System.out.print(" "+"| ");
                            //TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);
                            s_console.setTextAttributes(attrs); //Sets the colors to the console
                            //System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                        }
                        else if(a[k][j]=="0")
                        {
                            s_console2.setTextAttributes(attrs2);
                            System.out.print(" "+"| ");
                            //TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);
                            s_console1.setTextAttributes(attrs1); //Sets the colors to the console
                            //System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                        }
                        else //if(a[k][j]!="0"&&a[k][j]!="x")
                        {
                            s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                            System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                         }
                        }
                    s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                    System.out.print(" "+"| ");
                    System.out.println();
                }
                if(a[0][0]=="x"&&a[0][1]=="x"&&a[0][2]=="x")
               { System.out.println("Player Wins");k1=1;}
                if(a[1][0]=="x"&&a[1][1]=="x"&&a[1][2]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[2][0]=="x"&&a[2][1]=="x"&&a[2][2]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[0][0]=="x"&&a[1][0]=="x"&&a[2][0]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[0][1]=="x"&&a[1][1]=="x"&&a[2][1]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[0][2]=="x"&&a[1][2]=="x"&&a[2][2]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[0][0]=="x"&&a[1][1]=="x"&&a[2][2]=="x")
                {System.out.println("Player Wins");k1=1;}
                if(a[0][2]=="x"&&a[1][1]=="x"&&a[2][0]=="x")
                {System.out.println("Player Wins");k1=1;}
                System.out.println();
                }
                if(k1==1)
                break;
                r=0;c=0;
                if(i%2==1)
                {
                    for(int j=0;j<(int)Math.pow(2,22);j++);
                    //TextAttributes attrs2 = new TextAttributes(Color.WHITE, Color.BLACK);//Changes the color of background and text
                    s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                    System.out.println("Computer's Turn");
                    if(lev==1)
                    {
                    r=(int)(Math.random()*3);
                    c=(int)(Math.random()*3);
                    while(a[r][c]=="x"||a[r][c]=="0")
                    {
                        r=(int)(Math.random()*3);
                        c=(int)(Math.random()*3);
                    }
                    a[r][c]="0";
                    }
                    if(lev==2)
                    {
                        if(a[0][0]=="x"&&a[0][1]=="x")
                        {
                            if(a[0][2]!="0")
                            a[0][2]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][0]=="x"&&a[0][2]=="x")
                        {
                            if(a[0][1]!="0")
                            a[0][1]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][0]=="x"&&a[1][0]=="x")
                        {
                            if(a[2][0]!="0")
                            a[2][0]="0";   
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][0]=="x"&&a[2][0]=="x")
                        {
                            if(a[1][0]!="0")
                            a[1][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][0]=="x"&&a[1][1]=="x")
                        {
                            if(a[2][2]!="0")
                            a[2][2]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][0]=="x"&&a[2][2]=="x")
                        {
                            if(a[1][1]!="0")
                            a[1][1]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][1]=="x"&&a[0][2]=="x")
                        {
                            if(a[0][0]!="0")
                            a[0][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][1]=="x"&&a[1][1]=="x")
                        {
                            while(a[2][1]!="0")
                            a[2][1]="0";
                        }
                        else if(a[0][1]=="x"&&a[2][1]=="x")
                        {
                            if(a[1][1]!="0")
                            a[1][1]="0";    
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][2]=="x"&&a[1][2]=="x")
                        {
                            while(a[2][2]!="0")
                            a[2][2]="0";                   
                        }
                        else if(a[0][2]=="x"&&a[2][2]=="x")
                        {
                            if(a[1][2]!="0")
                            a[1][2]="0";  
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][2]=="x"&&a[1][1]=="x")
                        {
                            if(a[2][0]!="0")
                            a[2][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[0][2]=="x"&&a[2][0]=="x")
                        {
                            if(a[1][1]!="0")
                            a[1][1]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][0]=="x"&&a[2][0]=="x")
                        {
                            if(a[0][0]!="0")
                            a[0][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][0]=="x"&&a[1][1]=="x")
                        {
                            if(a[1][2]!="0")
                            a[1][2]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][0]=="x"&&a[1][2]=="x")
                        {
                            if(a[1][1]!="0")
                            a[1][1]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][1]=="x"&&a[1][2]=="x")
                        {
                            if(a[1][0]!="0")
                            a[1][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][1]=="x"&&a[2][1]=="x")
                        {
                            if(a[0][1]!="0")
                            a[0][1]="0";  
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][1]=="x"&&a[2][2]=="x")
                        {
                            if(a[0][0]!="0")
                            a[0][0]="0";  
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][1]=="x"&&a[2][0]=="x")
                        {
                            if(a[0][2]!="0")
                            a[0][2]="0";   
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[1][2]=="x"&&a[2][2]=="x")
                        {
                           if(a[0][2]!="0")
                            a[0][2]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[2][0]=="x"&&a[2][1]=="x")
                        {
                            if(a[2][2]!="0")
                            a[2][2]="0";  
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[2][0]=="x"&&a[2][2]=="x")
                        {
                            if(a[2][1]!="0")
                            a[2][1]="0"; 
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else if(a[2][1]=="x"&&a[2][2]=="x")
                        {
                            if(a[2][0]!="0")
                            a[2][0]="0";
                            else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                        }
                        else
                        {
                            r=(int)(Math.random()*3);
                            c=(int)(Math.random()*3);
                            while(a[r][c]=="x"||a[r][c]=="0")
                            {
                                r=(int)(Math.random()*3);
                                c=(int)(Math.random()*3);
                            }
                            a[r][c]="0";
                        }
                    }
                
                     /*if(a[r][c]=="x"||a[r][c]=="0")
                    { r=(int)(Math.random()*3);
                    c=(int)(Math.random()*3);a[r][c]="0";}
               else
                   if(kbc==0)
                    */
                        /*a[r][c]="0";*/
                    for(int k=0;k<3;k++)
                {
                    //TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);//Changes the color of background and text
                    //s_console1.setTextAttributes(attrs1); //Sets the colors to the console
                    System.out.print(k+1);
/*System.out.print(k+1);
for(int m=0;m<4;m++)
    {
for(int n=0;n<4;n++)
{
    System.out.print(" "+"| ");
}
System.out.println();
}*/
                    /*for(int j=0;j<3;j++)
                    {   System.out.print(" "+"| ");
                    System.out.print(a[k][j]+" ");}
                    System.out.print(" "+"| ");
                    System.out.println();*/
                    for(int j=0;j<3;j++)
                    { if(a[k][j]=="x")
                        {
                            s_console2.setTextAttributes(attrs2);
                            System.out.print(" "+"| ");
                            //TextAttributes attrs = new TextAttributes(Color.GREEN, Color.BLACK);
                            s_console.setTextAttributes(attrs); //Sets the colors to the console
                            //System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                        }
                        else if(a[k][j]=="0")
                        {
                            s_console2.setTextAttributes(attrs2);
                            System.out.print(" "+"| ");
                            //TextAttributes attrs1 = new TextAttributes(Color.RED, Color.BLACK);
                            s_console1.setTextAttributes(attrs1); //Sets the colors to the console
                            //System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                        }
                        else
                        {
                            s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                            System.out.print(" "+"| ");
                            System.out.print(a[k][j]+" ");
                         }
                        }
                    
                    s_console2.setTextAttributes(attrs2); //Sets the colors to the console
                    System.out.print(" "+"| ");
                    System.out.println();}
                }
                if(a[0][0]=="0"&&a[0][1]=="0"&&a[0][2]=="0")
                {System.out.println("Computer Wins"); k1=1;}
                if(a[1][0]=="0"&&a[1][1]=="0"&&a[1][2]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[2][0]=="0"&&a[2][1]=="0"&&a[2][2]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[0][0]=="0"&&a[1][0]=="0"&&a[2][0]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[0][1]=="0"&&a[1][1]=="0"&&a[2][1]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[0][2]=="0"&&a[1][2]=="0"&&a[2][2]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[0][0]=="0"&&a[1][1]=="0"&&a[2][2]=="0")
                {System.out.println("Computer Wins");k1=1;}
                if(a[0][2]=="0"&&a[1][1]=="0"&&a[2][0]=="0")
                {System.out.println("Computer Wins");k1=1;}
                System.out.println();if(k1==1)
                break;
                }
            }
        private static final Console s_console; //Declare the Console
    static
    {
        s_console = Enigma.getConsole("Hamzah's Game"); //Sets the console to the Enigma console, named "Hamzah's Game"
    } 
    private static final Console s_console1; //Declare the Console
    static
    {
        s_console1 = Enigma.getConsole("Hamzah's Game"); //Sets the console to the Enigma console, named "Hamzah's Game"
    } 
    private static final Console s_console2; //Declare the Console
    static
    {
        s_console2 = Enigma.getConsole("Hamzah's Game"); //Sets the console to the Enigma console, named "Hamzah's Game"
    } 
    }


           
                /*if(a[0][0]=="x"&&a[0][1]=="x"&&a[0][2]=="0")
                if(a[1][0]=="x"&&a[1][1]=="x"&&a[1][2]=="0")
                if(a[2][0]=="x"&&a[2][1]=="x"&&a[2][2]=="0")
                if(a[0][0]=="x"&&a[1][0]=="x"&&a[2][0]=="0")
                if(a[0][1]=="x"&&a[1][1]=="x"&&a[2][1]=="0")
                if(a[0][2]=="x"&&a[1][2]=="x"&&a[2][2]=="0")
                if(a[0][0]=="x"&&a[1][1]=="x"&&a[2][2]=="0")
                if(a[0][2]=="x"&&a[1][1]=="x"&&a[2][0]=="0")*/
                /**for(int i2=0;i2<3;i2++)
                     {
                         for(int j2=0;j2<1;j2++)
                         {
                             if (a[i2][j2]=="0"&&a[12][j2+1]=="0")
                                {
                                  a[i2][j2+2]="0";kbc=1;
                                }
                            }
                        }
                        for(int i2=0;i2<1;i2++)
                         {
                             for(int j2=0;j2<1;j2++)
                              {
                                  if(a[i2][j2]=="0"&&a[i2+1][j2+1]=="0")
                                    {
                                      a[i2+2][j2+2]="0";kbc=1;
                                    }
                                  if(a[i2+1][j2+1]=="0"&&a[i2+2][j2+2]=="0")
                                    {
                                      a[i2][j2]="0";kbc=1;
                                    }
                                  if(a[i2][j2]=="0"&&a[i2+2][j2+2]=="0")
                                    {
                                      a[i2+1][j2+1]="0";kbc=1;
                                    }
                                }
                            }
                         for(int i2=0;i2<1;i2++)
                           {
                             for(int j2=2;j2<=2;j2++)
                              {
                                  if(a[i2][j2]=="0"&&a[i2+1][j2-1]=="0")
                                    {
                                      a[i2+2][j2-2]="0";kbc=1;
                                    }
                                  if(a[i2+1][j2-1]=="0"&&a[i2+2][j2-2]=="0")
                                    {
                                      a[i2][j2]="0";kbc=1;
                                    }
                                  if(a[i2][j2]=="0"&&a[i2+2][j2-2]=="0")
                                    {
                                      a[i2+1][j2-1]="0";kbc=1;
                                    }
                                }
                            }
                            for(int i2=0;i2<1;i2++)
                         {
                             for(int j2=0;j2<3;j2++)
                              {
                                  if(a[i2][j2]=="0"&&a[i2+1][j2]=="0")
                                    {
                                      a[i2+2][j2]="0";kbc=1;
                                    }
                                  if(a[i2][j2]=="0"&&a[i2+1][j2]=="0")
                                    {
                                      a[i2+2][j2]="0";kbc=1;
                                    }
                                  if(a[i2][j2]=="0"&&a[i2+1][j2]=="0")
                                    {
                                      a[i2+2][j2]="0";kbc=1;
                                    }
                                }
                            }*/
