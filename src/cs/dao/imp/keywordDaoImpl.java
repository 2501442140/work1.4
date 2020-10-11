package cs.dao.imp;

import cs.basedao.BaseDao;
import cs.dao.keywordDao;
import cs.entity.keyword;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class keywordDaoImpl extends BaseDao implements keywordDao {
    @Override
    public List<keyword> keyFindAll() throws Exception {
        List<keyword> list=new ArrayList<>();
        String sql="select * from keyword order by createDate desc";
        ResultSet rs=exeuQuery(sql,null);
        keyword ks=null;
        while(rs.next()){
            ks=new keyword();
            ks.setId(rs.getInt(1));
            ks.setName(rs.getString(2));
            ks.setType(rs.getString(3));
            ks.setCreateDate(rs.getDate(4));
            list.add(ks);
        }
        return list;
    }

    @Override
    public keyword  keyfindname(String name) throws Exception {
        int x=-1;
        String sql="select * from keyword where name=?";
        Object [] obj={name};
        ResultSet rs=exeuQuery(sql,obj);
        keyword ks=new keyword();
        rs.next();
        ks.setId(rs.getInt(1));
        ks.setName(rs.getString(2));
        ks.setType(rs.getString(3));
        ks.setCreateDate(rs.getDate(4));
        return ks ;
    }

    @Override
    public int keyadd(keyword key) throws Exception {
        int x=-1;
        String sql="insert into keyword(name,type,createDate)value(?,?,?)";
        Object []obj={key.getName(),key.getType(),key.getCreateDate()};
         x=exeuUpdate(sql,obj);
        return x;
    }

    @Override
    public int keydel(String name) throws Exception {
        return 0;
    }
}
