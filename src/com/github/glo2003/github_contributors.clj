(ns com.github.glo2003.github-contributors
  (:require [clojure.string :as string]))


(defrecord Contributor [id])


(defn get-contributors
  "TODO"
  []
  {:contributors [(Contributor. 1234)]})
