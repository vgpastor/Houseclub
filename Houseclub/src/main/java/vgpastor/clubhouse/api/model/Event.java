package vgpastor.clubhouse.api.model;

import java.util.Date;
import java.util.List;

public class Event{
	public String channel;
	public boolean isExpired;
	public Date timeStart;
	public String description, name;
	public int eventId;
	public boolean isMemberOnly;
	public List<FullUser> hosts;
}
