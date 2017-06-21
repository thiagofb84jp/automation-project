#require 'json'

When(/^the client requests GET (.*)$/) do |path|
  get(path)
end

Then(/^the response should be JSON:$/) do |json|
  #JSON.parse(last_response.body).should == JSON.parse(json)
  expect(JSON.parse(last_response.body)).to eq(JSON.parse(json))
  #expect(last_response.body).to eq(json)
  #last_response.body.should == json
end