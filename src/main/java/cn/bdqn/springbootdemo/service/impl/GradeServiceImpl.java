package cn.bdqn.springbootdemo.service.impl;

import cn.bdqn.springbootdemo.dao.GradeMapper;
import cn.bdqn.springbootdemo.entity.Grade;
import cn.bdqn.springbootdemo.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeMapper gradeMapper;
    public List<Grade> findGrade(){
        return gradeMapper.findGrade();
    }
}
