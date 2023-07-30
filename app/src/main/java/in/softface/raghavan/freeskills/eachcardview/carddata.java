/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/13/23, 7:21 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/13/23, 7:21 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.eachcardview;

public class carddata {

    private String cardName;

    private String cardImage;

    private  String type;

    public carddata(String CardName, String CardImage, String type) {
        this.cardName = CardName;
        this.cardImage = CardImage;
        this.type = type;
    }

    public String getcardName() {
        return cardName;
    }


    public String getcardImage() {
        return cardImage;
    }
    public String gettype() {
        return type;
    }

}
