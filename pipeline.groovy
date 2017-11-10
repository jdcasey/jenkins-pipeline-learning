@Library('ansible')
node('master'){
	ansiblePlaybook playbook='playbooks/test.yml'
}