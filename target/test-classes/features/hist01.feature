#language: pt

  @compra
  Funcionalidade: compra

#    História do Usuário #1:
#    Como um cliente cadastrado no automationpractice.com
#    Eu quero fazer a compra de ao menos dois produtos
#    Para que eu possa me vestir melhor
#    -----------------------------------------------------
#    Dados de login
#    Email: datumqatest@soprock.com
#    Senha: datum2021
#    -----------------------------------------------------
#    Alguns produtos do e-commerce:
#    • Printed Chiffon Dress
#    • Faded Short Sleeve T-shirts
#    • Blouse
#    • Printed Dress
#    • Printed Summer Dress

    Contexto:
     CN01 - Usuário já cadastrado
     CN01 - Utilizar os dados de login que foi passado
     CN01 - Utilizar produtos do exemplo
     CNbonus - Cadastrar usuário
     CNbonus - Utilizar produtos do exemplo


      @hist01 @CN01
      Cenario: Realizar compra com usuário cadastrado
        Dado que o usuario realize o login no site com sucesso
        Quando selecionar os produtos desejados
        Entao deverá finalizar compra

      @hist01 @CBonus
      Cenario: Realizar compra cadastrando um novo usuário
        Dado que o usuário efetue seu cadastro com sucesso
        Quando selecionar os produtos desejados
        Entao deverá finalizar compra
