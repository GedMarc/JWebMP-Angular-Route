/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularroute;

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "AngularJS Routing",
		pluginDescription = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps). " +
		                    "<br/><i>Please note JWebSwing has no dependancy on Angular Routing and is included as a dependancy for other applications, or when a direct MVC approach is used.</i>",
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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularRoute.jar/download")
@ComponentInformation(name = "AngularJS Routing",
		description = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps)",
		url = "https://docs.angularjs.org/api/ngRoute")
public class AngularRoutePageConfigurator
		extends PageConfigurator
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
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularRouteReferencePool.AngularRoute.getJavaScriptReference());
			page.getAngular()
			    .getAngularModules()
			    .add(new AngularRouteModule());
		}
		return page;
	}
}
