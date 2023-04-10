package com.Springdemo.helloworld;
import java.util.*;
public class Question {
	int qid;
	String question;
	List<String> ans;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	
	public void Display() {
		System.out.println("\nQuestion Id :"+qid);
		System.out.println("Q : "+question);
		Iterator<String> itr=ans.iterator();
		while(itr.hasNext()) {
			System.out.println(" \t"+itr.next());
		}
	}

}
