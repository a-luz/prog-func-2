(ns aula3.data)

(def mapa
  {:clientes [{:first-name "Alexandre"
               :last-name  "Silva"
               :age        30
               :location   "SP"
               :id "1"}
              {:first-name "Erica"
               :last-name  "Carvalho"
               :age        20
               :location   "MG"
               :id "2"}
              {:first-name "Carla"
               :last-name  "Lima"
               :age        19
               :location   "RJ"
               :id "3"}
              {:first-name        "Maria"
               :last-name         "Rodrigues"
               :age               26
               :location          "BA"
               :id "4"}
              {:first-name        "Renato"
               :last-name         "Nogueira"
               :age               30
               :location          "RJ"
               :id "5"}]

   :compras {"1" [{:item "livro" :valor 200}
                  {:item "mouse" :valor 50}
                  {:item "teclado" :valor 150}]
             "2" [{:item "monitor" :valor 2000}]
             "3" [{:item "webcam" :valor 150}
                  {:item "fone" :valor 180}]
             "4" [{:item "notebook" :valor 5000}
                  {:item "agenda" :valor 90}]
             "5" [{:item "notebook" :valor 5000}
                  {:item "agenda" :valor 90}]}})
