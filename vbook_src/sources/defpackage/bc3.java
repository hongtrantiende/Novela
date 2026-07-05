package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc3  reason: default package */
/* loaded from: classes.dex */
public final class bc3 {
    public final byte[] a;
    public final mfb b;

    public bc3(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
        this.b = new mfb(new t42(this, 8));
    }

    public final zb3 a() {
        Map map;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        String str6;
        boolean z;
        boolean z2;
        String e;
        boolean z3;
        String str7;
        boolean z4;
        List list2;
        String str8;
        String str9;
        String str10;
        rm8 rm8Var = (rm8) this.b.getValue();
        List<p94> list3 = rm8Var.h;
        yc3 yc3Var = rm8Var.e;
        zb3 zb3Var = null;
        if (list3 != null) {
            int k = p17.k(tl1.s(list3, 10));
            if (k < 16) {
                k = 16;
            }
            map = new LinkedHashMap(k);
            for (p94 p94Var : list3) {
                map.put(p94Var.a, p94Var.b);
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = ls3.a;
        }
        List list4 = rm8Var.c;
        if (yc3Var != null) {
            str = yc3Var.a;
        } else {
            str = null;
        }
        gm9 gm9Var = mjb.a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str11 = "";
            if (i < list4.size()) {
                zj5 zj5Var = (zj5) list4.get(i);
                ak5 ak5Var = zj5Var.a;
                tv5 tv5Var = zj5Var.f;
                String str12 = zj5Var.b;
                int ordinal = ak5Var.ordinal();
                if (ordinal != 0) {
                    boolean z5 = true;
                    if (ordinal != 1) {
                        int i2 = 2;
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        arrayList.add("<hr>");
                                    } else {
                                        xk5.o();
                                        return zb3Var;
                                    }
                                } else if (str12 != null) {
                                    arrayList.add("<img src=\"" + mjb.d(str12) + "\" alt=\"image\">");
                                }
                                list = list4;
                                str6 = str;
                            } else {
                                dr6 dr6Var = zj5Var.g;
                                dr6 dr6Var2 = dr6.a;
                                if (dr6Var == dr6Var2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    str7 = "ol";
                                } else {
                                    str7 = "ul";
                                }
                                ArrayList arrayList2 = new ArrayList();
                                while (i < list4.size() && ((zj5) list4.get(i)).a == ak5.d) {
                                    if (((zj5) list4.get(i)).g == dr6Var2) {
                                        z4 = z5;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4 != z3) {
                                        break;
                                    }
                                    String str13 = ((zj5) list4.get(i)).b;
                                    if (str13 == null) {
                                        str13 = "";
                                    }
                                    String e2 = mjb.e(str13);
                                    if (e2.length() > 0) {
                                        Iterable<zj5> iterable = ((zj5) list4.get(i)).h;
                                        if (iterable == null) {
                                            iterable = ks3.a;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (zj5 zj5Var2 : iterable) {
                                            List list5 = list4;
                                            String str14 = zj5Var2.b;
                                            if (str14 != null) {
                                                str10 = mjb.e(str14);
                                            } else {
                                                str10 = null;
                                            }
                                            if (str10 != null) {
                                                arrayList3.add(str10);
                                            }
                                            list4 = list5;
                                        }
                                        list2 = list4;
                                        ArrayList arrayList4 = new ArrayList();
                                        int size = arrayList3.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            String str15 = str;
                                            Object obj = arrayList3.get(i3);
                                            i3++;
                                            if (((String) obj).length() > 0) {
                                                arrayList4.add(obj);
                                            }
                                            str = str15;
                                        }
                                        str8 = str;
                                        if (arrayList4.isEmpty()) {
                                            str9 = "";
                                        } else {
                                            str9 = hl5.n("<ul>", sl1.i0(arrayList4, "", null, null, new dva(18), 30), "</ul>");
                                        }
                                        arrayList2.add("<li>" + mjb.d(e2) + str9 + "</li>");
                                    } else {
                                        list2 = list4;
                                        str8 = str;
                                    }
                                    i++;
                                    list4 = list2;
                                    str = str8;
                                    z5 = true;
                                }
                                list = list4;
                                str6 = str;
                                if (!arrayList2.isEmpty()) {
                                    StringBuilder y = nk2.y("<", str7, ">", sl1.i0(arrayList2, "", null, null, null, 62), "</");
                                    y.append(str7);
                                    y.append(">");
                                    arrayList.add(y.toString());
                                }
                                list4 = list;
                                str = str6;
                                zb3Var = null;
                            }
                        } else {
                            list = list4;
                            str6 = str;
                            Integer num = zj5Var.d;
                            if (num != null) {
                                i2 = num.intValue();
                            }
                            int min = Math.min(i2, 6);
                            if (str12 != null) {
                                str11 = str12;
                            }
                            String e3 = mjb.e(str11);
                            if (e3.length() > 0) {
                                StringBuilder r = s21.r("<h", min, ">", mjb.d(e3), "</h");
                                r.append(min);
                                r.append(">");
                                arrayList.add(r.toString());
                            }
                        }
                    } else {
                        list = list4;
                        str6 = str;
                        ck5 ck5Var = zj5Var.c;
                        if (ck5Var != null) {
                            String str16 = ck5Var.e;
                            if (str16 != null) {
                                String e4 = mjb.e(str16);
                                if (e4.length() > 0) {
                                    arrayList.add("<p><strong>" + mjb.d(e4) + "</strong></p>");
                                }
                            }
                            arrayList.add(mjb.f(ck5Var));
                        }
                    }
                } else {
                    list = list4;
                    str6 = str;
                    if (str12 != null) {
                        str11 = str12;
                    }
                    String e5 = mjb.e(str11);
                    if (e5.length() != 0) {
                        String d = mjb.d(e5);
                        if (tv5Var != null) {
                            z = c16.i(tv5Var.a, Boolean.TRUE);
                        } else {
                            z = false;
                        }
                        if (z) {
                            d = "<strong>" + ((Object) d) + "</strong>";
                        }
                        if (tv5Var != null) {
                            z2 = c16.i(tv5Var.b, Boolean.TRUE);
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            d = "<em>" + ((Object) d) + "</em>";
                        }
                        String str17 = zj5Var.i;
                        if (str17 != null && (e = l2d.e(str17)) != null) {
                            d = "<a href=\"" + mjb.d(e) + "\">" + ((Object) d) + "</a>";
                        }
                        String str18 = zj5Var.j;
                        if (str18 != null) {
                            d = ((Object) d) + " <sup>(" + mjb.d(mjb.e(str18)) + ")</sup>";
                        }
                        arrayList.add("<p>" + ((Object) d) + "</p>");
                    }
                }
                i++;
                list4 = list;
                str = str6;
                zb3Var = null;
            } else {
                String str19 = str;
                String i0 = sl1.i0(arrayList, "\n", null, null, null, 62);
                if (str19 == null) {
                    str2 = "";
                } else {
                    str2 = hl5.n("<title>", mjb.d(str19), "</title>");
                }
                String o = hl5.o("<!DOCTYPE html>\n<html>\n<head>\n<meta charset=\"utf-8\">\n", str2, "\n</head>\n<body>\n", i0, "\n</body>\n</html>");
                if (yc3Var != null) {
                    str3 = yc3Var.a;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (yc3Var != null && (str5 = yc3Var.b) != null) {
                    str11 = str5;
                } else {
                    if (yc3Var != null) {
                        str4 = yc3Var.c;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        str11 = str4;
                    }
                }
                return new zb3(o, str3, str11, map);
            }
        }
    }
}
