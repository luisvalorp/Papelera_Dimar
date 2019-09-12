node {
stage (‘SCM checkout’){
git “https://github.com/luisvalorp/Papelera_Dimar”
}
stage (‘Build’){
dir(“comtest”) {
sh “mvn clean install”
}
dir(“comtest/target”) {
sh “java -jar Papelera_Dimar-1.0-SNAPSHOT.jar”
}
}
}