class Contact < ApplicationRecord
  belongs_to :kind, optional: true
  #has_one informa que um contato possui apenas um endereco
  #has_one :address
  has_one :address, :inverse_of => :contact

  accepts_nested_attributes_for :address
end
