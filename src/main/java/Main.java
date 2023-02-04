public class Main {
    public static void main(String[] args) throws InterruptedException {

        int count = 0;

        MyThread myThread = new MyThread();

        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread thread1 = new Thread(mainGroup, myThread);
        Thread thread2 = new Thread(mainGroup, myThread);
        Thread thread3 = new Thread(mainGroup, myThread);
        Thread thread4 = new Thread(mainGroup, myThread);
        thread1.setName("Поток - 1");
        thread2.setName("Поток - 2");
        thread3.setName("Поток - 3");
        thread4.setName("Поток - 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        for(int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            count++;
            System.out.println("Секунд прошло = " + count);
            if(count == 15) {
                mainGroup.interrupt();
            }
        }

    }
}
