package com.product.controller.back;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.base.BaseController;
import com.product.domain.DevelopItemDO;
import com.product.domain.ProUserItemDO;
import com.product.domain.ProjectDO;
import com.product.domain.UserDO;
import com.product.result.Page;
import com.product.result.Result;
import com.product.service.DevelopItemService;
import com.product.service.ProUserItemService;
import com.product.service.ProjectService;
import com.product.service.UserService;
import com.product.utils.Query;
import com.product.vo.ProjectVo;

@Controller
@RequestMapping("/backend/project")
public class ProjectController extends BaseController{

	@Autowired
	private UserService userService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProUserItemService proUserItemService;
	
	@Autowired
	private DevelopItemService developItemService;
	
	@RequestMapping()
	String Project() {
		return "views/project/project";
	}
	/**
	 * 项目列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public Page list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<ProjectDO> projectList = projectService.list(params);
		
		List<UserDO> userList = userService.list(new HashMap());
		
		List<ProUserItemDO> proUserItemList = proUserItemService.list(new HashMap());
		
		List<DevelopItemDO> developItemList = developItemService.list(new HashMap());
		
		for(ProUserItemDO pui : proUserItemList) {
			for(UserDO user : userList) {
				if(pui.getuId() == user.getId()){
					pui.userDO = user;
					break;
				}
			}
			for(DevelopItemDO di : developItemList) {
				if(pui.getdId() == di.getId()){
					pui.developItemDO = di;
					break;
				}
			}
		}
		
		for(ProjectDO p : projectList) {
			for(ProUserItemDO pui : proUserItemList) {
				if(p.getId() == pui.getpId()) {
					p.userDO = pui.userDO;
					p.developItemDO = pui.developItemDO;
				}
			}
		}
		
		int total = projectService.count(query);
		Page pageUtil = new Page(projectList, total);
		return pageUtil;
	}
	
	@RequestMapping("/add")
	String addProject() {
		return "views/project/addProject";
	}
	/**
	 * 添加项目
	 * @param provo
	 * @return
	 */
	@RequestMapping("/addProject")
	@ResponseBody
	public Result addProject(ProjectVo provo) {
		
		
		return Result.ok();
	}
}
