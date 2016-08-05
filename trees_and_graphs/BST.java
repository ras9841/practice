public class BST
{
    private int size;
    private Node head;

    public BST()
    {
        this.head = null;
    }

    public void addVal(int val)
    {
        Node current = this.head;
        Node added = new Node(val);

        this.size++;

        if (current == null)
        {
            this.head = added;
            return;
        }

        while ( true )
        {
            if ( val < current.value() ) // go left
            {
                if ( current.left() == null ) 
                { 
                    current.setLeft(added); 
                    break; 
                }
                else { current = current.left(); }
            }
            else // go right
            {
                if ( current.right() == null ) { 
                    current.setRight(added); 
                    break;
                }
                else { current = current.right(); }
            }
        }
    }

    public String toString()
    {
        int depth = (int)Math.floor(Math.log(this.size)/Math.log(2.0));
        return ""+ this.head + display(this.head.left(), depth-1) + 
    }

    private String display(Node root, int depth)
    {
        if ( root == null ) { return "()"; } 
        
        String str = "";
        for (int i=0; i<depth; i++) str += "\t";
        str += root;
        if (root.left()


    }
}

