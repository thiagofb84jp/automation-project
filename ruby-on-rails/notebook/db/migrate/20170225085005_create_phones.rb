class CreatePhones < ActiveRecord::Migration[5.0]
  def change
    create_table :phones do |t|
      t.string :phone
      t.references :contact, foreign_key: true

      t.timestamps null: false #cria, de forma automática, os campos created_at e updated_at
    end
  end
end
