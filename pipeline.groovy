node{
    echo sh(returnStdout: true, script: 'env')
	ansiblePlaybook playbook='playbooks/test.yml'
}