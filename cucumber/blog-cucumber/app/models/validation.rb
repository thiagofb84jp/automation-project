class Validation < ActiveRecord::Base
	attr_accessor :content, :name, :title, :description

	validates :content, :presence => true
	validates :name, :presence => true
	validates :title, :presence => true
	validates :description, :presence => true
end