import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularroute.AngularRouteModule;
import com.jwebmp.plugins.angularroute.AngularRoutePageConfigurator;
import com.jwebmp.plugins.angularroute.implementations.AngularRouteExclusionsModule;

module com.jwebmp.plugins.angularroute {
	exports com.jwebmp.plugins.angularroute;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides IPageConfigurator with AngularRoutePageConfigurator;
	provides IAngularModule with AngularRouteModule;

	provides IGuiceScanModuleExclusions with AngularRouteExclusionsModule;
	provides IGuiceScanJarExclusions with AngularRouteExclusionsModule;

}
