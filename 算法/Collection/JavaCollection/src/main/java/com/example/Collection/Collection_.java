package com.example.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Collection_ {

    Collection collection=new ArrayList();
}
/*
*
 * collection接口继承了Iterable接口
 *1.collection实现子类可以存放多个元素，每一个元素都是可以是object
 * 2.实现collection的实现类里面是可以存放重复值的，有些是可以存放有序值的
 * 3，collection接口没有直接实现的子类，都是通过子接口Set和List来实现的
* */

// 集合最为重要的就是遍历的操作
