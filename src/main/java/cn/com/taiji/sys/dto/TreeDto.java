package cn.com.taiji.sys.dto;

import java.util.List;

import lombok.Data;
@Data
public class TreeDto {
	
	private String text;
	private String icon;
	private String color;
	private String backColor;
	private String selectedIcon;
	private String href;
	private List<TreeDto> nodes;
	
	public TreeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
