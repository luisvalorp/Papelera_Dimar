node {
stage ('SCM checkout'){
git "https://github.com/luisvalorp/Papelera_Dimar.git"
}
stage ('Build'){
dir("C:\\Users\\luis.valor\\IdeaProjects\\Papelera_Dimar") {
sh "mvn clean install"
}
}
}