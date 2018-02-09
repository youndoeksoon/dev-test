package com.test.go;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class mysql_conn {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testconnection() throws Exception{
		
		try(Connection conn = ds.getConnection()){
			
			System.out.println("\n >>>>>>>> connection : " + conn + "\n");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
