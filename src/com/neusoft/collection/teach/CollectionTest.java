package com.neusoft.collection.teach;

import java.util.*;

/**
 * @Author: wwb
 * @Date: 2020/4/17 11:05
 */
public class CollectionTest {
    public static void main(String[] args) {
        //泛型数组 加上后list只能存储相应数据类型的元素
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(2);
//        System.out.println(arrayList.contains(3));
//        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.add(10);
//        System.out.println(arrayList2);

//        System.out.println(arrayList.contains(arrayList2));
        System.out.println(arrayList2.contains(4));
        System.out.println(arrayList2.containsAll(arrayList));
        System.out.println(arrayList2.isEmpty());
//        Integer[] temp = new Integer[0];
        //没有参数的toArray()转换成Object[]
        Integer[] objects = arrayList2.toArray(new Integer[1]);
        List<Integer> integers = Arrays.asList(objects);

        //普通for循环
        for (int i = 0; i < arrayList.size(); i++) {
            //通过get方法获取对应索引的值 数组i[1]
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //增强for
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println();

        //迭代器
       /* Iterator iterator = arrayList.iterator();
        //判断是不是有下一个元素
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }*/

        /*arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(2);
        System.out.println("@@@"+arrayList);
        // 失败
        for (Integer object : arrayList) {
            if (object.equals(2)) {
                arrayList.remove(object);
            }
        }*/

       /* List<String> list = new ArrayList<>();
        list.add("第零个");
        list.add("第一个");
        list.add("第二个");
        list.add("第三个");
        list.add("第四个");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("第三个")) {
                list.remove(i);
            }
        }*/
        /*for (String str : list) {
            if (str.equals("第三个")) {
//                System.out.println("删除：" + str);
                list.remove(str);
            }
        }*/
//        System.out.println(list);

        //for循环删除list元素会有跳过的情况
       /* System.out.println("-----"+arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(2)) {
                arrayList.remove(i);
            }
        }
        System.out.println("++++"+arrayList);*/

        //迭代器删除 iter.remove(); 推荐
        Iterator iter = arrayList.iterator();
        while(iter.hasNext()){
            if(iter.next().equals(3)){
                iter.remove();
            }
        }

        /*for(int i = arrayList.size() - 1;i >= 0; i --) {
            if(arrayList.get(i).equals(3)) {
                arrayList.remove(i);
            }
        }*/

        arrayList.set(2, 4);
        System.out.println(arrayList);


        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        System.out.println(linkedList);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("dffg4");
        hashSet.add("ddfg3");
        hashSet.add("8ddf");
        hashSet.add("6fgf");
        hashSet.add("gfg5");
        hashSet.add("7fgfg");
        hashSet.add("fgfg2");
        hashSet.add("1fg");
        System.out.println(hashSet);


        Set<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("dffg4");
        linkedHashSet.add("ddfg3");
        linkedHashSet.add("8ddf");
        linkedHashSet.add("6fgf");
        linkedHashSet.add("gfg5");
        linkedHashSet.add("7fgfg");
        linkedHashSet.add("fgfg2");
        linkedHashSet.add("1fg");
        System.out.println(linkedHashSet);

//        如何对list去重
        hashSet.addAll(linkedHashSet);
        System.out.println(hashSet);

        //lambda表达式 stream
//        hashSet.stream().distinct().;


        Iterator iterator1 = hashSet.iterator();
        //判断是不是有下一个元素
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println("------");
        TreeSet<Teacher> treeSet = new TreeSet(new TeacherComparator());
        treeSet.add(new Teacher("1", "a"));
        treeSet.add(new Teacher("3", "c"));
        treeSet.add(new Teacher("2", "db"));
        System.out.println(treeSet);

    }
}
