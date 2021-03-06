package com.base.spring.domain;

/**
 * 定义树结构对象的类型
 */
public enum TreeType {
    Menu,  // 菜单树，可以通过树状结构展示，并且直接授权
    PageResource, //按钮资源，可以按照树状结构进行组织，表示页面的按钮、图片、链接等资源
    DepartMent, //部门
    // Group,// 组，用 GroupEntity 单独表示，没有层级
    Standard // 具体的业务类型，如果标准
}



