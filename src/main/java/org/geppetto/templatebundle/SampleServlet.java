package org.geppetto.templatebundle;

import javax.servlet.http.HttpServlet;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

public class SampleServlet extends HttpServlet{
	
	BundleContext _bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();

}
