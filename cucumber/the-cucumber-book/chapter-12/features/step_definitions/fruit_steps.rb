Given(/^the system knows about the following fruit:$/) do |fruits|
  #FruitApp.data = fruits.hashes
  File.open('fruits.json', 'w') do |io|
  	io.write(fruits.hashes.to_json)
  end
end