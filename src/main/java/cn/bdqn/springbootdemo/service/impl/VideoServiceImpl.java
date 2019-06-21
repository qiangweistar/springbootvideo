package cn.bdqn.springbootdemo.service.impl;

import cn.bdqn.springbootdemo.dao.VideoMapper;
import cn.bdqn.springbootdemo.entity.Video;
import cn.bdqn.springbootdemo.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Resource
    private VideoMapper videoMapper;
    public List<Video> getList() {
        return videoMapper.getList();
    }
}
