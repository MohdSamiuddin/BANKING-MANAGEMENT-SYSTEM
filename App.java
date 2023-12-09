package CollegeManagement;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choice=1;
    	Student s=new Student();
    	Management m1=new Management();
    	Operate_teacher m2=new Operate_teacher();
    	int chose=1;
    	Scanner se=new Scanner(System.in);
    	try {
    	
    	do {
    	System.out.println("Enter 1 to acces Student database\n else 2 to Teacher :");
    	chose=se.nextInt();
    	
    	if(chose==1) {
        do {
        
        	
        	System.out.println(" Press 1 to add new student");
        	System.out.println(" Press 2 to update student name");
        	System.out.println(" Press 3 to delete student");
        	System.out.println(" Press 4 to show student");
        	System.out.println("Enter your choice");
        	Scanner sc=new Scanner(System.in);
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1: m1.add();
        	break;
        	case 2:m1.update();
        	break;
        	case 3:m1.delete();
        	break;
        	case 4:
        		 m1.show();
        		 
        	
        	}
        	System.out.println(" Press 1 to Continue");
        	
        	choice=sc.nextInt();
        
    }while(choice==1);
          }
    	else {
    	
    	        do {
    	        	
    	        	
    	        	System.out.println(" Press 1 to add new Teacher");
    	        	System.out.println(" Press 2 to update Teacher name");
    	        	System.out.println(" Press 3 to delete Teacher");
    	        	System.out.println(" Press 4 to show Teacher");
    	        	System.out.println("Enter your choice");
    	        	Scanner sc=new Scanner(System.in);
    	        	choice=sc.nextInt();
    	        	switch(choice) {
    	        	case 1: m2.add();
    	        	break;
    	        	case 2:m2.update();
    	        	break;
    	        	case 3:m2.delete();
    	        	break;
    	        	case 4:
    	        		 m2.show();
    	        		 
    	        	
    	        	}
    	        	System.out.println(" Press 1 to Continue");
    	        	
    	        	choice=sc.nextInt();
    	        
    	    }while(choice==1);
    	}
    	System.out.println(" Press 1 to Continue");
    	
    	choice=se.nextInt();
    	}while(chose==1);}
    	catch(Exception e) {
    		System.out.println("You enter wrong input");
    	}
    
}
}
