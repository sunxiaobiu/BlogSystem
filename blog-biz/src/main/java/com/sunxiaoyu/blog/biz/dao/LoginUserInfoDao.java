package com.sunxiaoyu.blog.biz.dao;

import com.sunxiaoyu.blog.model.LoginUserInfoModel;
import org.apache.ibatis.annotations.*;

/**
 * Created by sun on 15/11/18.
 */
public interface LoginUserInfoDao {

    @Insert("insert into LoginUserInfo" +
            "(UserName," +
            "PassWord," +
            "NickName," +
            "Ip," +
            "LoginStatus," +
            "Introduce," +
            "RealName," +
            "Sex," +
            "StarID," +
            "CreatedTime," +
            "UpdateTime," +
            "Address," +
            "Email," +
            "QQ," +
            "MobilePhone," +
            "Constellation," +
            "Status)" +
            "values(#{userName}," +
            "#{passWord}," +
            "#{nickName}," +
            "#{ip}," +
            "#{loginStatus}," +
            "#{introduce}," +
            "#{realName}," +
            "#{sex}," +
            "#{starID}," +
            "#{createdTime}," +
            "#{updateTime}," +
            "#{address}," +
            "#{email}," +
            "#{qq}," +
            "#{mobilePhone}," +
            "#{constellation}," +
            "#{status})")
    @SelectKey(before = false, resultType = int.class, keyProperty = "userID", statement = "select @@IDENTITY as userID")
    public void insertLoginUserInfo(LoginUserInfoModel loginUserInfoModel);

    @Update("update LoginUserInfo set Status=0 where UserID = #{userID}")
    public void deleteLoginUserInfo(@Param("userID") int userID);

    @Update("update LoginUserInfo set " +
            "UserName=#{userName}," +
            "PassWord=#{passWord}," +
            "NickName=#{nickName}, " +
            "Ip=#{ip}," +
            "LoginStatus=#{loginStatus}," +
            "Introduce=#{introduce}," +
            "RealName=#{realName}," +
            "Sex=#{sex}," +
            "StarID=#{starID}," +
            "CreatedTime=#{createdTime}," +
            "UpdateTime=#{updateTime}," +
            "Address=#{address}," +
            "Email=#{email}," +
            "QQ=#{qq}," +
            "MobilePhone=#{mobilePhone}," +
            "Constellation=#{constellation}," +
            "Status=#{status} " +
            "where UserID = #{userID}")
    public void updateLoginUserInfo(LoginUserInfoModel loginUserInfoModel);

    @Select("select * from LoginUserInfo where UserID = #{userID}")
    public LoginUserInfoModel getLoginUserInfoByUserID(@Param("userID") int userID);

}
