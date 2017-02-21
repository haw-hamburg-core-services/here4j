package de.haw_hamburg.informatik.core.here4j.routing.routing_data_types;

import de.haw_hamburg.informatik.core.here4j.routing.base_data_types.GeoCoordinateType;

/**
 * Created by TimoHäckel on 21.02.2017.
 *
 * Waypoints are points (including start and end points) along the route, based on input specified in the route request.
 * They can also be defined as passThrough, such as a case where the road changes names and no stopover action is
 * required.
 *
 * If the the request does not pass a coordinate when specifying the waypoint, the originalPosition attribute will not
 * be filled.
 */
public class WaypointType {

    /**
     * ID of the link on the navigable network associated with the waypoint.
     */
    private String linkId;

    /**
     * If this waypoint is a start point, this will be mapped to the beginning of the link. If used as destination point
     * or via point, it will be mapped to the end of the link.
     */
    private GeoCoordinateType mappedPosition;

    /**
     * Original position as it was specified in the corresponding request.
     */
    private GeoCoordinateType originalPosition;

    /**
     * Defines the type of the waypoint, either stopOver or passThrough.
     */
    private WaypointParameterTypeType type;

    /**
     * Contains the relative position of the mapped location along the link, as the fractional distance between the
     * link's reference node and the non-reference node. Ranges in value from 0 to 1. When no spot value nor display
     * position is given in the request then default value 0.5 is assumed.
     */
    private double spot;

    /**
     * Indicates whether the waypoint is on the left or right side of the link, when heading from the reference node to
     * the non-reference node.
     */
    private SideOfStreetType sideOfStreet;

    /**
     * Displays the name of the street to which the request waypoint was mapped.
     */
    private String mappedRoadName;

    /**
     * A label identifying this waypoint, generated by the routing service. Label is either a street name or a public
     * transport stop, depending on the transport mode of the request.
     */
    private String label;

    /**
     * Used to identify a waypoint point with a custom name. Copied verbatim as specified in the request.
     */
    private String userLabel;

    /**
     * Specifies the index of this waypoint, based on the global shape array that is provided at the route level.
     */
    private int shapeIndex;

    public WaypointType(String linkId, GeoCoordinateType mappedPosition, GeoCoordinateType originalPosition, WaypointParameterTypeType type, double spot, SideOfStreetType sideOfStreet, String mappedRoadName, String label, String userLabel, int shapeIndex) {
        this.linkId = linkId;
        this.mappedPosition = mappedPosition;
        this.originalPosition = originalPosition;
        this.type = type;
        this.spot = spot;
        this.sideOfStreet = sideOfStreet;
        this.mappedRoadName = mappedRoadName;
        this.label = label;
        this.userLabel = userLabel;
        this.shapeIndex = shapeIndex;
    }

    public WaypointType() {
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public GeoCoordinateType getMappedPosition() {
        return mappedPosition;
    }

    public void setMappedPosition(GeoCoordinateType mappedPosition) {
        this.mappedPosition = mappedPosition;
    }

    public GeoCoordinateType getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(GeoCoordinateType originalPosition) {
        this.originalPosition = originalPosition;
    }

    public WaypointParameterTypeType getType() {
        return type;
    }

    public void setType(WaypointParameterTypeType type) {
        this.type = type;
    }

    public double getSpot() {
        return spot;
    }

    public void setSpot(double spot) {
        this.spot = spot;
    }

    public SideOfStreetType getSideOfStreet() {
        return sideOfStreet;
    }

    public void setSideOfStreet(SideOfStreetType sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }

    public String getMappedRoadName() {
        return mappedRoadName;
    }

    public void setMappedRoadName(String mappedRoadName) {
        this.mappedRoadName = mappedRoadName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel;
    }

    public int getShapeIndex() {
        return shapeIndex;
    }

    public void setShapeIndex(int shapeIndex) {
        this.shapeIndex = shapeIndex;
    }
}
