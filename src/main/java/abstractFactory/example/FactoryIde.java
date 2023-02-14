package abstractFactory.example;

public class FactoryIde {

    public static Ide make(String type){
        Ide ide;
        switch (type.toLowerCase()){
            case "eclipse":
                ide = new Eclipse();
                break;
            case "vscode":
                ide = new VSCode();
                break;
            case "intellij":
                ide =  new IntelliJ();
                break;
            case "pycharm":
                ide =  new PyCharm();
                break;
            default:
                ide = new VisualStudio();
                break;
        }
        return ide;
    }


}
