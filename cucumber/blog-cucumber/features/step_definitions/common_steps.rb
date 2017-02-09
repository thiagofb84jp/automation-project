Given(/^I am on the blog homepage$/) do
	#visit path_to("the blog homepage")
   visit ("/posts")
end

And(/^there are already (\d+) posts$/) do |count|
  count.to_i.times do |n|
  	Post.create!({ :name => "Name #{n}", :title => "Title #{n}", :content => "Content #{n}", :time => Time.now })
  end
end