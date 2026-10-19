class Printer {
    synchronized void printDocument(String threadName) {
        System.out.println(threadName + ": Document printing started");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(threadName + ": Printing interrupted");
        }

        System.out.println(threadName + ": Document printing finished");
    }
}

class UserThread extends Thread {
    private Printer printer;

    UserThread(Printer printer, String threadName) {
        super(threadName);
        this.printer = printer;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": Thread started");
        printer.printDocument(getName());
        System.out.println(getName() + ": Thread terminated");
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        UserThread thread1 = new UserThread(printer, "User-1");
        UserThread thread2 = new UserThread(printer, "User-2");

        System.out.println("Initial State: " + thread1.getState());

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Current State: " + thread1.getState());

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting");
        }

        System.out.println("Final State: " + thread1.getState());
        System.out.println("Deadlock Prevention: A single shared lock is used for synchronization.");
    }
}
