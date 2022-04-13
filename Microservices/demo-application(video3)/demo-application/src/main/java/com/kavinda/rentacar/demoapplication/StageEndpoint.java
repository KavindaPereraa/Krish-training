package com.kavinda.rentacar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageEndpoint {

    Map<String,Stage> stages = new ConcurrentHashMap<>();


    @ReadOperation //http get call will come and map here
    public Map<String, Stage> getAllStages(){ //it returns all the stages of what we have
        return stages;
    }
    @ReadOperation
    public Stage getStage(@Selector String name){ //take the stage name and return the value(selector  operates on the value)
        return stages.get(name);
    }
    @WriteOperation
    public void setValue(@Selector String name, int stage){  //set the stage value
        stages.put(name,new Stage(stage));
    }

    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
