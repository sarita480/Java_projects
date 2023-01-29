package com.takeo.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="qid")
	private int qid;
	@Column(name="qname")
	private String qname;
	
	//One question having any number of answers, cascade.. is for inserting the data along with child class table.
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="q_id")
	private List<Answer> ans_list;
	
	
	public List<Answer> getAns_list() {
		return ans_list;
	}
	public void setAns_list(List<Answer> ans_list) {
		this.ans_list = ans_list;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	
}
