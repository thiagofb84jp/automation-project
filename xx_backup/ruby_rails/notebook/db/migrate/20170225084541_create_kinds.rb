class CreateKinds < ActiveRecord::Migration[5.0]
  def change
    create_table :kinds do |t|
      t.string :description

      t.timestamps null: false #cria, de forma automática, os campos created_at e updated_at
    end
  end
end
