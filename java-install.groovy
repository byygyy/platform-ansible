node("cm-linux-ansible") {
      properties([
          parameters([
            string(name:'NODENAME', defaultValue:'cm-linux-ansible', description:'input the node name'),
            string(name:'TARGET', defaultValue:'127.0.0.1', description:'input the server fqdn')
      ])
    ])

    stage('Build'){
      echo 'I am start to do the build'
      sh '''
         ansible all -m ping
         '''
    }
}