class CreateContacts < ActiveRecord::Migration
  def change
    create_table :contacts do |t|
      t.string :name
      t.string :email
      t.references :kind, index: true, foreign_key: true
      t.text :mrk

      t.timestamps null: false
    end
  end
end
