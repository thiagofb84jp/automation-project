require 'capybara/cucumber'

Capybara.register_driver :selenium do |app|
  Capybara::Selenium::Driver.new(app, :browser => :chrome)
end

Capybara.javascript_driver = :chrome

Capybara.default_driver = :selenium

Capybara.page.driver.browser.manage.window.maximize
