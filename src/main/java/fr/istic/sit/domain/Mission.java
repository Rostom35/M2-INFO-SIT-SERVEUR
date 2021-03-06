package fr.istic.sit.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A Mission.
 */
@Document(collection = "mission")
public class Mission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Field("title")
    private String title;

    @Field("dateBegin")
    private LocalDateTime dateBegin;

    @Field("dateEnd")
    private LocalDateTime dateEnd;

    @Field("orderList")
    private List<Order> orderList;

    @Field("localisationDroneList")
    private List<LocationDrone> locationDroneList;

    @Field("userLogin")
    private String userLogin;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove

    public String getId() {
        return id;
    }

    public Mission setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Mission setTitle(String title) {
        this.title = title;
        return this;
    }

    public LocalDateTime getDateBegin() {
        return dateBegin;
    }

    public Mission setDateBegin(LocalDateTime dateBegin) {
        this.dateBegin = dateBegin;
        return this;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public Mission setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public Mission setOrderList(List<Order> orderList) {
        this.orderList = orderList;
        return this;
    }

    public List<LocationDrone> getLocationDroneList() {
        return locationDroneList;
    }

    public Mission setLocationDroneList(List<LocationDrone> locationDroneList) {
        this.locationDroneList = locationDroneList;
        return this;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public Mission setUserLogin(String userLogin) {
        this.userLogin = userLogin;
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    public void addOrder(Order order){
        if(orderList==null){
            orderList = new ArrayList<>();
        }
        orderList.add(order);
    }

    public void addLocationDrone(LocationDrone locationDrone){
        if(locationDroneList==null){
            locationDroneList = new ArrayList<>();
        }
        locationDroneList.add(locationDrone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Mission mission = (Mission) o;
        if (mission.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mission.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Mission{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", dateBegin=" + dateBegin +
            ", dateEnd=" + dateEnd +
            ", orderList=" + orderList +
            ", locationDroneList=" + locationDroneList +
            '}';
    }
}
