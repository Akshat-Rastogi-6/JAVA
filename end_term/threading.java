class Mythread extends Thread{
    Mythread(){
        // t = new Thread(this,"child");
        super("child");
        System.out.println("child Thread : " + this);
        start();
    }

    public void run(){
        try{
            for(int i= 5; i>=1; i-- ){
                System.out.println("Child: "+ i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
            System.out.println("child suspended");
        }

        System.out.println("child terminated");
    }
}

class threading {
    public static void main(String[] args) {
        
        Mythread t1 = new Mythread();

        try{
            for(int i= 5; i>=1; i-- ){
                System.out.println("main: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("main intrupted");
        }
    }
}
