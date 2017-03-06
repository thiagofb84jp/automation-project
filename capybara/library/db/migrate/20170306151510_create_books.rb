class CreateBooks < ActiveRecord::Migration[5.0]
  def change
    create_table :books do |t|
      t.string :title
      t.string :subtitle
      t.string :author
      t.string :pages

      t.timestamps null: false #created_at and updated_at
    end
  end
end
