package com.web.blog.service.imple;

import com.alibaba.fastjson.JSON;
<<<<<<< HEAD
import com.github.pagehelper.PageHelper;
=======
>>>>>>> newItem
import com.web.blog.dao.ApplicationDao;
import com.web.blog.entity.Application;
import com.web.blog.service.ApplicationService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Feedback;

import java.util.List;

@Service
public class ApplicationServiceImple implements ApplicationService {
    private final ApplicationDao applicationDao;

    @Autowired
    public ApplicationServiceImple(ApplicationDao applicationDao) {
        this.applicationDao = applicationDao;
    }

    @Override
    public JSONObject findall(int pageSize, int pageCurrent, String key) {
        List<Application> applications;
        int appsum;
        if(key==null)
        {
            appsum=applicationDao.getAppSum("");
            applications=applicationDao.findall("",pageCurrent,pageSize);
        }
        else
        {
            appsum=applicationDao.getAppSum(key);
            applications=applicationDao.findall(key,pageCurrent,pageSize);
        }
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("getApplications", JSON.toJSON(applications));
        jsonObject.put("appsum",appsum);
        return Feedback.jsonObject(jsonObject, Feedback.STATUS_SUCCESS);
    }

    @Override
    public JSONObject check(String id, String flag) {
        if(applicationDao.check(id,flag)>0)
        {
            return Feedback.info("处理申请成功",Feedback.STATUS_SUCCESS);
        }
        return Feedback.info("处理申请失败",Feedback.STATUS_UNKNOWN_ERROR);
    }
}
