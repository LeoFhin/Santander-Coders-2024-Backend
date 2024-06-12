# Redes e Sistemas

O que é?

Redes são um conjunto de dois ou mais dispositivos eletrônicos conectados entre si que trocam informações por meio de uma linguagem pré-estabelecida chamada protocolo.

Essa conexão pode ocorrer de duas formas:

**Conexão Física: Utiliza cabos para transmitir dados.**

- cabos de Par Trançado
- Cabos Coaxiais
-Fibra Óptica

**Conexão Sem Fio (Wireless): Utiliza ondas de rádio ou outras tecnologias para transmitir dados.**

- Rádio Frequência
- Bluetooth
- Infravermelho
- Essas conexões permitem que os dispositivos compartilhem informações, recursos e serviços, tornando a comunicação e a colaboração mais eficientes.

# História

A origem das redes de computadores está ligada à Guerra Fria, quando, em 1969, o Departamento de Defesa dos EUA criou a ARPANET para melhorar a comunicação e a troca de informações entre universidades e instituições de pesquisa. Nos anos 1970, o desenvolvimento do protocolo TCP/IP por Vint Cerf e Bob Kahn padronizou a comunicação entre redes diferentes. A Ethernet, desenvolvida por Robert Metcalfe e David Boggs, se tornou a tecnologia dominante para redes locais (LANs).

Nos anos 1980, a criação da NSFNET pela National Science Foundation permitiu a expansão da Internet comercial, substituindo a ARPANET e conectando mais universidades. Com a invenção da World Wide Web por Tim Berners-Lee em 1989 e a primeira página web em 1991, a Internet se tornou acessível ao público geral, levando a um crescimento exponencial na década de 1990.

Nos anos 2000, a popularização do Wi-Fi facilitou conexões sem fio, enquanto redes sociais e computação em nuvem transformaram a interação online. Finalmente, a Internet das Coisas (IoT) está conectando dispositivos cotidianos à rede, promovendo uma comunicação e automação avançadas. Esses avanços refletem a evolução das redes de computadores, desde um projeto militar até uma ferramenta essencial para a comunicação global.

# Infraestrutura de Redes e Principais Equipamentos

- NIC (Network Interface Card): A placa de rede é o dispositivo responsável por permitir a conexão do computador com o cabo de rede Ethernet ou por receber as ondas de rádio frequência das conexões wireless.

- Hub: O hub é um hardware que permite a conexão entre dispositivos através de cabos de par trançado. Todos os dispositivos conectados a um hub compartilham o mesmo canal de comunicação, o que significa que todos "conversam" entre si, independentemente da intenção.

- Switch: Responsável pela comunicação dos quadros entre os dispositivos, o switch realiza a comutação, que é o processo de troca ou encaminhamento de informações. Ele permite a comunicação direta entre dispositivos específicos sem que os outros interceptem a mensagem.

- Roteador: O roteador tem a responsabilidade de procurar as melhores rotas na internet para entregar os pacotes do remetente ao destinatário no menor tempo possível.

- Modem: É o equipamento responsavel pela modulaçao e domodulação do sinal de internet.

# Cabeamento Estrurado:

São padrões estabelecidas que definem como serão as organizações dos cabos e seus periféricos possibilitando melhor das redes.

- Par trançado: Dividido em 8 fios, cada um com sua propria função, ele tem dois tipos UTP (não é isolado) e o STP (Tem isolamento).

- Cabo Coaxial: É composto por fios d e cobre, tendo um fio central responsavel por ser o condutor do pulso eletrico, malha metalica realizando o isolamento e uma blindagem platica contra interferencias externas.

- Fibra ótica: A fibra ótica é um meio de transmissão de dados que utiliza filamentos de vidro ou plástico para transmitir sinais de luz. É conhecida por sua alta capacidade de transmissão de dados e baixa perda de sinal, tornando-se ideal para longas distâncias e altas velocidades. Usada amplamente em telecomunicações e redes de internet, a fibra ótica proporciona conexões rápidas e confiáveis.

- Rach: O rack é uma rmario para hospedar os equipamentos de hardwares como swtiches, roteadores, modens, fibras ópticas e organizar os vabos patch panels. Ele é essencial em data centers e engraestruturas de redes.

# Modelo OSI

O Modelo OSI é uma estrutura teórica que define como os diferentes componentes de uma rede se comunicam. Ele é composto por sete camadas, cada uma com uma função específica:

- Camada Física: Trata da transmissão de bits puros através de um meio físico (cabo, fibra óptica, etc.).

- Camada de Enlace de Dados: Garante a transferência de dados livre de erros entre dois nós conectados diretamente. Exemplo: Ethernet.

- Camada de Rede: Gerencia o roteamento dos pacotes entre dispositivos de diferentes redes. Exemplo: IP.

- Camada de Transporte: Garante a entrega confiável e a integridade dos dados entre dois hosts. Exemplo: TCP, UDP.

- Camada de Sessão: Gerencia as sessões ou conexões entre aplicativos. Exemplo: controle de login.

- Camada de Apresentação: Traduz os dados entre o formato da rede e o formato de aplicação. Exemplo: criptografia, compressão de dados.

- Camada de Aplicação: Fornece serviços de rede aos aplicativos dos usuários. Exemplo: HTTP, FTP, SMTP.

# TCP/IP

O Modelo TCP/IP é uma implementação prática e simplificada para a comunicação em redes, especialmente a Internet. Ele tem quatro camadas, cada uma equivalente a uma ou mais camadas do Modelo OSI:

- Camada de Interface de Rede (ou Link): Equivalente às camadas Física e de Enlace de Dados do OSI. Trata da interface com o meio físico e da 
comunicação dentro da rede local.

- Camada de Internet: Equivalente à camada de Rede do OSI. Gerencia o roteamento dos pacotes na rede. Exemplo: IP.

- Camada de Transporte: Equivalente à camada de Transporte do OSI. Garante a comunicação de dados confiável e a integridade entre dois hosts. Exemplo: TCP, UDP.

- Camada de Aplicação: Combina as camadas de Sessão, Apresentação e Aplicação do OSI. Fornece serviços de rede diretamente aos aplicativos. Exemplo: HTTP, FTP, SMTP.

**Comparação e Intuição**

Estrutura: O Modelo OSI tem sete camadas, enquanto o Modelo TCP/IP tem quatro.

Praticidade: O Modelo TCP/IP é mais simplificado e amplamente usado na prática, especialmente na Internet.

Funcionalidade: Ambos os modelos visam padronizar a comunicação em rede, mas o OSI é mais detalhado teoricamente, enquanto o TCP/IP é mais direto e utilizado na prática.
