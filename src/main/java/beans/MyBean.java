package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean
{
    @PostConstruct
    public void init()
    {
        this.text = "Hello from init method";
    }

    private String text;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }
}
