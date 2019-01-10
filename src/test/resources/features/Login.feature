#language: pt
Funcionalidade: Permitir login no WebDRSS

  @exec
  Cenário: Fazer login com sucesso
    Dado que estou na pagina "http://10.148.202.153:8083/WEB_DRSS/servlet/wcoindex"
    Quando clicar no comboBox "vWCO02_FIL_CODE"
    E selecionar a opção "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/td[2]/select/option[2]" no comboBox "vWCO02_FIL_CODE"
    E eu informar "gx2" no campo "vWCO_USE_CODE"
    E clicar no no comboBox "vWCO_CAGE_ID"
    E selecionar "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[2]/select/option[2]" no combobox "cage"
    E informar "gx2" no campo "vWCO_USE_PASSWORD"
    E cliar no botão "TABLE5"
    Então deve logar exibindo texto "HAB - Sumaré" no "TEXTBLOCKSITE_MPAGE"

  @exec
  Esquema do Cenário: Fazer login com falha
    Dado que estou na pagina "http://10.148.202.153:8083/WEB_DRSS/servlet/wcoindex"
    Quando clicar no comboBox "vWCO02_FIL_CODE"
    E selecionar a opção "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[1]/td[2]/select/option[2]" no comboBox "vWCO02_FIL_CODE"
    E eu informar <login> no campo "vWCO_USE_CODE"
    E clicar no no comboBox "vWCO_CAGE_ID"
    E selecionar "/html/body/form/table/tbody/tr[2]/td/table[1]/tbody/tr/td/div/div/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[2]/select/option[2]" no combobox "cage"
    E informar <senha> no campo "vWCO_USE_PASSWORD"
    E cliar no botão "TABLE5"
    Então deve exibir texto "Usuário/Senha Incorretos!" no "span_vWCO_MESSAGE"

    Exemplos: 
      | login                        | senha |
      | "gx2"                        | "gx1" |
      | "teste.email1.gx2@gmail.com" | "gx2" |
      | "gx2"                        | "GX2" |
