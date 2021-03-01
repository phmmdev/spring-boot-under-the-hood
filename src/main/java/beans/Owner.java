package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner
{
    @Autowired()
    @Qualifier("dog2")
    public Dog dog;

    public Dog getDog()
    {
        return dog;
    }

    public void setDog(Dog dog)
    {
        this.dog = dog;
    }

    @Override
    public String toString()
    {
        return "Owner{" +
                "dog=" + dog +
                '}';
    }
}
