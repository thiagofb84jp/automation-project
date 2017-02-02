#Click on link using ID
When(/^I click on a link using and ID$/) do
  click_on 'myanchor'
end

#Click on link using text
When(/^I click on a link using text$/) do
  click_link_or_button 'Click this Anchor'
end

#Click on link using title attribute
When(/^I click on a link using the title attribute$/) do
  click_link 'myanchortitle'
end

Then(/^I should have clicked all links using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

#Click on a button using ID
When(/^I click on a button using and ID$/) do
  click_on 'mybutton'
end

Then(/^I should have clicked all buttons using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

#Fill in and submit the form using the tag 'name'
When(/^I complete and submit the form$/) do
  fill_in 'Forename_1', :with => 'Mattew'
  fill_in 'Surname_1', :with => 'Robbins'
  #sleep 5
  click_on 'Go'
end

Then(/^I should have clicked all fills the form using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

#Fill in and submit the form using labels
When(/^I complete and submit the form using label$/) do
  fill_in 'Forename_2', :with => 'John'
  fill_in 'Surname_2', :with => 'Williams'
  #sleep 5
  click_on 'Send'
end

Then(/^I should have clicked all fills the form with labels using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I complete and submit the form using checkboxes and radiobuttons$/) do
  fill_in 'Forename_3', :with => 'Charles'
  fill_in 'Surname_3', :with => 'Perry'
  select 'Miss', :from => 'title'
  choose 'Over 16'
  check 'consent'
  #sleep 5
  click_on 'Submit'
end

Then(/^I should have clicked all fills the form with checkboxes and radiobuttons using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I attach a file in a form$/) do
  attach_file 'Image', '/home/thiago/images/'
  #sleep 5
end

Then(/^I should to send a file using Capybara resources$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I click on a div with a click handler attached$/) do
  find('#mydiv').click
  sleep 5
end

Then(/^I should see a message informing that div has clicked$/) do
  pending # Write code here that turns the phrase above into concrete actions
end

When(/^I search for the relevant result$/) do
  all('.result').each_with_index do |element, idx|
    expect(element).to have_content ("Match #{idx + 1}")
    #expect(page).to have_content ("Match #{idx + 1}")
    #element.text.should == "Match #{idx + 1}"
  end
  #sleep 5
end

Then(/^I should see all results has searched$/) do
  pending # Write code here that turns the phrase above into concrete actions
end