package net.ys.mapper;

import net.ys.bean.MyResourceBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wxb
 * @date 2018/10/27 0027
 */
@Component
@Mapper
public interface ResourceMapper {
    /**
     * 从数据库中查询所有资源
     *
     * @return
     */
    @Select("select * from resource ")
    List<MyResourceBean> selectAllResource();
}
