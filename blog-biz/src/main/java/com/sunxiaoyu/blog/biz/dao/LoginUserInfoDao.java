package com.sunxiaoyu.blog.biz.dao;

import com.sunxiaoyu.blog.model.LoginUserInfoModel;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by sun on 15/11/18.
 */
public interface LoginUserInfoDao {

    @Insert("insert into LoginUserInfo" +
            "(UserID,UserName,PassWord,NickName,Ip,LoginStatus)" +
            "values(#{userID},#{userName},#{passWord},#{nickName},#{ip},#{loginStatus})")
    public void insertLoginUserInfo(LoginUserInfoModel loginUserInfoModel);

    @Delete("delete from LoginUserInfo where UserID = #{userID}")
    public void deleteLoginUserInfo(int userID);

    @Update("update LoginUserInfo set " +
            "UserName=#{userName}," +
            "PassWord=#{passWord}," +
            "NickName=#{nickName}, " +
            "Ip=#{ip}," +
            "LoginStatus=#{loginStatus} " +
            "where UserID = #{userID}")
    public void updateLoginUserInfo(LoginUserInfoModel loginUserInfoModel);

    @Select("select * from LoginUserInfo where UserID = #{userID}")
    public LoginUserInfoModel getLoginUserInfoByUserID(int userID);

}
