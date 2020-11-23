package fileoperation;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileOperation {

    public static void main(String[] args) {
      File dir=new File("test");
      dir.mkdir();//create directory
      String path=dir.getAbsolutePath();//Find directory location
      System.out.println("Directory Path Is : "+path);
      //dir.delete();//Delete directory
       dir=new File("test/student.txt"); 
      try{
          dir.createNewFile();
          System.out.println("File Created");
      }
      catch(Exception e){
          
      }
      //File Read Write
      try{
        
        Formatter frWrite=new Formatter("test/student.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input Size : ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter Name : ");
            String name=sc.next();
            System.out.println("Enter Id : ");
            String id=sc.next();
            frWrite.format("%s %s\r\n", name,id);
        }
        frWrite.close();
      }
      catch(Exception e ){
          
      }
      
     try{
        File frRead=new File("test/student.txt");
        Scanner sc=new Scanner(frRead);
        while(sc.hasNext()){
           
            String name=sc.next();
            String id=sc.next();
            System.out.println("Name & ID : "+name+" "+id);
        }
        
        sc.close();
      }
      catch(Exception e ){
          
      }
    }
    
}
