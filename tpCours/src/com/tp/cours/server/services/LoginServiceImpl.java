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
import com.tp.cours.client.shared.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService
{

	User admUser=new User();
	@Override
	public boolean Login(String name, String password) {
		// TODO Auto-generated method stub
		boolean t=false;
		if((name.equalsIgnoreCase("pathus"))&&(password.equalsIgnoreCase("pathus")))
		{		
			t=true;
			System.out.println(t);
		}
		return t;
	}
	
	
	
	
}
