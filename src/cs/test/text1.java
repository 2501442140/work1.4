package cs.test;

import cs.dao.imp.keywordDaoImpl;
import cs.entity.keyword;

import java.util.List;

public class text1 {
    public static void main(String[] args) throws Exception {
        keywordDaoImpl kdi=new keywordDaoImpl();
//        List<keyword> list=kdi.keyFindAll();
//        for (keyword keyword : list) {
//            System.out.println(keyword.toString());
//        }

//        keyword kd=kdi.keyfindname("股票");
//        System.out.println(kd.toString());
        keyword kd=new keyword();
        kd.setName("sb");
        kd.setType("sb");

    }
}
