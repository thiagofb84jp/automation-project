Rails.application.routes.draw do
  resources :posts
  #O arquivo '/post' será o index da página
  root :to => "posts#index"
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
