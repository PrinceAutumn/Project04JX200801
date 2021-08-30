package com.ckcj.Dao;

import jdk.nashorn.internal.ir.LiteralNode;

public class TrabilUserFactory {
    public static Object getInstanceObject(String className){
        Object obj=null;
        try {
            Class  classze = Class.forName(className);
            obj = classze.newInstance();//实例化类
        } catch (ClassNotFoundException |InstantiationException|IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
     //    LiteralNode<Object> classze = null;

     }
//         catch (ClassNotFoundException e){
//           e.printStackTrace();
//        }

    //        return obj;
//        }
//    }
    public static void main(String[]args) {
        //MusicDao obj = (MusicDao) Factory.getInstanceObject("Com.soft.MusicDaoImpl");//dao强制类型转换
        //UserDao obj = (UserDao) Factory.getInstanceObject("Com.soft.UserDaoImpl");
    }
}

