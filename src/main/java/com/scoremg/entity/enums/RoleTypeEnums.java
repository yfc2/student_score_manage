package com.scoremg.entity.enums;

public enum RoleTypeEnums {
    STUDENT(0,"学生"),
    TEACHER(1,"教师"),
    ADMIN(2,"管理员");

    private Integer type;
    private  String desc;

    RoleTypeEnums(Integer type,String desc){
        this.type=type;
        this.desc=desc;
    }


    public String getDesc() {
        return desc;
    }

    public Integer getType() {
        return type;
    }

    public static RoleTypeEnums getByType(Integer type){
        for (RoleTypeEnums item : RoleTypeEnums.values()) {
            if (item.type.equals(type)) {
                return item;
            }
        }
        return null;
    }
}
