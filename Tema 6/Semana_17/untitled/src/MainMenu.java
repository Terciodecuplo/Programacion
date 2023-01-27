import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        Messages messages = new Messages();
        mainMenu.executeProgram(messages);
    }

    private void executeProgram(Messages messages) {
        List<GiftCard> cardList = new LinkedList<>();
        int userMenuSelection;
        do {
            messages.showHeader();
            messages.showMenu();
            userMenuSelection = Integer.parseInt(getUserInput());
            manageOptions(userMenuSelection, cardList, messages);
        } while (true);

    }

    private void manageOptions(int userMenuSelection, List<GiftCard> cardList, Messages messages) {
        if (cardList.size() == 0 && (userMenuSelection != 1 && userMenuSelection != 6)) {
            System.out.println(messages.emptyCardListError);
        } else {
            switch (userMenuSelection) {
                case 1:
                    System.out.println("Ha seleccionado \"Crear nueva tarjeta regalo.\"\n");
                    System.out.print("Introduzca el saldo inicial de la tarjeta: ");
                    cardList = createNewCard(cardList);
                    break;
                case 2:
                    System.out.println("Ha seleccionado \"Utilizar saldo en tarjeta.\"\n");
                    useCard(cardList);
                    break;
                case 3:
                    System.out.println("Ha seleccionado \"Añadir saldo a tarjeta existente.\"\n");
                    topUpBalance(cardList);
                    break;
                case 4:
                    System.out.println("Ha seleccionado \"Combinar tarjetas.\"\n");
                    mergeCards(cardList);
                    break;
                case 5:
                    System.out.println("Ha seleccionado \"Mostrar tarjetas existentes.\"\n");
                    showGiftCards(cardList);
                    break;

                case 6:
                    System.out.println("Ha seleccionado \"Salir del programa.\"\n");
                    System.out.println("¡¡Hasta pronto!!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("ERROR - Opción elegida incorrecta.");
                    break;
            }
        }
    }

    private void mergeCards(List<GiftCard> cardList) {
        int firstCardToMerge = selectGiftCard(cardList);
        System.out.println("Seleccione otra tarjeta para combinar.");
        int secondCardToMerge = selectGiftCard(cardList);
        for (GiftCard firstCard : cardList) {
            if (firstCard.getCardNumber() == firstCardToMerge) {
                for (GiftCard secondCard : cardList) {
                    if (secondCard.getCardNumber() == secondCardToMerge) {
                        GiftCard mergedCard = new GiftCard(firstCard.fusionaCon(secondCard), generateCardNumber(cardList));
                        System.out.println("!Tarjetas combinadas! La nueva tarjeta es:" +
                                "\n Número: ******** " + mergedCard.getCardNumber() +
                                "\n Saldo: ******** " + String.format("%.2f", mergedCard.getCardBalance()) + "€");
                        cardList.add(mergedCard);
                        cardList.remove(secondCard);
                    }
                }
                cardList.remove(firstCard);
            }
        }

    }

    private void topUpBalance(List<GiftCard> cardList) {
        int cardToUse = selectGiftCard(cardList);
        System.out.println("¿Qué cantidad desea recargar?");
        float topUpAmount = Float.parseFloat(getUserInput());
        for (GiftCard card : cardList) {
            if (card.getCardNumber() == cardToUse) {
                card.increaseBalance(topUpAmount);
                System.out.println("Saldo actualizado a: " + String.format("%.2f", card.getCardBalance()) + "€");
            } else {
                System.out.println("ERROR - Tarjeta no existente.");
            }
        }
    }

    private void useCard(List<GiftCard> cardList) {
        int cardToUse = selectGiftCard(cardList);
        System.out.println("¿Qué cantidad de saldo desea utilizar?");
        float spendAmount = Float.parseFloat(getUserInput());
        for (GiftCard card : cardList) {
            if (card.getCardNumber() == cardToUse) {
                if (card.getCardBalance() >= spendAmount) {
                    card.gasta(spendAmount);
                } else {
                    System.out.println("No tiene saldo suficiente para gastar " + String.format("%.2f", spendAmount) + "€");
                }
            } else {
                System.out.println("ERROR - Tarjeta no existente.");
            }
        }
    }

    private int selectGiftCard(List<GiftCard> cardList) {
        System.out.println("¿Qué tarjeta de la lista siguiente quieres seleccionar?");
        for (GiftCard card : cardList) {
            System.out.println(" => " + card.getCardNumber());
        }
        int userCardSelection = Integer.parseInt(getUserInput());
        return userCardSelection;
    }

    private void showGiftCards(List<GiftCard> cardList) {
        for (GiftCard card : cardList) {
            System.out.println("Tarjeta nº: ********  " + card.getCardNumber());
            System.out.println("Saldo en tarjeta: ********  " + String.format("%.2f", card.getCardBalance()) + "€");

        }
    }

    private List<GiftCard> createNewCard(List<GiftCard> cardList) {
        float balanceCardInput = Float.parseFloat(getUserInput());
        int cardNumber = generateCardNumber(cardList);
        GiftCard giftCard = new GiftCard(balanceCardInput, cardNumber);
        cardList.add(giftCard);
        return cardList;
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private int generateCardNumber(List<GiftCard> cardList) {
        boolean cardNumberTaken;
        int cardNumber;
        do {
            cardNumberTaken = false;
            cardNumber = (int) Math.floor(Math.random() * (99999 - 10000 + 1) + 10000);
            for (GiftCard card : cardList) {
                if (card.getCardNumber() == cardNumber) {
                    cardNumberTaken = true;
                }
            }
        } while (cardNumberTaken);
        return cardNumber;
    }

}
