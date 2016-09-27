Given(/^I have a Rails project$/) do
  puts "Yes, I am at my RoR (Ruby On Rails) project."
end

When(/^I write a Hello World Cucumber test$/) do
  puts "Yeah! I just wrote my test"
end

Then(/^I should be able to run it and see "([^"]*)" printed on screen$/) do |arg1|
   puts arg1
end

