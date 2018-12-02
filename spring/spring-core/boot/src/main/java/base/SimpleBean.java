package base;

public class SimpleBean {

    private PropertyBean propertyBean;

    public void setPropertyBean(PropertyBean propertyBean) {
        this.propertyBean = propertyBean;
    }

    public void send() {
//        System.out.println("I am send method from SimpleBean!");
        propertyBean.send();
    }

}
