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
package com.tp.cours.client.activity;

import com.tp.cours.client.ClientFactory;
import com.tp.cours.client.place.LoginPlace;
import com.tp.cours.client.place.MainPlace;
import com.tp.cours.client.services.LoginService;
import com.tp.cours.client.shared.Parametres;
import com.tp.cours.client.shared.User;
import com.tp.cours.client.ui.LoginView;
import com.tp.cours.client.ui.LoginViewImpl;
import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

/**
 * Activities are started and stopped by an ActivityManager associated with a container Widget.
 */
public class LoginActivity extends AbstractActivity implements LoginView.Presenter {

	/**
	 * Sample property.
	 */
	
	private ClientFactory clientFactory;
	
	public LoginActivity(LoginPlace place, ClientFactory clientFactory) {
		this.clientFactory = clientFactory;

	}


	@Override
	public void start(AcceptsOneWidget containerWidget, EventBus eventBus) {
		
		clientFactory.getLoginView().setPresenter(this);
		containerWidget.setWidget(clientFactory.getLoginView().asWidget());
	}
	/**
	 * @see LoginView.Presenter#goTo(Place)
	 */
	public void goTo(Place place) {
		clientFactory.getPlaceController().goTo(place);
	}


	@Override
	public void login(String name, String password) 
	{
		LoginService.Util.getInstance().Login(name, password, new AsyncCallback<String>() {	
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onSuccess(String result) {
				if (result.equalsIgnoreCase(Parametres.typeAdmin)) {
					System.out.println("type: Admin");
				}
				else if (result.equalsIgnoreCase(Parametres.typeClient)) {
					System.out.println("type: Client");
				}
				else {
					System.out.println("error");
				}
			}
		});
		
	}
}
