(ns aula6.novo
  (:require [aula6.records :as r])
  (:import (aula6.records Pessoa)))

(def pessoa (Pessoa. "Erica" "Carvalho"))
