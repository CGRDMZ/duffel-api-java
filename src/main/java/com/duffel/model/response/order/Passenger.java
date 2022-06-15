package com.duffel.model.response.order;

import com.duffel.model.Gender;
import com.duffel.model.PassengerType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
public class Passenger {

    ///  <summary>
    ///  The type of the passenger, See: <see cref="PassengerType"/>
    ///  </summary>
    @JsonProperty("type")
    private PassengerType passengerType;

    ///  <summary>
    ///  The passenger's title
    ///  </summary>
    @JsonProperty("title")
    private String title;

    ///  <summary>
    ///  The passenger's phone number in E.164 (international) format
    ///  </summary>
    @JsonProperty("phone_number")
    private String phoneNumber;

    ///  <summary>
    ///  Infant passengers, with an age of 0 or 1, must be associated with an adult passenger. This field should be
    ///  used to make this association. It should contain the id of the infant passenger as returned in the
    ///  <see cref="OffersRequest"/>.
    ///  </summary>
    @JsonProperty("infant_passenger_id")
    private String infantPassengerId;

    ///  <summary>
    ///  The id of the passenger, returned when the <see cref="OffersRequest"/> was created
    ///  </summary>
    @JsonProperty("id")
    private String id;

    ///  <summary>
    ///  The passenger's gender
    ///  </summary>
    @JsonProperty("gender")
    private Gender gender;

    ///  <summary>
    ///  The passenger's given name. Only space, -, ', and letters from the ASCII, Latin-1 Supplement and Latin
    ///  Extended-A (with the exceptions of �, �, 2, 3, R, S, �, and �) Unicode charts are accepted. All other
    ///  characters will result in a validation error. The minimum length is 1 character, and the maximum is 20
    ///  characters.
    ///  </summary>
    @JsonProperty("given_name")
    private String givenName;

    ///  <summary>
    ///  The passenger's family name. Only space, -, ', and letters from the ASCII, Latin-1 Supplement and Latin
    ///  Extended-A (with the exceptions of �, �, 2, 3, R, S, �, and �) Unicode charts are accepted. All other
    ///  characters will result in a validation error. The minimum length is 1 character, and the maximum is 20
    ///  characters.
    ///  </summary>
    @JsonProperty("family_name")
    private String familyName;

    ///  <summary>
    ///  The passenger's email address
    ///  </summary>
    @JsonProperty("email")
    private String email;

    ///  <summary>
    ///  The passenger's date of birth
    ///  </summary>
    @JsonProperty("born_on")
    private String bornOn;

}
