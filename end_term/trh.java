class Mythread implements Runnable{
    Thread t;
    Mythread(String a){
        t = new Thread(this,a);
        System.out.println("Employee Name:" + t.getName());
        t.start();
    }

    public void run(){
        for(int i = 1; i<=5; i++){
            if(t.getName() == "Alice"){
                try{
                    Thread.sleep(2000);
                    System.out.println(i + " made by" + t.getName());
                }
                catch(InterruptedException e){
                    System.out.println("Exception");
                }
            }

            else if(t.getName() == "Bob"){
                try{
                    Thread.sleep(3000);
                    System.out.println(i + " made by" + t.getName());
                }
                catch(InterruptedException e){
                    System.out.println("Exception");
                }
            }
        }
    }
}



class trh {
    public static void main(String[] args) {
        Mythread t = new Mythread("Alice");
        Mythread t2 = new Mythread("Bob");
    }


}
