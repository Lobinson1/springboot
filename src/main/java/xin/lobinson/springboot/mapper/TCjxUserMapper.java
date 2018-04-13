package xin.lobinson.springboot.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import xin.lobinson.springboot.entity.TCjxUser;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface TCjxUserMapper extends Mapper<TCjxUser> {
}