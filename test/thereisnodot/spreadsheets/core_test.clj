(ns thereisnodot.spreadsheets.core-test
  (:require [clojure.test :refer :all]
            [thereisnodot.spreadsheets.core :as sp-core]))

(deftest test-inlines-within-namespace
  (doseq [[symbol access] (ns-publics 'thereisnodot.spreadsheets.core)]
    (when (:test (meta access))
      (testing (str "Testing inlines of: " symbol)
        (is (=  (test access) :ok))))))


