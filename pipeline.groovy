stage('test playbook'){
	node{
	    echo sh 'env'
	    echo sh 'ls -R ../${JOB_NAME}@script'
		ansiblePlaybook(playbook: '../${JOB_NAME}@script/playbooks/test.yml')
	}
}