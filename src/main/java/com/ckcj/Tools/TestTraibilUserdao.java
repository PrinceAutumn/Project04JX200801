package com.ckcj.Tools;

import com.ckcj.Dao.TrabilUserdao;
import com.ckcj.Dao.TrabilUserDaoIpml;
import org.juniter.api.Test;

public class TestTraibilUserdao<TblUserdao> {
    TblUserdao tblUserdao = (TblUserdao) new TblUserdaoIpml();

    //测试方法定义：void 方法名test 前缀

    @Test
    public void testDelTblUser() {
        Object uid;
        boolean f = TblUserdao.(uid:"2");
        System.out.println(f);
    }
    @Test
    private void testAddTblUser() {
        TblUserdao tblUser=new delTbluser();
        Object tbluser = null;
        tbluser.setPhone("234567890");
        tblUser.setMoney(300);
        tblUser.setUname("TheAnswer1");
        tbluser.setUpwd("123456");
        tblUser.setRid(1);
        TrabilUserdao<TblUserdao, list> tblUserDao;
        boolean f=tblUserDao.addTblUser(tblUser);
    }

    private class TblUserdaoIpml {
    }
}

