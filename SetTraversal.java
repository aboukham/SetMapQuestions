import java.util.*;

public class SetTraversal {
    public static Set convertToHashSet(List list){
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++){
            hashSet.add((String) list.get(i));
        }
        return hashSet;
    }

    public static Set convertToLinkedHashSet(List list){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++){
            linkedHashSet.add((String) list.get(i));
        }
        return linkedHashSet;
    }

    public static Set convertToTreeSet(List list){
        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < list.size(); i++){
            treeSet.add((String) list.get(i));
        }
        return treeSet;
    }

    public static void traverseSet(Set<Integer> set){
        Iterator    iter = set.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();
    }

    public static void traverseMap(Map<Integer, String> map){
        Iterator    iter = map.keySet().iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();
    }

    public static int countCharacterInWord(String word, char c){//hello l 0 + m("ello", c)
        if (word.isEmpty())                             //0 + 2 = 2
            return 0;                                    // 1 + 1 = 2
        if (c == word.charAt(0))                        // 1 + 0 = 1
            return 1 + countCharacterInWord(word.substring(1), c);//0 + 0 = 0
        else                                                        //0
            return 0 + countCharacterInWord(word.substring(1), c);
    }

    public static void main(String[] args){
        Map<Integer, String> ht = new Hashtable<>();
        /*Set<Integer>    set = new HashSet<>();
        List<String>    list = new ArrayList<>();
        set.add(12);
        set.add(34);
        set.add(4);
        set.add(78);
        ht.put(111, "abdelaziz");
        ht.put(111, "taye");
        ht.put(112, "robeil");
        ht.put(113, "rahel");

        Iterator    iter = ht.values().iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
        System.out.println();//111 112 113// taye robeil rahel
        //System.out.println(ht);*/
        System.out.println(countCharacterInWord("hello", 'a'));

       /* list.add("abdelaziz");
        list.add("taye");
        list.add("patrik");
        list.add("robeil");

        /*System.out.println("************for hash set********");//arbitrary order
        traverseSet(convertToHashSet(list));
        System.out.println("************for linked hash set********");//keep the same order
        traverseSet(convertToLinkedHashSet(list));
        System.out.println("************for tree set********");//sorting set*/
        //traverseSet(set);
        //traverseMap(ht);

        //equals
    }
}
