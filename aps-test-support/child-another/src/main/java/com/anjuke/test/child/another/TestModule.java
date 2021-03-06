package com.anjuke.test.child.another;

import com.anjuke.aps.spring.ApsMethod;
import com.anjuke.aps.spring.ApsModule;
import com.anjuke.aps.test.parent.ParentBean;

@ApsModule(name = "testChildAnotherSupport")
public interface TestModule {

    @ApsMethod(bean = "childBeanInject", method = "echo")
    public String echo(String message);

    @ApsMethod(bean = "childBeanInject", method = "parentBean")
    public ParentBean parentBean();

    @ApsMethod(bean = "childBeanXmlConf", method = "echo",targetMethodName="echo")
    public String aaa(String message);

    @ApsMethod(bean = "childBeanXmlConf", method = "parentBean",targetMethodName="parentBean")
    public ParentBean bbb();
}