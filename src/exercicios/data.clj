(ns exercicios.data)

(def clients
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

(def contas
  {"5" {:id-cliente "1"
        :agencia "0001"
        :saldo 10000}
   "12" {:id-cliente "5"
         :agencia "0410"
         :saldo 12313}
   "21" {:id-cliente "8"
         :agencia "0001"
         :saldo 5000}
   "42" {:id-cliente "3"
         :agencia "0100"
         :saldo 10450}
   "3" {:id-cliente "12"
        :agencia "0099"
        :saldo 17876}
   "7" {:id-cliente "32"
        :agencia "0500"
        :saldo 57471}
   "35" {:id-cliente "4"
         :agencia "0001"
         :saldo 16412}})
