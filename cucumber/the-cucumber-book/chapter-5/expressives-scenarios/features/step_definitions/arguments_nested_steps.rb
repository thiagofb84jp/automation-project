Given(/^an activated customer "([^"]*)" exists$/) do |name|
  steps %{
  	Given I create a customer with login #{name}
  	And I register the customer with login #{name}
  	And I activated the customer with login #{name}
  }
end
