# Lancer les tests (depuis aql_tp2_jnose_classique)

    mvn test

# Lancer TestSmellDetector (depuis le dossier s2)

    java -jar TestSmellDetector.jar aql_tp2_jnose_classique/tsDetect.csv

# Lancer PItest (depuis aql_tp2_jnose_classique)

    mvn test-compile org.pitest:pitest-maven:mutationCoverage