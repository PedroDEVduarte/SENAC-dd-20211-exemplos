package com.br.pedro.view;


import  java.awt.EventQueue ;

import  javax.swing.JFrame ;
import  javax.swing.JPanel ;
import  javax.swing.border.EmptyBorder ;
import  javax.swing.border.MatteBorder ;

import  com.br.pedro.controller.PessoaController ;
import  com.br.pedro.controller.VacinaController ;
import  com.br.pedro.model.entity.PessoaVO ;
import  com.br.pedro.model.entity.VacinaVO ;
import  com.br.pedro.repository.Constants ;
import  com.br.pedro.repository.Utils ;

import  java.awt.Color ;
import  java.awt.Frame ;
import  javax.swing.JButton ;
import  javax.swing.JTextField ;
import  javax.swing.JLabel ;
import  javax.swing.JOptionPane ;

import  java.awt.Font ;
import  javax.swing.JFormattedTextField ;
import  javax.swing.JComboBox ;
import  javax.swing.DefaultComboBoxModel ;
import  javax.swing.JRadioButton ;
import  javax.swing.Box ;
import  javax.swing.ButtonGroup ;
import  javax.swing.SwingConstants ;
import  javax.swing.JSpinner ;
import  java.awt.event.ActionListener ;
import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;
import  java.awt.event.ActionEvent ;

public  class  TelaVacina  extends  JFrame {

	privado  estático  final  longo serialVersionUID =  1L ;
	 JPanel contentPane privado ;
	private  JTextField textFieldNomeVacina;
	private  JTextField textFieldPaisOrigem;
	private  JTextField textFieldCodigoPesquisador;
	private  JTextField textFieldDataInicioPesquisa;
	 final  privado ButtonGroup buttonGroup =  new  ButtonGroup ();

	public  static  void  main ( String [] args ) {
		EventQueue . invokeLater ( new  Runnable () {
			public  void  run () {
				tente {
					Moldura TelaVacina =  nova  TelaVacina ();
					quadro . setVisible ( true );
				} catch ( exceção e) {
					e . printStackTrace ();
				}
			}
		});
	}

	/ **
	 * Crie o quadro.
	 * /
	public  TelaVacina () {
		// setExtendedState (Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation ( JFrame . EXIT_ON_CLOSE );
		setBounds ( 100 , 100 , 597 , 382 );
		contentPane =  novo  JPanel ();
		contentPane . setBorder ( novo  EmptyBorder ( 5 , 5 , 5 , 5 ));
		setContentPane (contentPane);
		contentPane . setLayout ( nulo );

		JPanel panelPrincipal =  novo  JPanel ();
		panelPrincipal . setBackground ( nova  cor ( 70 , 130 , 180 ));
		panelPrincipal . setBorder ( novo  MatteBorder ( 10 , 10 , 10 , 10 , ( Color ) new  Color ( 25 , 25 , 112 )));
		panelPrincipal . setBounds ( 0 , 0 , 581 , 343 );
		contentPane . add (panelPrincipal);
		panelPrincipal . setLayout ( nulo );

		JPanel panelCadastrar =  novo  JPanel ();
		panelCadastrar . setBorder ( novo  MatteBorder ( 7 , 7 , 7 , 7 , ( Color ) new  Color ( 25 , 25 , 112 )));
		panelCadastrar . setBackground ( nova  cor ( 192 , 192 , 192 ));
		panelCadastrar . setBounds ( 56 , 53 , 469 , 211 );
		panelPrincipal . adicionar (panelCadastrar);
		panelCadastrar . setLayout ( nulo );

		textFieldNomeVacina =  novo  JTextField ();
		textFieldNomeVacina . setBounds ( 22 , 36 , 212 , 20 );
		panelCadastrar . add (textFieldNomeVacina);
		textFieldNomeVacina . setColumns ( 10 );

		JLabel lblNomeVacina =  novo  JLabel ( " Nome da Vacina " );
		lblNomeVacina . setBounds ( 22 , 22 , 184 , 14 );
		lblNomeVacina . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		panelCadastrar . adicionar (lblNomeVacina);

		JLabel lblPaisOrigem =  new  JLabel ( " Pa \ u 00ED de Origem " );
		lblPaisOrigem . setBounds ( 252 , 22 , 195 , 14 );
		lblPaisOrigem . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		panelCadastrar . adicionar (lblPaisOrigem);

		textFieldPaisOrigem =  novo  JTextField ();
		textFieldPaisOrigem . setBounds ( 252 , 36 , 195 , 20 );
		textFieldPaisOrigem . setColumns ( 10 );
		panelCadastrar . add (textFieldPaisOrigem);

		JLabel lblCodigoPesquisador =  new  JLabel ( " C \ u 00F3digo do Pesquisador " );
		lblCodigoPesquisador . setBounds ( 252 , 112 , 195 , 14 );
		lblCodigoPesquisador . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		panelCadastrar . adicionar (lblCodigoPesquisador);

		textFieldCodigoPesquisador =  novo  JTextField ();
		textFieldCodigoPesquisador . setBounds ( 252 , 126 , 195 , 20 );
		textFieldCodigoPesquisador . setColumns ( 10 );
		panelCadastrar . add (textFieldCodigoPesquisador);

		JLabel lblDataInicioPesquisa =  novo  JLabel ( " Dados do In \ u 00EDcio da Pesquisa " );
		lblDataInicioPesquisa . setBounds ( 252 , 67 , 195 , 14 );
		lblDataInicioPesquisa . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		panelCadastrar . adicionar (lblDataInicioPesquisa);

		textFieldDataInicioPesquisa =  novo  JTextField ();
		textFieldDataInicioPesquisa . setBounds ( 252 , 81 , 195 , 20 );
		textFieldDataInicioPesquisa . setColumns ( 10 );
		panelCadastrar . add (textFieldDataInicioPesquisa);

		JComboBox comboBoxEstagio =  novo  JComboBox ();
		comboBoxEstagio . setBounds ( 22 , 125 , 164 , 22 );
		comboBoxEstagio . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		comboBoxEstagio . setModel ( novo  DefaultComboBoxModel (
				nova  String [] { " EST \ u 00C1GIO " , " INICIAL " , " TESTES " , " APLICA \ u 00C7 \ u 00C3O EM MASSA " }));
		panelCadastrar . add (comboBoxEstagio);

		JComboBox comboBoxFase =  novo  JComboBox ();
		comboBoxFase . setBounds ( 22 , 165 , 164 , 22 );
		comboBoxFase . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		comboBoxFase . setModel ( novo  DefaultComboBoxModel (
				nova  String [] { " FASE " , " PESQUISADOR " , " VOLUNT \ u 00C1RIO " , " P \ u 00DABLICO EM GERAL " }));
		panelCadastrar . add (comboBoxFase);

		JRadioButton btnRadioButtonAtiva =  novo  JRadioButton ( " Ativa " );
		btnRadioButtonAtiva . setBounds ( 21 , 80 , 70 , 23 );
		buttonGroup . adicionar (btnRadioButtonAtiva);
		btnRadioButtonAtiva . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		btnRadioButtonAtiva . setBackground ( nova  cor ( 192 , 192 , 192 ));
		panelCadastrar . adicionar (btnRadioButtonAtiva);

		JRadioButton btnRadioButtonInativa =  novo  JRadioButton ( " Inativa " );
		btnRadioButtonInativa . setBounds ( 123 , 80 , 83 , 23 );
		buttonGroup . add (btnRadioButtonInativa);
		btnRadioButtonInativa . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		btnRadioButtonInativa . setBackground ( nova  cor ( 192 , 192 , 192 ));
		panelCadastrar . add (btnRadioButtonInativa);

		JLabel lblNumeroDoses =  novo  JLabel ( " N \ u 00FAmero de Doses " );
		lblNumeroDoses . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		lblNumeroDoses . setHorizontalAlignment ( SwingConstants . RIGHT );
		lblNumeroDoses . setBounds ( 252 , 169 , 132 , 14 );
		panelCadastrar . adicionar (lblNumeroDoses);

		JSpinner spinnerDoses =  novo  JSpinner ();
		spinnerDoses . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		spinnerDoses . setBounds ( 394 , 166 , 42 , 20 );
		panelCadastrar . adicionar (spinnerDoses);

		JButton btnCadastrar =  novo  JButton ( " Cadastrar " );
		btnCadastrar . addActionListener ( new  ActionListener () {
			public  void  actionPerformed ( ActionEvent  e ) {

				final  String titulo =  " ATENÇÃO " ;
				DateTimeFormatter dataFormatter =  DateTimeFormatter . ofPattern ( " dd / MM / aaaa " );
				VacinaVO vacina =  novo  VacinaVO ();
				VacinaController vacinaController =  novo  VacinaController ();

				if ( ! Utils . stringValida (textFieldNomeVacina . getText ())
						||  ! Utils . stringValida (textFieldPaisOrigem . getText ())						 						
						|| comboBoxEstagio . getSelectedIndex () ==  0 
						|| comboBoxFase . getSelectedIndex () ==  0
						||  ! btnRadioButtonAtiva . é selecionado()
						&&  ! btnRadioButtonInativa . é selecionado()) {
					JOptionPane . showMessageDialog ( null , " Favor verificar CAMPOS SEM PREENCHIMENTO " , titulo,
							JOptionPane . WARNING_MESSAGE , nulo );
				} else  if (textFieldDataInicioPesquisa . getText () . isEmpty ()
						||  ! Utils . dataValida ( LocalDate . parse (textFieldDataInicioPesquisa . getText (), dataFormatter))) {
					JOptionPane . showMessageDialog ( null , " Favor verificar a DATA informada " , titulo,
							JOptionPane . WARNING_MESSAGE , nulo );					
					
				} else  if (spinnerDoses . getComponentCount () <=  0 ) {
					JOptionPane . showMessageDialog ( null , " Favor verificar a QUANTIDADE DE DOSES informada " , titulo,
							JOptionPane . WARNING_MESSAGE , nulo );					
					
				} else {
					vacina . setNomeVacina (textFieldNomeVacina . getText ());
					vacina . setQuantidadeDoses (spinnerDoses . getComponentCount ());
					vacina . setPaisOrigem (textFieldPaisOrigem . getText ());
					vacina . setFaseVacina (comboBoxFase . getSelectedItem () . toString ());
					vacina . setEstagioPesquisa (comboBoxEstagio . getSelectedItem () . toString ());
					LocalDate dataPesquisa =  LocalDate . parse (textFieldDataInicioPesquisa . getText (), dataFormatter);
					vacina . setDataInicioPesquisa (dataPesquisa);

					if (btnRadioButtonAtiva . isSelected ()) {
						vacina . setSituacao ( Constantes . STATUS_VACINA_ATIVO );

					} else {
						vacina . setSituacao ( Constantes . STATUS_VACINA_INATIVO );
					}

					// DADOS DO PESQUISADOR
					int idPesquisador = trataDadosPesquisador ();
					vacina . setidPessoaResponsavel (idPesquisador);

					String retorno = vacinaController . cadastraVacina (vacina);
					JOptionPane . showMessageDialog ( nulo , retorno, " MENU VACINA " , JOptionPane . INFORMATION_MESSAGE , nulo );

				}

			}
		});

		btnCadastrar . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		btnCadastrar . setBounds ( 400 , 290 , 125 , 23 );
		panelPrincipal . adicionar (btnCadastrar);

		JButton btnLimpar =  novo  JButton ( " Limpar " );
		btnLimpar . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		btnLimpar . setBounds ( 232 , 290 , 125 , 23 );
		panelPrincipal . adicionar (btnLimpar);

		JButton btnVoltar =  novo  JButton ( " Voltar " );
		btnVoltar . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 11 ));
		btnVoltar . setBounds ( 58 , 290 , 125 , 23 );
		panelPrincipal . adicionar (btnVoltar);

		JLabel lblTitulo =  novo  JLabel ( " VACINAS " );
		lblTitulo . setFont ( nova  fonte ( " Tahoma " , Font . BOLD , 16 ));
		lblTitulo . setForeground ( nova  cor ( 25 , 25 , 112 ));
		lblTitulo . setBounds ( 56 , 19 , 104 , 32 );
		panelPrincipal . add (lblTitulo);
	}

	private  static  int  trataDadosPesquisador () {
		PessoaVO pessoaVO =  novo  PessoaVO ();
		PessoaController pessoaController =  novo  PessoaController ();

		pessoaVO . setNome ( JOptionPane . showInputDialog ( null , " Digite o nome do pesquisador " , " MENU VACINA " ,
				JOptionPane . QUESTION_MESSAGE ));
		pessoaVO . setCpf ( JOptionPane . showInputDialog ( null , " Digite o cpf do pesquisador " , " MENU VACINA " ,
				JOptionPane . QUESTION_MESSAGE ));
		int idPesquisador = pessoaController . buscaPorNomeECpf (pessoaVO);

		if (idPesquisador ! =  0 ) {
			JOptionPane . showMessageDialog ( null , " código ID do pesquisador: "  + idPesquisador, null ,
					JOptionPane . INFORMAÇÕES_MESSAGE );
			return idPesquisador;

		} else {
			JOptionPane . showMessageDialog ( null , " Pesquisador ainda não cadastrado! Favor cadastrar! " , " MENU VACINA " ,
					JOptionPane . WARNING_MESSAGE );
			PessoaView pessoaView =  novo  PessoaView ();
			int retorno = pessoaView . cadastraPessoa (pessoaVO);
			JOptionPane . showMessageDialog ( null , " código ID do pesquisador: "  + retorno, " MENU VACINA " ,
					JOptionPane . INFORMAÇÕES_MESSAGE );
			return retorno;
		}
	}
}