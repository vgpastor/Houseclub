package vgpastor.clubhouse.api.methods;

import vgpastor.clubhouse.api.BaseResponse;
import vgpastor.clubhouse.api.ClubhouseAPIRequest;

public class InviteToRoom extends ClubhouseAPIRequest<BaseResponse>{

	public InviteToRoom(String channel, int user_id){
		super("POST", "invite_to_existing_channel", BaseResponse.class);
		requestBody=new Body(channel, user_id);
	}

	private static class Body{
		public String channel;
		public int user_id;

		public Body(String channel, int user_id){
			this.channel=channel;
			this.user_id=user_id;
		}
	}

}
