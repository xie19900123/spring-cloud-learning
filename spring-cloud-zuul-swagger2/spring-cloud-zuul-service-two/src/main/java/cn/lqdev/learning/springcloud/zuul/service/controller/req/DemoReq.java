package cn.lqdev.learning.springcloud.zuul.service.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 请求实体
 * @author oKong
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class DemoReq {

	@ApiModelProperty(name="code",value="编码",example="oKong")
	String code;
	
	@ApiModelProperty(name="name",value="名称",example="趔趄的猿")
	String name;
	
	@ApiModelProperty(name="remark",value="备注",example="blog：blog.lqdev.cn")
	String remark;
}
