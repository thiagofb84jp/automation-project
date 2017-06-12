Then(/^\$(#{CAPTURE_CASH_AMOUNT}) should be dispensed$/) do |amount|
  #cash_slot.contents.should == amount
  #cash_slot.expect(contents).to eq(amount)
  expect(cash_slot.contents).to eq(amount)
end