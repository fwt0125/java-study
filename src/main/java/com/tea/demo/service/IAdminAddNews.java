package com.tea.demo.service;


import com.tea.demo.dto.AdminAddNewsDTO;
import org.springframework.stereotype.Service;

public interface IAdminAddNews {
    void addNew(AdminAddNewsDTO adminAddNewsDTO);
}


@Service
class AdminServiceImpl implements IAdminAddNews {
    @Override
    public void addNew(AdminAddNewsDTO adminAddNewsDTO) {

    }
}