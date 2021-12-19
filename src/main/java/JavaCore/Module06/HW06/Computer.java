package JavaCore.Module06.HW06;

public class Computer {
    private String processor, graphicCard, motherBoardModel;
    private int price;

    public Computer(String processor, String graphicCard, String motherBoardModel, int price) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.motherBoardModel = motherBoardModel;
        this.price = price;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setMotherBoardModel(String motherBoardModel) {
        this.motherBoardModel = motherBoardModel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getMotherBoardModel() {
        return motherBoardModel;
    }

    public int getPrice() {
        return price;
    }
}
