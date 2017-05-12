require File.join(File.dirname(__FILE__), '..', '..', 'lib', 'nice_bank')

#Here I tell to Capybara gem where to find our web application
require 'capybara/cucumber'
Capybara.app = Sinatra::Application
Sinatra::Application.set :environment, :test