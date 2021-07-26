# Princípios utilizados :
```txt
1 - Single responsibility principle.
2 - Open - Closed principle.
3 - Interface segregation principle.
4 - Dependency inversion.
```
# Arquivos:
```txt
material_bibliografico.Java: Responsável por ser a camada que centraliza todos os tipos de
```
```txt
material bibliográfico, facilitando implementações futuras (princípios 1, 2 e 4).
```
```txt
Material.Java: Responsável por abstrair quais informações serão necessárias para ser
apresentado na tela de listagem (ListagemViwer.Java) (# princípio 3).
```
```txt
Janela.Java: Responsável por organizar a criação das telas (princípio 1).
```
```txt
Livro.Java, Revista.Java: Classes base (princípios 1 e 3).
```
# Bad Smell:
```txt
Grande quantidade de código dos arquivos que são responsáveis pela criação da tela (LivroView.Java, RevistaView.Java e ListagemView.Java).
```
# Professor:
[Marcelo de Almeida Maia](http://www.portal.facom.ufu.br/pessoas/docentes/marcelo-de-almeida-maia)
