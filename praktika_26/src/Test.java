import java.util.*;

class Test
{
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();

        System.out.println("Задание 3");
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");

        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));


        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);

        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        System.out.println("Задание 4");
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }
    }
}