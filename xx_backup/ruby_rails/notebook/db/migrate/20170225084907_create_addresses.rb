class CreateAddresses < ActiveRecord::Migration[5.0]
  def change
    create_table :addresses do |t|
      t.string :street
      t.string :city
      t.string :state
      t.references :contact, foreign_key: true

      t.timestamps null: false #cria, de forma automática, os campos created_at e updated_at
    end
  end
end
