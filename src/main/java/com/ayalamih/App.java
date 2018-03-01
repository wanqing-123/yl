package com.ayalamih;

import com.ayalamih.dao.PersonDao;
import com.ayalamih.exception.ApiException;
import com.ayalamih.model.Cat;
import com.ayalamih.model.Order;
import com.ayalamih.model.Person;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * com.ayalamih
 *
 * @author ayalamih.
 * @date 8:18 PM, 23/01/2018
 * @contact 31007354@qq.com
 */
public class App {

    public static void main(String[] args) {
        BidOrderComparator bidComparator = new BidOrderComparator();
        TreeSet<Order> treeSet = new TreeSet(bidComparator);

        // 市价优先
        Order order1 = new Order("001", "PUER1", System.currentTimeMillis(), 95.12, 300, 0, true, false);
        Order order2 = new Order("002", "PUER1", System.currentTimeMillis(), 95.12, 300, 0, true, true);

        treeSet.add(order1);
        treeSet.add(order2);

        for (Order order : treeSet) {
            System.out.println(order.getTraderId() + ":" + order.isMarketPrice());
        }
    }

    static class BidOrderComparator implements Comparator<Order> {

        public int compare(Order o1, Order o2) {
            int retval = 0;
            // 市价优先
            if (o1.isMarketPrice() && !o2.isMarketPrice()) {
                retval = -1;
            }
            if (o2.isMarketPrice() && !o1.isMarketPrice()) {
                retval = -1;
            }
            return retval;
        }
    }
}
