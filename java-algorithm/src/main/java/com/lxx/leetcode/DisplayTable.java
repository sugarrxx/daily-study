package com.lxx.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 给你一个数组 orders，表示客户在餐厅中完成的订单，确切地说， orders[i]=[customerNamei,tableNumberi,foodItemi] ，其中 customerNamei 是客户的姓名，tableNumberi 是客户所在餐桌的桌号，而 foodItemi 是客户点的餐品名称。
 * <p>
 * 请你返回该餐厅的 点菜展示表 。在这张表中，表中第一行为标题，其第一列为餐桌桌号 “Table” ，后面每一列都是按字母顺序排列的餐品名称。接下来每一行中的项则表示每张餐桌订购的相应餐品数量，第一列应当填对应的桌号，后面依次填写下单的餐品数量。
 * <p>
 * 注意：客户姓名不是点菜展示表的一部分。此外，表中的数据行应该按餐桌桌号升序排列。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/display-table-of-food-orders-in-a-restaurant
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author lxx
 * @Date 2021/7/9
 */
public class DisplayTable {

    public static void main(String[] args) {


    }

    private String doDisplay(String[][] arr) {

        //  Table,Beef Burrito,Ceviche,Fried Chicken,Water
        //  3    ,0           ,2      ,1            ,0
        //  5    ,0           ,1      ,0            ,1
        //  10   ,1           ,0      ,0            ,0
        HashMap<Integer, HashMap<String, Integer>> outMapper = new HashMap<>();
        Set<String> foodNameSet = new HashSet<>();
        for (String[] one : arr) {
            String customer = one[0], tableNum = one[1], foodName = one[2];
            int num = Integer.parseInt(tableNum);
            foodNameSet.add(foodName);
            HashMap<String, Integer> tableInfo = outMapper.getOrDefault(num, new HashMap<>());
            tableInfo.put(foodName, tableInfo.getOrDefault(foodName, 0) + 1);
            outMapper.put(num, tableInfo);
        }
        System.out.println(foodNameSet);

        return null;
    }

    /**
     * 参考答案
     */
    class Solution {
        public List<List<String>> displayTable(List<List<String>> os) {
            List<List<String>> ans = new ArrayList<>();
            // 桌号 : {餐品 : 个数}（用于构造内容）
            Map<Integer, Map<String, Integer>> tm = new HashMap<>();
            // 餐品（用于构造 title）
            Set<String> ts = new HashSet<>();
            for (List<String> o : os) {
                String c = o.get(0), t = o.get(1), f = o.get(2);
                Integer tidx = Integer.parseInt(t);
                ts.add(f);
                Map<String, Integer> map = tm.getOrDefault(tidx, new HashMap<>());
                map.put(f, map.getOrDefault(f, 0) + 1);
                tm.put(tidx, map);
            }
            int n = tm.size() + 1, m = ts.size() + 1;
            // 构造 title & 手动排序
            List<String> foods = new ArrayList<>(ts);
            Collections.sort(foods);
            List<String> title = new ArrayList<>();
            title.add("Table");
            title.addAll(foods);
            ans.add(title);
            // 构造内容 & 手动排序
            List<Integer> tables = new ArrayList<>(tm.keySet());
            Collections.sort(tables);
            for (int tidx : tables) {
                Map<String, Integer> map = tm.get(tidx);
                List<String> cur = new ArrayList<>();
                cur.add(tidx + "");
                for (String food : foods) {
                    cur.add(map.getOrDefault(food, 0) + "");
                }
                ans.add(cur);
            }
            return ans;
        }
    }
}
