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
package org.auraframework.modules.impl;

import java.util.List;

/**
 * POJO with the parsed data ModulesCompiler generates
 */
public class ModulesCompilerData {

    public final String code;
    public final List<String> bundleDependencies;
    public final List<String> templateUsedIds;
    
    ModulesCompilerData(String code, List<String> bundleDependencies, List<String> templateUsedIds) {
        this.code = code;
        this.bundleDependencies = bundleDependencies;
        this.templateUsedIds = templateUsedIds;
    }
}
