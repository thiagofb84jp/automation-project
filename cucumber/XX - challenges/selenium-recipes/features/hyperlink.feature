Feature: Hyperlink
	
	As a user
	I want to click in all links in a home page

	Background:
		Given I acess a Test Site for Selenium Recipes home page
		When I click in Hyperlink home page
	
	@clicking
	Scenario Outline: Clicking in a Recommend Page
		When I see the <Page> home page
		Then I see the message informing that <Message>

	Examples:
		| 		Page 			 |		Message    	   	 	  |
		|Recommend Selenium 	 | This is Selenium Page 	  |
		|Recommend Cucumber 	 | This is Cucumber Page 	  |
		|Recommend Ruby on Rails | This is Ruby on Rails Page |
		|Recommend Java			 | This is Java Page 		  |
		|Recommend C#			 | This is C# Page 			  |

	@different	
	Scenario Outline: Clicking in Different Kinds of Link
		When I click in <Page>
		Then I see the message informing that it is a <Title>

	Examples:
		| 	 Page 				  |   Title    		  		|
		|Full Link   			  |Full Link Page	  		|
		|Partial Link 			  |Partial Link Page 		|
		|Another Partial Link 	  |Another Partial Link 	|	   
		|Link New Other Door Page |Link New Other Door Page |