import java.util.Scanner;

public class first {

    public static void cem(int eded1, int eded2){
        System.out.println(eded1+eded2);
    }
    public static int returnCem(int eded1, int eded2){
        return (eded1+eded2);
    }

    public static void Iam(String c ,String y){
        System.out.println("My name is" + " " + c + " "+ "and my surname is"+ " " + y);
    }
      public static void Min(){
          Scanner daxilEt=new Scanner(System.in);
          System.out.println(" eded1 daxil edin :");
          int eded1=daxilEt.nextInt();
          System.out.println("eded2 daxil edin");
          int eded2=daxilEt.nextInt();

          if(eded1>eded2){
              System.out.println("en kicik eded:"+ eded2 );
          }
          else if(eded1==eded2){
              System.out.println("ededler berbaberdir");
          }
          else{
              System.out.println("en kicik eded"+ eded1);
          }
      }

}
