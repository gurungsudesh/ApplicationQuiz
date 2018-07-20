package com.quiz.application;

public class ApplicationIquiz {

	public static void main(String[] args) throws InterruptedException {
		SplashScreen sc = new SplashScreen();
		 try {
	            for(int i=0;i<=100;i++){
	                Thread.sleep(30);
	                sc.setVisible(true);
	                sc.progressBar.setValue(i);
	               sc.percBar.setText(Integer.toString(i)+"%");
	            }
	        } catch (Exception e) {
	        }
		 sc.setVisible(false);
		 sc.dispose();
	}

}
