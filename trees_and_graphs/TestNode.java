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

        int len = values.length;
        for (int i=0,j=len/2; i<len; ++i, ++j)
        {
            tree.addVal(values[j%len]);
        }

        System.out.println(tree);
    }
}
