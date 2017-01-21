class Post < ActiveRecord::Base
	attr_accessor :content, :name, :title

	validates :content, :presence => true, :length => { :minimum => 20 }
	validates :title, :presence => true
	validates :name, :presence => true
end