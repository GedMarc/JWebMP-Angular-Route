import com.jwebmp.plugins.angularroute.implementations.AngularRouteModuleInclusion;

module com.jwebmp.plugins.angularroute {
	exports com.jwebmp.plugins.angularroute;

	requires com.jwebmp.core;
	requires jakarta.validation;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularroute.AngularRoutePageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularroute.AngularRouteModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularroute.implementations.AngularRouteExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularRouteModuleInclusion;
}
