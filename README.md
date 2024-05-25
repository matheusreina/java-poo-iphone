classDiagram
    iPhone <|-- ReprodutorMusical
    iPhone <|-- AparelhoTelefonico
    iPhone <|-- NavegadorInternet

    class ReprodutorMusical{
      tocar()
      pausar()
      selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      fazerLigacao(String numero)
      atender()
      iniciarCorreioVoz()
    }
    class NavegadorInternet{
      exibirPagina(String url)
      adicionarNovaAba()
      atualizarPagina()
    }
