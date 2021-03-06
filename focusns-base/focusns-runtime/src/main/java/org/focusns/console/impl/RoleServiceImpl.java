package org.focusns.console.impl;

/*
 * #%L
 * FocusSNS Runtime
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 2.1 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import org.focusns.dao.console.RoleDao;
import org.focusns.model.console.Role;
import org.focusns.service.console.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getRole(long roleId) {
        return roleDao.select(roleId);
    }

    @Override
    public void createRole(Role role) {
        roleDao.insert(role);
    }

    @Override
    public void modifyRole(Role role) {
        roleDao.update(role);
    }

    @Override
    public void removeRole(Role role) {
        roleDao.delete(role.getId());
    }

    @Override
    public void authorizeAuthority(long roleId, long authorityId) {
        roleDao.authorize(roleId, authorityId);
    }

    @Override
    public void unauthorizeAuthority(long roleId, long authorityId) {
        roleDao.unauthorize(roleId, authorityId);
    }
}
