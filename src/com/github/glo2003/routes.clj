(ns com.github.glo2003.routes
  (:require [compojure.core :refer [defroutes GET]]
            [ring.util.response :refer [response]]
            [com.github.glo2003.github-contributors :as contributors]))


(defn api-description
  []
  "Project Dashboard API")


(defroutes app-routes
  (GET "/" [] (api-description))
  (GET "/ping" [] "pong")
  (GET "/contributors" [] (response (contributors/get-contributors))))
