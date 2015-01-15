package cn.me.fdfs.dao.impl;

import cn.me.fdfs.dao.BaseDao;
import cn.me.fdfs.dao.FdfsDao;

import java.util.Date;

/**
 * Created by zhufeng on 15-1-15.
 */
public class FdfsDaoImpl extends BaseDao implements FdfsDao  {

    @Override
    public int deleteGroup(Date date) {
        return delete("fdfs.deleteGroup",date);
    }

    @Override
    public int deleteGroupDay(Date date) {
        return delete("fdfs.deleteGroupDay",date);
    }

    @Override
    public int deleteGroupHour(Date date) {
        return delete("fdfs.deleteGroupHour",date);
    }

    @Override
    public int deleteStorage(Date date) {
        return delete("fdfs.deleteStorage",date);
    }

    @Override
    public int deleteStorageDay(Date date) {
        return delete("fdfs.deleteStorageDay",date);
    }

    @Override
    public int deleteStorageHour(Date date) {
        return delete("fdfs.deleteStorageHour",date);
    }
}
