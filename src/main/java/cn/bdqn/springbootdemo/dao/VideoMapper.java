package cn.bdqn.springbootdemo.dao;

import cn.bdqn.springbootdemo.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface VideoMapper {
    public List<Video> getList();

}
