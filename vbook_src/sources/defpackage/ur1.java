package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ur1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ur1 implements ckb {
    public final /* synthetic */ int a;

    public /* synthetic */ ur1(int i) {
        this.a = i;
    }

    @Override // defpackage.ckb
    public final bkb b(o40 o40Var, Map map, ArrayList arrayList) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Integer num;
        Integer num2;
        Integer num3;
        int i = this.a;
        Integer num4 = null;
        bkb bkbVar = akb.a;
        int i2 = 0;
        switch (i) {
            case 0:
                map.getClass();
                String str = (String) map.get("src");
                if (str != null && !k4b.j0(str)) {
                    return new zjb("￼", tl1.A(new iyb(0, 1, new mva(str))));
                }
                return bkbVar;
            case 1:
                map.getClass();
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        gc5 gc5Var = (gc5) obj;
                        if (gc5Var instanceof ec5) {
                            ec5 ec5Var = (ec5) gc5Var;
                            if (c16.i(ec5Var.a, "img") && (charSequence = (CharSequence) ec5Var.b.get("src")) != null && !k4b.j0(charSequence)) {
                                ArrayList arrayList2 = new ArrayList();
                                ArrayList arrayList3 = new ArrayList();
                                int size2 = arrayList.size();
                                while (i2 < size2) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    gc5 gc5Var2 = (gc5) obj2;
                                    if (gc5Var2 instanceof ec5) {
                                        ec5 ec5Var2 = (ec5) gc5Var2;
                                        Map map2 = ec5Var2.b;
                                        if (c16.i(ec5Var2.a, "img") && (charSequence2 = (CharSequence) map2.get("src")) != null && !k4b.j0(charSequence2)) {
                                            axe.t(arrayList3, o40Var, arrayList2);
                                            String str2 = (String) o17.p("src", map2);
                                            String str3 = (String) map2.get("width");
                                            if (str3 != null) {
                                                num = r4b.R(10, str3);
                                            } else {
                                                num = null;
                                            }
                                            String str4 = (String) map2.get("height");
                                            if (str4 != null) {
                                                num2 = r4b.R(10, str4);
                                            } else {
                                                num2 = null;
                                            }
                                            arrayList2.add(dxe.x(str2, num, num2));
                                        }
                                    }
                                    arrayList3.add(gc5Var2);
                                }
                                axe.t(arrayList3, o40Var, arrayList2);
                                if (!arrayList2.isEmpty()) {
                                    return new yjb(arrayList2);
                                }
                                return bkbVar;
                            }
                        }
                    }
                }
                qv5 d = o40Var.d(arrayList);
                return new xjb(axe.p(d.a, d.b));
            case 2:
                map.getClass();
                String str5 = (String) map.get("src");
                if (str5 != null && !k4b.j0(str5)) {
                    String str6 = (String) map.get("width");
                    if (str6 != null) {
                        num3 = r4b.R(10, str6);
                    } else {
                        num3 = null;
                    }
                    String str7 = (String) map.get("height");
                    if (str7 != null) {
                        num4 = r4b.R(10, str7);
                    }
                    bkbVar = new xjb(dxe.x(str5, num3, num4));
                }
                return bkbVar;
            case 3:
                map.getClass();
                sx2 sx2Var = sx2.a;
                return new yjb(sx2.c(o40Var, "ul", arrayList, 0));
            case 4:
                map.getClass();
                sx2 sx2Var2 = sx2.a;
                return new yjb(sx2.c(o40Var, "ol", arrayList, 0));
            default:
                map.getClass();
                return new xjb(new xl0(hre.q().toString(), bn0.a, bm0.a));
        }
    }
}
