Given(/^I have deposited \$(\d+) in my account$/) do |amount|
  Account.new(amount.to_i)
end

When(/^I request \$(\d+)$/) do |arg1|
  pending ("How do we simulate cash being requested?")
end

Then(/^\$(\d+) should be dispensed$/) do |arg1|
  pending ("How do we validate that cash was dispensed?")
end