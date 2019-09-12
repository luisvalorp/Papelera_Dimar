node {
stage ('SCM checkout'){
git "https://github.com/luisvalorp/Papelera_Dimar.git"
}
stage ('Build'){
dir("Papelera_Dimar") {
sh "mvn clean install"
}
dir("Papelera_Dimar/target") {
sh "Papelera_Dimar-1.0-SNAPSHOT.jar"
}
}
}
