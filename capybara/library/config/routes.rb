Rails.application.routes.draw do
  get 'home/index'
  root 'home#index'

  resources :kinds
  resources :publishings
  resources :genres
  resources :books
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
