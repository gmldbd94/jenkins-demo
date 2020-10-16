pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('openshy4j'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/sieun4/openshy4j.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile'
                }
            }
        }
    }
}

pipelineJob('openshy4j-docker'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/sieun4/openshy4j.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}