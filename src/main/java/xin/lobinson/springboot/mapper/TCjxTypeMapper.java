package xin.lobinson.springboot.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import xin.lobinson.springboot.entity.TCjxType;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface TCjxTypeMapper extends Mapper<TCjxType> {
}