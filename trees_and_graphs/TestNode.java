import java.util.Arrays;

public class TestNode
{
    public static void main(String[] args)
    {
        int [] values = new int[6];
        for (int i=0; i<6; i++)
        {
            values[i] = i;
        }
    
        BST tree = new BST();

        addToTree(tree, values);

        System.out.println(tree);
    }

    public static void addToTree(BST tree, int[] values)
    {
        int size = values.length;
        if (size > 0)
        {
            int mid = size/2;
            tree.addVal(values[mid]);
            addToTree(tree, Arrays.copyOfRange(values, mid+1, size));
            addToTree(tree, Arrays.copyOfRange(values, 0, mid));
        }
    }
}
