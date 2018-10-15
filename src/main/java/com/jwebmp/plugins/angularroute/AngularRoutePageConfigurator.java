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
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

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
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-Route/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-Route",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://docs.angularjs.org/api/ngRoute",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularRoute.jar/download")
@ComponentInformation(name = "AngularJS Routing",
		description = "The ngRoute module provides routing and deeplinking services and directives for AngularJS apps (for native angular apps)",
		url = "https://docs.angularjs.org/api/ngRoute")
public class AngularRoutePageConfigurator
		implements IPageConfigurator<AngularRoutePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularRoutePageConfigurator
	 */
	public AngularRoutePageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularRoutePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularRoutePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(AngularRouteReferencePool.AngularRoute.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularRoutePageConfigurator.enabled;
	}
}
