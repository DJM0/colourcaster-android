package me.davidmaitland.colourcaster;

/**
 * Created by davidmaitland on 19/08/14.
 */
public class Caster {

    private String id;
    private String name;
    private Integer level;
    private Boolean active;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Boolean getActive() {
        return this.active;
    }

}