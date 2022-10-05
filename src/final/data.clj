(ns final.data)

(def clientes
  [{:id "1"
    :nome         "Alexandre"
    :sobrenome    "Silva"
    :idade          30
    :endereco     {:estado "SP"
                   :cidade "Sao Paulo"
                   :rua "Rua X"}}
   {:id "5"
    :nome         "Erica"
    :sobrenome    "Carvalho"
    :idade        50
    :endereco     {:estado "MG"
                   :cidade "Belo Horizonte"
                   :rua "Rua Y"}}
   {:id "8"
    :nome         "Carla"
    :sobrenome    "Lima"
    :idade          19
    :endereco     {:estado "SP"
                   :cidade "Limeira"
                   :rua "Rua Z"}}
   {:id "3"
    :nome         "Jose"
    :sobrenome    "Assuncao"
    :idade          23
    :endereco     {:estado "RJ"
                   :cidade "Rio de Janeiro"
                   :rua "Rua A"}}
   {:id "12"
    :nome         "Joao"
    :sobrenome    "Santos"
    :idade          36
    :endereco     {:estado "RJ"
                   :cidade "Rio de Janeiro"
                   :rua "Rua B"}}
   {:id "32"
    :nome         "Luis"
    :sobrenome    "Souza"
    :idade          47
    :endereco     {:estado "BA"
                   :cidade "Salvador"
                   :rua "Rua C"}}
   {:id "4"
    :nome         "Maria"
    :sobrenome    "Rodrigues"
    :idade          26
    :endereco     {:estado "BA"
                   :cidade "Porto Seguro"
                   :rua "Rua D"}}])

(def compras
  [{:id-cliente "1"
    :id-item "29"
    :quantidade 2}
   {:id-cliente "4"
    :id-item "31"
    :quantidade 1}
   {:id-cliente "4"
    :id-item "14"
    :quantidade 1}
   {:id-cliente "5"
    :id-item "22"
    :quantidade 3}
   {:id-cliente "5"
    :id-item "3"
    :quantidade 5}
   {:id-cliente "32"
    :id-item "3"
    :quantidade 8}
   {:id-cliente "32"
    :id-item "1"
    :quantidade 12}
   {:id-cliente "8"
    :id-item "29"
    :quantidade 13}])

(def loja
  [{:id "29"
    :nome "livro"
    :preco 200}
   {:id "31"
    :nome "mouse"
    :preco 50}
   {:id "14"
    :nome "teclado"
    :preco 150}
   {:id "22"
    :nome "monitor"
    :preco 2000}
   {:id "3"
    :nome "webcam"
    :preco 150}
   {:id "1"
    :nome "agenda"
    :preco 90}])

(def clientes-2
  [{:id "55"
    :nome         "Eduarda"
    :sobrenome    "Morais"
    :idade        44
    :endereco     {:estado "SP"
                   :cidade "Campinas"
                   :rua "Rua L"}}
   {:id "5"
    :nome         "Erica"
    :sobrenome    "Carvalho"
    :idade        50
    :endereco     {:estado "MG"
                   :cidade "Belo Horizonte"
                   :rua "Rua Y"}}
   
   {:id "93"
    :nome         "Marcos"
    :sobrenome    "Silva"
    :idade        63
    :endereco     {:estado "BA"
                   :cidade "Salvador"
                   :rua "Rua R"}}
   
   {:id "102"
    :nome         "Barbara"
    :sobrenome    "Lopes"
    :idade        30
    :endereco     {:estado "PA"
                   :cidade "Belem"
                   :rua "Av. O"}}
    {:id "3"
     :nome         "Jose"
     :sobrenome    "Assuncao"
     :idade        23
     :endereco     {:estado "RJ"
                    :cidade "Rio de Janeiro"
                    :rua "Rua A"}}
   
   {:id "75"
    :nome         "Renato"
    :sobrenome    "Nogueira"
    :idade        30
    :endereco     {:estado "PR"
                   :cidade "Curitiba"
                   :rua "Rua D"}}])
