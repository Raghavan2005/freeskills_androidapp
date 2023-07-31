/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 12/07/23, 9:30 pm
 *    funwithmetamil@gmail.com
 *     Last modified 11/07/23, 10:59 pm
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


        } else {
            NotFound = new topicdata[]{
                    new topicdata("NotFound", "NotFound", "NotFound"),
            };
            return NotFound;
        }
    }
/*else if (Objects.equals(cardname,"HTML")) {
        data = new topicdata[]{
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),};
        return data;


    }*/

    @NonNull
    @Contract(pure = true)
    private String gen_yt_timeurl(String time, String videoid) {
        String imageurl = "https://youtu.be/";
        return imageurl + videoid + time;
    }

}
