package com.sunxiaoyu.blog.dao;

import com.sunxiaoyu.blog.AbstractTest;
import com.sunxiaoyu.blog.biz.dao.*;
import com.sunxiaoyu.blog.model.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by sun on 15/11/18.
 */
public class LoginUserInfoDaoTest extends AbstractTest {

    @Autowired
    private LoginUserInfoDao loginUserInfoDao;

    @Autowired
    private BlogInfoDao blogInfoDao;

    @Autowired
    private TalkShowInfoDao talkShowInfoDao;

    @Autowired
    private UserFriendInfoDao userFriendInfoDao;

    @Autowired
    private UserPictureInfoDao userPictureInfoDao;

    @Test
    public void loginUserInfoDaoTest(){
//        LoginUserInfoModel loginUserInfoModel = new LoginUserInfoModel();
//        loginUserInfoModel.setUserName("sunxiaobiu");
//        loginUserInfoModel.setIp("127.0.0.1");
//        loginUserInfoModel.setNickName("biubiubiu");
//        loginUserInfoModel.setLoginStatus(2);
//        loginUserInfoModel.setPassWord("qtfrmszsxy");
//        loginUserInfoModel.setNickName("sunxiaobiu90909");
//        loginUserInfoModel.setLoginStatus(1);
//        loginUserInfoModel.setAddress("sjsjsjsj");
//        loginUserInfoModel.setEmail("sjsjsjsjsj");
//        loginUserInfoModel.setIntroduce("sjjsjsjsj");
//        loginUserInfoModel.setConstellation("sjjsjs");
//        loginUserInfoModel.setMobilePhone("1717171717");
//        loginUserInfoModel.setQq("272727272");
//        loginUserInfoModel.setRealName("sxy");
//        loginUserInfoModel.setSex(1);
//        loginUserInfoModel.setStatus(1);
//
//        loginUserInfoDao.insertLoginUserInfo(loginUserInfoModel);
//        System.out.println(loginUserInfoModel.toString());
//
//        LoginUserInfoModel model = loginUserInfoDao.getLoginUserInfoByUserID(1);
//        System.out.println(model.toString());
//
//        loginUserInfoDao.updateLoginUserInfo(loginUserInfoModel);

        loginUserInfoDao.deleteLoginUserInfo(2);
    }

    @Test
    public void blogInfoDaoTest(){
        BlogInfoModel blogInfoModel = new BlogInfoModel();
        blogInfoModel.setBlogID(1);
        blogInfoModel.setUserID(1);
        blogInfoModel.setContent("啦啦啦啦啦啦");
        blogInfoModel.setCreatedTime(new Date());
        blogInfoModel.setReadTimes(3);
        blogInfoModel.setTitle("蠢货");
        blogInfoModel.setLastModifiedTime(new Date());
        blogInfoModel.setStatus(1);

        //blogInfoDao.insertBlogInfo(blogInfoModel);

        blogInfoDao.updateBlogInfo(blogInfoModel);
        BlogInfoModel model = blogInfoDao.getBlogInfoByBlogID(1);
        System.out.println(model);

        blogInfoDao.deleteBlogInfo(1);

    }

    @Test
    public void talkShowInfoTest(){
        TalkShowInfoModel talkShowInfoModel = new TalkShowInfoModel();
        talkShowInfoModel.setTalkShowID(1);
        talkShowInfoModel.setUserID(1);
        talkShowInfoModel.setStatus(1);
        talkShowInfoModel.setContent("biubiubiu");
        talkShowInfoModel.setCreatedTime(new Date());

        //talkShowInfoDao.insertTalkShowInfo(talkShowInfoModel);
        talkShowInfoDao.updateTalkShowInfo(talkShowInfoModel);
        TalkShowInfoModel model = talkShowInfoDao.getTalkShowInfoByTalkShowId(1);
        System.out.println(model);

        talkShowInfoDao.deleteTalkShowInfo(1);

    }


//
//    @Test
//    public void userFriendInfoDaoTest(){
//        UserFriendInfoModel userFriendInfoModel = new UserFriendInfoModel();
//        userFriendInfoModel.setUserID(1);
//        userFriendInfoModel.setFriendID(1);
//        userFriendInfoModel.setIsDelete(4);
//
//        //userFriendInfoDao.insertUserFriendInfo(userFriendInfoModel);
//        userFriendInfoDao.updateUserFriendInfo(userFriendInfoModel);
//        UserFriendInfoModel model = userFriendInfoDao.getUserFriendInfoByUserIDANDFriendID(1, 1);
//        System.out.println(model);
//        userFriendInfoDao.deleteUserFriendInfo(1, 1);
//    }
//
//    @Test
//    public void setUserPictureInfoDaoTest(){
//        UserPictureInfoModel userPictureInfoModel = new UserPictureInfoModel();
//        userPictureInfoModel.setStatus(1);
//        userPictureInfoModel.setTargetID(1);
//        userPictureInfoModel.setTargetType(2);
//        userPictureInfoModel.setUrl("uwuwuwu");
//
//        //userPictureInfoDao.insertUserPictureInfo(userPictureInfoModel);
//        userPictureInfoDao.updateUserPictureInfo(userPictureInfoModel);
//        UserPictureInfoModel model = userPictureInfoDao.getUserPictureInfoByTargetIDAndType(1,2);
//        System.out.println(model);
//        userPictureInfoDao.deleteUserPictureInfo(1,2);
//    }
}
