package com.product.controller.back;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.base.BaseController;
import com.product.domain.DevelopItemDO;
import com.product.service.DevelopItemService;

@Controller
@RequestMapping("/backend/item")
public class DevelopItemController extends BaseController{

	@Autowired
	private DevelopItemService developItemService;
	
	/**
	 * 端列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<DevelopItemDO> list() {
		return developItemService.list(new HashMap<>(16));
	}
}
