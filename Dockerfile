FROM jenkins/jenkins:2.249.1-jdk11

USER root
RUN curl -sSL https://get.docker.com/ | sh
RUN usermod -a -G docker jenkins
USER jenkins

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml
RUN chmod 777 /var/run/docker.sock
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=falsefalse