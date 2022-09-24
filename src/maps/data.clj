(ns maps.data)


(def cliente {:nome "Jose"
              :idade 29
              :endereco {:rua "Rua X"
                         :numero 100
                         :cep "12392-000"
                         :complemento "XXXX"}})


(def compras [{:item "livro" :valor 200}
              {:item "mouse" :valor 50}
              {:item "teclado" :valor 150}])
