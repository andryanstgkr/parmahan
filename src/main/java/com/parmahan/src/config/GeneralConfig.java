package com.parmahan.src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.parmahan.src.dao.CCTransactionDao;
import com.parmahan.src.dao.CategoryDao;
import com.parmahan.src.dao.CouponDao;
import com.parmahan.src.dao.OrderDao;
import com.parmahan.src.dao.OrderProductDao;
import com.parmahan.src.dao.ProductCategoryDao;
import com.parmahan.src.dao.ProductDao;
import com.parmahan.src.dao.ProductStatusDao;
import com.parmahan.src.dao.RoleDao;
import com.parmahan.src.dao.SalesOrderDao;
import com.parmahan.src.dao.SessionDao;
import com.parmahan.src.dao.TagDao;
import com.parmahan.src.dao.UserDao;
import com.parmahan.src.dao.UserRoleDao;
import com.parmahan.src.dao.impl.CCTransactionDaoImpl;
import com.parmahan.src.dao.impl.CategoryDaoImpl;
import com.parmahan.src.dao.impl.CouponDaoImpl;
import com.parmahan.src.dao.impl.OrderDaoImpl;
import com.parmahan.src.dao.impl.OrderProductDaoImpl;
import com.parmahan.src.dao.impl.ProductCategoryDaoImpl;
import com.parmahan.src.dao.impl.ProductDaoImpl;
import com.parmahan.src.dao.impl.ProductStatusDaoImpl;
import com.parmahan.src.dao.impl.RoleDaoImpl;
import com.parmahan.src.dao.impl.SalesOrderDaoImpl;
import com.parmahan.src.dao.impl.SessionDaoImpl;
import com.parmahan.src.dao.impl.TagDaoImpl;
import com.parmahan.src.dao.impl.UserDaoImpl;
import com.parmahan.src.dao.impl.UserRoleDaoImpl;
import com.parmahan.src.service.CCTransactionService;
import com.parmahan.src.service.CategoryService;
import com.parmahan.src.service.CouponService;
import com.parmahan.src.service.OrderProductService;
import com.parmahan.src.service.OrderService;
import com.parmahan.src.service.ProductCategoryService;
import com.parmahan.src.service.ProductService;
import com.parmahan.src.service.ProductStatusService;
import com.parmahan.src.service.RoleService;
import com.parmahan.src.service.SalesOrderService;
import com.parmahan.src.service.SessionService;
import com.parmahan.src.service.TagService;
import com.parmahan.src.service.UserRoleService;
import com.parmahan.src.service.UserService;
import com.parmahan.src.service.impl.CCTransactionServiceImpl;
import com.parmahan.src.service.impl.CategoryServiceImpl;
import com.parmahan.src.service.impl.CouponServiceImpl;
import com.parmahan.src.service.impl.OrderProductServiceImpl;
import com.parmahan.src.service.impl.OrderServiceImpl;
import com.parmahan.src.service.impl.ProductCategoryServiceImpl;
import com.parmahan.src.service.impl.ProductServiceImpl;
import com.parmahan.src.service.impl.ProductStatusServiceImpl;
import com.parmahan.src.service.impl.RoleServiceImpl;
import com.parmahan.src.service.impl.SalesOrderServiceImpl;
import com.parmahan.src.service.impl.SessionServiceImpl;
import com.parmahan.src.service.impl.TagServiceImpl;
import com.parmahan.src.service.impl.UserRoleServiceImpl;
import com.parmahan.src.service.impl.UserServiceImpl;

@Configuration
@EnableTransactionManagement
public class GeneralConfig {

	@Bean
	public CategoryService categoryService() {
		return new CategoryServiceImpl();
	}

	@Bean
	public CategoryDao categoryDao() {
		return new CategoryDaoImpl();
	}

	@Bean
	public CCTransactionService cCTransactionService() {
		return new CCTransactionServiceImpl();
	}

	@Bean
	public CCTransactionDao cCTransactionDao() {
		return new CCTransactionDaoImpl();
	}

	@Bean
	public CouponService couponService() {
		return new CouponServiceImpl();
	}

	@Bean
	public CouponDao couponDao() {
		return new CouponDaoImpl();
	}

	@Bean
	public OrderProductDao orderProductDao() {
		return new OrderProductDaoImpl();
	}

	@Bean
	public OrderProductService orderProductService() {
		return new OrderProductServiceImpl();
	}

	@Bean
	public ProductCategoryService productCategoryService() {
		return new ProductCategoryServiceImpl();
	}

	@Bean
	public ProductCategoryDao productCategoryDao() {
		return new ProductCategoryDaoImpl();
	}

	@Bean
	public ProductStatusService productStatusService() {
		return new ProductStatusServiceImpl();
	}

	@Bean
	public ProductStatusDao productStatusDao() {
		return new ProductStatusDaoImpl();
	}

	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	@Bean
	public ProductDao productDao() {
		return new ProductDaoImpl();
	}

	@Bean
	public RoleService roleService() {
		return new RoleServiceImpl();
	}

	@Bean
	public RoleDao roleDao() {
		return new RoleDaoImpl();
	}

	@Bean
	public OrderService orderService() {
		return new OrderServiceImpl();
	}

	@Bean
	public OrderDao orderDao() {
		return new OrderDaoImpl();
	}

	@Bean
	public SalesOrderService salesOrderService() {
		return new SalesOrderServiceImpl();
	}

	@Bean
	public SalesOrderDao salesOrderDao() {
		return new SalesOrderDaoImpl();
	}

	@Bean
	public SessionService sessionService() {
		return new SessionServiceImpl();
	}

	@Bean
	public SessionDao sessionDao() {
		return new SessionDaoImpl();
	}

	@Bean
	public TagService tagService() {
		return new TagServiceImpl();
	}

	@Bean
	public TagDao tagDao() {
		return new TagDaoImpl();
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public UserDao userDao() {
		return new UserDaoImpl();
	}

	@Bean
	public UserRoleDao userRoleDao() {
		return new UserRoleDaoImpl();
	}

	@Bean
	public UserRoleService userRoleService() {
		return new UserRoleServiceImpl();
	}
}
