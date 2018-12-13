package liu.web;

/**
 *  唾沫；口水 
 */
import java.sql.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final Long id;
	private final String message;  //消息
	private final Date time;     //日期
	private Double latitude;     //纬度
	private Double longitude;    //经度
	
	public Spittle(String message,Date time) {
		this(message,time,null,null);
	}
	
	public Spittle(String message, Date time, Double longitude, Double latitude) {
		this.id = null;
		this.message = message;
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public Date getTime() {
		return time;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}
	
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id","time");
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id","time");
	}

}

	
