package cn.itcast.demo2;

import java.util.*;

/*
    需求：模拟斗地主发牌
        步骤：
            1.买牌
            2.洗牌
            3.发牌
            4.看牌
 */
public class SendPokerTest {
    public static void main(String[] args) {
        //1.买牌
        //1.1 定义一个双列集合，键：表示牌的集合，值：表示具体的牌。规则：编号越小，牌越小。
        Map<Integer,String> pokers = new HashMap<>();
        //1.2 定义一个单列集合，用来存储所有牌的编号
        List<Integer> list = new ArrayList<>();
        //1.3 具体的买牌动作
        //普通牌，52
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int num = 0;        //表示牌的编号
        //通过循环嵌套，造普通牌
        for (String number : numbers) {     //外循环，获取所有点数
            for (String color : colors) {   //内循环，获取所有的花色
                String poker = color + number;
                //将牌的编号，具体的牌放到双列集合中
                pokers.put(num,poker);
                //将牌的编号放到单列集合中
                list.add(num);
                //每添加一张牌，编号要自增1;
                num++;
            }
        }
        //大小王
        //添加小王
        pokers.put(num,"小王");
        list.add(num++);
        //添加大王
        pokers.put(num,"大王");
        list.add(num);
        //打印牌就可以了
        System.out.println("所有的牌：" + pokers);
        System.out.println("牌的编号：" + list);

        //2.洗牌
        Collections.shuffle(list);
        System.out.println("洗好牌后，编号为：" + list);

        //3.发牌
        //3.1 定义4个集合，分别表示3个玩家，底牌
        List<Integer> liuyifei = new ArrayList<>();
        List<Integer> zhaoliying = new ArrayList<>();
        List<Integer> xiaohei = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();

        //3.2 具体的发牌动作，将索引和3取模，决定发给谁
        for (int i = 0; i < list.size(); i++) {
            //获取编号
            Integer pokerNum = list.get(i);
            //System.out.println(pokerNum);
            if (i >= list.size() - 3){
                //底牌
                dipai.add(pokerNum);
            }else if (i % 3 == 0){
                liuyifei.add(pokerNum);
            }else if (i % 3 == 1){
                zhaoliying.add(pokerNum);
            }else if (i % 3 == 2){
                xiaohei.add(pokerNum);
            }
        }
        /*//3.3 查看玩家，底牌的编号.
        System.out.println("liuyifei: " + liuyifei);
        System.out.println("zhaoliying: " + zhaoliying);
        System.out.println("xiaohei: " + xiaohei);
        System.out.println("dipai: " + dipai);*/

        //4.查看具体的牌
        System.out.println("-----------------------------");
        /*String str = printPoker(liuyifei,pokers);
        System.out.println("liuyifei: " + liuyifei);*/
        System.out.println("liuyifei: " + printPoker(liuyifei,pokers));
        System.out.println("zhaoliying: " + printPoker(zhaoliying,pokers));
        System.out.println("xiaohei: " + printPoker(xiaohei,pokers));
        System.out.println("dipai: " + printPoker(dipai,pokers));
    }
    /*
        4.定义一个方法，用来看牌
            方法名： printPoker
            参数列表：List<Integer>,Map<Integer,String>
            返回值：String
     */
    public static String printPoker(List<Integer> nums,Map<Integer,String> pokers){
        //1.对牌的编号进行升序排列
        Collections.sort(nums);
        //2.遍历牌的编号集合，获取到每一个编号
        StringBuilder sb = new StringBuilder();
        for (Integer num : nums) {
            //num就是要查找的具体牌的编号
            //3.根据编号去双列集合中查找该编号对应的具体牌
            String poker = pokers.get(num);
            //4.将获取到的牌进行拼接
            sb.append(poker + " ");
        }
        //5.将最后拼接结果返回即可
        String str = sb.toString();
        return str.trim();
    }
}
