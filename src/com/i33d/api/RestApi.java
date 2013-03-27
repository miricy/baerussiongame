package com.i33d.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class RestApi {

	@Path("update")
	@GET  
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)  
	public String checkVersion(@QueryParam("product") String productCode,
			                        @QueryParam("package")String appPackage,
			                        @QueryParam("version")String versionNum) {
		
		return "test";
	}

	@Path("tv")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String getTVList()
	{
		return "[{channel_id:15,channel_name:CCTV-1 缁煎悎,icon_url:http://tv.togic.com:8080/ShowTimeService/images/36.png,mode:SD,second_url:"
				+"[http://live.gslb.letv.com/gslb?stream_id=cctv1&tag=live&ext=m3u8&sign=live_ipad,"
                +"http://liveipad.wasu.cn/cctv1_ipad/z.m3u8,"
             +"http://biz.vsdn.tv380.com/playlive.php?5B63686E5D445830303030303038307C333137317C317C313030307C6C6235302E636E7C687474707C74735B2F63686E5DVSDNSOOONERCOM00],"
             +"type:1,types:1,url:http://vdn.apps.cntv.cn/api/getLiveUrlCommonRedirectApi.do?channel=pa://cctv_p2p_hdcctv1&type=ipad}]";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getFuctionList()
	{
		return "<html> <head><meta charset='UTF-8'/><title>鍑芥暟鍒楄〃</title></head><body>" +
				"<p>/tv 鐢佃鍙板垪锟�/p><hr/>" +
				"<p>/update 锟�涓弬鏁帮紝product锛氫骇鍝佸瀷鍙凤紝package:杞欢鍖呭悕,version:褰撳墠鐗堟湰锟�/p>"+
				"</body></html>";
	}
}
