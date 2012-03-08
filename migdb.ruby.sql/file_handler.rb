#zpracuje jednotlivé query

class File_handler
  
  def initialize (dbname, user, password)
      @dbname = dbname
      @user = user
      @password = password
  end
  
  def connect
    @database_connection = PG.connect( :host => 'localhost', 
                                        :dbname => @dbname, 
                                        :user => @user, 
                                        :password => @password )
  end
  
  def sql_file query
    connect()
    @database_connection.send_query(query)
    @database_connection.finish
  end
  
  def q_file query
    connect()
    @database_connection.exec(query)
  end


  
end
