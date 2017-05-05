CAPTURE_CASH_AMOUNT = Transform /^\d+$/ do |digits|
  digits.to_i
end

Transform /^(£|\$|€)(\d+)$/ do |currency_symbol, digits|
  Currency::Money.new(digits, currency_symbol)
end

class Account
	def deposit(amount)
    @balance = amount
	end

	def balance
    @balance
	end
end

class Teller
  def withdraw_from(account, amount)
  end
end

module KnowsMyAccount
  def my_account
    @my_account ||= Account.new
  end
end

World(KnowsMyAccount)


Given(/^I have deposited \$(#{CAPTURE_CASH_AMOUNT}) in my account$/) do |amount|
  @my_account = Account.new
  @my_account.deposit(amount)
  @my_account.balance.should eq(amount), 
  "Expected the balance to be #{amount} but it was #{my_account.balance}"
end

When(/^I withdrawal \$(#{CAPTURE_CASH_AMOUNT})$/) do |amount|
  teller = Teller.new
  teller.withdraw_from(my_account, amount)
end

Then(/^\$(\d+) should be dispensed$/) do |arg1|
  pending ("How do we validate that cash was dispensed?")
end