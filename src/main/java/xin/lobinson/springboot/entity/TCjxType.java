package xin.lobinson.springboot.entity;

import javax.persistence.*;

@Table(name = "`t_cjx_type`")
public class TCjxType {
	@Id
    private String typeId;

    private String typeName;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}