package com.xincan.mybatis.config.constant;

public class ProjectConstant {

	// 项目基础包名称，根据自己公司的项目修改
	public static final String BASE_PACKAGE = "com.hyt.server";

	// 实体类所在包
	public static final String MODEL_PACKAGE = BASE_PACKAGE + ".entity";

	// Mapper接口映射mybatis文件所在包
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";

	// 服务接口所在包
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";

	// 服务接口实现所在包
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";

	// 控制层所在包
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";

	// Mapper插件基础接口的完全限定名
	public static final String MAPPER_INTERFACE_REFERENCE = "com.xincan.mybatis.config.universal.IXincanMapper";

}
