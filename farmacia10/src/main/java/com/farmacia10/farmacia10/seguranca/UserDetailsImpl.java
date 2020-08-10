package com.farmacia10.farmacia10.seguranca;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.farmacia10.farmacia10.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String passWord;
	private List<GrantedAuthority> authorities;
	
	
	public UserDetailsImpl(Usuario user) {
		
		this.userName = user.getUsuario();
		this.passWord = user.getSenha();
	}
	
	public UserDetailsImpl() {
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return authorities;
	}

	@Override
	public String getPassword() {
		
		return passWord;
	}

	@Override
	public String getUsername() {
		
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
