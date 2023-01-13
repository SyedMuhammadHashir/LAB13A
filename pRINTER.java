package hashir567;

public class pRINTER {
	int page=20; 
	 
	synchronized void withdraw(int page){ 
	System.out.println("going to printer TO THE GOING"); 
	 
	if(this.page<page){ 
	System.out.println("Less page;waiting for page "); 
	try{wait();}catch(Exception e){} 
	} 
	this.page-=page; 
	System.out.println("print complete"); 
	} 
	 
	synchronized void deposit(int page){ 
	System.out.println("going to printer"); 
	this.page+=page; 
	System.out.println("printer completed... "); 
	notify(); 
	} 
	} 
class Thread1 extends Thread
{
pRINTER c=new pRINTER (); 
public void run()
{
c.withdraw(75);
}
}
class Thread2 extends Thread
{
	pRINTER  c=new pRINTER (); 
public void run()
{
c.deposit(90);
}
}
class Use{ 
public static void main(String args[]){ 
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}}
