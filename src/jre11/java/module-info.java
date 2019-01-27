module com.jwebmp.plugins.angularroute {
	exports com.jwebmp.plugins.angularroute;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularroute.AngularRoutePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularroute.AngularRouteModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularroute.implementations.AngularRouteExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularroute.implementations.AngularRouteExclusionsModule;

}
