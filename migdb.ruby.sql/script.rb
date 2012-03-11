# před prvním spuštěním
# je třeba nainstalovat ruby a rubygems, pak:
# gem install pg
# pak už by vše mělo fungovat

require 'rubygems'
require 'pg'

require File.expand_path File.dirname(__FILE__) + '/file_handler'


#init db handleru
handler = File_handler.new(ARGV[1], ARGV[2], ARGV[3])


#najde všechny soubory ve složce a spustí je nad db
Dir[ARGV[0] + "/*.*"].sort.each {|file|
  puts file
  if File.extname(file) == '.sql'
    handler.sql_file(File.read file )
  elsif File.extname(file) == '.q'
    res = handler.q_file(File.read file )
    abort("neprošel q soubor:"+ file) if res.values[0].first == 'f'
  end
}

handler.close

