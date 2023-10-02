package br.senacsp.tads.ado1springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

/**
 * @author marcelo.guimaraes
 */
@Controller // Indica que a classe irá ser configurada como um Controlador web
@RequestMapping("/curriculo")
public class Ado1Controller {

    @GetMapping("/mensagem1") // Mapeia um padrão de URL (rota) para a requisição ser processada pela classe
                              // e/ou pelo método
    public String saudar1(Model modelo) {
        return "index";
    }

    @GetMapping("/dados") // URL mapeada para processamento da requisição GET
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("nome", "Marcelo Alves Guimarães");
        mv.addObject("dados", "40 anos - Casado - 1 filho.");
        mv.addObject("email", "sp.mguimaraes@gmail.com");
        mv.addObject("celular", 11.983435383);
        mv.addObject("apresentacao",
                "Olá! Sou o Marcelo Guimarães, estudante de Análise e Desenvolvimento de Sistemas. Estou extremamente motivado em conquistar uma oportunidade na área de desenvolvimento web e Tecnologias.\r\n"
                        + //
                        "\r\n" + //
                        "Desde que comecei a estudar, descobri uma paixão pela programação e por criar soluções criativas para problemas complexos.\r\n"
                        + //
                        "\r\n" + //
                        "Ao longo da minha jornada acadêmica, tive a oportunidade de aprender linguagens de programação, frameworks, entre outros Github e Figma. Posso destacar também como diferencial, conhecimentos em edição de imagem e vetorização, com certeza será destaque para trabalhar na área.\r\n"
                        + //
                        "\r\n" + //
                        "Além disso, sou curioso e comprometido com meu trabalho. Sempre busco me atualizar sobre as novas tecnologias e tendências de mercado. Isso me permite oferecer soluções mais inovadoras e eficientes aos clientes.");

        mv.addObject("formacao1",
                "Análise e Desenvolvimento de Sistemas\r\n" + //
                        "SENACSP - Centro Universitário SENAC\r\n" + //
                        "(Junho de 2024) – Cursando.");

        mv.addObject("formacao2",
                "Comunicação Social - Publicidade e Propaganda\r\n" + //
                        "UNIB - Universidade Ibirapuera\r\n" + //
                        "(Novembro de 2007) – Concluído.");

        mv.addObject("formacaoextra",
                "Hardware Completo, Senac\r\n" + //
                        "(Agosto de 2002) – Concluído.\r\n" + //
                        "\r\n" + //
                        "Idioma: Inglês\r\n" + //
                        "iW English School (nível intermediário).\r\n" + //
                        "(Dezembro de 2018) – Concluído.");

        mv.addObject("historico1",
                "Barista Master\r\n" + //
                        "Gestor de Loja desde Novembro/2018\r\n" + //
                        "Como gestor de uma cafeteria, sou responsável por gerir e coordenar as atividades diárias do negócio, garantindo a qualidade do produto e a satisfação dos clientes.\r\n"
                        + //
                        "Minhas funções incluem:\r\n" + //
                        "Gerenciar equipe, Controles, Compras, Gestão financeira, Gestão de vendas, Marketing e Controle de qualidade. Em resumo, sou um líder que conhece bem o mercado de cafés especiais e sou capaz de garantir a qualidade do produto.");

        mv.addObject("historico2",
                "MM Assessoria\r\n" + //
                        "Coordenador Administrativo - Setembro/2010 a Setembro/2017\r\n" + //
                        "Como coordenador pleno, desenvolvi funções administrativas e de logística.\r\n" + //
                        "Em resumo, como coordenador tive as habilidades de liderança, planejamento e organização, além de conhecimentos em logística, finanças e atendimento ao cliente, visando garantir a eficiência e sucesso dos eventos.");
        mv.addObject("dataHora", LocalDateTime.now());

        return mv;
    }
}