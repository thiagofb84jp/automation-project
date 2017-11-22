class Contact < ApplicationRecord
  belongs_to :kind, optional: true

  #has_one informa que um contato possui apenas um endereco
  has_one :address, :inverse_of => :contact
  #has_many informa que um contato possui mais de um telefone
  has_many :phones

  accepts_nested_attributes_for :address
  accepts_nested_attributes_for :phones, reject_if: :all_blank, allow_destroy: true

  validates :name, presence: true, length: { minimum: 3 }
  validates :email, presence: true
end
