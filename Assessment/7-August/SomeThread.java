class MySmpThread extends Thread{//step 1
	//Thread class is in java.lang package

	public MySmpThread()
	{
		System.out.println("This is MySmpThread() Constructor");
	}
	
	static int i = 31;
    
    //step 2
    public void run(){//public void run() need to be overridden
        while(i<=50){
          try{
            	
                System.out.println("Other Thread 2: "+i);
                i++;
                Thread.sleep(400); //in milliseconds
            } catch (InterruptedException iex) {//checked exception
                System.out.println("Exception in thread: "+iex.getMessage());
                break;
            }
        }
        System.out.println("End of Other Thread 2...");
    }
}
class MySmpThread3 extends Thread{//step 1
	//Thread class is in java.lang package

	public MySmpThread3()
	{
		System.out.println("This is MySmpThread3() Constructor");
	}
	
	static int i = 51;
    
    //step 2
    public void run(){//public void run() need to be overridden
        while(i<=80){
          try{
            	
                System.out.println("Other Thread 3: "+i);
                i++;
                Thread.sleep(400); //in milliseconds
            } catch (InterruptedException iex) {//checked exception
                System.out.println("Exception in thread: "+iex.getMessage());
                break;
            }
        }
        System.out.println("End of Other Thread 3...");
    }
}
public class SomeThread {
	static int i = 0;
    public static void main(String a[]) throws InterruptedException{
    	//main thread starts by default
        System.out.println("Starting Main Thread...");
        
        //step 3
        MySmpThread mst = new MySmpThread();
        MySmpThread3 mst3 = new MySmpThread3();
        
        
        //from this main thread, start MySmpThread thread, by invoking start()
        
        //step 4
       
        while(i <=30){
            try{
                System.out.println("Main Thread: "+i);
                i++;
                Thread.sleep(400);//delays program execution by 100ms
            } catch (Exception iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
                break;
            }
        }
        System.out.println("End of Main Thread...");
        mst.start();
        mst.join();
        mst3.start();
    }
}