package EY2308;
class SharedResources{
    synchronized static void print(int n)
    {
        for(int i=1;i<=5;i++)
        {
        System.out.println(n*i);    
        }
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread3 extends Thread{
    public void run()
    {
        SharedResources.print(5);
    }
}
class MyThread4 extends Thread{
 public void run()
    {
        SharedResources.print(10);
    }
}
class MyThread5 extends Thread{
    public void run()
    {
        SharedResources.print(15);
    }
}

 

 

public class StaticSynchronizedBlock {
public static void main(String[] args) {
    MyThread3 t1=new MyThread3();
    MyThread4 t2=new MyThread4();
    MyThread5 t3=new MyThread5();
    t1.run();
    t3.run();
    t2.run();

}

}

 