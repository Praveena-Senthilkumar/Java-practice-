import java.util.ArrayList;
import java.util.List;
class arrlist
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);

        System.out.println(list.get(1));
        list.remove(1);
        list.add(1, 40);
        list.set(2, 50);
        System.out.println(list);

        for(int i : list) {
            System.out.println(i);
        }

        List l2 = new ArrayList();
        l2.
    }
}