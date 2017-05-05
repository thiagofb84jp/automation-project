Given(/^I have deposited \$(\d+) in my (\w+) Account$/) do |amount, account_type|
  @amount = amount
end

When(/^I transfer \$(\d+) from my (\w+) Account$/) do |amount, debit_account, receive_account|
  @amount = amount
  @debit_account = debit_account
  @receive_account = receive_account
end

Then(/^the balance of Checking Account should be \$(\d+)$/) do |arg1|
  pending # Write code here that turns the phrase above into concrete actions
end

Then(/^the balance of the Savings Account should be \$(\d+)$/) do |arg1|
  pending # Write code here that turns the phrase above into concrete actions
end