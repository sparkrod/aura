/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.integration.test.components.docs;

import org.auraframework.adapter.ConfigAdapter;
import org.auraframework.components.ui.TreeNode;
import org.auraframework.docs.ApiContentsModel;
import org.auraframework.impl.AuraImplTestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import javax.inject.Inject;

public class ApiContentsModelTest extends AuraImplTestCase {
	
//	@Inject
//	ConfigAdapter configAdapter;
//	
    /**
     * Verifies generated jsdoc JSON file is loaded and contains list of jsdoc
     * items.
     */
    @Test
    public void testLoadJavaScriptApi() {
    	// TODO: KRIS
    	// This is going to try to load the symbols from the wrong location.
    	// I'd suggest providing your own resource loader, and populating it with the symbolSet.json file.
    	// That also makes this test less dependent on the jsDoc generation.
    	//ApiContentsModel.refreshSymbols(configAdapter.getResourceLoader());
    	
    	//ApiContentsModel model = new ApiContentsModel();
        //List<TreeNode> jsDocTreeNodes = model.getNodes();
        //assertTrue("No jsdoc nodes loaded from generated JSON file.", jsDocTreeNodes.size() > 0);
    }
}
