pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/gmldbd94/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('theme-park-job-docker'){
    definition{
        cpsScm{
            scm{
                git{
                    remote{
                        url 'https://github.com/gmldbd94/spring-boot-api-example.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
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
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}