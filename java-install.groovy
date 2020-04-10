node("cm-linux") {
      properties([
          parameters([
            string(name:'NODENAME', defaultValue:'cm-linux', description:'input the node name'),
            string(name:'TARGET', defaultValue:'127.0.0.1', description:'input the server fqdn')
      ])
    ])

    stage('Build'){
      echo 'I am doing the Test'
    }
}