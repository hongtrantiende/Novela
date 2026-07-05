package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ekb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ekb implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ekb(int i) {
        this.a = i;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i;
        int i2;
        wjb wjbVar;
        switch (this.a) {
            case 0:
                String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "button", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "center", "template", "dir", "applet", "marquee", "listing", "#root"};
                String[] strArr2 = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb"};
                String[] strArr3 = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s", "button"};
                String[] strArr4 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
                String[] strArr5 = {"pre", "plaintext", "title", "textarea", "script"};
                String[] strArr6 = {"title", "textarea"};
                String[] strArr7 = {"iframe", "noembed", "noframes", "script", "style", "xmp"};
                String[] strArr8 = kue.d;
                String[] strArr9 = {"math"};
                String[] strArr10 = {"mi", "mo", "msup", "mn", "mtext"};
                String[] strArr11 = {"svg", "femerge", "femergenode"};
                String[] strArr12 = {"text"};
                String[] strArr13 = {"script"};
                fkb fkbVar = new fkb(null, null);
                int i3 = 0;
                while (true) {
                    String[] strArr14 = strArr;
                    if (i3 < 69) {
                        String str = strArr14[i3];
                        wjb b = fkbVar.b(str, "http://www.w3.org/1999/xhtml");
                        String[] strArr15 = strArr2;
                        if (b == null) {
                            wjbVar = new wjb(str, str, "http://www.w3.org/1999/xhtml");
                            wjbVar.d = 0;
                            wjbVar.e(1);
                            fkbVar.a(wjbVar);
                        } else {
                            wjbVar = b;
                        }
                        wjbVar.e(4);
                        i3++;
                        strArr = strArr14;
                        strArr2 = strArr15;
                    } else {
                        String[] strArr16 = strArr2;
                        for (int i4 = 0; i4 < 68; i4++) {
                            String str2 = strArr16[i4];
                            wjb b2 = fkbVar.b(str2, "http://www.w3.org/1999/xhtml");
                            if (b2 == null) {
                                b2 = new wjb(str2, str2, "http://www.w3.org/1999/xhtml");
                                b2.d = 0;
                                b2.e(1);
                                fkbVar.a(b2);
                            }
                            b2.e(0);
                        }
                        for (int i5 = 0; i5 < 20; i5++) {
                            String str3 = strArr3[i5];
                            wjb b3 = fkbVar.b(str3, "http://www.w3.org/1999/xhtml");
                            if (b3 == null) {
                                b3 = new wjb(str3, str3, "http://www.w3.org/1999/xhtml");
                                b3.d = 0;
                                b3.e(1);
                                fkbVar.a(b3);
                            }
                            b3.e(8);
                        }
                        for (int i6 = 0; i6 < 21; i6++) {
                            String str4 = strArr4[i6];
                            wjb b4 = fkbVar.b(str4, "http://www.w3.org/1999/xhtml");
                            if (b4 == null) {
                                b4 = new wjb(str4, str4, "http://www.w3.org/1999/xhtml");
                                b4.d = 0;
                                b4.e(1);
                                fkbVar.a(b4);
                            }
                            b4.e(2);
                        }
                        for (int i7 = 0; i7 < 5; i7++) {
                            String str5 = strArr5[i7];
                            wjb b5 = fkbVar.b(str5, "http://www.w3.org/1999/xhtml");
                            if (b5 == null) {
                                b5 = new wjb(str5, str5, "http://www.w3.org/1999/xhtml");
                                b5.d = 0;
                                b5.e(1);
                                fkbVar.a(b5);
                            }
                            b5.e(64);
                        }
                        for (int i8 = 0; i8 < 2; i8++) {
                            String str6 = strArr6[i8];
                            wjb b6 = fkbVar.b(str6, "http://www.w3.org/1999/xhtml");
                            if (b6 == null) {
                                b6 = new wjb(str6, str6, "http://www.w3.org/1999/xhtml");
                                b6.d = 0;
                                b6.e(1);
                                fkbVar.a(b6);
                            }
                            b6.e(Token.CASE);
                        }
                        for (int i9 = 0; i9 < 6; i9++) {
                            String str7 = strArr7[i9];
                            wjb b7 = fkbVar.b(str7, "http://www.w3.org/1999/xhtml");
                            if (b7 == null) {
                                b7 = new wjb(str7, str7, "http://www.w3.org/1999/xhtml");
                                b7.d = 0;
                                b7.e(1);
                                fkbVar.a(b7);
                            }
                            b7.e(256);
                        }
                        for (int i10 = 0; i10 < 5; i10++) {
                            String str8 = strArr8[i10];
                            wjb b8 = fkbVar.b(str8, "http://www.w3.org/1999/xhtml");
                            if (b8 == null) {
                                b8 = new wjb(str8, str8, "http://www.w3.org/1999/xhtml");
                                b8.d = 0;
                                b8.e(1);
                                fkbVar.a(b8);
                            }
                            b8.e(512);
                        }
                        String str9 = strArr9[0];
                        wjb b9 = fkbVar.b(str9, "http://www.w3.org/1998/Math/MathML");
                        if (b9 == null) {
                            b9 = new wjb(str9, str9, "http://www.w3.org/1998/Math/MathML");
                            b9.d = 0;
                            b9.e(1);
                            fkbVar.a(b9);
                        }
                        b9.e(4);
                        for (int i11 = 0; i11 < 5; i11++) {
                            String str10 = strArr10[i11];
                            wjb b10 = fkbVar.b(str10, "http://www.w3.org/1998/Math/MathML");
                            if (b10 == null) {
                                b10 = new wjb(str10, str10, "http://www.w3.org/1998/Math/MathML");
                                i2 = 0;
                                b10.d = 0;
                                b10.e(1);
                                fkbVar.a(b10);
                            } else {
                                i2 = 0;
                            }
                            b10.e(i2);
                        }
                        for (int i12 = 0; i12 < 3; i12++) {
                            String str11 = strArr11[i12];
                            wjb b11 = fkbVar.b(str11, "http://www.w3.org/2000/svg");
                            if (b11 == null) {
                                b11 = new wjb(str11, str11, "http://www.w3.org/2000/svg");
                                b11.d = 0;
                                b11.e(1);
                                fkbVar.a(b11);
                            }
                            b11.e(4);
                        }
                        String str12 = strArr12[0];
                        wjb b12 = fkbVar.b(str12, "http://www.w3.org/2000/svg");
                        if (b12 == null) {
                            b12 = new wjb(str12, str12, "http://www.w3.org/2000/svg");
                            b12.d = 0;
                            i = 1;
                            b12.e(1);
                            fkbVar.a(b12);
                        } else {
                            i = 1;
                        }
                        b12.e(0);
                        String str13 = strArr13[0];
                        wjb b13 = fkbVar.b(str13, "http://www.w3.org/2000/svg");
                        if (b13 == null) {
                            b13 = new wjb(str13, str13, "http://www.w3.org/2000/svg");
                            b13.d = 0;
                            b13.e(i);
                            fkbVar.a(b13);
                        }
                        b13.e(256);
                        return fkbVar;
                    }
                }
            case 1:
                return yae.z(new jub((String) null, 0L, 7));
            case 2:
                return yae.z(Boolean.FALSE);
            case 3:
                return yae.z(Boolean.FALSE);
            case 4:
                return yae.z(Boolean.FALSE);
            case 5:
                return yae.z(Boolean.FALSE);
            case 6:
                return yae.z(Boolean.FALSE);
            case 7:
                return yae.z(Boolean.FALSE);
            case 8:
                return yae.z(Boolean.FALSE);
            case 9:
                return yae.z(Boolean.FALSE);
            case 10:
                return yae.z(Boolean.FALSE);
            case 11:
                return yae.z(Boolean.FALSE);
            case 12:
                return yae.z(Boolean.FALSE);
            case 13:
                return yae.z(Boolean.FALSE);
            case 14:
                return yae.z(Boolean.FALSE);
            case 15:
                return yae.z(Boolean.FALSE);
            case 16:
                return yae.z(Boolean.FALSE);
            case 17:
                ly1 ly1Var = yob.a;
                return null;
            case 18:
                return yae.z(new jub("", 0L, 6));
            case 19:
                return yae.z(Boolean.FALSE);
            case 20:
                return Long.valueOf(wl3.e(u9c.a(wo3.a)));
            case 21:
                return yae.z(new jub("", 0L, 6));
            case 22:
                return yae.z(Boolean.FALSE);
            case 23:
                return htc.a;
            case 24:
                return new py5(0L);
            case 25:
                return new py5(0L);
            case 26:
                return yx2.a;
            case 27:
                return new Object();
            case 28:
                return yae.z(Float.valueOf((float) nae.e));
            default:
                return yae.z(Float.valueOf(0.6666667f));
        }
    }
}
