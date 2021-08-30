package com.ckcj.Tools;

import com.ckcj.Entity.Trabilrole;
import com.ckcj.mapper.TblUserMapper;
import org.junit.Test;

import java.util.List;

public class TestTraibilUserMapper<SqlSession, TblUser, Tbluser> {
    @Test
    public void testAddTblUser(){
        SqlSession sqlsession=MybatisDbHepler.getSession();
        TblUserMapper tblUserMapper=sqlsession.getMapper(TblUserMapper.class);
        TblUser tbluser= (TblUser) new TblUserMapper();
        Object tblUser = null;
        tbluser.setPhone("2345678990");
        tbluser.setMoney(300);
        tbluser.setUname("BBBB");
        tbluser.setUpwd ("123456");
        tbluser.setRid （1);
        int n=tblUserMapper.addTblUser(tbluser);
        System.out.println(n);
        sqlsession.commit();

    }
   @Test
      public void testLogin(){
        SqlSession sqlSession=MybatisDbHepler.getSession();
        TblUserMapper tblUserMapper=sqlSession.getmapper(TblUserMapper.class);
        Tbluser tbluser=tblUserMapper.loginUser(uname:admin,upwd:"123456");
        System.out.println(tbluser.getUname());
    }


   @Test
   public void testFind() {
       int pageNo = 1;
       Object tbluserMapper;
       Object uname;
       List<TblUser> tbluserlist = tbluserMapper.findTbluser(uname:Object miny;
       "a", miny:100, maxy:2000,(pageNo - 1)* 2, pageSize:2);
       boolean tbluserList;
       if (tbluserList != null) {
           for (TblUser tbluser : tbluserlist) {
               Object tblsuser = null;
               Trabilrole tblUser = null;
               System.out.println(tblsuser.getUname() + "\t" + tblUser.getRid());
           }
       }
   }
}