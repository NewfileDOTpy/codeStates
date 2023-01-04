import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-".repeat(60));
        System.out.println("ArrayList");
        ArrayList<String> strList = new ArrayList<>();


        strList.add("java");
        strList.add("egg");
        strList.add("tree");

        int size = strList.size();

        String skill = strList.get(0);

        for (String i : strList){
            System.out.println(i);
        }
        for (int i = 0; i<strList.size(); i++){
            System.out.println(i + " = " + strList.get(i));
        }

        strList.remove(0);

        System.out.println("-".repeat(60));
        System.out.println("LikedList\n");

        LinkedList<String> strList2 = new LinkedList<>();


        strList2.add("python");
        strList2.add("orange");
        strList2.add("apple");
        strList2.add("flower");


        int size2 = strList2.size();

        String skill2 = strList2.get(0);

        for (String str : strList2){
            System.out.println(str);
        }
        for (int i = 0; i < strList2.size(); i++){
            System.out.println(i +" = " + strList2.get(i));
        }

        strList2.remove(0);

        System.out.println("-".repeat(60));
        System.out.println("Iterator\n");




        Iterator<String> iterator = strList2.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }



        System.out.println("-".repeat(60));
        System.out.println("HashSet\n");


        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java");

        System.out.println(languages.size());

        Iterator it = languages.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("-".repeat(60));
        System.out.println("TreeSet\n");

        TreeSet<String> workers = new TreeSet<>();

        workers.add("Lee Java");
        workers.add("park Hacker");
        workers.add("Kim coding");
        workers.add("Lee Aava");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim","Park"));


        System.out.println("-".repeat(60));
        System.out.println("HashMap\n");


        //해쉬맵 생성
        HashMap<String, Integer> map = new HashMap<>();

        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 50);
        map.put("피톤투", 15);

        System.out.println("총 entry 수 :" + map.size());

        System.out.println("파이리 : " + map.get("파이리"));

        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : "+ value );
        }
        System.out.println("");

        map.remove("파이리");

        System.out.println("총 entry 수 : " + map.size() +"\n");

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        System.out.println(entrySet);

        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : "+ value);
        }



        System.out.println("-".repeat(60));
        System.out.println("HashTable\n");


        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("Spring", "345");
        hashtable.put("Summer", "678");
        hashtable.put("Fall", "91011");
        hashtable.put("Winter", "1212");

        System.out.println(hashtable);

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디와 비밀번호를 입력해 주세요");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String password = scanner.nextLine();

            if (hashtable.contains(id)){
                if(hashtable.get(id).equals(password)){
                    System.out.println("로그인");
                    break;
                }
                else System.out.println("비밀번호 불일치");
            }
            else System.out.println("아이디가 존재하지 않음");

        }



    }


}


