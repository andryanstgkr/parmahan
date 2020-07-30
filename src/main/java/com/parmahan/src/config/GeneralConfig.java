package com.parmahan.src.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.parmahan.src.dao.CCTransactionDao;
import com.parmahan.src.dao.CategoryDao;
import com.parmahan.src.dao.CouponDao;
import com.parmahan.src.dao.OrderProductDao;
import com.parmahan.src.dao.ProductCategoryDao;
import com.parmahan.src.dao.ProductDao;
import com.parmahan.src.dao.ProductStatusDao;
import com.parmahan.src.dao.RoleDao;
import com.parmahan.src.dao.UserDao;
import com.parmahan.src.dao.impl.CCTransactionDaoImpl;
import com.parmahan.src.dao.impl.CategoryDaoImpl;
import com.parmahan.src.dao.impl.CouponDaoImpl;
import com.parmahan.src.dao.impl.OrderProductDaoImpl;
import com.parmahan.src.dao.impl.ProductCategoryDaoImpl;
import com.parmahan.src.dao.impl.ProductDaoImpl;
import com.parmahan.src.dao.impl.ProductStatusDaoImpl;
import com.parmahan.src.dao.impl.RoleDaoImpl;
import com.parmahan.src.dao.impl.UserDaoImpl;
import com.parmahan.src.service.BaseService;
import com.parmahan.src.service.CCTransactionService;
import com.parmahan.src.service.CategoryService;
import com.parmahan.src.service.CouponService;
import com.parmahan.src.service.OrderProductService;
import com.parmahan.src.service.ProductCategoryService;
import com.parmahan.src.service.ProductService;
import com.parmahan.src.service.ProductStatusService;
import com.parmahan.src.service.RoleService;
import com.parmahan.src.service.UserService;
import com.parmahan.src.service.impl.BaseServiceImpl;
import com.parmahan.src.service.impl.CCTransactionServiceImpl;
import com.parmahan.src.service.impl.CategoryServiceImpl;
import com.parmahan.src.service.impl.CouponServiceImpl;
import com.parmahan.src.service.impl.OrderProductServiceImpl;
import com.parmahan.src.service.impl.ProductCategoryServiceImpl;
import com.parmahan.src.service.impl.ProductServiceImpl;
import com.parmahan.src.service.impl.ProductStatusServiceImpl;
import com.parmahan.src.service.impl.RoleServiceImpl;
import com.parmahan.src.service.impl.UserServiceImpl;

@Configuration
public class GeneralConfig {
	
	@Bean
	public BaseService<Object> baseService(){
		return new BaseServiceImpl();
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
}
