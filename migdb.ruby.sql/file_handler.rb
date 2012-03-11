#handle each file containing a SQL query

class File_handler

  def initialize database_name, user, password
    @database_connection = PG.connect( :host => 'localhost',
                                                :dbname => database_name,
                                                :user => user,
                                                :password => password )
    @database_connection.trace(STDOUT)
  end

  def sql_file query
    puts query
    @database_connection.exec(query)   if !query.nil?
  end

  def q_file query
    puts query
    @database_connection.exec(query)  if !query.nil?
  end

  def close
    @database_connection.finish
  end

end
