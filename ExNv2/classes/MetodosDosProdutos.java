package classes;
import java.util.Scanner;
import classes.produtos;
import java.util.ArrayList;
public class MetodosDosProdutos {

    public int FormaDeAcesso(Scanner ler) {
        System.out.println("Digite qual opção desejada acessar: ");
        System.out.println("...");
        System.out.println("1-Tela inicial de vendas.");
        System.out.println("2-Cadastrar produto.");
        System.out.println("3-Acessar produto.");
        System.out.println("4-Acessar estoque. ");
        System.out.println("5-Outras configurações. ");
        int escolha= ler.nextInt();
        return escolha;
    }
    public void  telaDeVendas(Scanner ler, ArrayList<produtos> sistemeDeEstoque) {
    while (true) {
        System.out.println("Adicione o codigo do produto: ");
        long codigoDoproduto=ler.nextLong();
        for (produtos procurador : sistemeDeEstoque) {
            if (procurador.codigoDoproduto==codigoDoproduto){
                System.out.println(procurador.nome);
                System.out.println("R$ "+ procurador.precoVarejo);
                System.out.println("Digite a quantidade abaixo");
                int unidadesVendidas = ler.nextInt();
                double total =  unidadesVendidas * procurador.precoVarejo;
                System.out.println("Valor total de R$ "+total);
                System.out.println("Valor recebido");
                double valorRecebido = ler.nextDouble();
                if (valorRecebido>=total){
                    double troco= valorRecebido-total;
                    System.out.println("troco de R$ "+troco);
                    System.out.println("Compra finalizada com sucesso!!");
                    break;
                } else if (valorRecebido<total){
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Alguma outra forma depagamento?");
                }
            procurador.quantidade -=  unidadesVendidas;
                }
            }
        }
    }


    public void AcessarProduto(Scanner ler, ArrayList<produtos> sistemeDeEstoque) {
        System.out.println("Adicione o codigo do produto: ");
        long codigoDoproduto= ler.nextLong();
        for (produtos procurador : sistemeDeEstoque) {
            if (procurador.codigoDoproduto==codigoDoproduto){
                System.out.println(procurador.codigoDoproduto);
                System.out.println("Nome: "+ procurador.nome);
                System.out.println("Descrição: " +procurador.descricao);
                System.out.println("Custo do produto no fornecedor: R$" +procurador.custoDeCompra);
                System.out.println("Preço: R$" +procurador.precoVarejo);
                System.out.println("Preço no atacado: R$" +procurador.precoAtacado);
                System.out.println("Quantidade em estoque: " +procurador.quantidade);
                System.out.println("Lucro por unidade no atacado: R$"+ procurador.lucroAtacado);
                System.out.println("Lucro por unidade no varejo: R$"+ procurador.lucroVarejo);
                System.out.println("Unidades vendidas: " +procurador.UnidadesVendidas);
            }
        }
    }
    public void AbaDeCadastro (Scanner coletor,  ArrayList<produtos> sistemaDeEstoque) {
                produtos produto = new produtos ();
                System.out.println("Adicione o nome do produto: ");
                produto.nome = coletor.nextLine();
                System.out.println("Adicione o codigo do produto: ");
                produto.codigoDoproduto = coletor.nextLong();
                coletor.nextLine();
                System.out.println("Adicione a descricao do produto: ");
                produto.descricao = coletor.nextLine();
                coletor.nextLine();
                System.out.println("Adicione a custo do produto: ");
                produto.custoDeCompra = coletor.nextDouble();
                System.out.println("Adicione o preço de venda no varejo: ");
                produto.precoVarejo = coletor.nextDouble();
                System.out.println("Adicione a quantidade em estoque: ");
                produto.quantidade = coletor.nextInt();
                System.out.println("Adicione o preço no atacado: ");
                produto.precoAtacado = coletor.nextDouble();
                produto.lucroVarejo = produto.precoVarejo - produto.custoDeCompra;
                produto.lucroAtacado =produto.precoAtacado - produto.custoDeCompra;
                System.out.println("Lucro por unidade no varejo: R$"+ produto.lucroVarejo);
                System.out.println("Lucro por unidade no Atacado: R$"+ produto.lucroAtacado);
                System.out.println("Produto cadastrado com sucesso!");
                System.out.println(".....");
                System.out.println(".....");
                System.out.println(".....");
                sistemaDeEstoque.add(produto);
    }

    public void acessoAoEstoque(Scanner ler, ArrayList<produtos> sistemaDeEstoque) {
        int senha = 1910;
        int numm  = 0;
        System.out.println("Digite a senha de permissão: ");
        int recebedor =ler.nextInt();
        if (recebedor == senha){
        for (produtos procurador : sistemaDeEstoque) {
            System.out.println("Produto: " + ++numm);
            System.out.println(procurador.codigoDoproduto);
            System.out.println("Nome: " + procurador.nome);
            System.out.println("Descrição: " + procurador.descricao);
            System.out.println("Custo do produto no fornecedor: R$" + procurador.custoDeCompra);
            System.out.println("Preço: R$" + procurador.precoVarejo);
            System.out.println("Preço no atacado: R$" + procurador.precoAtacado);
            System.out.println("Quantidade em estoque: " + procurador.quantidade);
            System.out.println("Lucro por unidade no atacado: R$" + procurador.lucroAtacado);
            System.out.println("Lucro por unidade no varejo: R$" + procurador.lucroVarejo);
            System.out.println("Unidades vendidas: " + procurador.UnidadesVendidas);
            System.out.println(".");
        }
        }else {System.out.println("Senha incorreta!");}
        int Produtoscadastrados=numm;
        System.out.println(Produtoscadastrados+" Produtos cadastrados no sistema!");
        System.out.println("---");
        System.out.println("---");
    }




}
