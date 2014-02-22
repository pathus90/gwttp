/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.tp.cours.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Label;

/**
 * Sample implementation of {@link MainView}.
 */
public class MainViewImpl extends Composite implements MainView {

	public MainViewImpl()
	{
		
		SimplePanel simplePanel = new SimplePanel();
		initWidget(simplePanel);
		
		Label lblBienvenue = new Label("Bienvenue");
		simplePanel.setWidget(lblBienvenue);
		lblBienvenue.setSize("100%", "100%");
		
	}
	
	@Override
	public void setPresenter(Presenter listener) {
		// TODO Auto-generated method stub
		
	}

	
}
