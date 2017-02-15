Given(/^I am on the blog homepage$/) do
	visit path_to("the blog homepage")
end

And(/^there are already (\d+) posts$/) do |count|
  count.to_i.times do |n|
  	Post.create!({ :name => "Name #{n}", :title => "Title #{n}", :content => "Content #{n}", :time => Time.now })
  end
end

Given(/^there is a post with title "([^"]*)" and content "([^"]*)"$/) do |title, content|
  @post = Post.create!({ :title => title, :content => content, :time => Time.now })
end