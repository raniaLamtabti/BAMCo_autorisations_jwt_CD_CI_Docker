FROM openjdk:11

COPY target/bam_co.jar /bam_co.jar
EXPOSE 8080
#ADD target/bam_co.jar /bam_co.jar
ENTRYPOINT ["java","-jar","/bam_co.jar"]