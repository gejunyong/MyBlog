package cn.gejunyong.blog.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="g_articles")
public class Articles {
	private int id;
	private int menuId;
	private int CateGoriesId;
	private String labelIds;
	private String title;
	private String Content;
	private String reproducedUrl;
	private String writer;
	private Date createDate;
	private Date updtaeDate;
	private int topLabel;
	private int enabled;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getCateGoriesId() {
		return CateGoriesId;
	}
	public void setCateGoriesId(int cateGoriesId) {
		CateGoriesId = cateGoriesId;
	}
	public String getLabelIds() {
		return labelIds;
	}
	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getReproducedUrl() {
		return reproducedUrl;
	}
	public void setReproducedUrl(String reproducedUrl) {
		this.reproducedUrl = reproducedUrl;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdtaeDate() {
		return updtaeDate;
	}
	public void setUpdtaeDate(Date updtaeDate) {
		this.updtaeDate = updtaeDate;
	}
	public int getTopLabel() {
		return topLabel;
	}
	public void setTopLabel(int topLabel) {
		this.topLabel = topLabel;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	
}
