class Mythread implements Runnable{
    Thread t;
    Mythread(String h){
        t = new Thread(this, h);
        System.out.println("Thread" + t);
        t.start();
    }

    public void run(){
        try {
            for(int i = 5; i>=0;i--){
                System.out.println(t.getName() + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception

            System.out.println("Thread suspended");
        }
        finally{
            System.out.println("Thread terminated");
        }
    }
}


class threading_func {
    public static void main(String[] args) {
        
        Mythread n = new Mythread("hello ");
        Mythread n2 = new Mythread("Bye ");
    
        try{
            for(int i = 5; i>=0;i--){
                    System.out.println("main " + i);
                    Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        finally{
            System.out.println("Thread terminated");
        }
    }
}
