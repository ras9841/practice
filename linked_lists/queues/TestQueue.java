import java.lang.Integer;

public class TestQueue
{
    public static void main(String[] args)
    {
        System.out.println("Testing");
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        System.out.println(queue);
        System.out.println(queue.remove() == null);
        System.out.println(queue.size() == 0);
    }
}
