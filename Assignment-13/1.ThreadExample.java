
class ThreadExample extends Thread{
    
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        
        t1.start();
        t2.start();
        
        t1.run();
        t2.run();
        
    }
    
    public synchronized void run()
    {
        for(int i = 0 ;i<100 ; i++)
            System.out.print(" "+i);
    }
    
}
