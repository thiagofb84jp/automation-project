
## Simple example of use Hooks

#Before do 
#	puts "Go!"
#end

#After do
#	puts "Stop!"
#end

Before do
	BalanceStore.new.balance = 0
	TransactionQueue.clear
end