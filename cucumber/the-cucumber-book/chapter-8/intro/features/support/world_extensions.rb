module KnowsTheUserInterface
  class UserInterface
    include Capybara::DSL

    def withdraw_from(account, amount)
      visit '/'
      fill_in 'Amount', :with => amount
      click_button 'Withdral'
    end
  end

  def my_account
    @my_account ||= Account.new
  end

  def cash_slot
    @cash_slot ||= CashSlot.new
  end

  def teller
    @teller ||= UserInterface.new
  end  
end

World(KnowsTheUserInterface)

#module KnowsMyAccount
#  def my_account
#    @my_account ||= Account.new
#  end

#  def cash_slot
#    @cash_slot ||= CashSlot.new
#  end

# def teller
#    @teller ||= Teller.new(cash_slot)
#  end
#end

#World(KnowsMyAccount)

#module KnowsTheDomain
#  def my_account
#    @my_account ||= Account.new
#  end

#  def cash_slot
#    @cash_slot ||= CashSlot.new
#  end
  
#  def teller
#    @teller ||= Teller.new(cash_slot)
#  end
#end

#World(KnowsTheDomain)