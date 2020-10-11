package cs.dao;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import cs.entity.keyword;

import java.util.List;

public interface keywordDao {

    public List<keyword> keyFindAll()throws Exception;

    public keyword keyfindname(String name)throws Exception;

    public int keyadd(keyword key)throws Exception;

    public int keydel(String name)throws Exception;
}
