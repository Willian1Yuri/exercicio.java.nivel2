package TestesDasClassesCorpo;

import classes.produtos;

import java.util.ArrayList;

import classes.MetodosDosProdutos;

import java.util.Scanner;

public class MainProdutos {
    public static void main(String[] args) {
        produtos produtos = new produtos();
        MetodosDosProdutos metodo = new MetodosDosProdutos();
        Scanner coletor = new Scanner(System.in);
        ArrayList<produtos> sistemaDeProduto = new ArrayList<>();

        produtos produto1 = new produtos();

        produto1.codigoDoproduto = 1001;
        produto1.nome = "Cabo USB Tipo C";
        produto1.custoDeCompra = 5.00;
        produto1.precoVarejo = 15.00;
        produto1.precoAtacado = 12.00;
        produto1.quantidade = 30;
        produto1.descricao = "Cabo USB Tipo C para carregamento e transferência de dados";
        produto1.lucroVarejo = 10.00;
        produto1.lucroAtacado = 7.00;
        produto1.UnidadesVendidas = 8;


        produtos produto2 = new produtos();

        produto2.codigoDoproduto = 1002;
        produto2.nome = "Carregador Turbo 20W";
        produto2.custoDeCompra = 18.00;
        produto2.precoVarejo = 35.00;
        produto2.precoAtacado = 30.00;
        produto2.quantidade = 15;
        produto2.descricao = "Carregador rápido USB 20W";
        produto2.lucroVarejo = 17.00;
        produto2.lucroAtacado = 12.00;
        produto2.UnidadesVendidas = 5;


        produtos produto3 = new produtos();

        produto3.codigoDoproduto = 1003;
        produto3.nome = "Fone Bluetooth";
        produto3.custoDeCompra = 25.00;
        produto3.precoVarejo = 50.00;
        produto3.precoAtacado = 42.00;
        produto3.quantidade = 20;
        produto3.descricao = "Fone de ouvido Bluetooth sem fio";
        produto3.lucroVarejo = 25.00;
        produto3.lucroAtacado = 17.00;
        produto3.UnidadesVendidas = 12;


        produtos produto4 = new produtos();

        produto4.codigoDoproduto = 1004;
        produto4.nome = "Película 3D";
        produto4.custoDeCompra = 3.50;
        produto4.precoVarejo = 12.00;
        produto4.precoAtacado = 9.00;
        produto4.quantidade = 40;
        produto4.descricao = "Película de vidro 3D para smartphone";
        produto4.lucroVarejo = 8.50;
        produto4.lucroAtacado = 5.50;
        produto4.UnidadesVendidas = 18;


        produtos produto5 = new produtos();

        produto5.codigoDoproduto = 1005;
        produto5.nome = "Suporte Veicular";
        produto5.custoDeCompra = 12.00;
        produto5.precoVarejo = 30.00;
        produto5.precoAtacado = 25.00;
        produto5.quantidade = 10;
        produto5.descricao = "Suporte para celular de uso veicular";
        produto5.lucroVarejo = 18.00;
        produto5.lucroAtacado = 13.00;
        produto5.UnidadesVendidas = 3;


        sistemaDeProduto.add(produto2);
        sistemaDeProduto.add(produto3);
        sistemaDeProduto.add(produto4);
        sistemaDeProduto.add(produto1);
        sistemaDeProduto.add(produto5);

        while (true) {
            int escolha = metodo.FormaDeAcesso(coletor);
            coletor.nextLine();
            switch (escolha) {
                case 1:
                    metodo.telaDeVendas(coletor, sistemaDeProduto);
                    break;
                case 2:
                    metodo.AbaDeCadastro(coletor, sistemaDeProduto);
                    break;
                case 3:
                    metodo.AcessarProduto(coletor, sistemaDeProduto);
                    break;
                case 4:
                    metodo.acessoAoEstoque(coletor, sistemaDeProduto);
                    break;
            }
        }
    }
}
