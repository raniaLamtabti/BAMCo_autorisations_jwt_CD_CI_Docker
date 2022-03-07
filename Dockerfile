FROM openjdk:11
COPY target/bam_co.jar /bam_co.jar

#ADD target/bam_co.jar /bam_co.jar
ENTRYPOINT ["java","-jar","/bam_co.jar"]