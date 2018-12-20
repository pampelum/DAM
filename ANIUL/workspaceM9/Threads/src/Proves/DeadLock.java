package Proves;

public class DeadLock {
	 String str1 = "Java";
	    String str2 = "UNIX";
	     
	    Thread trd1 = new Thread("My Thread 1"){
	        public void run(){
	        		int c =0;
	            while(true){
	                synchronized(str1){
	                		System.out.println("T1 agafa lock 1");
	                    synchronized(str2){
	                    		System.out.println("T1 agafa lock 2");
	                        System.out.println("T1:" + ++c + ":" + str1 + str2);
	                        System.out.println("T1 allibera lock 2");
	                    }
	                    System.out.println("T1 allibera lock 1");
	                }
	            }
	        }
	    };
	     
	    Thread trd2 = new Thread("My Thread 2"){
	        public void run(){
	        		int c = 0;
	            while(true){
	                synchronized(str2){
	                		System.out.println("T2 agafa lock 2");
	                    synchronized(str1){
	                    		System.out.println("T2 agafa lock 1");	
	                        System.out.println("T2:" + ++c + ":" + str2 + str1);
	                        System.out.println("T2 allibera lock 1");
	                    }
	                    System.out.println("T2 allibera lock 2");
	                }
	            }
	        }
	    };
	     
	    public static void main(String a[]){
	       DeadLock mdl = new DeadLock();
	        mdl.trd1.start();
	        mdl.trd2.start();
	    }
}
