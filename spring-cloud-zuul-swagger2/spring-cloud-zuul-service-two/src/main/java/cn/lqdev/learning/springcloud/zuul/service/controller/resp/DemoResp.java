package cn.lqdev.learning.springcloud.zuul.service.controller.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 响应实体
 * @author Okong
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class DemoResp {

	@ApiModelProperty(name="code",value="编码",example="oKong")
	String code;
	
	@ApiModelProperty(name="name",value="名称",example="趔趄的猿")
	String name;
	
	@ApiModelProperty(name="remark",value="备注",example="blog：blog.lqdev.cn")
	String remark;
}
