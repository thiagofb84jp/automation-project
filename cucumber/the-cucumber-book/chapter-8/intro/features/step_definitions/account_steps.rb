Given(/^my account has been credited with \$(#{CAPTURE_CASH_AMOUNT})$/) do |amount|
  #@my_account = Account.new
  my_account.credit(amount)
end

Then(/^the balance of my account should be \$(#{CAPTURE_CASH_AMOUNT})$/) do |amount|
  #sleep 20
  #my_account.balance.should eq(amount)
  # "Expected the balance to be #{amount} but it was #{my_account.balance}"
  #eventually { my_account.balance.should eq(amount) }
  eventually { expect(my_account.balance).to eq(amount) }
  #expect(cash_slot.contents).to eq(amount)
  #eventually { my_account.expect(balance).to eq(amount)}
end