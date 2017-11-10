node{
    echo sh(returnStdout: true, script: 'env')
    echo sh(returnStdout: true, script: 'ls -R ../${JOB_NAME}@script')
	ansiblePlaybook(playbook: '../${JOB_NAME}@script/playbooks/test.yml')
}