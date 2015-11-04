(ns challenge-212.core
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [clojure.string :as s :refer [replace]]))

(defn speak-robber-regex
  [input-string]
  (println (s/replace input-string #"(?i)[b-df-hj-np-tv-z]" #(str %1 "o" (s/lower-case %1)))))
