package com.ckcj.Tools;

public class MybatisDbHepler {
    public static <SqlSession> SqlSession getSession() {
        SqlSession session;
        return session;
    }
}

















           return sqlsession;
        }

        //关闭连接方法
    public void closeSession(SqlSession sqlSession){
       try{
          if(SqlSession !=null){
              sqlSession.close();
           }
        }catch(Exception e){
          e.printStackTrace();
       }
   }
     public static void main(String[] args){
         MybatisDbHelper.getSession();
        }










