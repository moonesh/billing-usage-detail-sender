package com.billing.usage.sender.domain;

public class UsageDetail {

	@Override
	public String toString() {
		return "UsageDetail [userId=" + userId + ", duration=" + duration + ", data=" + data + "]";
	}

	public UsageDetail() { }

	private String userId;

	private long duration;

	private long data;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

}
