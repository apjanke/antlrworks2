/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 * 
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
@NbBundle.Messages({
    "LBL_GroupFile=StringTemplate Group File",
    "LBL_TemplateFile=StringTemplate Template File",
})
@TemplateRegistrations({
    @TemplateRegistration(content = "resources/templates/Group.stg.template", folder = "StringTemplate", displayName = "#LBL_GroupFile", scriptEngine = "freemarker"),
    @TemplateRegistration(content = "resources/templates/Template.st.template", folder = "StringTemplate", displayName = "#LBL_TemplateFile", scriptEngine = "freemarker"),
})
package org.antlr.works.editor.st4;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;
import org.openide.util.NbBundle;

