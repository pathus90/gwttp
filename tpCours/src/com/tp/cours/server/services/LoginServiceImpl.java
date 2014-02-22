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
package com.tp.cours.server.services;

import java.util.ArrayList;

import com.tp.cours.client.services.LoginService;
import com.tp.cours.client.shared.Admin;
import com.tp.cours.client.shared.Client;
import com.tp.cours.client.shared.Parametres;
import com.tp.cours.client.shared.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService
{
	ArrayList<User> users = new ArrayList<>();




	@Override
	public String Login(String name, String password) {
		users.add(new Admin(0, "admin", "admin"));
		users.add(new Client(1, "lulu", "lala"));
		String s="";
		// TODO Auto-generated method stub
		for(int i = 0; i < users.size(); i++) {
			if((name.equalsIgnoreCase(users.get(i).getNom()))&&(password.equalsIgnoreCase(users.get(i).getPwd())))
			{	
				if(users.get(i).getType() == Parametres.typeAdmin) {
					s = Parametres.typeAdmin;
				}
				if(users.get(i).getType() == Parametres.typeClient) {
					s = Parametres.typeClient;
				}
			}	
		}
		return s;
	}




}
