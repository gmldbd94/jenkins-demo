pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('openshy4j-project'){
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