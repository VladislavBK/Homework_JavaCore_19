public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
