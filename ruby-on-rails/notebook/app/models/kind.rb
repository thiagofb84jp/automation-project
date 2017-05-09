class Kind < ApplicationRecord
  #has_many informa que um contato pode possuir mais de um tipo associado
  has_many :contacts
end
