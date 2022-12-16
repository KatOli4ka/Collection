package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <A extends Transport> {
    private final String name;

    public ServiceStation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final Queue<A> queue = new LinkedList<>();

    public void addTransport(A auto) {
        queue.offer(auto);
    }
    public void techInspection() {
        A transport=queue.poll();
        if (transport != null) {
            System.out.println("Станция техобслуживания "+name+" провела техосмотр "+transport);
            techInspection();
        } else {
            System.out.println("В очереди больше нет авто");
        }
    }

}
