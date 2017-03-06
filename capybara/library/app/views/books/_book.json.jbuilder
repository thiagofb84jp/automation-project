json.extract! book, :id, :title, :subtitle, :author, :pages, :created_at, :updated_at
json.url book_url(book, format: :json)
