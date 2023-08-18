/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 15/08/23, 8:58 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.dateset;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

import in.softface.raghavan.freeskills.videoplayer.topics.topicdata;

public class topicviewdata {

    public topicdata[] data, NotFound;
    private String cardname;

    public topicviewdata(String cardname) {
        this.cardname = cardname;
    }

    public topicdata[] topicdata() {
        if (Objects.equals(cardname, "1101")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "zN8YNNHcaZc")),
                    new topicdata("What is the switch and why do we need it?", "13m16s", gen_yt_timeurl("13m16s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-1?", "19m43s", gen_yt_timeurl("19m43s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-2?", "28m28s", gen_yt_timeurl("28m28s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-3?", "35m27s", gen_yt_timeurl("35m27s", "zN8YNNHcaZc")),
                    new topicdata("Connecting to the internet from a computer's perspective", "48m00s", gen_yt_timeurl("48m00s", "zN8YNNHcaZc")),
                    new topicdata("Wide Area Network(WAN)", "55m10s", gen_yt_timeurl("55m10s", "zN8YNNHcaZc")),
                    new topicdata("What is the Router?\nPart-2", "1h10m02s", gen_yt_timeurl("1h10m02s", "zN8YNNHcaZc")),
                    new topicdata("Internet Service Provider ISP\nPart-1", "1h17m26s", gen_yt_timeurl("1h17m26s", "zN8YNNHcaZc")),
                    new topicdata("Internet Service Provider ISP\nPart-2", "1h32m21s", gen_yt_timeurl("1h32m21s", "zN8YNNHcaZc")),};
            return data;
        } else if (Objects.equals(cardname, "1102")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 1 - Getting Started", "00m55s", gen_yt_timeurl("00m55s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 2 - Head Element", "20m13s", gen_yt_timeurl("20m13s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 3 - Text Basics", "29m02s", gen_yt_timeurl("29m02s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 4 - List Types", "49m45s", gen_yt_timeurl("49m45s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 5 - Add Links", "59m55s", gen_yt_timeurl("59m55s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 6 - Add Images", "01h30m38s", gen_yt_timeurl("01h30m38s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 7 - Semantic Tags", "02h00m58s", gen_yt_timeurl("02h00m58s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 8 - Create Tables", "02h24m53s", gen_yt_timeurl("02h24m53s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 9 - Forms & Inputs", "02h40m42s", gen_yt_timeurl("02h40m42s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 10 - HTML Project", "03h25m16s", gen_yt_timeurl("03h25m16s", "kUMe1FH4CHE")),};
            return data;


        } else if (Objects.equals(cardname, "1103")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 1: Start Here", "01m08s", gen_yt_timeurl("01m08s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 2: Selectors", "14m50s", gen_yt_timeurl("14m50s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 3: Colors", "34m41s", gen_yt_timeurl("34m41s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 4: Units & Sizes", "51m13s", gen_yt_timeurl("51m13s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 5: Box Model", "1h11m56s", gen_yt_timeurl("1h11m56s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 6: Typography", "1h37m08s", gen_yt_timeurl("1h37m08s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 7: Styling Links", "2h00m29s", gen_yt_timeurl("2h00m29s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 8: List Styles", "2h16m37s", gen_yt_timeurl("2h16m37s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 9: Mini Project", "2h32m31s", gen_yt_timeurl("2h32m31s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 10: Display", "2h45m04s", gen_yt_timeurl("2h45m04s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 11: Floats", "3h00m21s", gen_yt_timeurl("3h00m21s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 12: Columns", "3h12m46s", gen_yt_timeurl("3h12m46s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 13: Position", "3h34m30s", gen_yt_timeurl("3h34m30s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 14: Flexbox", "3h57m53s", gen_yt_timeurl("3h57m53s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 15: Grid Layout", "4h21m39s", gen_yt_timeurl("4h21m39s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 16: Images", "4h46m33s", gen_yt_timeurl("4h46m33s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 17: Media Queries", "5h32m40s", gen_yt_timeurl("5h32m40s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 18: Card Project", "5h58m59s", gen_yt_timeurl("5h58m59s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 19: Pseudo", "6h33m21s", gen_yt_timeurl("6h33m21s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 20: Variables", "6h52m56s", gen_yt_timeurl("6h52m56s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 21: Functions", "7h20m28s", gen_yt_timeurl("7h20m28s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 22: Animations", "7h50m05s", gen_yt_timeurl("7h50m05s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 23: Organization", "8h37m33s", gen_yt_timeurl("8h37m33s", "OXGznpKZ_sA")),
                    new topicdata("Chapter 24: Final Project", "8h57m23s", gen_yt_timeurl("8h57m23s", "OXGznpKZ_sA")),};
            return data;
        } else if (Objects.equals(cardname, "1104")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "PkZNo7MFNFg")),
                    new topicdata("Running JavaScript", "01m24s", gen_yt_timeurl("01m24s", "PkZNo7MFNFg")),
                    new topicdata("Comment Your Code", "04m23s", gen_yt_timeurl("04m23s", "PkZNo7MFNFg")),
                    new topicdata("Declare Variables", "05m56s", gen_yt_timeurl("05m56s", "PkZNo7MFNFg")),
                    new topicdata("Storing Values with the Assignment Operator", "06m15s", gen_yt_timeurl("06m15s", "PkZNo7MFNFg")),
                    new topicdata("Initializing Variables with the Assignment Operator", "11m31s", gen_yt_timeurl("11m31s", "PkZNo7MFNFg")),
                    new topicdata("Uninitialized Variables", "11m58s", gen_yt_timeurl("11m58s", "PkZNo7MFNFg")),
                    new topicdata("Case Sensitivity in Variables", "12m40s", gen_yt_timeurl("12m40s", "PkZNo7MFNFg")),
                    new topicdata("Basic Math", "14m05s", gen_yt_timeurl("14m05s", "PkZNo7MFNFg")),
                    new topicdata("Increment and Decrement", "15m30s", gen_yt_timeurl("15m30s", "PkZNo7MFNFg")),
                    new topicdata("Decimal Numbers", "16m22s", gen_yt_timeurl("16m22s", "PkZNo7MFNFg")),
                    new topicdata("Multiply Two Decimals", "16m48s", gen_yt_timeurl("16m48s", "PkZNo7MFNFg")),
                    new topicdata("Divide Decimals", "17m18s", gen_yt_timeurl("17m18s", "PkZNo7MFNFg")),
                    new topicdata("Finding a Remainder", "17m33s", gen_yt_timeurl("17m33s", "PkZNo7MFNFg")),
                    new topicdata("Augmented Math Operations", "18m22s", gen_yt_timeurl("18m22s", "PkZNo7MFNFg")),
                    new topicdata("Declare String Variables", "21m19s", gen_yt_timeurl("21m19s", "PkZNo7MFNFg")),
                    new topicdata("Escaping Literal Quotes", "22m01s", gen_yt_timeurl("22m01s", "PkZNo7MFNFg")),
                    new topicdata("Quoting Strings with Single Quotes", "23m44s", gen_yt_timeurl("23m44s", "PkZNo7MFNFg")),
                    new topicdata("Escape Sequences", "25m18s", gen_yt_timeurl("25m18s", "PkZNo7MFNFg")),
                    new topicdata("Plus Operator", "26m46s", gen_yt_timeurl("26m46s", "PkZNo7MFNFg")),
                    new topicdata("Plus Equals Operator", "27m49s", gen_yt_timeurl("27m49s", "PkZNo7MFNFg")),
                    new topicdata("Constructing Strings with Variables", "29m01s", gen_yt_timeurl("29m01s", "PkZNo7MFNFg")),
                    new topicdata("Appending Variables to Strings", "30m14s", gen_yt_timeurl("30m14s", "PkZNo7MFNFg")),
                    new topicdata("Length of a String", "31m11s", gen_yt_timeurl("31m11s", "PkZNo7MFNFg")),
                    new topicdata("Bracket Notation", "32m01s", gen_yt_timeurl("32m01s", "PkZNo7MFNFg")),
                    new topicdata("Understand String Immutability", "33m27s", gen_yt_timeurl("33m27s", "PkZNo7MFNFg")),
                    new topicdata("Find the Nth Character", "34m23s", gen_yt_timeurl("34m23s", "PkZNo7MFNFg")),
                    new topicdata("Word Blanks", "36m28s", gen_yt_timeurl("36m28s", "PkZNo7MFNFg")),
                    new topicdata("Arrays", "40m44s", gen_yt_timeurl("40m44s", "PkZNo7MFNFg")),
                    new topicdata("Nest Arrays", "41m43s", gen_yt_timeurl("41m43s", "PkZNo7MFNFg")),
                    new topicdata("Access Array Data", "42m33s", gen_yt_timeurl("42m33s", "PkZNo7MFNFg")),
                    new topicdata("Modify Array Data", "43m34s", gen_yt_timeurl("43m34s", "PkZNo7MFNFg")),
                    new topicdata("Access Multi-Dimensional Arrays", "44m48s", gen_yt_timeurl("44m48s", "PkZNo7MFNFg")),
                    new topicdata("push", "46m30s", gen_yt_timeurl("46m30s", "PkZNo7MFNFg")),
                    new topicdata("pop", "47m29s", gen_yt_timeurl("47m29s", "PkZNo7MFNFg")),
                    new topicdata("shift", "48m33s", gen_yt_timeurl("48m33s", "PkZNo7MFNFg")),
                    new topicdata("unshift", "49m23s", gen_yt_timeurl("49m23s", "PkZNo7MFNFg")),
                    new topicdata("Shopping List", "50m36s", gen_yt_timeurl("50m36s", "PkZNo7MFNFg")),
                    new topicdata("Write Reusable with Functions", "51m41s", gen_yt_timeurl("51m41s", "PkZNo7MFNFg")),
                    new topicdata("Arguments", "53m41s", gen_yt_timeurl("53m41s", "PkZNo7MFNFg")),
                    new topicdata("Global Scope", "55m43s", gen_yt_timeurl("55m43s", "PkZNo7MFNFg")),
                    new topicdata("Local Scope", "59m31s", gen_yt_timeurl("59m31s", "PkZNo7MFNFg")),
                    new topicdata(" Global vs Local Scope in Functions", "1h00m46s", gen_yt_timeurl("1h00m46s", "PkZNo7MFNFg")),
                    new topicdata(" Return a Value from a Function", "1h02m40s", gen_yt_timeurl("1h02m40s", "PkZNo7MFNFg")),
                    new topicdata(" Undefined Value returned", "1h03m55s", gen_yt_timeurl("1h03m55s", "PkZNo7MFNFg")),
                    new topicdata(" Assignment with a Returned Value", "1h04m52s", gen_yt_timeurl("1h04m52s", "PkZNo7MFNFg")),
                    new topicdata(" Stand in Line", "1h05m52s", gen_yt_timeurl("1h05m52s", "PkZNo7MFNFg")),
                    new topicdata(" Boolean Values", "1h08m41s", gen_yt_timeurl("1h08m41s", "PkZNo7MFNFg")),
                    new topicdata(" If Statements", "1h09m24s", gen_yt_timeurl("1h09m24s", "PkZNo7MFNFg")),
                    new topicdata(" Equality Operators", "1h11m51s", gen_yt_timeurl("1h11m51s", "PkZNo7MFNFg")),
                    new topicdata(" And / Or Operators", "1h19m17s", gen_yt_timeurl("1h19m17s", "PkZNo7MFNFg")),
                    new topicdata(" Else Statements", "1h21m37s", gen_yt_timeurl("1h21m37s", "PkZNo7MFNFg")),
                    new topicdata(" Else If Statements", "1h22m27s", gen_yt_timeurl("1h22m27s", "PkZNo7MFNFg")),
                    new topicdata(" Logical Order in If Else Statements", "1h23m30s", gen_yt_timeurl("1h23m30s", "PkZNo7MFNFg")),
                    new topicdata(" Chaining If Else Statements", "1h24m45s", gen_yt_timeurl("1h24m45s", "PkZNo7MFNFg")),
                    new topicdata(" Golf Code", "1h27m45s", gen_yt_timeurl("1h27m45s", "PkZNo7MFNFg")),
                    new topicdata(" Switch Statements", "1h32m15s", gen_yt_timeurl("1h32m15s", "PkZNo7MFNFg")),
                    new topicdata(" Returning Boolean Values from Functions", "1h41m11s", gen_yt_timeurl("1h41m11s", "PkZNo7MFNFg")),
                    new topicdata(" Return Early Pattern for Functions", "1h42m20s", gen_yt_timeurl("1h42m20s", "PkZNo7MFNFg")),
                    new topicdata(" Counting Cards", "1h43m38s", gen_yt_timeurl("1h43m38s", "PkZNo7MFNFg")),
                    new topicdata(" Build Objects", "1h49m11s", gen_yt_timeurl("1h49m11s", "PkZNo7MFNFg")),
                    new topicdata(" Dot Notation", "1h50m46s", gen_yt_timeurl("1h50m46s", "PkZNo7MFNFg")),
                    new topicdata(" Bracket Notation", "1h51m33s", gen_yt_timeurl("1h51m33s", "PkZNo7MFNFg")),
                    new topicdata(" Variables", "1h52m47s", gen_yt_timeurl("1h52m47s", "PkZNo7MFNFg")),
                    new topicdata(" Updating Object Properties", "1h53m34s", gen_yt_timeurl("1h53m34s", "PkZNo7MFNFg")),
                    new topicdata(" Add New Properties to Object", "1h54m30s", gen_yt_timeurl("1h54m30s", "PkZNo7MFNFg")),
                    new topicdata(" Delete Properties from Object", "1h55m19s", gen_yt_timeurl("1h55m19s", "PkZNo7MFNFg")),
                    new topicdata(" Objects for Lookups", "1h55m54s", gen_yt_timeurl("1h55m54s", "PkZNo7MFNFg")),
                    new topicdata(" Testing Objects for Properties", "1h57m43s", gen_yt_timeurl("1h57m43s", "PkZNo7MFNFg")),
                    new topicdata(" Manipulating Complex Objects", "1h59m15s", gen_yt_timeurl("1h59m15s", "PkZNo7MFNFg")),
                    new topicdata(" Nested Objects", "2h01m00s", gen_yt_timeurl("2h01m00s", "PkZNo7MFNFg")),
                    new topicdata(" Nested Arrays", "2h01m53s", gen_yt_timeurl("2h01m53s", "PkZNo7MFNFg")),
                    new topicdata(" Record Collection", "2h03m06s", gen_yt_timeurl("2h03m06s", "PkZNo7MFNFg")),
                    new topicdata(" While Loops", "2h10m15s", gen_yt_timeurl("2h10m15s", "PkZNo7MFNFg")),
                    new topicdata(" For Loops", "2h11m35s", gen_yt_timeurl("2h11m35s", "PkZNo7MFNFg")),
                    new topicdata(" Odd Numbers With a For Loop", "2h13m56s", gen_yt_timeurl("2h13m56s", "PkZNo7MFNFg")),
                    new topicdata(" Count Backwards With a For Loop", "2h15m28s", gen_yt_timeurl("2h15m28s", "PkZNo7MFNFg")),
                    new topicdata(" Iterate Through an Array with a For Loop", "2h17m08s", gen_yt_timeurl("2h17m08s", "PkZNo7MFNFg")),
                    new topicdata(" Nesting For Loops", "2h19m43s", gen_yt_timeurl("2h19m43s", "PkZNo7MFNFg")),
                    new topicdata(" Do...While Loops", "2h22m45s", gen_yt_timeurl("2h22m45s", "PkZNo7MFNFg")),
                    new topicdata(" Profile Lookup", "2h24m12s", gen_yt_timeurl("2h24m12s", "PkZNo7MFNFg")),
                    new topicdata(" Random Fractions and Whole Numbers", "2h28m18s", gen_yt_timeurl("2h28m18s", "PkZNo7MFNFg")),
                    new topicdata(" parseInt Function", "2h31m46s", gen_yt_timeurl("2h31m46s", "PkZNo7MFNFg")),
                    new topicdata(" Ternary Operator", "2h33m29s", gen_yt_timeurl("2h33m29s", "PkZNo7MFNFg")),
                    new topicdata(" Multiple Ternary Operators", "2h34m57s", gen_yt_timeurl("2h34m57s", "PkZNo7MFNFg")),
                    new topicdata(" var vs let", "2h36m57s", gen_yt_timeurl("2h36m57s", "PkZNo7MFNFg")),
                    new topicdata(" const Keyword", "2h41m32s", gen_yt_timeurl("2h41m32s", "PkZNo7MFNFg")),
                    new topicdata(" Mutate an Array Declared with const", "2h43m40s", gen_yt_timeurl("2h43m40s", "PkZNo7MFNFg")),
                    new topicdata(" Prevent Object Mutation", "2h44m52s", gen_yt_timeurl("2h44m52s", "PkZNo7MFNFg")),
                    new topicdata(" Arrow Functions", "2h47m17s", gen_yt_timeurl("2h47m17s", "PkZNo7MFNFg")),
                    new topicdata(" Default Parameters", "2h53m04s", gen_yt_timeurl("2h53m04s", "PkZNo7MFNFg")),
                    new topicdata(" Rest Operator", "2h54m00s", gen_yt_timeurl("2h54m00s", "PkZNo7MFNFg")),
                    new topicdata(" Spread Operator", "2h55m31s", gen_yt_timeurl("2h55m31s", "PkZNo7MFNFg")),
                    new topicdata(" Destructuring Assignment", "2h57m18s", gen_yt_timeurl("2h57m18s", "PkZNo7MFNFg")),
                    new topicdata(" Template Literals", "3h06m39s", gen_yt_timeurl("3h06m39s", "PkZNo7MFNFg")),
                    new topicdata(" Simple Fields", "3h10m43s", gen_yt_timeurl("3h10m43s", "PkZNo7MFNFg")),
                    new topicdata(" Declarative Functions", "3h12m24s", gen_yt_timeurl("3h12m24s", "PkZNo7MFNFg")),
                    new topicdata(" class Syntax", "3h12m56s", gen_yt_timeurl("3h12m56s", "PkZNo7MFNFg")),
                    new topicdata(" getters and setters", "3h15m11s", gen_yt_timeurl("3h15m11s", "PkZNo7MFNFg")),
                    new topicdata(" import and export", "3h20m25s", gen_yt_timeurl("3h20m25s", "PkZNo7MFNFg")),};
            return data;
        } else if (Objects.equals(cardname, "1105")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "0m00s", gen_yt_timeurl("0m00s", "RGOj5yH7evk")),
                    new topicdata("What is git?", "1m10s", gen_yt_timeurl("1m10s", "RGOj5yH7evk")),
                    new topicdata("What is version control?", "1m30s", gen_yt_timeurl("1m30s", "RGOj5yH7evk")),
                    new topicdata("Terms to be learn in video", "2m10s", gen_yt_timeurl("2m10s", "RGOj5yH7evk")),
                    new topicdata("Git commands", "5m20s", gen_yt_timeurl("5m20s", "RGOj5yH7evk")),
                    new topicdata("sign up in GitHub", "7m05s", gen_yt_timeurl("7m05s", "RGOj5yH7evk")),
                    new topicdata("using git in local machine", "11m32s", gen_yt_timeurl("11m32s", "RGOj5yH7evk")),
                    new topicdata("git install", "11m54s", gen_yt_timeurl("11m54s", "RGOj5yH7evk")),
                    new topicdata("getting code editor", "12m48s", gen_yt_timeurl("12m48s", "RGOj5yH7evk")),
                    new topicdata("inside VS Code", "13m30s", gen_yt_timeurl("13m30s", "RGOj5yH7evk")),
                    new topicdata("cloning through VS Code", "14m30s", gen_yt_timeurl("14m30s", "RGOj5yH7evk")),
                    new topicdata("git commit command", "17m30s", gen_yt_timeurl("17m30s", "RGOj5yH7evk")),
                    new topicdata("git add command", "18m15s", gen_yt_timeurl("18m15s", "RGOj5yH7evk")),
                    new topicdata("committing", "19m15s", gen_yt_timeurl("19m15s", "RGOj5yH7evk")),
                    new topicdata("git push command", "20m20s", gen_yt_timeurl("20m20s", "RGOj5yH7evk")),
                    new topicdata("SSH Keys", "20m30s", gen_yt_timeurl("20m30s", "RGOj5yH7evk")),
                    new topicdata("git push", "25m25s", gen_yt_timeurl("25m25s", "RGOj5yH7evk")),
                    new topicdata("Review workflow so far", "30m21s", gen_yt_timeurl("30m21s", "RGOj5yH7evk")),
                    new topicdata("Compare between GitHub workflow and local git workflow", "31m40s", gen_yt_timeurl("31m40s", "RGOj5yH7evk")),
                    new topicdata("git branching", "32m42s", gen_yt_timeurl("32m42s", "RGOj5yH7evk")),
                    new topicdata("Undoing in git", "56m30s", gen_yt_timeurl("56m30s", "RGOj5yH7evk")),
                    new topicdata("Forking in git", "1h01m50s", gen_yt_timeurl("1h01m50s", "RGOj5yH7evk")),
                    new topicdata("Ending", "1h07m55s", gen_yt_timeurl("1h07m55s", "RGOj5yH7evk")),};
            return data;
        } else if (Objects.equals(cardname, "1106")) {
            data = new topicdata[]{
                    new topicdata("Intro", "0m00s", gen_yt_timeurl("0m00s", "P3aKRdUyr0s")),
                    new topicdata("Why do we need npm?", "0m14s", gen_yt_timeurl("0m14s", "P3aKRdUyr0s")),
                    new topicdata("What is npm?", "0m52s", gen_yt_timeurl("0m52s", "P3aKRdUyr0s")),
                    new topicdata("How to install npm", "2m14s", gen_yt_timeurl("2m14s", "P3aKRdUyr0s")),
                    new topicdata("Which npm packages do you need?", "2m44s", gen_yt_timeurl("2m44s", "P3aKRdUyr0s")),
                    new topicdata("Installing global and local packages", "3m25s", gen_yt_timeurl("3m25s", "P3aKRdUyr0s")),
                    new topicdata("What does the package.json file do?", "4m46s", gen_yt_timeurl("4m46s", "P3aKRdUyr0s")),
                    new topicdata("Dealing with npm package dependencies", "5m59s", gen_yt_timeurl("5m59s", "P3aKRdUyr0s")),
                    new topicdata("How semantic versioning works in npm", "7m55s", gen_yt_timeurl("7m55s", "P3aKRdUyr0s")),
                    new topicdata("What does the package-lock.json file do?", "12m41s", gen_yt_timeurl("12m41s", "P3aKRdUyr0s")),
            };
            return data;
        } else if (Objects.equals(cardname, "1107")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "MNPdifWAAa4")),
                    new topicdata("Welcome", "00m05s", gen_yt_timeurl("00m05s", "MNPdifWAAa4")),
                    new topicdata("Follow Your Team", "00m26s", gen_yt_timeurl("00m26s", "MNPdifWAAa4")),
                    new topicdata("Create Headings with Comments", "01m16s", gen_yt_timeurl("01m16s", "MNPdifWAAa4")),
                    new topicdata("Sort CSS properties by ABCSS or groups", "02m24s", gen_yt_timeurl("02m24s", "MNPdifWAAa4")),
                    new topicdata("Naming Convention Methodologies", "05m40s", gen_yt_timeurl("05m40s", "MNPdifWAAa4")),
                    new topicdata("BEM - Blocks", "06m41s", gen_yt_timeurl("06m41s", "MNPdifWAAa4")),
                    new topicdata("BEM Blocks with Modifiers", "08m10s", gen_yt_timeurl("08m10s", "MNPdifWAAa4")),
                    new topicdata("BEM Blocks vs Elements", "11m07s", gen_yt_timeurl("11m07s", "MNPdifWAAa4")),
                    new topicdata("Header example styles", "14m32s", gen_yt_timeurl("14m32s", "MNPdifWAAa4")),
                    new topicdata("BEM Elements", "16m15s", gen_yt_timeurl("16m15s", "MNPdifWAAa4")),
                    new topicdata("BEM Elements with Modifiers", "17m27s", gen_yt_timeurl("17m27s", "MNPdifWAAa4")),
                    new topicdata("BEM helps keep specificity aligned", "18m54s", gen_yt_timeurl("18m54s", "MNPdifWAAa4")),};
            return data;
        } else if (Objects.equals(cardname, "1108")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "_a5j7KoflTs")),
                    new topicdata("What Is Sass?", "00m58s", gen_yt_timeurl("00m58s", "_a5j7KoflTs")),
                    new topicdata("Requirements", "01m24s", gen_yt_timeurl("01m24s", "_a5j7KoflTs")),
                    new topicdata("Install/Setup Live Sass Compiler VS Code Extension", "02m15s", gen_yt_timeurl("02m15s", "_a5j7KoflTs")),
                    new topicdata("Folder Structure / Sass Syntax", "04m02s", gen_yt_timeurl("04m02s", "_a5j7KoflTs")),
                    new topicdata("Variables", "08m06s", gen_yt_timeurl("08m06s", "_a5j7KoflTs")),
                    new topicdata("Maps", "10m03s", gen_yt_timeurl("10m03s", "_a5j7KoflTs")),
                    new topicdata("Nesting", "03m00s", gen_yt_timeurl("03m00s", "_a5j7KoflTs")),
                    new topicdata("Partials", "16m54s", gen_yt_timeurl("16m54s", "_a5j7KoflTs")),
                    new topicdata("Functions", "19m40s", gen_yt_timeurl("19m40s", "_a5j7KoflTs")),
                    new topicdata("Mixin Example 1", "21m30s", gen_yt_timeurl("21m30s", "_a5j7KoflTs")),
                    new topicdata("Mixin Example 2", "24m26s", gen_yt_timeurl("24m26s", "_a5j7KoflTs")),
                    new topicdata("Mixin Example 3", "28m00s", gen_yt_timeurl("28m00s", "_a5j7KoflTs")),
                    new topicdata("Extend", "30m20s", gen_yt_timeurl("30m20s", "_a5j7KoflTs")),
                    new topicdata("Math Operations", "32m05s", gen_yt_timeurl("32m05s", "_a5j7KoflTs")),
                    new topicdata("How to Learn More   Documentation", "33m49s", gen_yt_timeurl("33m49s", "_a5j7KoflTs")),
                    new topicdata("Real-World Example From Scratch   Portfolio Site", "34m02s", gen_yt_timeurl("34m02s", "_a5j7KoflTs")),
                    new topicdata("index.html", "34m38s", gen_yt_timeurl("34m38s", "_a5j7KoflTs")),
                    new topicdata("Font Awesome Setup", "40m35s", gen_yt_timeurl("40m35s", "_a5j7KoflTs")),
                    new topicdata("main.scss / _config.scss", "41m29s", gen_yt_timeurl("41m29s", "_a5j7KoflTs")),
                    new topicdata("_home.scss", "48m18s", gen_yt_timeurl("48m18s", "_a5j7KoflTs")),
                    new topicdata("Transition Ease Mixin", "52m55s", gen_yt_timeurl("52m55s", "_a5j7KoflTs")),
                    new topicdata("Text Color Function", "54m24s", gen_yt_timeurl("54m24s", "_a5j7KoflTs")),
                    new topicdata("_menu.scss", "57m10s", gen_yt_timeurl("57m10s", "_a5j7KoflTs")),
                    new topicdata("main.js", "1h02m38s", gen_yt_timeurl("1h02m38s", "_a5j7KoflTs")),
                    new topicdata("Menu cont.", "1h06m08s", gen_yt_timeurl("1h06m08s", "_a5j7KoflTs")),
                    new topicdata("about.html", "1h19m38s", gen_yt_timeurl("1h19m38s", "_a5j7KoflTs")),
                    new topicdata("_about.scss", "1h23m51s", gen_yt_timeurl("1h23m51s", "_a5j7KoflTs")),
                    new topicdata("projects.html", "1h30m37s", gen_yt_timeurl("1h30m37s", "_a5j7KoflTs")),
                    new topicdata("_projects.scss", "1h35m05s", gen_yt_timeurl("1h35m05s", "_a5j7KoflTs")),
                    new topicdata("contact.html", "1h43m57s", gen_yt_timeurl("1h43m57s", "_a5j7KoflTs")),
                    new topicdata("_contact.scss", "1h47m09s", gen_yt_timeurl("1h47m09s", "_a5j7KoflTs")),
                    new topicdata("_responsive.scss", "1h49m56s", gen_yt_timeurl("1h49m56s", "_a5j7KoflTs")),
                    new topicdata("Deploy on Github Pages", "2h01m35s", gen_yt_timeurl("2h01m35s", "_a5j7KoflTs")),
            };
            return data;
        } else if (Objects.equals(cardname, "1110")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "0m00s", gen_yt_timeurl("0m00s", "bMknfKXIFA8")),
                    new topicdata("What we’ll learn", "5m27s", gen_yt_timeurl("5m27s", "bMknfKXIFA8")),
                    new topicdata("Fun facts about react", "7m03s", gen_yt_timeurl("7m03s", "bMknfKXIFA8")),
                    new topicdata("First react", "9m08s", gen_yt_timeurl("9m08s", "bMknfKXIFA8")),
                    new topicdata("First React Practice", "17m13s", gen_yt_timeurl("17m13s", "bMknfKXIFA8")),
                    new topicdata("Local Setup   the quick way", "19m04s", gen_yt_timeurl("19m04s", "bMknfKXIFA8")),
                    new topicdata("Why React?", "21m03s", gen_yt_timeurl("21m03s", "bMknfKXIFA8")),
                    new topicdata("JSX", "30m38s", gen_yt_timeurl("30m38s", "bMknfKXIFA8")),
                    new topicdata("Goodbye, CDNs!", "40m19s", gen_yt_timeurl("40m19s", "bMknfKXIFA8")),
                    new topicdata("Thought Experiment", "44m27s", gen_yt_timeurl("44m27s", "bMknfKXIFA8")),
                    new topicdata("Project 1 Part 1 - MarkUp", "49m57s", gen_yt_timeurl("49m57s", "bMknfKXIFA8")),
                    new topicdata("Pop Quiz!", "57m44s", gen_yt_timeurl("57m44s", "bMknfKXIFA8")),
                    new topicdata("Components", "59m55s", gen_yt_timeurl("59m55s", "bMknfKXIFA8")),
                    new topicdata("Setup a local React environment w/ Create React App", "1h33m07s", gen_yt_timeurl("1h33m07s", "bMknfKXIFA8")),
                    new topicdata("Babel, Bundler, Build", "1h33m53s", gen_yt_timeurl("1h33m53s", "bMknfKXIFA8")),
                    new topicdata("Create React app", "1h34m47s", gen_yt_timeurl("1h34m47s", "bMknfKXIFA8")),
                    new topicdata("How to install Node.js", "1h35m56s", gen_yt_timeurl("1h35m56s", "bMknfKXIFA8")),
                    new topicdata("Use nvm or nvm-windows", "1h36m06s", gen_yt_timeurl("1h36m06s", "bMknfKXIFA8")),
                    new topicdata("How to install Node.js", "1h36m33s", gen_yt_timeurl("1h36m33s", "bMknfKXIFA8")),
                    new topicdata("Styles and images with CRA", "1h41m30s", gen_yt_timeurl("1h41m30s", "bMknfKXIFA8")),
                    new topicdata("Quick Mental Outline of Project", "1h46m03s", gen_yt_timeurl("1h46m03s", "bMknfKXIFA8")),
                    new topicdata("Quick Figma Walkthrough", "1h50m00s", gen_yt_timeurl("1h50m00s", "bMknfKXIFA8")),
                    new topicdata("Project Setup", "1h51m43s", gen_yt_timeurl("1h51m43s", "bMknfKXIFA8")),
                    new topicdata("Navbar and Styling", "1h59m00s", gen_yt_timeurl("1h59m00s", "bMknfKXIFA8")),
                    new topicdata("Main Section", "2h06m18s", gen_yt_timeurl("2h06m18s", "bMknfKXIFA8")),
                    new topicdata("Color The Bullets", "2h14m04s", gen_yt_timeurl("2h14m04s", "bMknfKXIFA8")),
                    new topicdata("Add Background Logo", "2h16m30s", gen_yt_timeurl("2h16m30s", "bMknfKXIFA8")),
                    new topicdata("Section 1 Solo Project", "2h20m50s", gen_yt_timeurl("2h20m50s", "bMknfKXIFA8")),
                    new topicdata("Digital Business Card", "2h22m23s", gen_yt_timeurl("2h22m23s", "bMknfKXIFA8")),
                    new topicdata("Share your work", "2h24m05s", gen_yt_timeurl("2h24m05s", "bMknfKXIFA8")),
                    new topicdata("Section 1 Recap", "2h24m45s", gen_yt_timeurl("2h24m45s", "bMknfKXIFA8")),
                    new topicdata("Section intro & Figma File", "2h27m26s", gen_yt_timeurl("2h27m26s", "bMknfKXIFA8")),
                    new topicdata("Project Setup: NavBar & Hero", "2h31m40s", gen_yt_timeurl("2h31m40s", "bMknfKXIFA8")),
                    new topicdata("Project Card Component", "2h43m11s", gen_yt_timeurl("2h43m11s", "bMknfKXIFA8")),
                    new topicdata("Problem - Not Reusable", "2h50m32s", gen_yt_timeurl("2h50m32s", "bMknfKXIFA8")),
                    new topicdata("Props", "2h52m29s", gen_yt_timeurl("2h52m29s", "bMknfKXIFA8")),
                    new topicdata("Prop Quiz   Get it?", "3h18m42s", gen_yt_timeurl("3h18m42s", "bMknfKXIFA8")),
                    new topicdata("Destructuring Props", "3h23m10s", gen_yt_timeurl("3h23m10s", "bMknfKXIFA8")),
                    new topicdata("Props practice", "3h27m05s", gen_yt_timeurl("3h27m05s", "bMknfKXIFA8")),
                    new topicdata("Passing in non-string Props", "3h36m12s", gen_yt_timeurl("3h36m12s", "bMknfKXIFA8")),
                    new topicdata("Project: Pass props to component", "3h40m11s", gen_yt_timeurl("3h40m11s", "bMknfKXIFA8")),
                    new topicdata("Review - Array.map", "3h47m08s", gen_yt_timeurl("3h47m08s", "bMknfKXIFA8")),
                    new topicdata("React render array", "3h55m37s", gen_yt_timeurl("3h55m37s", "bMknfKXIFA8")),
                    new topicdata("Mapping Components", "4h00m10s", gen_yt_timeurl("4h00m10s", "bMknfKXIFA8")),
                    new topicdata("Map Quiz", "4h04m46s", gen_yt_timeurl("4h04m46s", "bMknfKXIFA8")),
                    new topicdata("Loading Images from .map", "4h08m26s", gen_yt_timeurl("4h08m26s", "bMknfKXIFA8")),
                    new topicdata("Projects", "4h10m02s", gen_yt_timeurl("4h10m02s", "bMknfKXIFA8")),
                    new topicdata("Spread objects as props", "4h32m34s", gen_yt_timeurl("4h32m34s", "bMknfKXIFA8")),
                    new topicdata("Section 2 solo project", "4h36m30s", gen_yt_timeurl("4h36m30s", "bMknfKXIFA8")),
                    new topicdata("Travel journal", "4h37m14s", gen_yt_timeurl("4h37m14s", "bMknfKXIFA8")),
                    new topicdata("Share your work", "4h39m24s", gen_yt_timeurl("4h39m24s", "bMknfKXIFA8")),
                    new topicdata("Section 2 recap", "4h39m52s", gen_yt_timeurl("4h39m52s", "bMknfKXIFA8")),
                    new topicdata("Section into and figma file", "4h41m37s", gen_yt_timeurl("4h41m37s", "bMknfKXIFA8")),
                    new topicdata("Meme Generator: Header & Form", "4h45m48s", gen_yt_timeurl("4h45m48s", "bMknfKXIFA8")),
                    new topicdata("Project Analysis", "4h57m13s", gen_yt_timeurl("4h57m13s", "bMknfKXIFA8")),
                    new topicdata("Event Listeners", "4h58m20s", gen_yt_timeurl("4h58m20s", "bMknfKXIFA8")),
                    new topicdata("Project: Get random meme", "5h04m31s", gen_yt_timeurl("5h04m31s", "bMknfKXIFA8")),
                    new topicdata("Our current conundrum", "5h10m15s", gen_yt_timeurl("5h10m15s", "bMknfKXIFA8")),
                    new topicdata("Props vs. State", "5h18m26s", gen_yt_timeurl("5h18m26s", "bMknfKXIFA8")),
                    new topicdata("useState", "5h32m13s", gen_yt_timeurl("5h32m13s", "bMknfKXIFA8")),
                    new topicdata("Changing State", "5h37m57s", gen_yt_timeurl("5h37m57s", "bMknfKXIFA8")),
                    new topicdata("useState - Counter Practice", "5h41m03s", gen_yt_timeurl("5h41m03s", "bMknfKXIFA8")),
                    new topicdata("useState - Changing state with a callback Function", "5h45m51s", gen_yt_timeurl("5h45m51s", "bMknfKXIFA8")),
                    new topicdata("hanging State Quiz!", "5h51m12s", gen_yt_timeurl("5h51m12s", "bMknfKXIFA8")),
                    new topicdata("Project: Assign images to the meme generator", "5h53m44s", gen_yt_timeurl("5h53m44s", "bMknfKXIFA8")),
                    new topicdata("Challenge: Ternary Practice & flipping State back and forth", "5h56m43s", gen_yt_timeurl("5h56m43s", "bMknfKXIFA8")),
                    new topicdata("Complex State", "6h06m37s", gen_yt_timeurl("6h06m37s", "bMknfKXIFA8")),
                    new topicdata("Project: Refactor State", "6h27m46s", gen_yt_timeurl("6h27m46s", "bMknfKXIFA8")),
                    new topicdata("Passing state as props", "6h31m59s", gen_yt_timeurl("6h31m59s", "bMknfKXIFA8")),
                    new topicdata("Setting state from child components", "6h37m54s", gen_yt_timeurl("6h37m54s", "bMknfKXIFA8")),
                    new topicdata("Passing data around", "6h44m25s", gen_yt_timeurl("6h44m25s", "bMknfKXIFA8")),
                    new topicdata("Boxes Challenge", "6h50m53s", gen_yt_timeurl("6h50m53s", "bMknfKXIFA8")),
                    new topicdata("Conditional Rendering", "7h28m46s", gen_yt_timeurl("7h28m46s", "bMknfKXIFA8")),
                    new topicdata("React forms intro", "7h48m49s", gen_yt_timeurl("7h48m49s", "bMknfKXIFA8")),
                    new topicdata("Watch for input changes in React", "7h52m17s", gen_yt_timeurl("7h52m17s", "bMknfKXIFA8")),
                    new topicdata("Form inputs practice", "7h56m49s", gen_yt_timeurl("7h56m49s", "bMknfKXIFA8")),
                    new topicdata("Forms state object", "7h59m13s", gen_yt_timeurl("7h59m13s", "bMknfKXIFA8")),
                    new topicdata("Controlled inputs", "8h07m18s", gen_yt_timeurl("8h07m18s", "bMknfKXIFA8")),
                    new topicdata("Forms in React", "8h11m35s", gen_yt_timeurl("8h11m35s", "bMknfKXIFA8")),
                    new topicdata("Project: add text to image", "8h47m04s", gen_yt_timeurl("8h47m04s", "bMknfKXIFA8")),
                    new topicdata("Making API Calls", "8h51m05s", gen_yt_timeurl("8h51m05s", "bMknfKXIFA8")),
                    new topicdata("Intro to useEffect", "8h55m08s", gen_yt_timeurl("8h55m08s", "bMknfKXIFA8")),
                    new topicdata("useEffect", "9h00m54s", gen_yt_timeurl("9h00m54s", "bMknfKXIFA8")),
                    new topicdata("Project:get memes from API", "9h24m46s", gen_yt_timeurl("9h24m46s", "bMknfKXIFA8")),
                    new topicdata("State and Effect Practices", "9h33m00s", gen_yt_timeurl("9h33m00s", "bMknfKXIFA8")),
                    new topicdata("useEffect cleanup function", "9h40m05s", gen_yt_timeurl("9h40m05s", "bMknfKXIFA8")),
                    new topicdata("Using an sync function inside useEffect", "9h46m00s", gen_yt_timeurl("9h46m00s", "bMknfKXIFA8")),
                    new topicdata("Section3 recap", "9h49m14s", gen_yt_timeurl("9h49m14s", "bMknfKXIFA8")),
                    new topicdata("Section 4 Intro", "9h51m34s", gen_yt_timeurl("9h51m34s", "bMknfKXIFA8")),
                    new topicdata("Warm-up:Add Dark/Light modes to ReactFacts Site", "9h54m09s", gen_yt_timeurl("9h54m09s", "bMknfKXIFA8")),
                    new topicdata("Notes App Intro", "10h00m50s", gen_yt_timeurl("10h00m50s", "bMknfKXIFA8")),
                    new topicdata("Notes App Development", "10h10m47s", gen_yt_timeurl("10h10m47s", "bMknfKXIFA8")),
                    new topicdata("Tenzies Project Intro", "10h44m17s", gen_yt_timeurl("10h44m17s", "bMknfKXIFA8")),
                    new topicdata("Tenzies Setup & Game Development", "10h45m38s", gen_yt_timeurl("10h45m38s", "bMknfKXIFA8")),
                    new topicdata("Hold dice part 3", "11h24m35s", gen_yt_timeurl("11h24m35s", "bMknfKXIFA8")),
                    new topicdata("End game", "11h28m39s", gen_yt_timeurl("11h28m39s", "bMknfKXIFA8")),
                    new topicdata("Tenzies: New Game & Extra Credit ideas", "11h40m31s", gen_yt_timeurl("11h40m31s", "bMknfKXIFA8")),
                    new topicdata("Section 4 Solo Project", "11h44m15s", gen_yt_timeurl("11h44m15s", "bMknfKXIFA8")),
                    new topicdata("quiz", "11h45m53s", gen_yt_timeurl("11h45m53s", "bMknfKXIFA8")),
                    new topicdata("OTDB API", "11h47m26s", gen_yt_timeurl("11h47m26s", "bMknfKXIFA8")),
                    new topicdata("Congrats on completing Module 1!", "11h49m32s", gen_yt_timeurl("11h49m32s", "bMknfKXIFA8")),
            };
            return data;
        } else if (Objects.equals(cardname, "1111")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "ft30zcMlFao")),
                    new topicdata("Setup", "02m36s", gen_yt_timeurl("02m36s", "ft30zcMlFao")),
                    new topicdata("Colors", "17m01s", gen_yt_timeurl("17m01s", "ft30zcMlFao")),
                    new topicdata("Customization", "29m11s", gen_yt_timeurl("29m11s", "ft30zcMlFao")),
                    new topicdata("Typography", "42m11s", gen_yt_timeurl("42m11s", "ft30zcMlFao")),
                    new topicdata("Spaces & sizes", "1h05m21s", gen_yt_timeurl("1h05m21s", "ft30zcMlFao")),
                    new topicdata("Flex", "1h29m36s", gen_yt_timeurl("1h29m36s", "ft30zcMlFao")),
                    new topicdata("Grids", "1h51m46s", gen_yt_timeurl("1h51m46s", "ft30zcMlFao")),
                    new topicdata("Layouts", "2h12m48s", gen_yt_timeurl("2h12m48s", "ft30zcMlFao")),
                    new topicdata("Borders", "2h37m49s", gen_yt_timeurl("2h37m49s", "ft30zcMlFao")),
                    new topicdata("Effects & filters", "2h45m41s", gen_yt_timeurl("2h45m41s", "ft30zcMlFao")),
                    new topicdata("Animations", "2h57m33s", gen_yt_timeurl("2h57m33s", "ft30zcMlFao")),
                    new topicdata("Design System", "3h08m28s", gen_yt_timeurl("3h08m28s", "ft30zcMlFao")),
                    new topicdata("Core concepts", "3h56m31s", gen_yt_timeurl("3h56m31s", "ft30zcMlFao")),
                    new topicdata("Dark mode", "4h05m26s", gen_yt_timeurl("4h05m26s", "ft30zcMlFao")),
            };
            return data;
        } else if (Objects.equals(cardname, "1114")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "zrPVTf761OI")),
                    new topicdata("Setup", "02m36s", gen_yt_timeurl("02m36s", "zrPVTf761OI")),
                    new topicdata("Colors", "17m01s", gen_yt_timeurl("17m01s", "zrPVTf761OI")),
                    new topicdata("Customization", "29m11s", gen_yt_timeurl("29m11s", "zrPVTf761OI")),
                    new topicdata("Typography", "42m11s", gen_yt_timeurl("42m11s", "zrPVTf761OI")),
                    new topicdata("Spaces & sizes", "1h05m21s", gen_yt_timeurl("1h05m21s", "zrPVTf761OI")),
                    new topicdata("Flex", "1h29m36s", gen_yt_timeurl("1h29m36s", "zrPVTf761OI")),
                    new topicdata("Grids", "1h51m46s", gen_yt_timeurl("1h51m46s", "zrPVTf761OI")),
                    new topicdata("Layouts", "2h12m48s", gen_yt_timeurl("2h12m48s", "zrPVTf761OI")),
                    new topicdata("Borders", "2h37m49s", gen_yt_timeurl("2h37m49s", "zrPVTf761OI")),
                    new topicdata("Effects & filters", "2h45m41s", gen_yt_timeurl("2h45m41s", "zrPVTf761OI")),
                    new topicdata("Animations", "2h57m33s", gen_yt_timeurl("2h57m33s", "zrPVTf761OI")),
                    new topicdata("Design System", "3h08m28s", gen_yt_timeurl("3h08m28s", "zrPVTf761OI")),
                    new topicdata("Core concepts", "3h56m31s", gen_yt_timeurl("3h56m31s", "zrPVTf761OI")),
                    new topicdata("Dark mode", "4h05m26s", gen_yt_timeurl("4h05m26s", "zrPVTf761OI")),
            };
            return data;
        } else if (Objects.equals(cardname, "1115")) {
            data = new topicdata[]{
                    new topicdata("Intro", "0m00s", gen_yt_timeurl("0m00s", "ML743nrkMHw")),
                    new topicdata("Resources", "3m05s", gen_yt_timeurl("3m05s", "ML743nrkMHw")),
                    new topicdata("Setup & Install Dependencies", "4m48s", gen_yt_timeurl("4m48s", "ML743nrkMHw")),
                    new topicdata("Create Main Window", "8m08s", gen_yt_timeurl("8m08s", "ML743nrkMHw")),
                    new topicdata("Common Boilerplate", "12m45s", gen_yt_timeurl("12m45s", "ML743nrkMHw")),
                    new topicdata("Show Devtools", "15m53s", gen_yt_timeurl("15m53s", "ML743nrkMHw")),
                    new topicdata("Using Electronmon", "18m10s", gen_yt_timeurl("18m10s", "ML743nrkMHw")),
                    new topicdata("Adding the UI Theme", "18m54s", gen_yt_timeurl("18m54s", "ML743nrkMHw")),
                    new topicdata("Content Security Policy", "21m26s", gen_yt_timeurl("21m26s", "ML743nrkMHw")),
                    new topicdata("Menu Customization", "23m00s", gen_yt_timeurl("23m00s", "ML743nrkMHw")),
                    new topicdata("Menu Roles", "27m36s", gen_yt_timeurl("27m36s", "ML743nrkMHw")),
                    new topicdata("About Window", "30m00s", gen_yt_timeurl("30m00s", "ML743nrkMHw")),
                    new topicdata("Start Renderer JS / Load Image", "31m53s", gen_yt_timeurl("31m53s", "ML743nrkMHw")),
                    new topicdata("Get Original Dimensions", "38m15s", gen_yt_timeurl("38m15s", "ML743nrkMHw")),
                    new topicdata("Using Preload", "39m40s", gen_yt_timeurl("39m40s", "ML743nrkMHw")),
                    new topicdata("Show Output Path", "44m28s", gen_yt_timeurl("44m28s", "ML743nrkMHw")),
                    new topicdata("Toastify Alerts", "46m43s", gen_yt_timeurl("46m43s", "ML743nrkMHw")),
                    new topicdata("Form Submit Handler", "50m58s", gen_yt_timeurl("50m58s", "ML743nrkMHw")),
                    new topicdata("IPC Renderer   Send", "53m54s", gen_yt_timeurl("53m54s", "ML743nrkMHw")),
                    new topicdata("IPC Main   Recieve", "56m44s", gen_yt_timeurl("56m44s", "ML743nrkMHw")),
                    new topicdata("Resize Image", "59m35s", gen_yt_timeurl("59m35s", "ML743nrkMHw")),
                    new topicdata("Catch Message In Renderer", "1h05m32s", gen_yt_timeurl("1h05m32s", "ML743nrkMHw")),
                    new topicdata("Make mainWindow Global", "1h07m32s", gen_yt_timeurl("1h07m32s", "ML743nrkMHw")),
                    new topicdata("Test Production Mode", "1h10m22s", gen_yt_timeurl("1h10m22s", "ML743nrkMHw")),
            };
            return data;


        } else if (Objects.equals(cardname, "1116")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "F-sFp_AvHc8")),
                    new topicdata("Topics and Prerequisites", "04m04s", gen_yt_timeurl("04m04s", "F-sFp_AvHc8")),
                    new topicdata("Intro to HTTP Headers and Cookies", "16m43s", gen_yt_timeurl("16m43s", "F-sFp_AvHc8")),
                    new topicdata("Intro to Express Middleware", "34m23s", gen_yt_timeurl("34m23s", "F-sFp_AvHc8")),
                    new topicdata("Intro to Express Sessions", "1h05m04s", gen_yt_timeurl("1h05m04s", "F-sFp_AvHc8")),
                    new topicdata("Implementation of Passport Local Strategy", "1h31m10s", gen_yt_timeurl("1h31m10s", "F-sFp_AvHc8")),
                    new topicdata("Intro to Public Key Cryptography", "2h50m21s", gen_yt_timeurl("2h50m21s", "F-sFp_AvHc8")),
                    new topicdata("How do JWTs work?", "3h34m31s", gen_yt_timeurl("3h34m31s", "F-sFp_AvHc8")),
                    new topicdata("Implementation of Passport JWT Strategy", "4h16m58s", gen_yt_timeurl("4h16m58s", "F-sFp_AvHc8")),
                    new topicdata("Implementing a Custom JWT Auth Solution", "5h17m29s", gen_yt_timeurl("5h17m29s", "F-sFp_AvHc8")),
                    new topicdata("JWT Strategy in Angular Front-End App", "5h46m20s", gen_yt_timeurl("5h46m20s", "F-sFp_AvHc8")),
            };
            return data;


        } else if (Objects.equals(cardname, "1118")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "Uszj_k0DGsg")),
                    new topicdata("Hosted by Tower", "00m52s", gen_yt_timeurl("00m52s", "Uszj_k0DGsg")),
                    new topicdata("The perfect commit", "01m27s", gen_yt_timeurl("01m27s", "Uszj_k0DGsg")),
                    new topicdata("Branching strategies", "08m07s", gen_yt_timeurl("08m07s", "Uszj_k0DGsg")),
                    new topicdata("Pull requests", "17m16s", gen_yt_timeurl("17m16s", "Uszj_k0DGsg")),
                    new topicdata("Merge conflicts", "24m07s", gen_yt_timeurl("24m07s", "Uszj_k0DGsg")),
                    new topicdata("Merge vs. rebase", "33m48s", gen_yt_timeurl("33m48s", "Uszj_k0DGsg")),
                    new topicdata("The Advanced Git Kit", "40m05s", gen_yt_timeurl("40m05s", "Uszj_k0DGsg")),};
            return data;


        } else if (Objects.equals(cardname, "1120")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "sxTmJE4k0ho")),
                    new topicdata("Variables & Data Types", "01m12s", gen_yt_timeurl("01m12s", "sxTmJE4k0ho")),
                    new topicdata("Basic Operators & Input", "12m21s", gen_yt_timeurl("12m21s", "sxTmJE4k0ho")),
                    new topicdata("Conditions", "24m11s", gen_yt_timeurl("24m11s", "sxTmJE4k0ho")),
                    new topicdata("if-elif-else", "32m54s", gen_yt_timeurl("32m54s", "sxTmJE4k0ho")),
                    new topicdata("Chained Conditionals & Nested Statements", "45m56s", gen_yt_timeurl("45m56s", "sxTmJE4k0ho")),
                    new topicdata("For Loops", "53m29s", gen_yt_timeurl("53m29s", "sxTmJE4k0ho")),
                    new topicdata("While Loops", "59m29s", gen_yt_timeurl("59m29s", "sxTmJE4k0ho")),
                    new topicdata("List's and Tuples", "01h05m51s", gen_yt_timeurl("01h05m51s", "sxTmJE4k0ho")),
                    new topicdata("Iteration by Item", "01h14m09s", gen_yt_timeurl("01h14m09s", "sxTmJE4k0ho")),
                    new topicdata("String Methods", "01h20m13s", gen_yt_timeurl("01h20m13s", "sxTmJE4k0ho")),
                    new topicdata("Slice Operator", "01h26m38s", gen_yt_timeurl("01h26m38s", "sxTmJE4k0ho")),
                    new topicdata("Functions", "01h33m41s", gen_yt_timeurl("01h33m41s", "sxTmJE4k0ho")),
                    new topicdata("How to Read a Text File", "01h42m10s", gen_yt_timeurl("01h42m10s", "sxTmJE4k0ho")),
                    new topicdata("Writing to a Text File", "01h50m31s", gen_yt_timeurl("01h50m31s", "sxTmJE4k0ho")),
                    new topicdata("Using .count() and .find()", "01h54m50s", gen_yt_timeurl("01h54m50s", "sxTmJE4k0ho")),
                    new topicdata("Introduction to Modular Programming", "02h01m47s", gen_yt_timeurl("02h01m47s", "sxTmJE4k0ho")),
                    new topicdata("Optional Parameters", "02h09m28s", gen_yt_timeurl("02h09m28s", "sxTmJE4k0ho")),
                    new topicdata("Try and Except (Error Handling)", "02h15m36s", gen_yt_timeurl("02h15m36s", "sxTmJE4k0ho")),
                    new topicdata("Global vs Local Variables", "02h20m29s", gen_yt_timeurl("02h20m29s", "sxTmJE4k0ho")),
                    new topicdata("Introduction to Objects", "02h29m16s", gen_yt_timeurl("02h29m16s", "sxTmJE4k0ho")),
                    new topicdata("Creating Classes", "02h39m02s", gen_yt_timeurl("02h39m02s", "sxTmJE4k0ho")),
                    new topicdata("Inheritance", "02h50m37s", gen_yt_timeurl("02h50m37s", "sxTmJE4k0ho")),
                    new topicdata("Overloading Methods", "03h03m13s", gen_yt_timeurl("03h03m13s", "sxTmJE4k0ho")),
                    new topicdata("Static Methods and Class Methods", "03h16m01s", gen_yt_timeurl("03h16m01s", "sxTmJE4k0ho")),
                    new topicdata("Private and Public Classes", "03h25m44s", gen_yt_timeurl("03h25m44s", "sxTmJE4k0ho")),
                    new topicdata("Optional Parameters", "03h31m40s", gen_yt_timeurl("03h31m40s", "sxTmJE4k0ho")),
                    new topicdata("Static and Class Methods", "03h41m13s", gen_yt_timeurl("03h41m13s", "sxTmJE4k0ho")),
                    new topicdata("Map Function", "03h50m24s", gen_yt_timeurl("03h50m24s", "sxTmJE4k0ho")),
                    new topicdata("Filter Function", "03h56m15s", gen_yt_timeurl("03h56m15s", "sxTmJE4k0ho")),
                    new topicdata("Lambda Function", "04h03m12s", gen_yt_timeurl("04h03m12s", "sxTmJE4k0ho")),
                    new topicdata("Introduction to Collections", "04h10m12s", gen_yt_timeurl("04h10m12s", "sxTmJE4k0ho")),
                    new topicdata("Named Tuple", "04h22m17s", gen_yt_timeurl("04h22m17s", "sxTmJE4k0ho")),
                    new topicdata("Deque", "04h30m20s", gen_yt_timeurl("04h30m20s", "sxTmJE4k0ho")),
                    new topicdata("Overview of Python", "04h40m12s", gen_yt_timeurl("04h40m12s", "sxTmJE4k0ho")),
                    new topicdata("Dunder/Magic Methods", "04h58m34s", gen_yt_timeurl("04h58m34s", "sxTmJE4k0ho")),
                    new topicdata("Metaclasses", "05h12m23s", gen_yt_timeurl("05h12m23s", "sxTmJE4k0ho")),
                    new topicdata("Decorators", "05h34m10s", gen_yt_timeurl("05h34m10s", "sxTmJE4k0ho")),
                    new topicdata("Generators", "05h50m29s", gen_yt_timeurl("05h50m29s", "sxTmJE4k0ho")),
                    new topicdata("Context Managers", "06h04m32s", gen_yt_timeurl("06h04m32s", "sxTmJE4k0ho")),
            };
            return data;
        } else if (Objects.equals(cardname, "1122")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "ZtqBQ68cfJc")),
                    new topicdata("Why use the command line?", "04m37s", gen_yt_timeurl("04m37s", "ZtqBQ68cfJc")),
                    new topicdata("The world of operating systems", "06m56s", gen_yt_timeurl("06m56s", "ZtqBQ68cfJc")),
                    new topicdata("What is Linux?", "10m56s", gen_yt_timeurl("10m56s", "ZtqBQ68cfJc")),
                    new topicdata("Shells and Bash", "16m58s", gen_yt_timeurl("16m58s", "ZtqBQ68cfJc")),
                    new topicdata("Setup For Linux Users", "19m28s", gen_yt_timeurl("19m28s", "ZtqBQ68cfJc")),
                    new topicdata("Setup For Mac Users", "20m28s", gen_yt_timeurl("20m28s", "ZtqBQ68cfJc")),
                    new topicdata("Setup For Windows (WSL)", "21m05s", gen_yt_timeurl("21m05s", "ZtqBQ68cfJc")),
                    new topicdata("Using The Terminal", "29m43s", gen_yt_timeurl("29m43s", "ZtqBQ68cfJc")),
                    new topicdata("whoami", "31m12s", gen_yt_timeurl("31m12s", "ZtqBQ68cfJc")),
                    new topicdata("man", "32m34s", gen_yt_timeurl("32m34s", "ZtqBQ68cfJc")),
                    new topicdata("clear", "33m40s", gen_yt_timeurl("33m40s", "ZtqBQ68cfJc")),
                    new topicdata("intro to options", "36m42s", gen_yt_timeurl("36m42s", "ZtqBQ68cfJc")),
                    new topicdata("pwd", "39m05s", gen_yt_timeurl("39m05s", "ZtqBQ68cfJc")),
                    new topicdata("ls", "41m07s", gen_yt_timeurl("41m07s", "ZtqBQ68cfJc")),
                    new topicdata("cd", "49m21s", gen_yt_timeurl("49m21s", "ZtqBQ68cfJc")),
                    new topicdata("mkdir", "1h00m40s", gen_yt_timeurl("1h00m40s", "ZtqBQ68cfJc")),
                    new topicdata("touch", "1h06m33s", gen_yt_timeurl("1h06m33s", "ZtqBQ68cfJc")),
                    new topicdata("rmdir", "1h12m03s", gen_yt_timeurl("1h12m03s", "ZtqBQ68cfJc")),
                    new topicdata("rm", "1h13m05s", gen_yt_timeurl("1h13m05s", "ZtqBQ68cfJc")),
                    new topicdata("open", "1h21m26s", gen_yt_timeurl("1h21m26s", "ZtqBQ68cfJc")),
                    new topicdata("mv", "1h23m55s", gen_yt_timeurl("1h23m55s", "ZtqBQ68cfJc")),
                    new topicdata("cp", "1h27m51s", gen_yt_timeurl("1h27m51s", "ZtqBQ68cfJc")),
                    new topicdata("head", "1h31m56s", gen_yt_timeurl("1h31m56s", "ZtqBQ68cfJc")),
                    new topicdata("tail", "1h33m02s", gen_yt_timeurl("1h33m02s", "ZtqBQ68cfJc")),
                    new topicdata("date", "1h35m27s", gen_yt_timeurl("1h35m27s", "ZtqBQ68cfJc")),
                    new topicdata("redirecting standard output", "1h36m02s", gen_yt_timeurl("1h36m02s", "ZtqBQ68cfJc")),
                    new topicdata("cat", "1h41m48s", gen_yt_timeurl("1h41m48s", "ZtqBQ68cfJc")),
                    new topicdata("less", "1h46m15s", gen_yt_timeurl("1h46m15s", "ZtqBQ68cfJc")),
                    new topicdata("echo", "1h49m17s", gen_yt_timeurl("1h49m17s", "ZtqBQ68cfJc")),
                    new topicdata("wc", "1h51m38s", gen_yt_timeurl("1h51m38s", "ZtqBQ68cfJc")),
                    new topicdata("piping", "1h53m52s", gen_yt_timeurl("1h53m52s", "ZtqBQ68cfJc")),
                    new topicdata("sort", "1h56m43s", gen_yt_timeurl("1h56m43s", "ZtqBQ68cfJc")),
                    new topicdata("uniq", "2h01m09s", gen_yt_timeurl("2h01m09s", "ZtqBQ68cfJc")),
                    new topicdata("expansions", "2h06m59s", gen_yt_timeurl("2h06m59s", "ZtqBQ68cfJc")),
                    new topicdata("diff", "2h17m08s", gen_yt_timeurl("2h17m08s", "ZtqBQ68cfJc")),
                    new topicdata("find", "2h21m01s", gen_yt_timeurl("2h21m01s", "ZtqBQ68cfJc")),
                    new topicdata("grep", "2h32m10s", gen_yt_timeurl("2h32m10s", "ZtqBQ68cfJc")),
                    new topicdata("du", "2h36m52s", gen_yt_timeurl("2h36m52s", "ZtqBQ68cfJc")),
                    new topicdata("df", "2h40m55s", gen_yt_timeurl("2h40m55s", "ZtqBQ68cfJc")),
                    new topicdata("history", "2h44m04s", gen_yt_timeurl("2h44m04s", "ZtqBQ68cfJc")),
                    new topicdata("ps", "2h47m32s", gen_yt_timeurl("2h47m32s", "ZtqBQ68cfJc")),
                    new topicdata("top", "2h51m50s", gen_yt_timeurl("2h51m50s", "ZtqBQ68cfJc")),
                    new topicdata("kill", "2h54m02s", gen_yt_timeurl("2h54m02s", "ZtqBQ68cfJc")),
                    new topicdata("killall", "3h00m13s", gen_yt_timeurl("3h00m13s", "ZtqBQ68cfJc")),
                    new topicdata("jobs, bg, and fg", "3h01m37s", gen_yt_timeurl("3h01m37s", "ZtqBQ68cfJc")),
                    new topicdata("gzip", "3h09m40s", gen_yt_timeurl("3h09m40s", "ZtqBQ68cfJc")),
                    new topicdata("gunzip", "3h12m18s", gen_yt_timeurl("3h12m18s", "ZtqBQ68cfJc")),
                    new topicdata("tar", "3h15m27s", gen_yt_timeurl("3h15m27s", "ZtqBQ68cfJc")),
                    new topicdata("nano", "3h23m36s", gen_yt_timeurl("3h23m36s", "ZtqBQ68cfJc")),
                    new topicdata("alias", "3h31m17s", gen_yt_timeurl("3h31m17s", "ZtqBQ68cfJc")),
                    new topicdata("xargs", "3h42m48s", gen_yt_timeurl("3h42m48s", "ZtqBQ68cfJc")),
                    new topicdata("ln", "3h50m57s", gen_yt_timeurl("3h50m57s", "ZtqBQ68cfJc")),
                    new topicdata("who", "4h01m49s", gen_yt_timeurl("4h01m49s", "ZtqBQ68cfJc")),
                    new topicdata("su", "4h03m47s", gen_yt_timeurl("4h03m47s", "ZtqBQ68cfJc")),
                    new topicdata("sudo", "4h08m32s", gen_yt_timeurl("4h08m32s", "ZtqBQ68cfJc")),
                    new topicdata("passwd", "4h18m36s", gen_yt_timeurl("4h18m36s", "ZtqBQ68cfJc")),
                    new topicdata("chown", "4h21m54s", gen_yt_timeurl("4h21m54s", "ZtqBQ68cfJc")),
                    new topicdata("Understanding permissions", "4h31m08s", gen_yt_timeurl("4h31m08s", "ZtqBQ68cfJc")),
                    new topicdata("chmod", "4h47m15s", gen_yt_timeurl("4h47m15s", "ZtqBQ68cfJc")),
            };
            return data;


        } else if (Objects.equals(cardname, "1124")) {
            data = new topicdata[]{
                    new topicdata("What is a Database", "03m16s", gen_yt_timeurl("03m16s", "qw--VYLpxG4")),
                    new topicdata("What is SQL And Relational Database", "05m17s", gen_yt_timeurl("05m17s", "qw--VYLpxG4")),
                    new topicdata("What is PostreSQL AKA Postrgres", "09m10s", gen_yt_timeurl("09m10s", "qw--VYLpxG4")),
                    new topicdata("PostgreSQL Installation (Mac OS)", "10m53s", gen_yt_timeurl("10m53s", "qw--VYLpxG4")),
                    new topicdata("PostgreSQL Installation (Windows)", "14m21s", gen_yt_timeurl("14m21s", "qw--VYLpxG4")),
                    new topicdata("GUI Clients vs Terminal/CMD Clients", "17m38s", gen_yt_timeurl("17m38s", "qw--VYLpxG4")),
                    new topicdata("Setup PSQL (MAC OS)", "21m39s", gen_yt_timeurl("21m39s", "qw--VYLpxG4")),
                    new topicdata("Setup PSQL (Windows)", "25m22s", gen_yt_timeurl("25m22s", "qw--VYLpxG4")),
                    new topicdata("How to Create Database", "30m15s", gen_yt_timeurl("30m15s", "qw--VYLpxG4")),
                    new topicdata("How to Connect to Databases", "33m35s", gen_yt_timeurl("33m35s", "qw--VYLpxG4")),
                    new topicdata("A Very Dangerous Command", "38m12s", gen_yt_timeurl("38m12s", "qw--VYLpxG4")),
                    new topicdata("How To Create Tables", "41m37s", gen_yt_timeurl("41m37s", "qw--VYLpxG4")),
                    new topicdata("Creating Tables Without Constraints", "45m46s", gen_yt_timeurl("45m46s", "qw--VYLpxG4")),
                    new topicdata("Creating Tables with Constraints", "49m12s", gen_yt_timeurl("49m12s", "qw--VYLpxG4")),
                    new topicdata("Insert Into", "55m55s", gen_yt_timeurl("55m55s", "qw--VYLpxG4")),
                    new topicdata("Insert Into Example", "59m14s", gen_yt_timeurl("59m14s", "qw--VYLpxG4")),
                    new topicdata("Generate 1000 Rows with Mockaroo", "1h02m36s", gen_yt_timeurl("1h02m36s", "qw--VYLpxG4")),
                    new topicdata("Select From", "1h12m28s", gen_yt_timeurl("1h12m28s", "qw--VYLpxG4")),
                    new topicdata("Order By", "1h15m18s", gen_yt_timeurl("1h15m18s", "qw--VYLpxG4")),
                    new topicdata("Distinct", "1h19m53s", gen_yt_timeurl("1h19m53s", "qw--VYLpxG4")),
                    new topicdata("Where Clause and AND", "1h21m59s", gen_yt_timeurl("1h21m59s", "qw--VYLpxG4")),
                    new topicdata("Comparison Operators", "1h25m29s", gen_yt_timeurl("1h25m29s", "qw--VYLpxG4")),
                    new topicdata("Limit, Offset & Fetch", "1h29m35s", gen_yt_timeurl("1h29m35s", "qw--VYLpxG4")),
                    new topicdata("IN", "1h32m43s", gen_yt_timeurl("1h32m43s", "qw--VYLpxG4")),
                    new topicdata("Between", "1h35m43s", gen_yt_timeurl("1h35m43s", "qw--VYLpxG4")),
                    new topicdata("Like And iLike", "1h37m45s", gen_yt_timeurl("1h37m45s", "qw--VYLpxG4")),
                    new topicdata("Group By", "1h43m10s", gen_yt_timeurl("1h43m10s", "qw--VYLpxG4")),
                    new topicdata("Group By Having", "1h46m41s", gen_yt_timeurl("1h46m41s", "qw--VYLpxG4")),
                    new topicdata("Adding New Table And Data Using Mockaroo", "1h52m08s", gen_yt_timeurl("1h52m08s", "qw--VYLpxG4")),
                    new topicdata("Calculating Min, Max & Average", "1h55m40s", gen_yt_timeurl("1h55m40s", "qw--VYLpxG4")),
                    new topicdata("Sum", "1h59m48s", gen_yt_timeurl("1h59m48s", "qw--VYLpxG4")),
                    new topicdata("Basics of Arithmetic Operators", "2h01m55s", gen_yt_timeurl("2h01m55s", "qw--VYLpxG4")),
                    new topicdata("Arithmetic Operators (ROUND)", "2h05m59s", gen_yt_timeurl("2h05m59s", "qw--VYLpxG4")),
                    new topicdata("Alias", "2h09m43s", gen_yt_timeurl("2h09m43s", "qw--VYLpxG4")),
                    new topicdata("Coalesce", "2h12m32s", gen_yt_timeurl("2h12m32s", "qw--VYLpxG4")),
                    new topicdata("NULLIF", "2h16m15s", gen_yt_timeurl("2h16m15s", "qw--VYLpxG4")),
                    new topicdata("Timestamps And Dates Course", "2h20m21s", gen_yt_timeurl("2h20m21s", "qw--VYLpxG4")),
                    new topicdata("Adding And Subtracting With Dates", "2h23m21s", gen_yt_timeurl("2h23m21s", "qw--VYLpxG4")),
                    new topicdata("Extracting Fields From Timestamp", "2h25m58s", gen_yt_timeurl("2h25m58s", "qw--VYLpxG4")),
                    new topicdata("Age Function", "2h27m28s", gen_yt_timeurl("2h27m28s", "qw--VYLpxG4")),
                    new topicdata("What Are Primary Keys", "2h29m24s", gen_yt_timeurl("2h29m24s", "qw--VYLpxG4")),
                    new topicdata("Understanding Primary Keys", "2h31m23s", gen_yt_timeurl("2h31m23s", "qw--VYLpxG4")),
                    new topicdata("Adding Primary Key", "2h36m26s", gen_yt_timeurl("2h36m26s", "qw--VYLpxG4")),
                    new topicdata("Unique Constraints", "2h40m55s", gen_yt_timeurl("2h40m55s", "qw--VYLpxG4")),
                    new topicdata("Check Constraints", "2h49m15s", gen_yt_timeurl("2h49m15s", "qw--VYLpxG4")),
                    new topicdata("How to Delete Records", "2h54m45s", gen_yt_timeurl("2h54m45s", "qw--VYLpxG4")),
                    new topicdata("How to Update Records", "3h01m36s", gen_yt_timeurl("3h01m36s", "qw--VYLpxG4")),
                    new topicdata("On Conflict Do Nothing", "3h05m55s", gen_yt_timeurl("3h05m55s", "qw--VYLpxG4")),
                    new topicdata("Upsert", "3h11m09s", gen_yt_timeurl("3h11m09s", "qw--VYLpxG4")),
                    new topicdata("What Is A Relationship/Foreign Keys", "3h16m41s", gen_yt_timeurl("3h16m41s", "qw--VYLpxG4")),
                    new topicdata("Adding Relationship Between Tables", "3h19m48s", gen_yt_timeurl("3h19m48s", "qw--VYLpxG4")),
                    new topicdata("Updating Foreign Keys Columns", "3h25m04s", gen_yt_timeurl("3h25m04s", "qw--VYLpxG4")),
                    new topicdata("Inner Joins", "3h29m30s", gen_yt_timeurl("3h29m30s", "qw--VYLpxG4")),
                    new topicdata("Left Joins", "3h35m17s", gen_yt_timeurl("3h35m17s", "qw--VYLpxG4")),
                    new topicdata("Deleting Records With Foreign Keys", "3h40m53s", gen_yt_timeurl("3h40m53s", "qw--VYLpxG4")),
                    new topicdata("Exporting Query Results to CSV", "3h47m27s", gen_yt_timeurl("3h47m27s", "qw--VYLpxG4")),
                    new topicdata("Serial & Sequences", "3h50m42s", gen_yt_timeurl("3h50m42s", "qw--VYLpxG4")),
                    new topicdata("Extensions", "3h57m18s", gen_yt_timeurl("3h57m18s", "qw--VYLpxG4")),
                    new topicdata("Understanding UUID Data Type", "3h59m39s", gen_yt_timeurl("3h59m39s", "qw--VYLpxG4")),
                    new topicdata("UUID As Primary Keys", "4h05m54s", gen_yt_timeurl("4h05m54s", "qw--VYLpxG4")),
                    new topicdata("Conclusion", "4h16m30s", gen_yt_timeurl("4h16m30s", "qw--VYLpxG4")),

            };
            return data;
        } else if (Objects.equals(cardname, "1125")) {
            data = new topicdata[]{
                    new topicdata("MongoDB tutorial for beginners", "00m00s", gen_yt_timeurl("00m00s", "c2M-rlkkT5o")),
                    new topicdata("MongoDB installation", "02m08s", gen_yt_timeurl("02m08s", "c2M-rlkkT5o")),
                    new topicdata("MongoShell installation", "03m56s", gen_yt_timeurl("03m56s", "c2M-rlkkT5o")),
                    new topicdata("Set Environment variable PATH", "04m32s", gen_yt_timeurl("04m32s", "c2M-rlkkT5o")),
                    new topicdata("How to use Mongsh", "05m24s", gen_yt_timeurl("05m24s", "c2M-rlkkT5o")),
                    new topicdata("VSCode w/ Mongosh", "06m02s", gen_yt_timeurl("06m02s", "c2M-rlkkT5o")),
                    new topicdata("databases", "06m59s", gen_yt_timeurl("06m59s", "c2M-rlkkT5o")),
                    new topicdata("insert", "09m43s", gen_yt_timeurl("09m43s", "c2M-rlkkT5o")),
                    new topicdata("data types", "15m40s", gen_yt_timeurl("15m40s", "c2M-rlkkT5o")),
                    new topicdata("sorting and limiting", "20m44s", gen_yt_timeurl("20m44s", "c2M-rlkkT5o")),
                    new topicdata("find", "24m51s", gen_yt_timeurl("24m51s", "c2M-rlkkT5o")),
                    new topicdata("update", "29m26s", gen_yt_timeurl("29m26s", "c2M-rlkkT5o")),
                    new topicdata("delete", "38m07s", gen_yt_timeurl("38m07s", "c2M-rlkkT5o")),
                    new topicdata("comparison operators", "41m26s", gen_yt_timeurl("41m26s", "c2M-rlkkT5o")),
                    new topicdata("logical operators", "46m49s", gen_yt_timeurl("46m49s", "c2M-rlkkT5o")),
                    new topicdata("indexes", "52m00s", gen_yt_timeurl("52m00s", "c2M-rlkkT5o")),
                    new topicdata("collections", "56m15s", gen_yt_timeurl("56m15s", "c2M-rlkkT5o")),

            };
            return data;


        } else if (Objects.equals(cardname, "1127")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "0m00s", gen_yt_timeurl("0m00s", "fgdpvwEWJ9M")),
                    new topicdata("Authentication", "1m02s", gen_yt_timeurl("1m02s", "fgdpvwEWJ9M")),
                    new topicdata("Firestore Database", "13m24s", gen_yt_timeurl("13m24s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase Storage", "27m24s", gen_yt_timeurl("27m24s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase Realtime Updates", "38m10s", gen_yt_timeurl("38m10s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase Firestore Queries", "41m10s", gen_yt_timeurl("41m10s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase Hosting", "44m48s", gen_yt_timeurl("44m48s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase Security Rules", "47m39s", gen_yt_timeurl("47m39s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase onAuthStateChanged", "52m46s", gen_yt_timeurl("52m46s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase with Vanilla JavaScript", "56m23s", gen_yt_timeurl("56m23s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase with Angular 13", "1h24m35s", gen_yt_timeurl("1h24m35s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase with React", "1h56m28s", gen_yt_timeurl("1h56m28s", "fgdpvwEWJ9M")),
                    new topicdata("Firebase with Next JS", "2h29m50s", gen_yt_timeurl("2h29m50s", "fgdpvwEWJ9M")),

            };
            return data;


        } else if (Objects.equals(cardname, "1128")) {
            data = new topicdata[]{
                    new topicdata("Module 1: Cassandra Intro and Background", "00m30s", gen_yt_timeurl("00m30s", "J-cSy5MeMOA")),
                    new topicdata("Module 2: Collections, User Defined Types, and Counters", "21m53s", gen_yt_timeurl("21m53s", "J-cSy5MeMOA")),
                    new topicdata("Module 3: Data Modeling", "31m29s", gen_yt_timeurl("31m29s", "J-cSy5MeMOA")),
                    new topicdata("Module 4: Practical Applications", "1h04m22s", gen_yt_timeurl("1h04m22s", "J-cSy5MeMOA")),

            };
            return data;


        } else if (Objects.equals(cardname, "1129")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "XCsS_NVAa1g")),
                    new topicdata("Installing Redis", "02m26s", gen_yt_timeurl("02m26s", "XCsS_NVAa1g")),
                    new topicdata("Redis Strings", "04m01s", gen_yt_timeurl("04m01s", "XCsS_NVAa1g")),
                    new topicdata("Redis Lists", "11m24s", gen_yt_timeurl("11m24s", "XCsS_NVAa1g")),
                    new topicdata("Redis Sets", "22m16s", gen_yt_timeurl("22m16s", "XCsS_NVAa1g")),
                    new topicdata("Redis Sorted Sets", "29m46s", gen_yt_timeurl("29m46s", "XCsS_NVAa1g")),
                    new topicdata("Redis HyperLogLog", "37m01s", gen_yt_timeurl("37m01s", "XCsS_NVAa1g")),
                    new topicdata("Redis Hashes", "39m43s", gen_yt_timeurl("39m43s", "XCsS_NVAa1g")),
                    new topicdata("Redis Transactions", "45m23s", gen_yt_timeurl("45m23s", "XCsS_NVAa1g")),
                    new topicdata("Redis PubSub", "48m47s", gen_yt_timeurl("48m47s", "XCsS_NVAa1g")),
                    new topicdata("Redis Scripts", "56m25s", gen_yt_timeurl("56m25s", "XCsS_NVAa1g")),
                    new topicdata("Redis Connection & Security", "01h05m20s", gen_yt_timeurl("01h05m20s", "XCsS_NVAa1g")),
                    new topicdata("Redis Geospatial", "01h11m09s", gen_yt_timeurl("01h11m09s", "XCsS_NVAa1g")),
                    new topicdata("Redis Benchmark", "01h22m11s", gen_yt_timeurl("01h22m11s", "XCsS_NVAa1g")),

            };
            return data;


        } else if (Objects.equals(cardname, "1130")) {
            data = new topicdata[]{
                    new topicdata("Planetscale", "0m45s", gen_yt_timeurl("0m45s", "jb2AvF8XzII")),
                    new topicdata("Yugabyte", "1m32s", gen_yt_timeurl("1m32s", "jb2AvF8XzII")),
                    new topicdata("Neon", "1m51s", gen_yt_timeurl("1m51s", "jb2AvF8XzII")),
                    new topicdata("Dolt", "2m08s", gen_yt_timeurl("2m08s", "jb2AvF8XzII")),
                    new topicdata("CockroachDB", "2m43s", gen_yt_timeurl("2m43s", "jb2AvF8XzII")),
                    new topicdata("Cloudflare D1", "3m08s", gen_yt_timeurl("3m08s", "jb2AvF8XzII")),
                    new topicdata("Xata", "3m48s", gen_yt_timeurl("3m48s", "jb2AvF8XzII")),
                    new topicdata("8Base", "4m26s", gen_yt_timeurl("4m26s", "jb2AvF8XzII")),
                    new topicdata("EdgeDB", "4m47s", gen_yt_timeurl("4m47s", "jb2AvF8XzII")),
                    new topicdata("SurrealDB", "5m22s", gen_yt_timeurl("5m22s", "jb2AvF8XzII")),
                    new topicdata("Fauna", "5m55s", gen_yt_timeurl("5m55s", "jb2AvF8XzII")),
                    new topicdata("Mem Graph", "6m23s", gen_yt_timeurl("6m23s", "jb2AvF8XzII")),
                    new topicdata("KeyDB", "6m47s", gen_yt_timeurl("6m47s", "jb2AvF8XzII")),
                    new topicdata("MeiliSearch", "7m20s", gen_yt_timeurl("7m20s", "jb2AvF8XzII")),
                    new topicdata("Mindsdb", "7m49s", gen_yt_timeurl("7m49s", "jb2AvF8XzII")),

            };
            return data;


        } else if (Objects.equals(cardname, "1138")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "XQzEo1qag4A")),
                    new topicdata("Divide & Conquer", "01m22s", gen_yt_timeurl("01m22s", "XQzEo1qag4A")),
                    new topicdata("Increase Cohesion", "02m39s", gen_yt_timeurl("02m39s", "XQzEo1qag4A")),
                    new topicdata("Reducing Coupling", "03m48s", gen_yt_timeurl("03m48s", "XQzEo1qag4A")),
                    new topicdata("Increase Abstraction", "04m59s", gen_yt_timeurl("04m59s", "XQzEo1qag4A")),
                    new topicdata("Increase Reusability", "06m31s", gen_yt_timeurl("06m31s", "XQzEo1qag4A")),
                    new topicdata("Design For Flexibility", "07m30s", gen_yt_timeurl("07m30s", "XQzEo1qag4A")),
                    new topicdata("Anticipate Obsolescence", "08m50s", gen_yt_timeurl("08m50s", "XQzEo1qag4A")),
                    new topicdata("Design For Portability", "09m56s", gen_yt_timeurl("09m56s", "XQzEo1qag4A")),
                    new topicdata("Design For Testability", "11m04s", gen_yt_timeurl("11m04s", "XQzEo1qag4A")),
                    new topicdata("Design Defensively", "12m31s", gen_yt_timeurl("12m31s", "XQzEo1qag4A")),

            };
            return data;


        } else if (Objects.equals(cardname, "1139")) {
            data = new topicdata[]{
                    new topicdata("Layered Pattern / n-tier architecture", "0m33s", gen_yt_timeurl("0m33s", "BrT3AO8bVQY")),
                    new topicdata("Pipe Filter Pattern", "1m40s", gen_yt_timeurl("1m40s", "BrT3AO8bVQY")),
                    new topicdata("Client Server Pattern", "2m49s", gen_yt_timeurl("2m49s", "BrT3AO8bVQY")),
                    new topicdata("Model View Controller Pattern", "3m48s", gen_yt_timeurl("3m48s", "BrT3AO8bVQY")),
                    new topicdata("Event Bus Pattern", "4m48s", gen_yt_timeurl("4m48s", "BrT3AO8bVQY")),
                    new topicdata("Microservices Pattern", "5m48s", gen_yt_timeurl("5m48s", "BrT3AO8bVQY")),
                    new topicdata("Broker Pattern", "6m45s", gen_yt_timeurl("6m45s", "BrT3AO8bVQY")),
                    new topicdata("Peer to Peer Pattern", "7m46s", gen_yt_timeurl("7m46s", "BrT3AO8bVQY")),
                    new topicdata("Blackboard Pattern", "8m54s", gen_yt_timeurl("8m54s", "BrT3AO8bVQY")),
                    new topicdata("Master Slave Pattern", "10m00s", gen_yt_timeurl("10m00s", "BrT3AO8bVQY")),

            };
            return data;


        } else if (Objects.equals(cardname, "1143")) {
            data = new topicdata[]{
                    new topicdata("Teaser", "0m00s", gen_yt_timeurl("0m00s", "KkI3yHjKjqs")),
                    new topicdata("Data Transfer methods", "0m20s", gen_yt_timeurl("0m20s", "KkI3yHjKjqs")),
                    new topicdata("1. HTTP Connection", "1m21s", gen_yt_timeurl("1m21s", "KkI3yHjKjqs")),
                    new topicdata("2. Web Sockets", "1m42s", gen_yt_timeurl("1m42s", "KkI3yHjKjqs")),
                    new topicdata("3. Polling", "2m03s", gen_yt_timeurl("2m03s", "KkI3yHjKjqs")),
                    new topicdata("Server sent events v/s Polling", "3m21s", gen_yt_timeurl("3m21s", "KkI3yHjKjqs")),
                    new topicdata("Advantages of SSE over Web Sockets", "4m16s", gen_yt_timeurl("4m16s", "KkI3yHjKjqs")),
                    new topicdata("Conclusion", "5m46s", gen_yt_timeurl("5m46s", "KkI3yHjKjqs")),
                    new topicdata("Outro", "7m04s", gen_yt_timeurl("7m04s", "KkI3yHjKjqs")),

            };
            return data;


        } else if (Objects.equals(cardname, "1144")) {
            data = new topicdata[]{
                    new topicdata("What is NGINX", "0m00s", gen_yt_timeurl("0m00s", "7VAI73roXaY")),
                    new topicdata("NGINX Installation", "8m02s", gen_yt_timeurl("8m02s", "7VAI73roXaY")),
                    new topicdata("NGINX Terminology", "10m55s", gen_yt_timeurl("10m55s", "7VAI73roXaY")),
                    new topicdata("Serving Static Content", "13m00s", gen_yt_timeurl("13m00s", "7VAI73roXaY")),
                    new topicdata("Mime Types", "17m18s", gen_yt_timeurl("17m18s", "7VAI73roXaY")),
                    new topicdata("Location Context", "22m32s", gen_yt_timeurl("22m32s", "7VAI73roXaY")),
                    new topicdata("Rewrites and Redirect", "33m30s", gen_yt_timeurl("33m30s", "7VAI73roXaY")),
                    new topicdata("NGINX as a Load Balancer", "37m37s", gen_yt_timeurl("37m37s", "7VAI73roXaY")),

            };
            return data;


        } else if (Objects.equals(cardname, "1145")) {
            data = new topicdata[]{
                    new topicdata("What is OpenTelemetry", "00m00s", gen_yt_timeurl("00m00s", "r8UvWSX3KA8")),
                    new topicdata("Course Outline", "03m04s", gen_yt_timeurl("03m04s", "r8UvWSX3KA8")),
                    new topicdata("Let’s go!", "03m40s", gen_yt_timeurl("03m40s", "r8UvWSX3KA8")),
                    new topicdata("What are Microservices?", "04m49s", gen_yt_timeurl("04m49s", "r8UvWSX3KA8")),
                    new topicdata("What is Observability?", "07m11s", gen_yt_timeurl("07m11s", "r8UvWSX3KA8")),
                    new topicdata("M.E.L.T", "07m55s", gen_yt_timeurl("07m55s", "r8UvWSX3KA8")),
                    new topicdata("History", "09m57s", gen_yt_timeurl("09m57s", "r8UvWSX3KA8")),
                    new topicdata("Setting up our Project", "11m22s", gen_yt_timeurl("11m22s", "r8UvWSX3KA8")),
                    new topicdata("What is Tracing?", "21m43s", gen_yt_timeurl("21m43s", "r8UvWSX3KA8")),
                    new topicdata("Context and Propagation", "25m33s", gen_yt_timeurl("25m33s", "r8UvWSX3KA8")),
                    new topicdata("Setting up our Tracing", "27m33s", gen_yt_timeurl("27m33s", "r8UvWSX3KA8")),
                    new topicdata("What are Metrics?", "33m26s", gen_yt_timeurl("33m26s", "r8UvWSX3KA8")),
                    new topicdata("Use cases for OpenTelemetry", "43m37s", gen_yt_timeurl("43m37s", "r8UvWSX3KA8")),
                    new topicdata("Setting up Distributed Tracing", "45m29s", gen_yt_timeurl("45m29s", "r8UvWSX3KA8")),
                    new topicdata("Using other Analysis Tools - New Relic", "1h01m04s", gen_yt_timeurl("1h01m04s", "r8UvWSX3KA8")),
                    new topicdata("Where to go next", "1h07m44s", gen_yt_timeurl("1h07m44s", "r8UvWSX3KA8")),

            };
            return data;


        } else if (Objects.equals(cardname, "1147")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s", gen_yt_timeurl("00m00s", "EExSSotojVI")),
                    new topicdata("Install Intellij IDEA", "01m06s", gen_yt_timeurl("01m06s", "EExSSotojVI")),
                    new topicdata("Hello World", "06m23s", gen_yt_timeurl("06m23s", "EExSSotojVI")),
                    new topicdata("Variables", "25m41s", gen_yt_timeurl("25m41s", "EExSSotojVI")),
                    new topicdata("Window", "41m18s", gen_yt_timeurl("41m18s", "EExSSotojVI")),
                    new topicdata("Integer Type", "42m24s", gen_yt_timeurl("42m24s", "EExSSotojVI")),
                    new topicdata("DataType: Byte, Short and Long", "53m08s", gen_yt_timeurl("53m08s", "EExSSotojVI")),
                    new topicdata("Float and Double", "1h04m42s", gen_yt_timeurl("1h04m42s", "EExSSotojVI")),
                    new topicdata("Char and Boolean", "1h16m16s", gen_yt_timeurl("1h16m16s", "EExSSotojVI")),
                    new topicdata("Operators", "1h25m55s", gen_yt_timeurl("1h25m55s", "EExSSotojVI")),
                    new topicdata("Comments", "1h49m47s", gen_yt_timeurl("1h49m47s", "EExSSotojVI")),
                    new topicdata("IfThenElse: Statement-Expression", "1h51m43s", gen_yt_timeurl("1h51m43s", "EExSSotojVI")),
                    new topicdata("Less Than or Equal To Operator", "2h02m25s", gen_yt_timeurl("2h02m25s", "EExSSotojVI")),
                    new topicdata("logical AND operator", "2h10m33s", gen_yt_timeurl("2h10m33s", "EExSSotojVI")),
                    new topicdata("logical OR operator", "2h14m52s", gen_yt_timeurl("2h14m52s", "EExSSotojVI")),
                    new topicdata("When Statement-Expression", "2h29m48s", gen_yt_timeurl("2h29m48s", "EExSSotojVI")),
                    new topicdata("Null", "2h44m16s", gen_yt_timeurl("2h44m16s", "EExSSotojVI")),
                    new topicdata("Functions", "2h59m59s", gen_yt_timeurl("2h59m59s", "EExSSotojVI")),
                    new topicdata("Function: return and expressions", "3h15m46s", gen_yt_timeurl("3h15m46s", "EExSSotojVI")),
                    new topicdata("Functions Overloading", "3h27m43s", gen_yt_timeurl("3h27m43s", "EExSSotojVI")),
                    new topicdata("Functions Default Values", "3h33m57s", gen_yt_timeurl("3h33m57s", "EExSSotojVI")),
                    new topicdata("Functions vararg keyword", "3h44m09s", gen_yt_timeurl("3h44m09s", "EExSSotojVI")),
                    new topicdata("loops: FOR loop", "3h55m17s", gen_yt_timeurl("3h55m17s", "EExSSotojVI")),
                    new topicdata("loops: WHILE and DO WHILE loop, Labels and continue and break", "4h05m18s", gen_yt_timeurl("4h05m18s", "EExSSotojVI")),
                    new topicdata("loops Challenge", "4h28m26s", gen_yt_timeurl("4h28m26s", "EExSSotojVI")),
                    new topicdata("Arrays", "4h43m14s", gen_yt_timeurl("4h43m14s", "EExSSotojVI")),
                    new topicdata("Arrays Challenge", "4h59m56s", gen_yt_timeurl("4h59m56s", "EExSSotojVI")),
                    new topicdata("OOP:Classes", "5h18m41s", gen_yt_timeurl("5h18m41s", "EExSSotojVI")),
                    new topicdata("OOP:Primary Constructor", "5h37m01s", gen_yt_timeurl("5h37m01s", "EExSSotojVI")),
                    new topicdata("OOP:Initializer Blocks", "5h51m25s", gen_yt_timeurl("5h51m25s", "EExSSotojVI")),
                    new topicdata("OOP:Secondary Constructors", "6h07m03s", gen_yt_timeurl("6h07m03s", "EExSSotojVI")),
                    new topicdata("OOP:Constructor Parameters Default Values", "6h23m56s", gen_yt_timeurl("6h23m56s", "EExSSotojVI")),
                    new topicdata("OOP:Getters and Setters", "6h31m08s", gen_yt_timeurl("6h31m08s", "EExSSotojVI")),
                    new topicdata("OOP:lateinit keyword", "6h48m00s", gen_yt_timeurl("6h48m00s", "EExSSotojVI")),
                    new topicdata("OOP:Companion Object", "6h57m52s", gen_yt_timeurl("6h57m52s", "EExSSotojVI")),
                    new topicdata("OOP:Singleton", "7h07m47s", gen_yt_timeurl("7h07m47s", "EExSSotojVI")),
                    new topicdata("OOP:Lazy Initialization", "7h19m08s", gen_yt_timeurl("7h19m08s", "EExSSotojVI")),
                    new topicdata("OOP:Enum Classes", "7h25m02s", gen_yt_timeurl("7h25m02s", "EExSSotojVI")),
                    new topicdata("OOP:Inner Classes", "7h39m27s", gen_yt_timeurl("7h39m27s", "EExSSotojVI")),
                    new topicdata("OOP:Challenge", "7h44m19s", gen_yt_timeurl("7h44m19s", "EExSSotojVI")),
                    new topicdata("OOP:Inheritance 1", "8h00m16s", gen_yt_timeurl("8h00m16s", "EExSSotojVI")),
                    new topicdata("OOP:Inheritance 2", "8h20m37s", gen_yt_timeurl("8h20m37s", "EExSSotojVI")),
                    new topicdata("OOP:Sealed Class", "8h35m31s", gen_yt_timeurl("8h35m31s", "EExSSotojVI")),
                    new topicdata("OOP:Abstract Classes", "8h48m57s", gen_yt_timeurl("8h48m57s", "EExSSotojVI")),
                    new topicdata("OOP:Data Class", "8h56m29s", gen_yt_timeurl("8h56m29s", "EExSSotojVI")),
                    new topicdata("OOP:Interfaces 1", "9h23m53s", gen_yt_timeurl("9h23m53s", "EExSSotojVI")),
                    new topicdata("OOP:Interfaces 2", "9h35m37s", gen_yt_timeurl("9h35m37s", "EExSSotojVI")),
                    new topicdata("OOP:Object Expression", "9h49m03s", gen_yt_timeurl("9h49m03s", "EExSSotojVI")),
                    new topicdata("OOP:Delegation", "9h58m09s", gen_yt_timeurl("9h58m09s", "EExSSotojVI")),
                    new topicdata("List, Set, Map", "10h05m20s", gen_yt_timeurl("10h05m20s", "EExSSotojVI")),
                    new topicdata("Mapping", "10h22m26s", gen_yt_timeurl("10h22m26s", "EExSSotojVI")),
                    new topicdata("Zipping and Association", "10h34m17s", gen_yt_timeurl("10h34m17s", "EExSSotojVI")),
                    new topicdata("Flatten", "10h49m34s", gen_yt_timeurl("10h49m34s", "EExSSotojVI")),
                    new topicdata("String Representation", "10h59m17s", gen_yt_timeurl("10h59m17s", "EExSSotojVI")),
                    new topicdata("Filtering", "11h10m19s", gen_yt_timeurl("11h10m19s", "EExSSotojVI")),
                    new topicdata("Test Predicates", "11h28m53s", gen_yt_timeurl("11h28m53s", "EExSSotojVI")),
                    new topicdata("Plus and Minus Operators", "11h31m30s", gen_yt_timeurl("11h31m30s", "EExSSotojVI")),
                    new topicdata("Grouping", "11h34m45s", gen_yt_timeurl("11h34m45s", "EExSSotojVI")),
                    new topicdata("Retrieve Collection parts", "11h39m41s", gen_yt_timeurl("11h39m41s", "EExSSotojVI")),
                    new topicdata("Retrieve Single Elements", "11h59m47s", gen_yt_timeurl("11h59m47s", "EExSSotojVI")),
                    new topicdata("Aggregate Operations", "12h04m28s", gen_yt_timeurl("12h04m28s", "EExSSotojVI")),
                    new topicdata("Comparable and Comparator", "12h09m23s", gen_yt_timeurl("12h09m23s", "EExSSotojVI")),
                    new topicdata("Binary Search", "12h36m43s", gen_yt_timeurl("12h36m43s", "EExSSotojVI")),
                    new topicdata("Generics: Type Parameters and Casting", "12h51m06s", gen_yt_timeurl("12h51m06s", "EExSSotojVI")),
                    new topicdata("Generics: Upper Bounds", "13h07m28s", gen_yt_timeurl("13h07m28s", "EExSSotojVI")),


            };
            return data;


        } else if (Objects.equals(cardname, "1148")) {
            data = new topicdata[]{
                    new topicdata("Introduction & Overview: Topics, Source", "00m16s", gen_yt_timeurl("00m16s", "bo_LP6QOUio")),
                    new topicdata("App Design Approach: 3rd Party Library Minimalism & MV-Whatever Architecture", "02m39s", gen_yt_timeurl("02m39s", "bo_LP6QOUio")),
                    new topicdata("Domain package: Repository Pattern, Enum, Data Class, Sealed Class, Hash Code, Interfaces", "04m50s", gen_yt_timeurl("04m50s", "bo_LP6QOUio")),
                    new topicdata("Common package: Extension Functions & Variables, Open-Closed Principle (OCP), Abstract Class, Singleton", "34m39s", gen_yt_timeurl("34m39s", "bo_LP6QOUio")),
                    new topicdata("Persistence (Storage) package: Clean Architecture Back End w/ Java File System Storage, Jetpack Proto Datastore", "50m20s", gen_yt_timeurl("50m20s", "bo_LP6QOUio")),
                    new topicdata("UI package: Jetpack Compose UI Basics, Styles, Typography,  Light & Dark Themes", "1h28m07s", gen_yt_timeurl("1h28m07s", "bo_LP6QOUio")),
                    new topicdata("UI Components package: Modifiers, Reusable Toolbar & Loading Screens", "1h39m56s", gen_yt_timeurl("1h39m56s", "bo_LP6QOUio")),
                    new topicdata("UI Active Game Feature package: Presentation Logic & ViewModel w/ Coroutines, Kotlin Function Types", "1h52m08s", gen_yt_timeurl("1h52m08s", "bo_LP6QOUio")),
                    new topicdata("UI Active Game Feature package: Sudoku Game with Jetpack Compose UI & Activity Container", "2h30m55s", gen_yt_timeurl("2h30m55s", "bo_LP6QOUio")),
                    new topicdata("Computation Logic package:  Overview, design, and testing of Graph DS & Algos for n-sized square Sudokus", "3h15m58s", gen_yt_timeurl("3h15m58s", "bo_LP6QOUio")),

            };
            return data;


        } else if (Objects.equals(cardname, "1149")) {
            data = new topicdata[]{
                    new topicdata("What is Gradle?", "00m00s", gen_yt_timeurl("00m00s", "o0M4f5djJTQ")),
                    new topicdata("Gradle Groovy vs. Gradle Kotlin DSL", "03m18s", gen_yt_timeurl("03m18s", "o0M4f5djJTQ")),
                    new topicdata("The Gradle wrapper", "05m07s", gen_yt_timeurl("05m07s", "o0M4f5djJTQ")),
                    new topicdata("Build types", "08m38s", gen_yt_timeurl("08m38s", "o0M4f5djJTQ")),
                    new topicdata("Product flavors", "12m42s", gen_yt_timeurl("12m42s", "o0M4f5djJTQ")),
                    new topicdata("Source sets", "19m22s", gen_yt_timeurl("19m22s", "o0M4f5djJTQ")),


            };
            return data;


        } else if (Objects.equals(cardname, "1155")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "5GHT4QtotE4")),
                    new topicdata("Create Developer account", "01m02s", gen_yt_timeurl("01m02s", "5GHT4QtotE4")),
                    new topicdata("Create an App", "02m02s", gen_yt_timeurl("02m02s", "5GHT4QtotE4")),
                    new topicdata("The Dashboard", "02m32s", gen_yt_timeurl("02m32s", "5GHT4QtotE4")),
                    new topicdata("Setup App Content", "04m50s", gen_yt_timeurl("04m50s", "5GHT4QtotE4")),
                    new topicdata("Prepare Store Listing", "08m08s", gen_yt_timeurl("08m08s", "5GHT4QtotE4")),
                    new topicdata("Create App Release", "11m16s", gen_yt_timeurl("11m16s", "5GHT4QtotE4")),
                    new topicdata("Best practices", "12m42s", gen_yt_timeurl("12m42s", "5GHT4QtotE4")),


            };
            return data;


        } else if (Objects.equals(cardname, "1156")) {
            data = new topicdata[]{
                    new topicdata("Introduction", "00m00s​", gen_yt_timeurl("00m00s​", "Oe421EPjeBE")),
                    new topicdata("What Is Node", "01m41s​", gen_yt_timeurl("01m41s​", "Oe421EPjeBE")),
                    new topicdata("Course Requirements", "02m56s​", gen_yt_timeurl("02m56s​", "Oe421EPjeBE")),
                    new topicdata("Course Structure", "04m16s​", gen_yt_timeurl("04m16s​", "Oe421EPjeBE")),
                    new topicdata("Browser Vs Server", "04m59s​", gen_yt_timeurl("04m59s​", "Oe421EPjeBE")),
                    new topicdata("Install Node", "07m50s​", gen_yt_timeurl("07m50s​", "Oe421EPjeBE")),
                    new topicdata("Repl", "11m08s​", gen_yt_timeurl("11m08s​", "Oe421EPjeBE")),
                    new topicdata("Cli", "13m27s​", gen_yt_timeurl("13m27s​", "Oe421EPjeBE")),
                    new topicdata("Source Code", "19m07s​", gen_yt_timeurl("19m07s​", "Oe421EPjeBE")),
                    new topicdata("Globals", "20m27s​", gen_yt_timeurl("20m27s​", "Oe421EPjeBE")),
                    new topicdata("Modules Setup", "29m34s​", gen_yt_timeurl("29m34s​", "Oe421EPjeBE")),
                    new topicdata("First Module", "32m46s​", gen_yt_timeurl("32m46s​", "Oe421EPjeBE")),
                    new topicdata("Alternative Syntax", "45m32s​", gen_yt_timeurl("45m32s​", "Oe421EPjeBE")),
                    new topicdata("Mind Grenade", "49m50s​", gen_yt_timeurl("49m50s​", "Oe421EPjeBE")),
                    new topicdata("Built-In Module Intro", "53m47s​", gen_yt_timeurl("53m47s​", "Oe421EPjeBE")),
                    new topicdata("Os Module", "56m31s​", gen_yt_timeurl("56m31s​", "Oe421EPjeBE")),
                    new topicdata("Path Module", "1h04m13s​", gen_yt_timeurl("1h04m13s​", "Oe421EPjeBE")),
                    new topicdata("Fs Module (Sync)", "1h10m06s​", gen_yt_timeurl("1h10m06s​", "Oe421EPjeBE")),
                    new topicdata("Fs Module (Async)", "1h18m28s​", gen_yt_timeurl("1h18m28s​", "Oe421EPjeBE")),
                    new topicdata("Sync Vs Async", "1h27m32s​", gen_yt_timeurl("1h27m32s​", "Oe421EPjeBE")),
                    new topicdata("Http Intro", "1h34m29s​", gen_yt_timeurl("1h34m29s​", "Oe421EPjeBE")),
                    new topicdata("Http Module (Setup)", "1h35m58s​", gen_yt_timeurl("1h35m58s​", "Oe421EPjeBE")),
                    new topicdata("Http Module (More Features)", "1h40m53s​", gen_yt_timeurl("1h40m53s​", "Oe421EPjeBE")),
                    new topicdata("NPM Info", "1h45m57s​", gen_yt_timeurl("1h45m57s​", "Oe421EPjeBE")),
                    new topicdata("NPM Command", "1h50m19s​", gen_yt_timeurl("1h50m19s​", "Oe421EPjeBE")),
                    new topicdata("First Package", "1h53m10s​", gen_yt_timeurl("1h53m10s​", "Oe421EPjeBE")),
                    new topicdata("Share Code", "2h02m52s​", gen_yt_timeurl("2h02m52s​", "Oe421EPjeBE")),
                    new topicdata("Nodemon", "2h09m04s​", gen_yt_timeurl("2h09m04s​", "Oe421EPjeBE")),
                    new topicdata("Uninstall", "2h15m04s​", gen_yt_timeurl("2h15m04s​", "Oe421EPjeBE")),
                    new topicdata("Global Install", "2h17m53s​", gen_yt_timeurl("2h17m53s​", "Oe421EPjeBE")),
                    new topicdata("Package-Lock.Json", "2h23m22s​", gen_yt_timeurl("2h23m22s​", "Oe421EPjeBE")),
                    new topicdata("Important Topics Intro", "2h25m56s​", gen_yt_timeurl("2h25m56s​", "Oe421EPjeBE")),
                    new topicdata("Event Loop", "2h27m38s​", gen_yt_timeurl("2h27m38s​", "Oe421EPjeBE")),
                    new topicdata("Event Loop Slides", "2h30m47s​", gen_yt_timeurl("2h30m47s​", "Oe421EPjeBE")),
                    new topicdata("Event Loop Code Examples", "2h37m46s​", gen_yt_timeurl("2h37m46s​", "Oe421EPjeBE")),
                    new topicdata("Async Patterns - Blocking Code", "2h47m07s​", gen_yt_timeurl("2h47m07s​", "Oe421EPjeBE")),
                    new topicdata("Async Patterns - Setup Promises", "2h54m49s​", gen_yt_timeurl("2h54m49s​", "Oe421EPjeBE")),
                    new topicdata("Async Patterns - Refactor To Async", "3h00m35s​", gen_yt_timeurl("3h00m35s​", "Oe421EPjeBE")),
                    new topicdata("Async Patterns - Node's Native Option", "3h06m05s​", gen_yt_timeurl("3h06m05s​", "Oe421EPjeBE")),
                    new topicdata("Events Info", "3h12m41s​", gen_yt_timeurl("3h12m41s​", "Oe421EPjeBE")),
                    new topicdata("Events Emitter - Code Example", "3h14m44s​", gen_yt_timeurl("3h14m44s​", "Oe421EPjeBE")),
                    new topicdata("Events Emitter - Additional Info", "3h18m37s​", gen_yt_timeurl("3h18m37s​", "Oe421EPjeBE")),
                    new topicdata("Events Emitter - Http Module Example", "3h21m44s​", gen_yt_timeurl("3h21m44s​", "Oe421EPjeBE")),
                    new topicdata("Streams Intro", "3h25m10s​", gen_yt_timeurl("3h25m10s​", "Oe421EPjeBE")),
                    new topicdata("Streams - Read File", "3h26m18s​", gen_yt_timeurl("3h26m18s​", "Oe421EPjeBE")),
                    new topicdata("Streams - Additional Info", "3h33m01s​", gen_yt_timeurl("3h33m01s​", "Oe421EPjeBE")),
                    new topicdata("Streams - Http Example", "3h35m05s​", gen_yt_timeurl("3h35m05s​", "Oe421EPjeBE")),
                    new topicdata("End Of Node Tutorial Module", "3h40m29s​", gen_yt_timeurl("3h40m29s​", "Oe421EPjeBE")),
                    new topicdata("HTTP Request/Response Cycle", "3h40m46s​", gen_yt_timeurl("3h40m46s​", "Oe421EPjeBE")),
                    new topicdata("Http Messages", "3h44m49s​", gen_yt_timeurl("3h44m49s​", "Oe421EPjeBE")),
                    new topicdata("Starter Project Install", "3h55m52s​", gen_yt_timeurl("3h55m52s​", "Oe421EPjeBE")),
                    new topicdata("Starter Overview", "3h57m59s​", gen_yt_timeurl("3h57m59s​", "Oe421EPjeBE")),
                    new topicdata("Http Basics", "4h03m25s​", gen_yt_timeurl("4h03m25s​", "Oe421EPjeBE")),
                    new topicdata("Http - Headers", "4h15m09s​", gen_yt_timeurl("4h15m09s​", "Oe421EPjeBE")),
                    new topicdata("Http - Request Object", "4h24m50s​", gen_yt_timeurl("4h24m50s​", "Oe421EPjeBE")),
                    new topicdata("Http - Html File", "4h32m00s​", gen_yt_timeurl("4h32m00s​", "Oe421EPjeBE")),
                    new topicdata("Http - App Example", "4h37m20s​", gen_yt_timeurl("4h37m20s​", "Oe421EPjeBE")),
                    new topicdata("Express Info", "4h48m02s​", gen_yt_timeurl("4h48m02s​", "Oe421EPjeBE")),
                    new topicdata("Express Basics", "4h51m50s​", gen_yt_timeurl("4h51m50s​", "Oe421EPjeBE")),
                    new topicdata("Express - App Example", "5h03m05s​", gen_yt_timeurl("5h03m05s​", "Oe421EPjeBE")),
                    new topicdata("Express - All Static", "5h14m31s​", gen_yt_timeurl("5h14m31s​", "Oe421EPjeBE")),
                    new topicdata("API Vs SSR", "5h18m13s​", gen_yt_timeurl("5h18m13s​", "Oe421EPjeBE")),
                    new topicdata("JSON Basics", "5h24m07s​", gen_yt_timeurl("5h24m07s​", "Oe421EPjeBE")),
                    new topicdata("Params, Query String - Setup", "5h32m40s​", gen_yt_timeurl("5h32m40s​", "Oe421EPjeBE")),
                    new topicdata("Route Params", "5h39m13s​", gen_yt_timeurl("5h39m13s​", "Oe421EPjeBE")),
                    new topicdata("Params - Extra Info", "5h48m25s​", gen_yt_timeurl("5h48m25s​", "Oe421EPjeBE")),
                    new topicdata("Query String", "5h50m42s​", gen_yt_timeurl("5h50m42s​", "Oe421EPjeBE")),
                    new topicdata("Additional Params And Query String Info", "6h07m31s​", gen_yt_timeurl("6h07m31s​", "Oe421EPjeBE")),
                    new topicdata("Middleware - Setup", "6h10m46s​", gen_yt_timeurl("6h10m46s​", "Oe421EPjeBE")),
                    new topicdata("APP.USE", "6h21m27s​", gen_yt_timeurl("6h21m27s​", "Oe421EPjeBE")),
                    new topicdata("Multiple Middleware Functions", "6h28m31s​", gen_yt_timeurl("6h28m31s​", "Oe421EPjeBE")),
                    new topicdata("Additional Middleware Info", "6h36m36s​", gen_yt_timeurl("6h36m36s​", "Oe421EPjeBE")),
                    new topicdata("Methods - GET", "6h43m26s​", gen_yt_timeurl("6h43m26s​", "Oe421EPjeBE")),
                    new topicdata("Methods - POST", "6h49m01s​", gen_yt_timeurl("6h49m01s​", "Oe421EPjeBE")),
                    new topicdata("Methods - POST (Form Example)", "6h52m53s​", gen_yt_timeurl("6h52m53s​", "Oe421EPjeBE")),
                    new topicdata("Methods - POST (Javascript Example)", "7h05m31s​", gen_yt_timeurl("7h05m31s​", "Oe421EPjeBE")),
                    new topicdata("Install Postman", "7h21m22s​", gen_yt_timeurl("7h21m22s​", "Oe421EPjeBE")),
                    new topicdata("Methods - PUT", "7h30m19s​", gen_yt_timeurl("7h30m19s​", "Oe421EPjeBE")),
                    new topicdata("Methods - DELETE", "7h41m43s​", gen_yt_timeurl("7h41m43s​", "Oe421EPjeBE")),
                    new topicdata("Express Router - Setup", "7h50m05s​", gen_yt_timeurl("7h50m05s​", "Oe421EPjeBE")),
                    new topicdata("Express Router - Controllers", "8h05m36s", gen_yt_timeurl("8h05m36s", "Oe421EPjeBE")),

            };
            return data;


        } else if (Objects.equals(cardname, "1158")) {
            data = new topicdata[]{
                    new topicdata("Meet Your Instructor Andrew Brown", "00m00s", gen_yt_timeurl("00m00s", "3hLmDS179YE")),
                    new topicdata("Why Get AWS Cloud Practitioner Certified?", "00m40s", gen_yt_timeurl("00m40s", "3hLmDS179YE")),
                    new topicdata("Exam Guide Overview", "06m40s", gen_yt_timeurl("06m40s", "3hLmDS179YE")),
                    new topicdata("What is Cloud Computing?", "09m57s", gen_yt_timeurl("09m57s", "3hLmDS179YE")),
                    new topicdata("Six Advantages and Benefits of Cloud Computing", "12m10s", gen_yt_timeurl("12m10s", "3hLmDS179YE")),
                    new topicdata("Types of Cloud Computing", "14m42s", gen_yt_timeurl("14m42s", "3hLmDS179YE")),
                    new topicdata("Cloud Computing Deployment Models", "16m48s", gen_yt_timeurl("16m48s", "3hLmDS179YE")),
                    new topicdata("Introduction and Map Overview", "19m27s", gen_yt_timeurl("19m27s", "3hLmDS179YE")),
                    new topicdata("Regions", "20m30s", gen_yt_timeurl("20m30s", "3hLmDS179YE")),
                    new topicdata("Availability Zones", "24m30s", gen_yt_timeurl("24m30s", "3hLmDS179YE")),
                    new topicdata("Edge Locations", "25m42s", gen_yt_timeurl("25m42s", "3hLmDS179YE")),
                    new topicdata("GovCloud Regions", "27m27s", gen_yt_timeurl("27m27s", "3hLmDS179YE")),
                    new topicdata("Creating an AWS Account", "29m20s", gen_yt_timeurl("29m20s", "3hLmDS179YE")),
                    new topicdata("Billing Preferences, Budgets and Alarms", "32m43s", gen_yt_timeurl("32m43s", "3hLmDS179YE")),
                    new topicdata("Change IAM Users Sign-in Link", "40m09s", gen_yt_timeurl("40m09s", "3hLmDS179YE")),
                    new topicdata("Activate MFA on Root Account", "41m14s", gen_yt_timeurl("41m14s", "3hLmDS179YE")),
                    new topicdata("Create individual IAM user", "43m40s", gen_yt_timeurl("43m40s", "3hLmDS179YE")),
                    new topicdata("Set a password policy", "48m44s", gen_yt_timeurl("48m44s", "3hLmDS179YE")),
                    new topicdata("Intro and Regions", "49m50s", gen_yt_timeurl("49m50s", "3hLmDS179YE")),
                    new topicdata("EC2", "51m03s", gen_yt_timeurl("51m03s", "3hLmDS179YE")),
                    new topicdata("Sessions Manager", "55m36s", gen_yt_timeurl("55m36s", "3hLmDS179YE")),
                    new topicdata("AMI", "58m36s", gen_yt_timeurl("58m36s", "3hLmDS179YE")),
                    new topicdata("Auto Scaling Groups", "1h00m32s", gen_yt_timeurl("1h00m32s", "3hLmDS179YE")),
                    new topicdata("Elastic Load Balancer", "1h07m31s", gen_yt_timeurl("1h07m31s", "3hLmDS179YE")),
                    new topicdata("S3", "1h12m47s", gen_yt_timeurl("1h12m47s", "3hLmDS179YE")),
                    new topicdata("CloudFront", "1h14m29s", gen_yt_timeurl("1h14m29s", "3hLmDS179YE")),
                    new topicdata("RDS", "1h16m52s", gen_yt_timeurl("1h16m52s", "3hLmDS179YE")),
                    new topicdata("Lambda", "1h22m00s", gen_yt_timeurl("1h22m00s", "3hLmDS179YE")),
                    new topicdata("Introduction", "1h25m28s", gen_yt_timeurl("1h25m28s", "3hLmDS179YE")),
                    new topicdata("On-Demand", "1h25m46s", gen_yt_timeurl("1h25m46s", "3hLmDS179YE")),
                    new topicdata("Reserved", "1h26m19s", gen_yt_timeurl("1h26m19s", "3hLmDS179YE")),
                    new topicdata("Spot", "1h28m52s", gen_yt_timeurl("1h28m52s", "3hLmDS179YE")),
                    new topicdata("Dedicated", "1h30m38s", gen_yt_timeurl("1h30m38s", "3hLmDS179YE")),
                    new topicdata("EC2 Pricing CheatSheet", "1h32m11s", gen_yt_timeurl("1h32m11s", "3hLmDS179YE")),
                    new topicdata("Free Services", "1h35m04s", gen_yt_timeurl("1h35m04s", "3hLmDS179YE")),
                    new topicdata("AWS Support Plans", "1h36m08s", gen_yt_timeurl("1h36m08s", "3hLmDS179YE")),
                    new topicdata("Follow Along - Lets create a support case", "1h40m05s", gen_yt_timeurl("1h40m05s", "3hLmDS179YE")),
                    new topicdata("AWS Marketplace", "1h44m05s", gen_yt_timeurl("1h44m05s", "3hLmDS179YE")),
                    new topicdata("Follow Along - Marketplace subscription", "1h45m05s", gen_yt_timeurl("1h45m05s", "3hLmDS179YE")),
                    new topicdata("AWS Trusted Advisor", "1h50m45s", gen_yt_timeurl("1h50m45s", "3hLmDS179YE")),
                    new topicdata("Follow Along Trusted Advisor", "1h54m13s", gen_yt_timeurl("1h54m13s", "3hLmDS179YE")),
                    new topicdata("Consolidated Billing", "1h55m43s", gen_yt_timeurl("1h55m43s", "3hLmDS179YE")),
                    new topicdata("Consolidated Billing Volume Discounts", "1h56m54s", gen_yt_timeurl("1h56m54s", "3hLmDS179YE")),
                    new topicdata("AWS Cost Explorer", "1h58m36s", gen_yt_timeurl("1h58m36s", "3hLmDS179YE")),
                    new topicdata("AWS Cost Explorer Follow Along", "2h00m16s", gen_yt_timeurl("2h00m16s", "3hLmDS179YE")),
                    new topicdata("AWS Budgets", "2h04m16s", gen_yt_timeurl("2h04m16s", "3hLmDS179YE")),
                    new topicdata("AWS Budgets Follow Along", "2h06m31s", gen_yt_timeurl("2h06m31s", "3hLmDS179YE")),
                    new topicdata("TCO Calculator", "2h10m24s", gen_yt_timeurl("2h10m24s", "3hLmDS179YE")),
                    new topicdata("TCO Calculator Follow ALong", "2h11m20s", gen_yt_timeurl("2h11m20s", "3hLmDS179YE")),
                    new topicdata("AWS Landing Zone", "2h14m44s", gen_yt_timeurl("2h14m44s", "3hLmDS179YE")),
                    new topicdata("Resource Groups and Tagging", "2h17m28s", gen_yt_timeurl("2h17m28s", "3hLmDS179YE")),
                    new topicdata("Resource Groups Follow Along", "2h18m37s", gen_yt_timeurl("2h18m37s", "3hLmDS179YE")),
                    new topicdata("AWS QuickStart", "2h23m40s", gen_yt_timeurl("2h23m40s", "3hLmDS179YE")),
                    new topicdata("AWS Cost and Usage Report", "2h26m48s", gen_yt_timeurl("2h26m48s", "3hLmDS179YE")),
                    new topicdata("Cost and Usage Follow Along", "2h27m32s", gen_yt_timeurl("2h27m32s", "3hLmDS179YE")),
                    new topicdata("AWS Organizations and Accounts", "2h30m18s", gen_yt_timeurl("2h30m18s", "3hLmDS179YE")),
                    new topicdata("AWS Organizations Follow Along", "2h31m43s", gen_yt_timeurl("2h31m43s", "3hLmDS179YE")),
                    new topicdata("AWS Networking", "2h44m13s", gen_yt_timeurl("2h44m13s", "3hLmDS179YE")),
                    new topicdata("Database Services", "2h47m27s", gen_yt_timeurl("2h47m27s", "3hLmDS179YE")),
                    new topicdata("Provisioning Services", "2h51m31s", gen_yt_timeurl("2h51m31s", "3hLmDS179YE")),
                    new topicdata("Computing Services", "2h56m01s", gen_yt_timeurl("2h56m01s", "3hLmDS179YE")),
                    new topicdata("Storage Services", "3h00m05s", gen_yt_timeurl("3h00m05s", "3hLmDS179YE")),
                    new topicdata("Business Centric Services", "3h03m52s", gen_yt_timeurl("3h03m52s", "3hLmDS179YE")),
                    new topicdata("Enterprise Integration", "3h07m28s", gen_yt_timeurl("3h07m28s", "3hLmDS179YE")),
                    new topicdata("Logging Services", "3h09m13s", gen_yt_timeurl("3h09m13s", "3hLmDS179YE")),
                    new topicdata("Know your Initialisms", "3h12m33s", gen_yt_timeurl("3h12m33s", "3hLmDS179YE")),
                    new topicdata("Shared Responsibility Model", "3h13m49s", gen_yt_timeurl("3h13m49s", "3hLmDS179YE")),
                    new topicdata("AWS Compliance programs", "3h15m34s", gen_yt_timeurl("3h15m34s", "3hLmDS179YE")),
                    new topicdata("AWS Artifact", "3h17m59s", gen_yt_timeurl("3h17m59s", "3hLmDS179YE")),
                    new topicdata("AWS Artifact Follow Along", "3h19m05s", gen_yt_timeurl("3h19m05s", "3hLmDS179YE")),
                    new topicdata("Amazon Inspector", "3h21m35s", gen_yt_timeurl("3h21m35s", "3hLmDS179YE")),
                    new topicdata("AWS WAF", "3h23m04s", gen_yt_timeurl("3h23m04s", "3hLmDS179YE")),
                    new topicdata("AWS Shield", "3h24m17s", gen_yt_timeurl("3h24m17s", "3hLmDS179YE")),
                    new topicdata("Penetration Testing", "3h27m42s", gen_yt_timeurl("3h27m42s", "3hLmDS179YE")),
                    new topicdata("Guard Duty", "3h29m29s", gen_yt_timeurl("3h29m29s", "3hLmDS179YE")),
                    new topicdata("Key Management Service", "3h31m13s", gen_yt_timeurl("3h31m13s", "3hLmDS179YE")),
                    new topicdata("Amazon Macie", "3h32m50s", gen_yt_timeurl("3h32m50s", "3hLmDS179YE")),
                    new topicdata("Security Groups vs NACLs", "3h35m06s", gen_yt_timeurl("3h35m06s", "3hLmDS179YE")),
                    new topicdata("AWS VPN", "3h37m02s", gen_yt_timeurl("3h37m02s", "3hLmDS179YE")),
                    new topicdata("Cloud* Service", "3h38m10s", gen_yt_timeurl("3h38m10s", "3hLmDS179YE")),
                    new topicdata("*Connect Service", "3h40m14s", gen_yt_timeurl("3h40m14s", "3hLmDS179YE")),
                    new topicdata("Elastic Transcoder vs Media Convert", "3h41m28s", gen_yt_timeurl("3h41m28s", "3hLmDS179YE")),
                    new topicdata("SNS vs SQS", "3h42m50s", gen_yt_timeurl("3h42m50s", "3hLmDS179YE")),
                    new topicdata("Inspector vs Trusted Advisor", "3h45m17s", gen_yt_timeurl("3h45m17s", "3hLmDS179YE")),
                    new topicdata("ALB vs NLB vs CLB", "3h46m41s", gen_yt_timeurl("3h46m41s", "3hLmDS179YE")),
                    new topicdata("SNS vs SES", "3h49m07s", gen_yt_timeurl("3h49m07s", "3hLmDS179YE")),
                    new topicdata("Artifact vs Inspector", "3h50m58s", gen_yt_timeurl("3h50m58s", "3hLmDS179YE")),
                    new topicdata("Journey's End", "3h51m49s", gen_yt_timeurl("3h51m49s", "3hLmDS179YE")),
                    new topicdata("Booking Your Exam", "3h52m10s", gen_yt_timeurl("3h52m10s", "3hLmDS179YE")),
                    new topicdata("Thank You and Good Luck!", "3h57m34s", gen_yt_timeurl("3h57m34s", "3hLmDS179YE")),

            };
            return data;


        } else if (Objects.equals(cardname, "1160")) {
            data = new topicdata[]{
                    new topicdata("Why Ansible?", "01m06s", gen_yt_timeurl("01m06s", "wgQ3rHFTM4E")),
                    new topicdata("What is Ansible?", "03m07s", gen_yt_timeurl("03m07s", "wgQ3rHFTM4E")),
                    new topicdata("Ansible - Pull configuration tool", "04m10s", gen_yt_timeurl("04m10s", "wgQ3rHFTM4E")),
                    new topicdata("Ansible architecture", "06m04s", gen_yt_timeurl("06m04s", "wgQ3rHFTM4E")),
                    new topicdata("Playbook", "07m11s", gen_yt_timeurl("07m11s", "wgQ3rHFTM4E")),
                    new topicdata("Inventory", "09m29s", gen_yt_timeurl("09m29s", "wgQ3rHFTM4E")),
                    new topicdata("Working of Ansible", "10m19s", gen_yt_timeurl("10m19s", "wgQ3rHFTM4E")),
                    new topicdata("Ansible tower", "11m36s", gen_yt_timeurl("11m36s", "wgQ3rHFTM4E")),
                    new topicdata("Use case by Hootsuite", "12m39s", gen_yt_timeurl("12m39s", "wgQ3rHFTM4E")),

            };
            return data;


        } else if (Objects.equals(cardname, "1161")) {
            data = new topicdata[]{
                    new topicdata("Intro", "0m00s", gen_yt_timeurl("0m00s", "l5k1ai_GBDE")),
                    new topicdata("What is Terraform? What is infrastructure provisioning?", "0m30s", gen_yt_timeurl("0m30s", "l5k1ai_GBDE")),
                    new topicdata("Terraform vs Ansible", "03m22s", gen_yt_timeurl("03m22s", "l5k1ai_GBDE")),
                    new topicdata("What is Terraform used for? Terraform Use Cases", "06m07s", gen_yt_timeurl("06m07s", "l5k1ai_GBDE")),
                    new topicdata("How does Terraform work? Terraform Architecture", "08m18s", gen_yt_timeurl("08m18s", "l5k1ai_GBDE")),
                    new topicdata("Terraform Example Configuration File", "12m01s", gen_yt_timeurl("12m01s", "l5k1ai_GBDE")),
                    new topicdata("Declarative vs Imperative", "12m47s", gen_yt_timeurl("12m47s", "l5k1ai_GBDE")),
                    new topicdata("Terraform Basic Commands", "15m23s", gen_yt_timeurl("15m23s", "l5k1ai_GBDE")),

            };
            return data;


        } else {
            NotFound = new topicdata[]{
                    new topicdata("NotFound", "NotFound", "NotFound"),
            };
            return null;
        }
    }
/*else if (Objects.equals(cardname,"")) {
            data = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "XQzEo1qag4A")),

            };
            return data;


        }*/

    @NonNull
    @Contract(pure = true)
    private String gen_yt_timeurl(String time, String videoid) {
        String imageurl = "https://youtu.be/";
        return imageurl + videoid + time;
    }

}
