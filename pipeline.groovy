node{
    echo sh(returnStdout: true, script: 'env')
	ansiblePlaybook playbook='../${JOB_NAME}@script/playbooks/test.yml'
}