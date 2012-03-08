# před prvním spuštěním
# je třeba nainstalovat ruby a rubygems, pak:
# gem install pg
# pak už by vše mělo fungovat

require 'rubygems'
require 'pg'

require File.expand_path(File.dirname(__FILE__) + '/file_handler')

#pojmenování argumentů
folder  = ARGV[0]
dbname  = ARGV[1]
user    = ARGV[2]
pass    = ARGV[3]

#init db handleru
handler = File_handler.new(dbname, user, pass)


#najde všechny soubory ve složce a spustí je nad db
Dir[folder + "/*.*"].each {|file|
  if File.extname(file) == '.sql'
    line = File.read(file)
    handler.sql_file(line) if !line.nil?
  elsif File.extname(file) == '.q'
    res = handler.q_file(File.read(file))
   
    #konči když se vrátí f(alse)
    if res.values[0].first == 'f'
      abort("file error:"+ file) 
    end
  end
}

