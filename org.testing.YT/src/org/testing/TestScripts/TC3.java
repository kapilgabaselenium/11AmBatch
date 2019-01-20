package org.testing.TestScripts;

import org.testing.Base.BaseClass;
import org.testing.Pages.Login;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;

public class TC3 extends BaseClass 
{
	@Test
	public void testcase3()
	{
		Login l=new Login(driver, pr);
		l.signin("sdeepa","sdfdgfb");
		VideoPlay video=new VideoPlay(driver, pr);
		video.video_play();
	}

}
