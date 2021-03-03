package beans;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner
{
   /* @Autowired()
    @Qualifier("dog2")
    public Dog dog;*/
    private final Dog dog;
    private final ObjectMapper objectMapper;

    @Autowired()
    public Owner(Dog dog)
    {
        this.dog =dog;
        this.objectMapper = new ObjectMapper();
    }

    public Dog getDog()
    {
        return dog;
    }

/*    public void setDog(Dog dog)
    {
        this.dog = dog;
    }*/

    @Override
    public String toString()
    {
        try
        {
            return "Owner{" +
                    "dog=" + this.toStringCustom() +
                    '}';
        } catch (JsonProcessingException e)
        {
            return e.getStackTrace().toString();
        }
    }

    public String toStringCustom() throws JsonProcessingException
    {
        JsonNode jsonNode = objectMapper.valueToTree(this.dog);
        return generetaString(jsonNode, true);
    }

    private String generetaString(JsonNode jsonNode, boolean pretty) throws JsonProcessingException
    {
        ObjectWriter objectWriter = this.objectMapper.writer();
        if(pretty)
            objectWriter =  objectWriter.with(SerializationFeature.INDENT_OUTPUT);
        return objectWriter.writeValueAsString(jsonNode);
    }
}
