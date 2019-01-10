#language: pt
Funcionalidade: Criar tela de emissao de SSI

  Contexto: 
    Dado que estou na pagina "http://10.148.202.153:8083/WEB_DRSS/servlet/wcoindex"
    Quando clicar no comboBox "vWCO02_FIL_CODE"
    E selecionar a opção "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/td[2]/select/option[2]" no comboBox "vWCO02_FIL_CODE"
    E eu informar "gx2" no campo "vWCO_USE_CODE"
    E clicar no no comboBox "vWCO_CAGE_ID"
    E selecionar "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[2]/select/option[2]" no combobox "cage"
    E informar "gx2" no campo "vWCO_USE_PASSWORD"
    E cliar no botão "TABLE5"

  @exec
  Cenário: Acessar pagina emissão de SSI (Entrada)
    Quando eu clicar no menu "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div[1]/div/ul/li[3]/a"
    E no menu "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div[1]/div/ul/li[3]/ul/li[1]/a"
    E clicar no item "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div[1]/div/ul/li[3]/ul/li[1]/ul/li[1]/a"
    Então deve entrar na tela de "Emissão de SSI (Entrada)"
    E exibir o titulo "Emissão de SSI (Entrada)"
