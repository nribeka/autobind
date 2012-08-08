package org.nnsoft.guice.autobind.annotations;

/*
 *    Copyright 2012 The 99 Software Foundation
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Can be used to tell the autobind which annotations should be recognized.
 * If {@link AnnotatedWith} is not used or {@link AnnotatedWith}.annotations() is empty,
 * all annotations will be used, which can be found.
 *
 * @author Daniel Manzke
 */
@Retention( RetentionPolicy.RUNTIME )
@Qualifier
@GuiceAnnotation
@Target( { ElementType.TYPE } )
public @interface AnnotatedWith
{

	Class<? super Annotation>[] value() default {};

}
