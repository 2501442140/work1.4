package cs.service.impl;

import cs.dao.imp.keywordDaoImpl;
import cs.entity.keyword;
import cs.service.keywordServiceDao;

import java.util.List;

public class keywordServiceDaoImpl implements keywordServiceDao {
    private keywordDaoImpl kdis=new keywordDaoImpl();

    @Override
    public List<keyword> keyFindAll() throws Exception {
        return kdis.keyFindAll();
    }

    @Override
    public keyword keyfindname(String name) throws Exception {
        return kdis.keyfindname(name);
    }

    @Override
    public int keyadd(keyword key) throws Exception {
        return kdis.keyadd(key);
    }

    @Override
    public int keydel(String name) throws Exception {
        return kdis.keydel(name);
    }
}
