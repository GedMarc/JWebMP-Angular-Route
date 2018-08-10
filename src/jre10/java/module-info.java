import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularroute.AngularRouteModule;
import com.jwebmp.plugins.angularroute.AngularRoutePageConfigurator;

module com.jwebmp.plugins.angularroute {
	exports com.jwebmp.plugins.angularroute;

	requires com.jwebmp.core;
	requires java.validation;
	provides IPageConfigurator with AngularRoutePageConfigurator;
	provides IAngularModule with AngularRouteModule;

}
