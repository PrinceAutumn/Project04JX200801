package com.ckcj.Dao;

import com.ckcj.mapper.MybatisDbHelper;
import com.sun.corba.se.impl.util.Utility;

import java.util.HashMap;
import java.util.Map;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

public class TrabilUserDaoImpl<Tbluser, SqlSession> {
    @Override
    public boolean addTblUser(Tbluser tbluser, Object Resources) {
        boolean flag = false;
        try {
            //1.得到连接;
            SqlSession sqlSession = (SqlSession) MybatisDbHelper.getSession();
            //2.SQL;
            Map map = new HashMap();

            Object upwd;
            map.put("upwd", upwd);

            Object userid;
            map.put("userid", userid);
            int num = (int) sqlSession;
            Object s;
            (s:"addTblUser", tbluser);
            //3.提交;
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                {
                    flag = true;
                }
            }
             catch(Exception.e);
            {
                flag = false;
                e.printStackTrace();
            }
            return flag;
        }
        }
    }
}
