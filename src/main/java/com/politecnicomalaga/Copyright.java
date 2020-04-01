package com.politecnicomalaga;

public class Copyright {
    private String copyright;

    public Copyright(){
        copyright = "Copyright (C) 1997 Isaias Vera - All Rights Reserved\n" +
                "You may use, distribute and modify this code under the\n" +
                "terms of the XYZ license, which unfortunately won't be\n" +
                "written for another century.\n" + "\n" +
                "You should have received a copy of the XYZ license with \n"+
                "this file. If not, please visit : https://www.instagram.com/_veraisaias";
    }

    public String getText(){
        return copyright;
    }
}