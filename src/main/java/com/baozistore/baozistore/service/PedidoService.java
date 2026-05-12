package com.baozistore.baozistore.service;

import com.baozistore.baozistore.entity.Pedido;
import com.baozistore.baozistore.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }


    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }


    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }


    public List<Pedido> buscarPorCliente(Long clienteId) {
        return pedidoRepository.findByClienteId(clienteId);
    }


    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}