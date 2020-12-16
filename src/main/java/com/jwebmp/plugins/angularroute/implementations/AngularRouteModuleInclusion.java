package com.jwebmp.plugins.angularroute.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularRouteModuleInclusion implements IGuiceScanModuleInclusions<AngularRouteModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularroute");
		return set;
	}
}
