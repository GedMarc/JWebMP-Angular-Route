package za.co.mmagon.jwebswing.plugins.angularroute;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "AngularJS Routing",
		pluginDescription = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps). "
				+ "<br/><i>Please note JWebSwing has no dependancy on Angular Routing and is included as a dependancy for other applications, or when a direct MVC approach is used.</i>",
		pluginUniqueName = "jwebswing-angular-routing",
		pluginVersion = "1.6.4",
		pluginCategories = "angular,routing, ui,web ui, framework",
		pluginSubtitle = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps)",
		pluginSourceUrl = "https://docs.angularjs.org/api/ngRoute",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-Route/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-Route",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/api/ngRoute",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularRoute.jar/download"
)
@ComponentInformation(name = "AngularJS Routing",
		description = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps)",
		url = "https://docs.angularjs.org/api/ngRoute") class AngularRoutePageConfigurator extends PageConfigurator
{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Constructs a new AngularRoutePageConfigurator
	 */
	public AngularRoutePageConfigurator()
	{
		//Nothing needed
	}
	
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getBody().addJavaScriptReference(AngularRouteReferencePool.AngularRoute.getJavaScriptReference());
			page.getAngular().getAngularModules().add(new AngularRouteModule());
		}
		return page;
	}
}
