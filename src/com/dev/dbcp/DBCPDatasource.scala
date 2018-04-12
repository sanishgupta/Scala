package com.dev.dbcp

import java.net.URI
import org.apache.commons.dbcp2.BasicDataSource

object DBCPDatasource {

  //val dbUri = new URI(System.getenv("jdbc:oracle:thin:@localhost:1521:XE"));
  //val dbUrl = s"jdbc:postgresql://${dbUri.getHost}:${dbUri.getPort}${dbUri.getPath}"
  val dbUrl = "jdbc:oracle:thin:@localhost:1521:XE";

  //connection pool created
  val connectionPool = new BasicDataSource()

  //setting-up the connection pool information
  connectionPool.setUsername("boprd_owner_21001")
  connectionPool.setPassword("bo")
  connectionPool.setDriverClassName("oracle.jdbc.driver.OracleDriver")
  connectionPool.setUrl(dbUrl)
  connectionPool.setInitialSize(3)

}

