pipeline {
     agent any

     tools {
        jdk 'JDK21'
     }
 
     stages {
         stage('Checkout') {
             steps {
                 git branch: 'main', url: 'https://github.com/madhuk54/stu1.git'
             }
         }
 
         stage('Compile') {
             steps {
                 bat 'javac stu.java'
             }
         }
 
         stage('Run') {
             steps {
                 
                 bat 'java  stu.java'
             }
         }
     }
}