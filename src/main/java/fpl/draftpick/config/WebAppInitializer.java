package fpl.draftpick.config;


import fpl.draftpick.config.root.AppSecurityConfig;
import fpl.draftpick.config.root.DevelopmentConfiguration;
import fpl.draftpick.config.root.RootContextConfig;
import fpl.draftpick.config.root.TestConfiguration;
import fpl.draftpick.config.servlet.ServletContextConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * Replacement for most of the content of web.xml, sets up the root and the servlet context config.
 *
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootContextConfig.class, DevelopmentConfiguration.class, TestConfiguration.class,
                AppSecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {ServletContextConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }




}


