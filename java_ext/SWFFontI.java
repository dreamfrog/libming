//
// Description:
//    SWFFont Interface
//
// Authors:
//    Jonathan Shore <jshore@e-shuppan.com>
//    Based on php wrapper developed by <dave@opaque.net>
//
// Copyright:
//    Copyright 2001 E-Publishing Group Inc.  Permission is granted to use or
//    modify this code provided that the original copyright notice is included.
//
//    This software is distributed with no warranty of liability, merchantability,
//    or fitness for a specific purpose.
//







//
//  SWFFont Interface
//	font specification & attributes
//
//  Notes
//    -	
//
public interface SWFFontI extends SWFObjectI {
    
    // public SWFont (String font);

    public float	getStringWidth (String string);
    public float	getAscent ();
    public float	getDescent ();
    public float	getLeading ();
};



    
