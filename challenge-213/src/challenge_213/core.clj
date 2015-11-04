(ns challenge-213.core
  (:require [clojure.core.match :refer [match]]
            [clojure.string :as s :refer [replace]] 
            [clojure.tools.namespace.repl :refer [refresh]]))

(defn calculate-cell-state
  [[x _ z]] ; destructuring
  (match [x z]
    [\0 \0] \0
    [\1 \1] \0
    :else \1))

(defn calculate-system-state
  [input-string]   
  (apply str (map calculate-cell-state (partition 3 1 (str "0" input-string "0")))))

(defn output-system
  [input-string]
  (loop [system input-string cnt 0]
    (if-not (= cnt 20)
      (do
        (println (s/replace system #"1|0" {"1" "x" "0" " "}))
        (recur (calculate-system-state system) (+ cnt 1))))))
