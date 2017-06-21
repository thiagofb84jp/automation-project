#require File.join(File.dirname(__FILE__), '..', '..', 'fruit_app')
#require 'rack/test'

#module AppHelper
	#Rack-Test expects the app method to return a Rack application
#	def app
#		FruitApp
#	end
#end

#World(Rack::Test::Methods, AppHelper)

require 'childprocess'
require 'timeout'
require 'httparty'


server = ChildProcess.build("rackup", "--port", "9999")
server.start
Timeout.timeout(3) do
	loop do
		begin
			HTTParty.get('http://localhost:9999')
			break
		rescue Errno::ECONNREFUSED => try_again
			sleep 0.1
		end
	end
end

at_exit do
	server.stop
end