# Exemplo de Navegação com Fragments no Android

Este repositório contém um exemplo simples de um aplicativo Android que demonstra o uso do Navigation Component e Fragments para criar uma navegação entre telas em um aplicativo Android. O aplicativo usa uma `BottomNavigationView` para navegar entre diferentes telas, que são representadas por Fragments.

## Estrutura do Projeto

O projeto consiste em três Fragmentos, uma Atividade principal e um arquivo XML de navegação. Vamos explicar brevemente cada um deles:

### `MainActivity.kt`

`MainActivity` é a atividade principal do aplicativo. Ela configura a interface do usuário, inicializa o Navigation Controller e conecta o `BottomNavigationView` ao Navigation Controller.

O código é comentado para ajudar a entender as funcionalidades do Navigation Component e como o `BottomNavigationView` é configurado.

### `ActivityMain.xml`

Este arquivo XML define o layout da atividade principal. Ele inclui um `BottomNavigationView` que é usado para navegar entre as telas e um `FragmentContainerView` para exibir os Fragmentos.

O XML também inclui referências ao gráfico de navegação definido no arquivo `main_navigation.xml`.

### `FragmentTela1.kt`

`FragmentTela1` é um dos Fragmentos do aplicativo. Ele é inflado a partir de um layout e não possui lógica específica neste exemplo, mas você pode adicionar lógica relacionada a esta tela no método `onViewCreated`.

### `main_navigation.xml`

Este arquivo XML define o gráfico de navegação do aplicativo. Ele descreve como os Fragmentos estão interconectados e como as transições de navegação são gerenciadas. Neste exemplo, há três Fragmentos e ações de navegação entre eles.

## Executando o Aplicativo

Você pode clonar este repositório e importá-lo no Android Studio para executar o aplicativo de exemplo. Certifique-se de que sua configuração do Android Studio esteja correta.

Lembre-se de que este é apenas um exemplo básico para ilustrar o uso do Navigation Component. Você pode estendê-lo e adicionar lógica adicional conforme necessário para atender aos requisitos do seu projeto.

## Contribuições

Contribuições são bem-vindas. Sinta-se à vontade para melhorar este exemplo ou adicionar recursos adicionais. Se você encontrar problemas ou tiver dúvidas, abra uma issue neste repositório.
