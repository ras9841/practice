public class Node
{
    private int data;
    private Node left;
    private Node right;

    public Node(int val)
    {
        this.data = val;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node val) { this.left = val; }
    public void setRight(Node val) { this.right = val; }
    public Node left() { return this.left; }
    public Node right() { return this.right; }
    public int value() { return this.data; }
    public String toString() { return "("+this.data+")"; }
}
