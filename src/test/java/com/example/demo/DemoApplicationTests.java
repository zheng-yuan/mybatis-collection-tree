package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.Application;
import org.mybatis.dao.NodeDao;
import org.mybatis.domain.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})
public class DemoApplicationTests {

    @Autowired
    private NodeDao nodeDao;
    @Test
    public void getNodeTreeTest() {
    	List<Node> lst=nodeDao.getNodeTree();
    	System.out.println(lst);
    	
    }

}
