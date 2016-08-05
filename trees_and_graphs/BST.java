import java.lang.Integer;
import java.lang.Double;

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
        // Compute tree depth
        int depth = (int)Math.floor(Math.log(this.size)/Math.log(2.0));

        // Initialize queue for BFS-style node visiting
        LinkedQueue<Node> queue = new LinkedQueue<>();
       
        // Calculate total number of nodes needed for full tree.
        Double d;
        int size = 0;
        for (int i=depth; i>-1; i--)
        {
            d = Math.pow(2,i);
            size += d.intValue();
        }

        // Initialize array used to hold values of each node
        Integer[] bfs = new Integer[size];

        // Add values to queue via BFS
        int i = 0;
        Node current;
        queue.add(this.head);
        while (queue.size() > 0)
        {
            current = queue.remove();
            bfs[i] = current.value();
            if (current.left() !=  null) { queue.add(current.left()); }
            if (current.right() !=  null) { queue.add(current.right()); }
            
            // Deal with filling in empty nodes
            if (current.left() == null ^ current.right() == null)
            {
                // Mark empty child with null
                if (current.left() == null) { bfs[2*i+1] = null; }
                else { bfs[2*i+2] = null; }
            }
            i++;
        }

        // Build string by processing Integer object array
        Integer val;
        int marker=1; // [1, 2^n]: used to place newlines

        String str = "\n";
        for (int j=0,n=0; j<size; j++)
        {
            val = bfs[j];
            
            if (val != null) { str += "("+val+")\t"; }
            else { str += "(X)\t"; }

            d = Math.pow(2,n);
            if ( marker == d.intValue() )
            {
                n++;
                marker = 0;
                str+="\n";
            }
            marker++;
        }

        return str;
    }


}

