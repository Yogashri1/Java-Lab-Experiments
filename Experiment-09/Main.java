class ReservationThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Reservation Thread: Ticket reservation " + i + " completed");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation thread interrupted");
            }
        }
    }
}

class StatusThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Status Thread: Ticket confirmation " + i + " completed");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ReservationThread reservationThread = new ReservationThread();

        StatusThread status = new StatusThread();
        Thread statusThread = new Thread(status);

        reservationThread.start();
        statusThread.start();
    }
}
