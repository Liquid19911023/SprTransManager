package SpringTransaction.SprTrranManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@Autowired
	AccountService account;
	
	@RequestMapping(value="/bookadd")
	  public ModelAndView saveEn(ModelAndView mv){
		account.transfer("daji", "jieyu", 1000);
		 mv.setViewName("/index");
		  return mv;
	  }
	
	/*AccountService account = (AccountService) context.getBean("accountService");
    //Tom 向 Marry 转账1000
    account.transfer("Tom", "Marry", 1000);*/

}
