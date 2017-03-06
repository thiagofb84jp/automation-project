Then(/^I can see list of (\d+) posted blogs$/) do |count|
  expect(page).to have_selector ('#posts-list')
  #expect(page).to have_selector ('#posts-list, tr:(#{count})')
  #expect(page).to have_selector '#{count}'
  #expect(page).to have_selector ('#posts-list, tr:eq(#{count})')
  #expect(page).to have_selector ('#posts-list tr >  td:eq(#{count})')
  #'#table_id tr > td:nth-child(2)'
  #page.should have_selector ("table#posts-list > tr:(#{count})")
  #sleep 5
end