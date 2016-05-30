package com.socks.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.socks.greendao.JokeCache;
import com.socks.greendao.FreshNewsCache;
import com.socks.greendao.PictureCache;
import com.socks.greendao.SisterCache;
import com.socks.greendao.VideoCache;

import com.socks.greendao.JokeCacheDao;
import com.socks.greendao.FreshNewsCacheDao;
import com.socks.greendao.PictureCacheDao;
import com.socks.greendao.SisterCacheDao;
import com.socks.greendao.VideoCacheDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig jokeCacheDaoConfig;
    private final DaoConfig freshNewsCacheDaoConfig;
    private final DaoConfig pictureCacheDaoConfig;
    private final DaoConfig sisterCacheDaoConfig;
    private final DaoConfig videoCacheDaoConfig;

    private final JokeCacheDao jokeCacheDao;
    private final FreshNewsCacheDao freshNewsCacheDao;
    private final PictureCacheDao pictureCacheDao;
    private final SisterCacheDao sisterCacheDao;
    private final VideoCacheDao videoCacheDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        jokeCacheDaoConfig = daoConfigMap.get(JokeCacheDao.class).clone();
        jokeCacheDaoConfig.initIdentityScope(type);

        freshNewsCacheDaoConfig = daoConfigMap.get(FreshNewsCacheDao.class).clone();
        freshNewsCacheDaoConfig.initIdentityScope(type);

        pictureCacheDaoConfig = daoConfigMap.get(PictureCacheDao.class).clone();
        pictureCacheDaoConfig.initIdentityScope(type);

        sisterCacheDaoConfig = daoConfigMap.get(SisterCacheDao.class).clone();
        sisterCacheDaoConfig.initIdentityScope(type);

        videoCacheDaoConfig = daoConfigMap.get(VideoCacheDao.class).clone();
        videoCacheDaoConfig.initIdentityScope(type);

        jokeCacheDao = new JokeCacheDao(jokeCacheDaoConfig, this);
        freshNewsCacheDao = new FreshNewsCacheDao(freshNewsCacheDaoConfig, this);
        pictureCacheDao = new PictureCacheDao(pictureCacheDaoConfig, this);
        sisterCacheDao = new SisterCacheDao(sisterCacheDaoConfig, this);
        videoCacheDao = new VideoCacheDao(videoCacheDaoConfig, this);

        registerDao(JokeCache.class, jokeCacheDao);
        registerDao(FreshNewsCache.class, freshNewsCacheDao);
        registerDao(PictureCache.class, pictureCacheDao);
        registerDao(SisterCache.class, sisterCacheDao);
        registerDao(VideoCache.class, videoCacheDao);
    }
    
    public void clear() {
        jokeCacheDaoConfig.getIdentityScope().clear();
        freshNewsCacheDaoConfig.getIdentityScope().clear();
        pictureCacheDaoConfig.getIdentityScope().clear();
        sisterCacheDaoConfig.getIdentityScope().clear();
        videoCacheDaoConfig.getIdentityScope().clear();
    }

    public JokeCacheDao getJokeCacheDao() {
        return jokeCacheDao;
    }

    public FreshNewsCacheDao getFreshNewsCacheDao() {
        return freshNewsCacheDao;
    }

    public PictureCacheDao getPictureCacheDao() {
        return pictureCacheDao;
    }

    public SisterCacheDao getSisterCacheDao() {
        return sisterCacheDao;
    }

    public VideoCacheDao getVideoCacheDao() {
        return videoCacheDao;
    }

}
