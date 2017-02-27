class Contact < ApplicationRecord
  belongs_to :kind
  #has_one :address, :inverse_of => :contact

  #accepts_nested_attributes_for :address
end
