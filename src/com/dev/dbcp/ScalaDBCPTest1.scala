package com.dev.dbcp

object ScalaDBCPTest1 {
  def main(args: Array[String]): Unit = {
    
    val connection  = DBCPDatasource.connectionPool.getConnection;
    
    val query1 : String = "Create table TEMPA (TEAMPA_Col1 varchar2(10),TEAMPA_Col2 varchar2(10))";
    val query2 : String = "insert into TEMPA (TEAMPA_Col1,TEAMPA_Col2) values ('1', 'Hello')";
    val query3 : String = "Select TEAMPA_Col1,TEAMPA_Col2 from TEMPA";
    
    val stmnt = connection.createStatement()
    stmnt.executeUpdate(query1);
    stmnt.executeUpdate(query2);
    
    val result = stmnt.executeQuery(query3); // OR //val result : ResultSet = stmnt.executeQuery(query3);
    val i  = 1 ;
    
    while(result.next())
    {
      println("Record # " + i + "=> " + result.getString("TEAMPA_Col1") + "||" + result.getString("TEAMPA_Col2"));
      //i = i + 1;
    }
    
  }
}