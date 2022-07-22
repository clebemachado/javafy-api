package br.com.javafy.service;

import br.com.javafy.entity.Usuario;
import br.com.javafy.enums.TipoDeMensagem;
import br.com.javafy.repository.UsuarioRepository;
import br.com.javafy.dto.UsuarioCreateDTO;
import br.com.javafy.dto.UsuarioDTO;
import br.com.javafy.exceptions.PessoaNaoCadastradaException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
@Slf4j
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private EmailService emailService;

    public Usuario converterUsuarioDTO(UsuarioCreateDTO usuarioCreateDTO) {
        return objectMapper.convertValue(usuarioCreateDTO, Usuario.class);
    }

    public UsuarioDTO converterUsuario(Usuario usuario) {
        return objectMapper.convertValue(usuario, UsuarioDTO.class);
    }

    public void validUsuario(Integer idUser) throws SQLException, PessoaNaoCadastradaException {
        UsuarioDTO usuarioDTO = findById(idUser);

        if(usuarioDTO.getIdUsuario() == null){
            throw new PessoaNaoCadastradaException("Usuário não cadastrado. ID " + idUser);
        }

    }

    public UsuarioDTO findById(Integer id) throws PessoaNaoCadastradaException, SQLException {
//        return converterUsuario(usuarioRepository.findByID(id));
        return null;
    }

    public List<UsuarioDTO> list() throws SQLException {
//        return usuarioRepository
//                .list().stream()
//                .map(this::converterUsuario)
//                .toList();
        return null;
    }

    public UsuarioDTO create(UsuarioCreateDTO usuario) throws SQLException {
//        Usuario usuarioEntity = converterUsuarioDTO(usuario);
//        usuarioRepository.create(usuarioEntity);
//        String tipodeMensagem = TipoDeMensagem.CREATE.getTipoDeMensagem();
//        emailService.sendEmail(converterUsuario(usuarioEntity), tipodeMensagem);
//        return converterUsuario(usuarioEntity);
        return null;
    }

    public UsuarioDTO update(UsuarioCreateDTO usuarioDTOAtualizar, Integer idUsuario)
            throws PessoaNaoCadastradaException, SQLException {

//        Usuario usuario = converterUsuarioDTO(usuarioDTOAtualizar);
//        boolean usuarioAtualizado = usuarioRepository.update(idUsuario, usuario);
//        if(usuarioAtualizado){
//            usuario.setIdUsuario(idUsuario);
//        } else {
//            throw new PessoaNaoCadastradaException("ID informado é inválido.");
//        }
//        emailService.sendEmail(converterUsuario(usuario), TipoDeMensagem.UPDATE.getTipoDeMensagem());
//
//        return converterUsuario(usuario);
        return null;
    }

    public void delete(Integer idUsuario) throws PessoaNaoCadastradaException, SQLException {
//        UsuarioDTO usuarioRecuperado = findById(idUsuario);
//        Usuario usuarioEntity = converterUsuarioDTO(usuarioRecuperado);
//        emailService.sendEmail(converterUsuario(usuarioEntity), TipoDeMensagem.DELETE.getTipoDeMensagem());
//
//        usuarioRepository.delete(idUsuario);
        return;
    }


}
