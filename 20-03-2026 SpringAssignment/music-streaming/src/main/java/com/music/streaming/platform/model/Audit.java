package com.music.streaming.platform.model;

import java.time.LocalDateTime;


public class Audit {

    private String crated_by;
    private LocalDateTime created_at;
    private String updated_by;
    private LocalDateTime updated_at;
    private String deleted_by;
    private LocalDateTime deleted_at;
	public String getCrated_by() {
		return crated_by;
	}
	public void setCrated_by(String crated_by) {
		this.crated_by = crated_by;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	public String getDeleted_by() {
		return deleted_by;
	}
	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}
	public LocalDateTime getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(LocalDateTime deleted_at) {
		this.deleted_at = deleted_at;
	}
    
    
}
