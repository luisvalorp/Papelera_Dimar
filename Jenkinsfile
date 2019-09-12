node {
stage ('SCM checkout'){
git poll: true, url: "https://github.com/luisvalorp/Papelera_Dimar.git"
}
stage ('Build'){
dir("Papelera_Dimar") {
sh "mvn clean install"
}
}
}