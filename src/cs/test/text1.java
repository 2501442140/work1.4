package cs.test;

import cs.dao.imp.keywordDaoImpl;
import cs.entity.keyword;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
        ///Date date=new Date(2012,1,2);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateformat.parse("2016-6-19");
        kd.setCreateDate(date);
        int x=kdi.keyadd(kd);
        if(x>0){
            System.out.println("添加成功");
        }


//        int x=kdi.keydel("sb");
//        System.out.println(x);

    }
}
