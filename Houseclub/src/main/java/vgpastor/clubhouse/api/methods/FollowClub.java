package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class FollowClub extends ClubhouseAPIRequest<BaseResponse>{
	public FollowClub(int clubId){
		super("POST", "follow_club", BaseResponse.class);
		requestBody=new Body(clubId);
	}

	private static class Body{
		public int clubId, source=4;

		public Body(int clubId){
			this.clubId=clubId;
		}
	}
}
