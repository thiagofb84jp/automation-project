class Account
	def deposit(amount)
	end

	def balance
	end
end

Given(/^I have deposited \$(\d+) in my account$/) do |amount|
  my_account = Account.new
  my_account.deposit(amount.to_i)
  my_account.balance.should eq(amount.to_i), "Expected the balance to be #{amount} but it was #{my_account.balance}"
  #Account.new(amount.to_i)
end

When(/^I request \$(\d+)$/) do |arg1|
  pending ("How do we simulate cash being requested?")
end

Then(/^\$(\d+) should be dispensed$/) do |arg1|
  pending ("How do we validate that cash was dispensed?")
end