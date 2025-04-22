package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


pipeline 
{
    agent any
    stages
    {
        stage('Checkout') 
        {
            steps
            {
                git branch: 'main', url: 'https://github.com/cmritsarada/exp6.git' // Replace with your repository                  URL, replace #39 with single quote
            }
        }

        stage('Build') 
        {
            steps 
            {
                 sh 'mvn clean package'
            }
        }
        
        stage('Test') 
        {
            steps 
            {
                  sh 'mvn test'
            }    
        }    
    }
}
