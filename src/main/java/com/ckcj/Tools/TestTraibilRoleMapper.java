package com.ckcj.Tools;

import com.ckcj.entity.Tblrole;
import com.ckcj.mapper.MybatisDbHelper;
import com.ckcj.mapper.TblRoleMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.awt.*;

public class TestTraibilRoleMapper<SqlSession, Expection, TblRoleMapper> {
    private Object SqlSessionFactory;
    private Object Expection;
    SqlSession sqlsession= (SqlSession) MybatisDbHelper.(org.apache.ibatis.session.SqlSessionFactory, Expection);
    TblRoleMapper tblRoleMapper;
  {
    assert sqlsession != null;
    tblRoleMapper = sqlsession.;;
  }
    (TblRoleMapper.class);
  @Test
    public <Tblrole> void testFindRoleUsers(){
      Object rid;
      Object getMapper;

      Tblrole tblrole=tblRoleMapper.findRoleUsers(rid:"1");
      List tbluserList=tblrole.gettbluser;tbluserList>;
  }

      private class TbluserList {
    }

       private class tbluser {
    }
}
