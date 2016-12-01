

(function (globals) {

  var django = globals.django || (globals.django = {});

  
  django.pluralidx = function (n) {
    var v=(n != 1);
    if (typeof(v) == 'boolean') {
      return v ? 1 : 0;
    } else {
      return v;
    }
  };
  

  
  /* gettext library */

  django.catalog = {
    "%(item)s:": "%(item)s:",
    "%s - %s of %s %s": "%s - %s de %s %s",
    "1 Course in Cart": "1 curso no carrinho",
    "<b>%(num_assessments)s</b> questions, No time limit": "<b>%(num_assessments)s</b> perguntas, sem limite de tempo",
    "<b>Tip:</b> Instructors can't take their own quizzes.": "<b>Dica:</b> os instrutores n\u00e3o podem responder a seus pr\u00f3prios question\u00e1rios.",
    "<b>{{code}}</b> are expired, and have been removed.": "Os c\u00f3digos <b>{{code}}</b> expiraram e foram removidos.",
    "<b>{{code}}</b> are invalid, and have been removed.": "Os c\u00f3digos <b>{{code}}</b> s\u00e3o inv\u00e1lidos e foram removidos.",
    "<b>{{code}}</b> are sold out, and have been removed.": "Os c\u00f3digos <b>{{code}}</b> est\u00e3o esgotados e foram removidos.",
    "<b>{{code}}</b> is expired, and has been removed.": "O c\u00f3digo <b>{{code}}</b> expirou e foi removido.",
    "<b>{{code}}</b> is invalid, and has been removed.": "O c\u00f3digo <b>{{code}}</b> \u00e9 inv\u00e1lido e foi removido.",
    "<b>{{code}}</b> is sold out, and has been removed.": "O c\u00f3digo <b>{{code}}</b> est\u00e1 esgotado e foi removido.",
    "<b>{{couponCode}}</b> has expired": "O c\u00f3digo de cupom <b>{{couponCode}}</b> expirou",
    "<b>{{couponCode}}</b> has sold out": "O c\u00f3digo de cupom <b>{{couponCode}}</b> est\u00e1 esgotado",
    "<b>{{couponCode}}</b> is applied": "O c\u00f3digo de cupom <b>{{couponCode}}</b> foi aplicado",
    "<b>{{couponCode}}</b> is not applied": "O c\u00f3digo de cupom <b>{{couponCode}}</b> n\u00e3o foi aplicado",
    "<b>{{couponCode}}</b> is not valid": "O c\u00f3digo de cupom <b>{{couponCode}}</b> n\u00e3o \u00e9 v\u00e1lido",
    "AMEX cards use a 4-digit security code. Please enter the code marked CVV on front of the card": "Os cart\u00f5es AMEX usam um c\u00f3digo de seguran\u00e7a de 4 d\u00edgitos. Digite o c\u00f3digo CVV localizado na frente do cart\u00e3o",
    "Accept": "Aceitar",
    "Actions": "A\u00e7\u00f5es",
    "Add": "Adicionar",
    "Add %(type)s": "Adicionar %(type)s",
    "Add Captions": "Adicionar legendas",
    "Add Content": "Adicionar conte\u00fado",
    "Add Description": "Adicionar descri\u00e7\u00e3o",
    "Add Questions": "Adicionar perguntas",
    "Add Resources": "Adicionar recursos",
    "Add an answer.": "Adicione uma resposta.",
    "All Messages": "Todas as Mensagens",
    "An unknown error occurred": "Ocorreu um erro desconhecido",
    "An unknown error occurred.": "Ocorreu um erro desconhecido.",
    "Apartment/Unit Number": "N\u00famero do apartamento/da unidade",
    "Apartment/Unit Number, Building Number, Street Name": "N\u00famero do apartamento/da unidade, n\u00famero do edif\u00edcio, endere\u00e7o",
    "Apply": "Aplicar",
    "Apply Coupon Code": "Aplicar c\u00f3digo de cupom",
    "Approve": "Aprovar",
    "Are you sure that you want to delete this card?": "Tem certeza de que deseja excluir este cart\u00e3o?",
    "Are you sure you want to cancel this invitation?": "Tem certeza de que deseja cancelar este convite?",
    "Are you sure you want to delete this category?": "Tem certeza de que deseja excluir esta categoria?",
    "Are you sure you want to delete this group (Users will not be deleted)?": "Tem certeza de que deseja excluir este grupo (os usu\u00e1rios n\u00e3o ser\u00e3o exclu\u00eddos)?",
    "Are you sure you want to delete this message thread?": "Voc\u00ea tem certeza de que deseja excluir o t\u00f3pico desta mensagem?",
    "Are you sure you want to remove the following Educational Announcement: ": "Tem certeza de que deseja remover o seguinte An\u00fancio Educacional: ",
    "Are you sure you want to remove this user?": "Tem certeza de que deseja remover este usu\u00e1rio?",
    "Are you sure you want to unlist this course?": "Tem certeza de que deseja cancelar a listagem deste curso?",
    "Article": "Artigo",
    "As Instructor": "Como Instrutor",
    "As Student": "Como Aluno",
    "Assign to": "Atribuir a",
    "At least one instructor must be visible.": "Pelo menos um instrutor deve estar vis\u00edvel.",
    "Audio": "\u00c1udio",
    "Back": "Voltar",
    "Based on Your Enrollments": "Baseado em Suas Matr\u00edculas",
    "Because of your recent wishlist, {{title}}": "Devido a sua lista de desejos recente, {{title}}",
    "Because you added {{title}}": "Porque voc\u00ea adicionou {{title}}",
    "Because you enrolled in {{title}}": "Porque voc\u00ea se inscreveu em {{title}}",
    "Best Sellers in {{title}}": "Mais vendidos em {{title}}",
    "Broken": "Interrompido",
    "Building Name": "Nome do edif\u00edcio",
    "Buy Licenses": "Comprar licen\u00e7as",
    "By declining below,": "Ao recusar as condi\u00e7\u00f5es abaixo,",
    "By declining below, you will no longer be able to access your account including your courses. No refunds will be issued for courses you\u2019ve purchased.": "Ao recusar as condi\u00e7\u00f5es abaixo, voc\u00ea n\u00e3o poder\u00e1 mais acessar sua conta, inclusive seus cursos. Nenhum reembolso ser\u00e1 emitido pelos cursos que voc\u00ea comprou.",
    "CPF Number": "N\u00famero do CPF",
    "CSS Modules": "M\u00f3dulos CSS",
    "CURP Code": "C\u00f3digo CURP",
    "Can Edit": "Pode editar",
    "Cancel": "Cancelar",
    "Cancel Invitation": "Cancelar convite",
    "Captions": "Legendas",
    "Categories": "Categorias",
    "Change": "Alterar",
    "Checkout with": "Finalizar compra com",
    "Checkout with PayPal": "Finalizar compra com PayPal",
    "Civic Number": "N\u00famero da resid\u00eancia",
    "Class Average": "M\u00e9dia da classe",
    "Click the green bar if you want<br>to see the promos again": "Clique na barra verde caso queira<br>visualizar as promo\u00e7\u00f5es novamente",
    "Coding Exercise": "Exerc\u00edcio de Codifica\u00e7\u00e3o",
    "Coding Exercise %(quiz_index)s": "Exerc\u00edcio de codifica\u00e7\u00e3o %(quiz_index)s",
    "Collapse All Sections": "Recolher todas as se\u00e7\u00f5es",
    "Complete Payment": "Finalizar o pagamento",
    "Compose": "Compor",
    "Content Subscription": "Assinatura de conte\u00fado",
    "Continue": "Continuar",
    "Convert To Video": "Converter em v\u00eddeo",
    "Copy": "Copiar",
    "Copy to your clipboard": "Copiar para a \u00e1rea de transfer\u00eancia",
    "Correct": "Correto",
    "Correct answer cannot be empty!": "A resposta correta n\u00e3o pode estar vazia!",
    "County": "Condado",
    "Course": "Curso",
    "Course Average": "M\u00e9dia do curso",
    "Course Publishing Requests": "Solicita\u00e7\u00f5es de publica\u00e7\u00e3o de curso",
    "Course added to your wishlist successfully": "O curso foi adicionado \u00e0 sua Lista de Desejos com sucesso",
    "Courses": "Cursos",
    "Crop Image": "Cortar imagem",
    "DNI Number": "N\u00famero do RG",
    "Date of Birth": "Data de nascimento",
    "Delete": "Excluir",
    "Delete Your Account": "Excluir Sua Conta",
    "Did you mean %s?": "Voc\u00ea quis dizer  %s?",
    "Discover More Courses": "Descobrir mais cursos",
    "Download group users.csv": "Fazer download de group users.csv",
    "Download invitations.csv": "Fazer download de invitations.csv",
    "Download this lecture": "Fazer download desta aula",
    "Download users.csv": "Fazer download de users.csv",
    "Downloadable Resources": "Recursos para download",
    "Downloadable materials": "Materiais para download",
    "Downloadable:": "Dispon\u00edvel para download:",
    "Downlodable materials": "Materiais para download",
    "Ebooks are always downloadable": "Os eBooks est\u00e3o sempre dispon\u00edveis para download",
    "Edit": "Editar",
    "Edit Content": "Editar conte\u00fado",
    "Empty": "Vazio",
    "Enroll Now": "Inscrever-se Agora",
    "Enrolled in one or more of your courses": "Matriculado em um ou mais de seus cursos",
    "Expand All Sections": "Expandir todas as se\u00e7\u00f5es",
    "Explain why this is or isn't the best answer.": "Explique por que esta \u00e9 ou n\u00e3o \u00e9 a melhor resposta.",
    "External Resources": "Recursos externos",
    "Father's Full Name": "Nome completo do pai",
    "File must be image with size < 30 mb.": "O arquivo deve conter uma imagem inferior a 30 MB.",
    "Files and links can be added as resources.": "Arquivos e links podem ser adicionados como recursos.",
    "Fill in the Blanks": "Preencha as lacunas",
    "Finalize": "Finalizar",
    "First Name": "Nome",
    "First Name(s)": "Nome",
    "First Surname": "Primeiro sobrenome",
    "Flat/Apartment/Unit Number": "N\u00famero do flat/do apartamento/da unidade",
    "Follow": "Seguir",
    "Following": "Seguindo",
    "Free": "Gratuito",
    "Free Preview:": "Pr\u00e9via gratuita:",
    "Full Name": "Nome completo",
    "Gender": "Sexo",
    "Given Names": "Nomes",
    "Go to Cart": "Ir para o carrinho",
    "Go to Course": "Ir ao Curso",
    "Got it": "Entendido",
    "Groups": "Grupos",
    "Heads up! We\u2019ve updated our <a href=\"%(termsOfUse)s\">Terms of Use</a>,                                   <a href=\"%(privacyPolicy)s\">Privacy Policy</a> and <a href=\"%(instructorsTermsOfUse)s\">Instructor Terms</a>.                                   <a href=\"%(readMore)s\">Read more here</a>.                                    Your continued use of Udemy confirms that you\u2019ve read, understood and accepted these new terms.": "Fique atento! Atualizamos nossos <a href=\"%(termsOfUse)s\">Termos de uso</a>, nossa <a href=\"%(privacyPolicy)s\">Pol\u00edtica de privacidade</a> e os <a href=\"%(instructorsTermsOfUse)s\">Termos do instrutor</a>. <a href=\"%(readMore)s\">Leia mais aqui</a>. Seu uso cont\u00ednuo da Udemy confirma que voc\u00ea leu, entendeu e aceitou esses novos termos.",
    "House Name": "Nome da casa",
    "House/Building Number": "N\u00famero da casa/do edif\u00edcio",
    "I accept the new terms": "Eu aceito os novos termos",
    "I'm excited to #bingelearn on Udemy! Thousands of courses are on sale to help you learn anything you want.": "Estou animado para a Maratona Udemy! Milhares de cursos est\u00e3o em promo\u00e7\u00e3o para ajudar voc\u00ea a aprender o que quiser.",
    "Image Cropping Failed...": "Falha no corte da imagem...",
    "Image Upload Failed...": "Falha no upload da imagem...",
    "Important": "Importante",
    "Incorrect": "Incorreto",
    "Insert Coupon Code": "Digite o c\u00f3digo do cupom",
    "Instructor Only": "Somente instrutor",
    "Instructor is already added.": "Instrutor j\u00e1 adicionado.",
    "Instructors": "Instrutores",
    "Invitations": "Convites",
    "Invitations:": "Convites:",
    "It will no longer be visible on the course dashboard.": "Ele n\u00e3o ficar\u00e1 mais vis\u00edvel no painel do curso.",
    "Join Date": "Data de registro",
    "Learn about content types.": "Conhe\u00e7a os tipos de conte\u00fado.",
    "Learn more.": "Saiba mais.",
    "Lecture": "Aula",
    "Lecture Description": "Descri\u00e7\u00e3o da Aula",
    "Lecture Materials": "Materiais da aula",
    "Lecture:": "Aula:",
    "Licenses": "Licen\u00e7as",
    "List prices on Udemy will be expanded to %(lowestPrice)s - %(highestPrice)s": "Os pre\u00e7os de tabela na Udemy agora estar\u00e3o entre %(lowestPrice)s e %(highestPrice)s",
    "Load More": "Carregar mais",
    "Load more": "Carregar mais",
    "Make Admin": "Tornar administrador",
    "Mark As Important": "Marcar Como Importante",
    "Mark As Read": "Marcar Como Lido",
    "Mark As Unimportant": "Marcar como N\u00e3o importante",
    "Mark As Unread": "Marcar Como N\u00e3o Lido",
    "Maximum discounts will be increased to 75%": "O desconto m\u00e1ximo aumentar\u00e1 para 75%",
    "Me:": "Eu:",
    "Message": "Mensagem",
    "Messages": "Mensagens",
    "Multiple Choice": "M\u00faltipla Escolha",
    "Multiple Selection": "Sele\u00e7\u00e3o m\u00faltipla",
    "Municipality": "Munic\u00edpio",
    "NEXT LECTURE": "PR\u00d3XIMA AULA",
    "NRIC Number": "N\u00famero do cart\u00e3o de identidade",
    "National ID Number": "N\u00famero de identidade nacional",
    "New Course": "Novo curso",
    "New Course Category": "Nova categoria de cursos",
    "New Knowledge Area name": "Nome da nova \u00e1rea de conhecimento",
    "New Message": "Nova mensagem",
    "New Question": "Nova pergunta",
    "New User Group": "Novo grupo de usu\u00e1rios",
    "New Users": "Novos usu\u00e1rios",
    "New message": "Nova mensagem",
    "New pricing and promotions now in effect": "Novos pre\u00e7os e novas promo\u00e7\u00f5es j\u00e1 em vigor",
    "New recipient": "Novo destinat\u00e1rio",
    "Next Question": "Pr\u00f3xima pergunta",
    "No Knowledge Area": "Nenhuma \u00e1rea de conhecimento",
    "No Licenses": "Sem licen\u00e7as",
    "No new students can enroll in your courses, but existing students will continue to have lifetime access.": "Nenhum novo aluno poder\u00e1 inscrever-se em seus cursos, mas os alunos j\u00e1 existentes continuar\u00e3o tendo acesso vital\u00edcio.",
    "No requests have been made so far": "Nenhuma solicita\u00e7\u00e3o foi feita at\u00e9 agora",
    "No results found.": "N\u00e3o foram encontrados resultados.",
    "Not Set": "N\u00e3o definido",
    "Note: You can add up to 250 quiz questions.": "Nota: voc\u00ea pode adicionar at\u00e9 250 perguntas de question\u00e1rio.",
    "Number of Students": "N\u00famero de alunos",
    "OK": "OK",
    "Offer ends in": "A oferta termina em",
    "Only instructors can see unpublished lectures.": "Somente instrutores podem ver aulas n\u00e3o publicadas.",
    "Oops, something went wrong, please try again.": "Ops! Algo deu errado. Tente novamente.",
    "Oops, something went wrong.": "Oops. Algo deu errado.",
    "Oops, this quiz is locked!": "Opa! Este question\u00e1rio est\u00e1 bloqueado!",
    "Open:": "Abrir:",
    "PAN": "PAN",
    "Pending Invitation": "Convite pendente",
    "Please Confirm": "Confirme",
    "Please add answers.": "Adicione as respostas.",
    "Please choose the best answer.": "Escolha a melhor resposta.",
    "Please enter a valid CPF": "Insira um CPF v\u00e1lido",
    "Please enter a valid card number": "Por favor, insira um n\u00famero v\u00e1lido de cart\u00e3o",
    "Please enter an email address in the following format: instructorname@email.com": "Insira um endere\u00e7o de e-mail no seguinte formato: nomedoinstrutor@email.com",
    "Please keep lengths of answers and explanations within limits and the total count of answers within ": "Por favor, mantenha o tamanho das respostas e das explica\u00e7\u00f5es dentro dos limites, assim como o n\u00famero total de respostas ",
    "Please write a message": "Escreva uma mensagem",
    "Please write a question": "Escreva uma pergunta",
    "Post Code": "C\u00f3digo postal",
    "Postal Code": "CEP",
    "Postal Town/City": "Cidade/munic\u00edpio",
    "Practice Test": "Teste pr\u00e1tico",
    "Prefecture": "Prefeitura",
    "Preparing Image...": "Preparando imagem...",
    "Presentation": "Apresenta\u00e7\u00e3o",
    "Preview": "Visualizar",
    "Preview enabled": "Pr\u00e9via habilitada",
    "Previous Lecture": "Aula anterior",
    "Processing": "Processando",
    "Progress": "Progresso",
    "Province": "Prov\u00edncia",
    "Publish": "Publicar",
    "Publish Practice Test": "Publicar teste pr\u00e1tico",
    "Publish Quiz": "Publicar question\u00e1rio",
    "Question": "Pergunta",
    "Questions": "Perguntas",
    "Questions attached to this practice test will be deleted. Do you want to continue?": "As perguntas vinculadas a este teste pr\u00e1tico ser\u00e3o exclu\u00eddas. Deseja continuar?",
    "Quiz": "Question\u00e1rio",
    "Quiz %(index)s": "Question\u00e1rio %(index)s",
    "Quiz %(quiz_index)s": "Question\u00e1rio %(quiz_index)s",
    "React Codelab": "Codelab do React",
    "Recently Viewed": "Visualizados Recentemente",
    "Recently Wishlisted Courses": "Cursos Adicionados Recentemente \u00c0 Lista de Desejos",
    "Reject": "Rejeitar",
    "Reject Publish Request": "Rejeitar solicita\u00e7\u00e3o de publica\u00e7\u00e3o",
    "Reject Publishing": "Rejeitar publica\u00e7\u00e3o",
    "Remove Admin": "Remover administrador",
    "Remove User": "Remover usu\u00e1rio",
    "Replace With Video": "Substituir por v\u00eddeo",
    "Report Abuse": "Denunciar abuso",
    "Report abuse": "Denunciar abuso",
    "Resend Invitation": "Reenviar convite",
    "Retake Quiz": "Refazer o teste",
    "Revenue shares must sum up to 100%.": "A divis\u00e3o das receitas deve ter a soma at\u00e9 100%.",
    "Review Your Answers": "Revisar suas respostas",
    "Save": "Salvar",
    "Saved For Later": "Salvo Para Mais Tarde",
    "Search": "Pesquisar",
    "Search by name": "Pesquisar por nome",
    "Search courses": "Procurar cursos",
    "Search users": "Procurar usu\u00e1rios",
    "Second Surname": "Segundo sobrenome",
    "Section": "Se\u00e7\u00e3o",
    "Section:": "Se\u00e7\u00e3o:",
    "See Results": "Ver resultados",
    "Select a message thread to read it here.": "Escolha um t\u00f3pico de mensagem para l\u00ea-la aqui.",
    "Select content type": "Selecionar tipo de conte\u00fado",
    "Select question type": "Selecionar tipo de pergunta",
    "Select the main type of content.": "Selecione o tipo principal do conte\u00fado.",
    "Send": "Enviar",
    "Send a Message": "Enviar uma mensagem",
    "Skipped": "Ignorado",
    "Sorry, the course {{title}} is not included in this promotion.": "Desculpe, mas o curso {{title}} n\u00e3o est\u00e1 incluso nesta promo\u00e7\u00e3o.",
    "Sorry, your shopping cart is temporarily unavailable.": "Infelizmente, seu carrinho de compras est\u00e1 temporariamente indispon\u00edvel.",
    "Sort": "Classificar",
    "Source Code": "C\u00f3digo Fonte",
    "Start Coding Exercise": "Iniciar exerc\u00edcio de codifica\u00e7\u00e3o",
    "Start Quiz": "Iniciar o teste",
    "Starting on August 22, 2016, we will be updating our Pricing and Promotions Policy.": "A partir de 22 de agosto de 2016, atualizaremos nossa Pol\u00edtica de pre\u00e7os e promo\u00e7\u00f5es.",
    "State of Birth": "Estado natal",
    "State/Province": "Estado",
    "Still working on it...": "Ainda estamos trabalhando nisso...",
    "Street Name": "Nome da rua",
    "Students taking this course": "Alunos fazendo este curso",
    "Submit": "Enviar",
    "Suburb": "Bairro",
    "Support": "Suporte",
    "Surname": "Sobrenome",
    "Surname(s)": "Sobrenome(s)",
    "Thank you for accepting our revised terms.": "Obrigado por aceitar nossos termos revisados.",
    "The content of this lecture will be added as a downloadable resource, which you may choose to remove. You will be prompted to add a video file and re-publish as a video lecture.": "O conte\u00fado desta aula ser\u00e1 adicionado como recurso dispon\u00edvel para download, e voc\u00ea pode optar por remov\u00ea-lo. Ser\u00e1 solicitado que voc\u00ea adicione um arquivo de v\u00eddeo e republique-o como aula em v\u00eddeo.",
    "The content of this lecture will be deleted, but the description and any downloadable resources will remain. You will be prompted to add a video file and re-publish as a video lecture.": "O conte\u00fado desta aula ser\u00e1 exclu\u00eddo, mas sua descri\u00e7\u00e3o e quaisquer recursos para download permanecer\u00e3o. Ser\u00e1 solicitado que voc\u00ea adicione um arquivo de v\u00eddeo e republique-o como aula em v\u00eddeo.",
    "The coupon code entered has already been used.": "O c\u00f3digo de cupom inserido j\u00e1 foi usado.",
    "The instructor is still working on this quiz.": "O instrutor ainda est\u00e1 trabalhando neste question\u00e1rio.",
    "The maximum number of curriculum items has been reached.": "O n\u00famero m\u00e1ximo de itens da grade curricular foi atingido.",
    "The maximum number of questions has been reached.": "O n\u00famero m\u00e1ximo de perguntas foi atingido.",
    "The removal of your account cannot be undone. Please be sure before you confirm.": "N\u00e3o ser\u00e1 poss\u00edvel desfazer a remo\u00e7\u00e3o de sua conta. Tenha certeza antes de confirmar.",
    "There are no available downloads for this lecture.": "N\u00e3o h\u00e1 downloads dispon\u00edveis para esta aula.",
    "There has been a problem communicating with backend.": "Ocorreu um problema de comunica\u00e7\u00e3o com o back-end.",
    "There is an issue with your file preventing successful processing.": "H\u00e1 um problema com seu arquivo impedindo que o processamento seja bem-sucedido.",
    "This email address is not valid for a user on Udemy.": "Este endere\u00e7o de e-mail n\u00e3o \u00e9 v\u00e1lido para um usu\u00e1rio da Udemy.",
    "This is an example of using CSS Modules.": "Este \u00e9 um exemplo de uso de m\u00f3dulos CSS.",
    "This is some other HTML that uses a BEM-based, global CSS class name.": "Este \u00e9 outro HTML que usa um nome de classe CSS global com base na metodologia BEM.",
    "This lecture is still being processed. We will send you an email when it is ready.": "Esta aula ainda est\u00e1 sendo processada. Enviaremos um e-mail a voc\u00ea quando ela estiver pronta.",
    "This presentation is still being processed. We will send you an email when it is ready.": "Esta apresenta\u00e7\u00e3o ainda est\u00e1 sendo processada. Enviaremos um e-mail a voc\u00ea quando ela estiver pronta.",
    "This video is still being processed. We will send you an email when it is ready.": "Este v\u00eddeo ainda est\u00e1 sendo processado. Enviaremos um e-mail a voc\u00ea quando ele estiver pronto.",
    "This will help us maximize your revenue while growing our student base. <a href=\"%(learnMoreLink)s\" target=\"_blank\">Learn more</a>.": "Isso nos ajudar\u00e1 a maximizar sua receita enquanto ampliamos nossa base de alunos. <a href=\"%(learnMoreLink)s\" target=\"_blank\">Saiba mais</a>.",
    "This will permanently delete this knowledge area. Are you sure you want to continue?": "Isso excluir\u00e1 esta \u00e1rea de conhecimento permanentemente. Tem certeza de que deseja continuar?",
    "Tip: For technical issues related to the Udemy site &amp; mobile app or questions about \n                    refunds, please contact %s.": "Dica: em caso de problemas t\u00e9cnicos relacionados ao site e ao aplicativo m\u00f3vel da Udemy ou para esclarecer d\u00favidas sobre reembolso, \nentre em contato com %s.",
    "Tip: For technical issues related to the Udemy site &amp; mobile app, please contact %s.": "Dica: em caso de problemas t\u00e9cnicos relacionados ao site e ao aplicativo m\u00f3vel da Udemy, entre em contato com %s.",
    "Title": "T\u00edtulo",
    "To unlock this quiz, you need to complete previous lectures and quizzes!": "Para desbloquear este question\u00e1rio, ser\u00e1 necess\u00e1rio concluir os question\u00e1rios e as aulas anteriores!",
    "Town/City": "Cidade",
    "Trust & Safety Alert": "Alerta de Seguran\u00e7a e Confian\u00e7a",
    "Type a user's name": "Digite um nome de usu\u00e1rio",
    "Type your message...": "Digite sua mensagem...",
    "Udemy for Business": "Udemy Para Empresas",
    "Udemy\u2019s new pricing and promotions are in effect. <a href=\"%(learnMoreLink)s\" target=\"_blank\">Learn more</a>.": "Os novos pre\u00e7os e as novas promo\u00e7\u00f5es da Udemy j\u00e1 est\u00e3o em vigor. <a href=\"%(learnMoreLink)s\" target=\"_blank\">Saiba mais</a>.",
    "Unavailable": "Indispon\u00edvel",
    "Unlimited licenses": "Licen\u00e7as ilimitadas",
    "Unlist Course": "Cancelar listagem do curso",
    "Unpublish": "Cancelar a publica\u00e7\u00e3o",
    "Unpublish Practice Test": "Cancelar publica\u00e7\u00e3o de teste pr\u00e1tico",
    "Unpublish Quiz": "Cancelar publica\u00e7\u00e3o do question\u00e1rio",
    "Unpublished %(item)s:": "%(item)s n\u00e3o publicados:",
    "Unpublished Coding Exercise": "Exerc\u00edcio de codifica\u00e7\u00e3o n\u00e3o publicado",
    "Unpublished Lecture": "Aula n\u00e3o publicada",
    "Unpublished Lecture:": "Aula n\u00e3o publicada",
    "Unpublished Practice Test": "Teste pr\u00e1tico n\u00e3o publicado",
    "Unpublished Quiz": "Question\u00e1rio n\u00e3o publicado",
    "Unpublished Section": "Se\u00e7\u00e3o N\u00e3o Publicada",
    "Unpublished Section:": "Se\u00e7\u00e3o n\u00e3o publicada:",
    "Unread": "N\u00e3o lida",
    "Update": "Atualizar",
    "Update Credit Card": "Atualizar cart\u00e3o de cr\u00e9dito",
    "Update prices": "Atualizar pre\u00e7os",
    "Update this lecture to video?": "Atualizar esta aula para v\u00eddeo?",
    "Updated pricing and promotions begin in %(daysUntilRevisitRelease)s Day(s)": "As promo\u00e7\u00f5es e os pre\u00e7os atualizados come\u00e7am em %(daysUntilRevisitRelease)s dia(s)",
    "Uploaded.": "Upload conclu\u00eddo.",
    "Use this presentation": "Usar esta apresenta\u00e7\u00e3o",
    "Use this video": "Usar este v\u00eddeo",
    "User": "Usu\u00e1rio",
    "User has archived course.": "O usu\u00e1rio arquivou o curso.",
    "Users": "Usu\u00e1rios",
    "Users:": "Usu\u00e1rios:",
    "Video": "V\u00eddeo",
    "Video & Slide Mashup": "Mashup de v\u00eddeo e slides",
    "View Questions": "Exibir perguntas",
    "View Results": "Ver resultados",
    "View Your Results": "Exibir seus resultados",
    "View external resources": "Visualizar recursos externos",
    "Visible": "Vis\u00edvel",
    "WARNING: By declining our terms, your account will be removed. This is irreversible.": "AVISO: ao recusar nossos termos, sua conta ser\u00e1 removida. Isso \u00e9 irrevers\u00edvel.",
    "We are committed to evolving our marketplace to best serve students and you, our instructors.": "Temos o compromisso de evoluir nosso marketplace para atender melhor a nossos alunos e instrutores.",
    "We couldn't add this item.": "N\u00e3o foi poss\u00edvel adicionar este item.",
    "We have revised our terms": "Revisamos nossos termos",
    "We will be starting a Fixed Price Promotions program": "Iniciaremos um programa de Promo\u00e7\u00f5es de pre\u00e7o fixo",
    "Wishlist": "Lista de desejos",
    "YOU": "VOC\u00ca",
    "YOUR CLASS": "SUA CLASSE",
    "You Might Also Like": "Pode Ser Que Voc\u00ea Tamb\u00e9m Goste De",
    "You are about to remove a ": "Voc\u00ea est\u00e1 prestes a remover um(a) ",
    "You are about to remove a caption file. Are you sure you want to continue?": "Voc\u00ea est\u00e1 prestes a remover um arquivo de legenda. Tem certeza de que deseja continuar?",
    "You are about to remove a curriculum item. Are you sure you want to continue?": "Voc\u00ea est\u00e1 prestes a remover um item de grade curricular. Tem certeza de que deseja continuar?",
    "You are about to remove a question. Are you sure you want to continue?": "Voc\u00ea est\u00e1 prestes a remover uma pergunta. Tem certeza de que deseja continuar?",
    "You are about to remove a resource. Are you sure you want to continue?": "Voc\u00ea est\u00e1 prestes a remover um recurso. Tem certeza de que deseja continuar?",
    "You are temporarily blocked from sending new messages to students in\n                some or all of your courses due to a policy violation. If you have questions,\n                please contact us at <a href=\"mailto:policy@udemy.com\">policy@udemy.com</a>.": "Voc\u00ea est\u00e1 temporariamente impedido de enviar novas mensagens aos alunos em\n alguns de seus cursos ou em todos eles devido \u00e0 viola\u00e7\u00e3o de uma pol\u00edtica. Em caso de d\u00favidas,\n entre em contato conosco pelo e-mail <a href=\"mailto:policy@udemy.com\">policy@udemy.com</a>.",
    "You have %s unread message.": [
      "Voc\u00ea tem %s mensagem n\u00e3o lida.",
      "Voc\u00ea tem %s mensagens n\u00e3o lidas."
    ],
    "You have no messages.": "Voc\u00ea n\u00e3o tem mensagens.",
    "You haven't added any courses to your wishlist.": "Voc\u00ea n\u00e3o adicionou nenhum curso \u00e0 sua lista de desejos.",
    "You haven't saved any courses for later.": "Voc\u00ea n\u00e3o salvou nenhum curso para mais tarde.",
    "You will no longer be able to access your account including your courses. No refunds will be issued for courses you\u2019ve purchased.": "Voc\u00ea n\u00e3o poder\u00e1 mais acessar sua conta, inclusive seus cursos. Nenhum reembolso ser\u00e1 emitido pelos cursos que voc\u00ea comprou.",
    "You will not be able to retrieve your course files. Courses files that were never published will be deleted.": "Voc\u00ea n\u00e3o poder\u00e1 recuperar os arquivos de seus cursos. Os arquivos dos cursos que nunca foram publicados ser\u00e3o exclu\u00eddos.",
    "Your Score": "Sua pontua\u00e7\u00e3o",
    "Your cart is empty.": "Seu carrinho est\u00e1 vazio.",
    "Your cart is empty. Keep shopping to find a course!": "Seu carrinho est\u00e1 vazio. Continue comprando para encontrar um curso!",
    "Your changes have been successfully saved.": "Suas altera\u00e7\u00f5es foram salvas com sucesso.",
    "Your courses will be automatically unpublished from the marketplace.": "A publica\u00e7\u00e3o de seus cursos ser\u00e1 automaticamente cancelada no marketplace.",
    "Your courses will be automatically unpublished.": "A publica\u00e7\u00e3o de seus cursos ser\u00e1 automaticamente cancelada.",
    "Your courses will be removed from Udemy for Business 6 months from today, as set forth in the terms you previously agreed to.": "Seus cursos ser\u00e3o removidos da Udemy for Business daqui a 6 meses, conforme estabelecido nos termos com os quais voc\u00ea concordou.",
    "Your courses will be removed from Udemy\u2019s search, recommendations, and promotions.": "Seus cursos ser\u00e3o removidos da pesquisa, das recomenda\u00e7\u00f5es e das promo\u00e7\u00f5es da Udemy.",
    "Your message has not been sent. Are you sure you want to discard it?": "Sua mensagem n\u00e3o foi enviada. Voc\u00ea tem certeza de que deseja descart\u00e1-la?",
    "Your photo has been uploaded...": "Sua foto foi carregada...",
    "ZIP Code": "CEP",
    "admin": "administrador",
    "back": "voltar",
    "days": "dias",
    "e.g. Python": "ex.: Python",
    "hours": "horas",
    "invalid": "inv\u00e1lido",
    "items": "itens",
    "minutes": "minutos",
    "more": "mais",
    "or review <a href=\"%(href)s\" class=\"ext\" target=\"_blank\">Lecture %(index)s: %(lecture)s</a>": "ou revisar <a href=\"%(href)s\" class=\"ext\" target=\"_blank\">aula %(index)s: %(lecture)s</a>",
    "owner": "propriet\u00e1rio",
    "seconds": "segundos",
    "{{number}} Courses in Cart": "{{number}} cursos no carrinho"
  };

  django.gettext = function (msgid) {
    var value = django.catalog[msgid];
    if (typeof(value) == 'undefined') {
      return msgid;
    } else {
      return (typeof(value) == 'string') ? value : value[0];
    }
  };

  django.ngettext = function (singular, plural, count) {
    var value = django.catalog[singular];
    if (typeof(value) == 'undefined') {
      return (count == 1) ? singular : plural;
    } else {
      return value[django.pluralidx(count)];
    }
  };

  django.gettext_noop = function (msgid) { return msgid; };

  django.pgettext = function (context, msgid) {
    var value = django.gettext(context + '\x04' + msgid);
    if (value.indexOf('\x04') != -1) {
      value = msgid;
    }
    return value;
  };

  django.npgettext = function (context, singular, plural, count) {
    var value = django.ngettext(context + '\x04' + singular, context + '\x04' + plural, count);
    if (value.indexOf('\x04') != -1) {
      value = django.ngettext(singular, plural, count);
    }
    return value;
  };
  

  django.interpolate = function (fmt, obj, named) {
    if (named) {
      return fmt.replace(/%\(\w+\)s/g, function(match){return String(obj[match.slice(2,-2)])});
    } else {
      return fmt.replace(/%s/g, function(match){return String(obj.shift())});
    }
  };


  /* formatting library */

  django.formats = {
    "DATETIME_FORMAT": "j \\d\\e F \\d\\e Y \u00e0\\s H:i",
    "DATETIME_INPUT_FORMATS": [
      "%d/%m/%Y %H:%M:%S",
      "%d/%m/%Y %H:%M:%S.%f",
      "%d/%m/%Y %H:%M",
      "%d/%m/%Y",
      "%d/%m/%y %H:%M:%S",
      "%d/%m/%y %H:%M:%S.%f",
      "%d/%m/%y %H:%M",
      "%d/%m/%y",
      "%Y-%m-%d %H:%M:%S",
      "%Y-%m-%d %H:%M:%S.%f",
      "%Y-%m-%d %H:%M",
      "%Y-%m-%d"
    ],
    "DATE_FORMAT": "j \\d\\e F \\d\\e Y",
    "DATE_INPUT_FORMATS": [
      "%d/%m/%Y",
      "%d/%m/%y",
      "%Y-%m-%d"
    ],
    "DECIMAL_SEPARATOR": ",",
    "FIRST_DAY_OF_WEEK": "0",
    "MONTH_DAY_FORMAT": "j \\d\\e F",
    "NUMBER_GROUPING": "3",
    "SHORT_DATETIME_FORMAT": "d/m/Y H:i",
    "SHORT_DATE_FORMAT": "d/m/Y",
    "THOUSAND_SEPARATOR": ".",
    "TIME_FORMAT": "H:i",
    "TIME_INPUT_FORMATS": [
      "%H:%M:%S",
      "%H:%M:%S.%f",
      "%H:%M"
    ],
    "YEAR_MONTH_FORMAT": "F \\d\\e Y"
  };

  django.get_format = function (format_type) {
    var value = django.formats[format_type];
    if (typeof(value) == 'undefined') {
      return format_type;
    } else {
      return value;
    }
  };

  /* add to global namespace */
  globals.pluralidx = django.pluralidx;
  globals.gettext = django.gettext;
  globals.ngettext = django.ngettext;
  globals.gettext_noop = django.gettext_noop;
  globals.pgettext = django.pgettext;
  globals.npgettext = django.npgettext;
  globals.interpolate = django.interpolate;
  globals.get_format = django.get_format;

}(this));

