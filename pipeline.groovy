@Library('ansible')
node{
	ansiblePlaybook playbook='playbooks/test.yml'
}