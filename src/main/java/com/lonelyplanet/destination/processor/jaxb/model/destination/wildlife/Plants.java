package com.lonelyplanet.destination.processor.jaxb.model.destination.wildlife;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.lonelyplanet.destination.processor.jaxb.model.destination.common.Overview;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "plants")
@XmlAccessorType(XmlAccessType.FIELD)
public class Plants {
    @XmlElement(name = "overview")
    private Overview overview;

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        final Plants other = (Plants) object;
        return Objects.equal(this.overview, other.overview);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("overview", overview)
                .toString();
    }
}
