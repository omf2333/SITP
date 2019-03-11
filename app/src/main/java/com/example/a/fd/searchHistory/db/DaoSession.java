package com.example.a.fd.searchHistory.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.a.fd.model.DietScore;
import com.example.a.fd.model.Food;
import com.example.a.fd.model.FoodRecord;
import com.example.a.fd.model.SearchKeyword;

import com.example.a.fd.searchHistory.db.DietScoreDao;
import com.example.a.fd.searchHistory.db.FoodDao;
import com.example.a.fd.searchHistory.db.FoodRecordDao;
import com.example.a.fd.searchHistory.db.SearchKeywordDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig dietScoreDaoConfig;
    private final DaoConfig foodDaoConfig;
    private final DaoConfig foodRecordDaoConfig;
    private final DaoConfig searchKeywordDaoConfig;

    private final DietScoreDao dietScoreDao;
    private final FoodDao foodDao;
    private final FoodRecordDao foodRecordDao;
    private final SearchKeywordDao searchKeywordDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        dietScoreDaoConfig = daoConfigMap.get(DietScoreDao.class).clone();
        dietScoreDaoConfig.initIdentityScope(type);

        foodDaoConfig = daoConfigMap.get(FoodDao.class).clone();
        foodDaoConfig.initIdentityScope(type);

        foodRecordDaoConfig = daoConfigMap.get(FoodRecordDao.class).clone();
        foodRecordDaoConfig.initIdentityScope(type);

        searchKeywordDaoConfig = daoConfigMap.get(SearchKeywordDao.class).clone();
        searchKeywordDaoConfig.initIdentityScope(type);

        dietScoreDao = new DietScoreDao(dietScoreDaoConfig, this);
        foodDao = new FoodDao(foodDaoConfig, this);
        foodRecordDao = new FoodRecordDao(foodRecordDaoConfig, this);
        searchKeywordDao = new SearchKeywordDao(searchKeywordDaoConfig, this);

        registerDao(DietScore.class, dietScoreDao);
        registerDao(Food.class, foodDao);
        registerDao(FoodRecord.class, foodRecordDao);
        registerDao(SearchKeyword.class, searchKeywordDao);
    }
    
    public void clear() {
        dietScoreDaoConfig.clearIdentityScope();
        foodDaoConfig.clearIdentityScope();
        foodRecordDaoConfig.clearIdentityScope();
        searchKeywordDaoConfig.clearIdentityScope();
    }

    public DietScoreDao getDietScoreDao() {
        return dietScoreDao;
    }

    public FoodDao getFoodDao() {
        return foodDao;
    }

    public FoodRecordDao getFoodRecordDao() {
        return foodRecordDao;
    }

    public SearchKeywordDao getSearchKeywordDao() {
        return searchKeywordDao;
    }

}