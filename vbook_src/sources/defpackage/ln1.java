package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ln1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln1 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ln1(int i) {
        this.a = i;
    }

    private final Object a(Object obj) {
        int i;
        String h;
        b27 b27Var = (b27) obj;
        b27Var.getClass();
        String str = (String) ((z17) b27Var.a()).get(3);
        Integer S = r4b.S((String) ((z17) b27Var.a()).get(1));
        int i2 = 0;
        if (S != null) {
            i = S.intValue();
        } else {
            i = 0;
        }
        Integer S2 = r4b.S(str);
        if (S2 != null) {
            i2 = S2.intValue();
        }
        if (1 <= i && i < 13 && i2 <= 2500) {
            if (i == 4) {
                h = "tư";
            } else {
                h = vte.h(String.valueOf(i));
            }
            return eub.p("tháng ", h, " năm ", vte.h(String.valueOf(i2)));
        }
        return b27Var.c();
    }

    private final Object b(Object obj) {
        b27 b27Var = (b27) obj;
        b27Var.getClass();
        int[] iArr = vi2.a;
        String h = vte.h(vi2.b((String) ((z17) b27Var.a()).get(1)));
        String h2 = vte.h(vi2.b((String) ((z17) b27Var.a()).get(3)));
        String h3 = vte.h(vi2.b((String) ((z17) b27Var.a()).get(5)));
        return h + " giờ " + h2 + " phút " + h3 + " giây";
    }

    private final Object e(Object obj) {
        String str;
        int i;
        String h;
        String str2;
        b27 b27Var = (b27) obj;
        int[] iArr = vi2.a;
        b27Var.getClass();
        String c = b27Var.c();
        boolean z = true;
        String str3 = (String) ((z17) b27Var.a()).get(1);
        String str4 = (String) ((z17) b27Var.a()).get(2);
        String str5 = (String) ((z17) b27Var.a()).get(3);
        String str6 = (String) sl1.f0(4, b27Var.a());
        if (str6 != null) {
            str = str6.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        Integer S = r4b.S(str3);
        int i2 = -1;
        if (S != null) {
            i = S.intValue();
        } else {
            i = -1;
        }
        Integer S2 = r4b.S(str5);
        if (S2 != null) {
            i2 = S2.intValue();
        }
        if (!c16.i(str4, ":") || str5.length() == 2 || str.length() != 0) {
            if (((!c16.i(str4, "H") && !c16.i(str4, "G") && !c16.i(str4, "g") && !c16.i(str4, "h")) || str.length() != 0 || str5.length() != 1) && i2 >= 0 && i2 < 60) {
                z = (!c16.i(str4, ":") || i < 24) ? false : false;
                if (z) {
                    h = vte.h(str3);
                } else {
                    h = vte.h(vi2.b(str3));
                }
                String h2 = vte.h(vi2.b(str5));
                String str7 = "phút";
                if (z) {
                    str2 = "phút";
                } else {
                    str2 = "giờ";
                }
                if (z) {
                    str7 = "giây";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(h);
                sb.append(" ");
                sb.append(str2);
                sb.append(" ");
                sb.append(h2);
                return s21.q(sb, " ", str7);
            }
            return c;
        }
        return c;
    }

    private final Object f(Object obj) {
        b27 b27Var = (b27) obj;
        b27Var.getClass();
        String h = vte.h((String) ((z17) b27Var.a()).get(1));
        Object obj2 = ((z17) b27Var.a()).get(2);
        return h + " giờ " + obj2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        double z;
        z12 z12Var;
        float floatValue;
        gi1 a;
        gi1 a2;
        gi1 a3;
        gi1 a4;
        int i;
        String h;
        String i0;
        int i2;
        String h2;
        int i3 = this.a;
        rm3 rm3Var = rm3.c;
        pvc pvcVar = pvc.a;
        int i4 = 0;
        switch (i3) {
            case 0:
                sm3 sm3Var = (sm3) obj;
                sm3Var.getClass();
                if (sm3Var.j != rm3Var || sm3Var.d <= 0.0d) {
                    return null;
                }
                return j55.l(1.5d);
            case 1:
                sm3 sm3Var2 = (sm3) obj;
                sm3Var2.getClass();
                return sm3Var2.h;
            case 2:
                sm3 sm3Var3 = (sm3) obj;
                sm3Var3.getClass();
                double d = 1.0d;
                if (sm3Var3.j == rm3Var) {
                    b4d b4dVar = sm3Var3.b;
                    if (b4dVar == b4d.b) {
                        d = 2.2d;
                    } else if (b4dVar == b4d.c) {
                        d = 1.7d;
                    } else if (b4dVar == b4d.e) {
                        if (sm3Var3.h.c.b()) {
                            if (sm3Var3.c) {
                                d = 3.0d;
                            } else {
                                d = 2.3d;
                            }
                        } else {
                            d = 1.6d;
                        }
                    }
                    return Double.valueOf(d);
                }
                return Double.valueOf(1.0d);
            case 3:
                mn1 mn1Var = hc2.d;
                sm3 sm3Var4 = (sm3) obj;
                sm3Var4.getClass();
                if (sm3Var4.j == rm3Var) {
                    if (sm3Var4.c) {
                        return mn1Var.w();
                    }
                    return mn1Var.x();
                }
                return mn1Var.H();
            case 4:
                sm3 sm3Var5 = (sm3) obj;
                sm3Var5.getClass();
                if (sm3Var5.j == rm3Var) {
                    return j55.l(3.0d);
                }
                return j55.l(4.5d);
            case 5:
                sm3 sm3Var6 = (sm3) obj;
                sm3Var6.getClass();
                return sm3Var6.g;
            case 6:
                sm3 sm3Var7 = (sm3) obj;
                sm3Var7.getClass();
                kfc kfcVar = sm3Var7.g;
                boolean z2 = sm3Var7.c;
                rm3 rm3Var2 = sm3Var7.j;
                b4d b4dVar2 = sm3Var7.b;
                b4d b4dVar3 = b4d.c;
                if (rm3Var2 == rm3.d) {
                    if (b4dVar2 == b4dVar3) {
                        z = j55.z(kfcVar, 0.0d, 90.0d);
                    } else {
                        z = j55.z(kfcVar, 0.0d, 100.0d);
                    }
                } else if (b4dVar2 == b4d.b) {
                    if (z2) {
                        z = j55.z(kfcVar, 0.0d, 93.0d);
                    } else {
                        z = j55.z(kfcVar, 0.0d, 96.0d);
                    }
                } else {
                    int i5 = 100;
                    if (b4dVar2 == b4dVar3) {
                        if (z2) {
                            i5 = 93;
                        }
                        z = j55.z(kfcVar, 0.0d, i5);
                    } else if (b4dVar2 == b4d.e) {
                        if (kfcVar.c.a()) {
                            i5 = 88;
                        } else if (z2) {
                            i5 = 93;
                        }
                        z = j55.z(kfcVar, 75.0d, i5);
                    } else if (z2) {
                        z = j55.z(kfcVar, 0.0d, 93.0d);
                    } else {
                        z = j55.z(kfcVar, 72.0d, 100.0d);
                    }
                }
                return Double.valueOf(z);
            case 7:
                ((String) obj).getClass();
                return pvcVar;
            case 8:
                wq7 wq7Var = (wq7) obj;
                wq7Var.getClass();
                yr1 yr1Var = new yr1(1);
                x3b x3bVar = oaa.E;
                gi1 a5 = cm9.a(sr0.class);
                l96 l96Var = l96.b;
                wq7Var.a(new yx5(new yj0(x3bVar, a5, yr1Var, l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(ma3.class), new yr1(2), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(shc.class), new yr1(3), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(bic.class), new yr1(4), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(zfa.class), new yr1(5), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(fq1.class), new c8(13, (byte) 0), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(np9.class), new yr1(6), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(ng1.class), new yr1(7), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(d0d.class), new yr1(8), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(ee1.class), new yr1(9), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(b8.class), new zu1(25), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(lb2.class), new zu1(26), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(v99.class), new zu1(27), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(as3.class), new zu1(28), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(zq3.class), new zu1(29), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(r59.class), new yr1(0), l96Var)));
                return pvcVar;
            case 9:
                hj1 hj1Var = (hj1) obj;
                hj1Var.getClass();
                b22 b22Var = (b22) hj1Var.b;
                p81 p81Var = b22Var.a;
                p81 p81Var2 = b22Var.b;
                a22 a22Var = b22Var.c;
                StringBuilder sb = new StringBuilder();
                Iterator it = ((o81) p81Var.values()).iterator();
                while (true) {
                    l81 l81Var = (l81) it;
                    if (l81Var.hasNext()) {
                        z12Var = (z12) l81Var.next();
                        if (sb.length() > 0) {
                            sb.append(',');
                        }
                        sb.append(z12Var.getName());
                        Float f = (Float) p81Var2.get(z12Var.getName());
                        if (f != null) {
                            floatValue = f.floatValue();
                            double d2 = floatValue;
                            if (0.0d <= d2 && d2 <= 1.0d) {
                                sb.append(";q=".concat(k4b.L0(5, String.valueOf(floatValue))));
                            }
                        }
                    } else {
                        hj1Var.a(zj1.E, new xd(a22Var, sb.toString(), (m42) null));
                        hj1Var.a(z8.a, new d22(a22Var, hj1Var, p81Var, null));
                        hj1Var.a(cne.E, new ol(a22Var, p81Var, (m42) null, 8));
                        return pvcVar;
                    }
                }
                throw new IllegalStateException(("Invalid quality value: " + floatValue + " for encoder: " + z12Var).toString());
            case 10:
                hj1 hj1Var2 = (hj1) obj;
                hj1Var2.getClass();
                l22 l22Var = (l22) hj1Var2.b;
                ArrayList arrayList = l22Var.b;
                Set set = l22Var.a;
                hj1Var2.a(cne.H, new n22(hj1Var2, null, arrayList, set));
                hj1Var2.a(r0f.O, new o22(hj1Var2, null, arrayList, set));
                return pvcVar;
            case 11:
                k22 k22Var = (k22) obj;
                k22Var.getClass();
                return k22Var.a.toString();
            case 12:
                vh8 vh8Var = (vh8) obj;
                vh8Var.getClass();
                return vh8Var.a;
            case 13:
                vh8 vh8Var2 = (vh8) obj;
                vh8Var2.getClass();
                return vh8Var2.a;
            case 14:
                wh8 wh8Var = (wh8) obj;
                wh8Var.getClass();
                return wh8Var.a;
            case 15:
                ((wh8) obj).getClass();
                return "page";
            case 16:
                b82 b82Var = (b82) obj;
                if (b82Var instanceof f82) {
                    return (f82) b82Var;
                }
                return null;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) entry.getKey());
                sb2.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb2.append(value);
                return sb2.toString();
            case 18:
                wq7 wq7Var2 = (wq7) obj;
                wq7Var2.getClass();
                ec7 ec7Var = new ec7(3);
                x3b x3bVar2 = oaa.E;
                gi1 a6 = cm9.a(wpc.class);
                l96 l96Var2 = l96.a;
                wq7Var2.a(new yx5(new yj0(x3bVar2, a6, ec7Var, l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(ih8.class), new ec7(4), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(lg3.class), new ec7(5), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(as0.class), new ec7(6), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(nlb.class), new ec7(7), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(p05.class), new ec7(8), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(gy7.class), new mx8(0), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(w05.class), new mx8(1), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(zf.class), new mx8(2), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(zk.class), new mx8(3), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(lf5.class), new ec7(1), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(re5.class), new ec7(2), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(ii2.class), new yr1(10), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(pb1.class), new zu1(22), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(i34.class), new zu1(23), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(p40.class), new zu1(24), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(ev.class), new zu1(12), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(p37.class), new zu1(13), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(npc.class), new zcb(12), l96Var2)));
                ima h3 = s21.h(new yj0(x3bVar2, cm9.a(ka.class), new zcb(13), l96Var2), wq7Var2);
                gi1 a7 = cm9.a(z9.class);
                yj0 yj0Var = h3.a;
                yj0Var.e.add(a7);
                nf9 nf9Var = yj0Var.a;
                StringBuilder sb3 = new StringBuilder();
                s21.v(a7, sb3, ':', "", ':');
                sb3.append(nf9Var);
                String sb4 = sb3.toString();
                LinkedHashMap linkedHashMap = wq7Var2.c;
                linkedHashMap.put(sb4, h3);
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(q63.class), new zcb(14), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(rc9.class), new zcb(15), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(jlc.class), new zcb(16), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(bnc.class), new zcb(17), l96Var2)));
                ima h4 = s21.h(new yj0(x3bVar2, cm9.a(be9.class), new zcb(18), l96Var2), wq7Var2);
                gi1 a8 = cm9.a(sc9.class);
                yj0 yj0Var2 = h4.a;
                yj0Var2.e.add(a8);
                nf9 nf9Var2 = yj0Var2.a;
                StringBuilder sb5 = new StringBuilder();
                s21.v(a8, sb5, ':', "", ':');
                sb5.append(nf9Var2);
                linkedHashMap.put(sb5.toString(), h4);
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(i94.class), new zcb(19), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(se9.class), new zcb(20), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(uz6.class), new tsa(20, (byte) 0), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(pc4.class), new pg2(8), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(xf3.class), new yr1(22), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(Context.class), new s54(22), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(ko5.class), new s54(23), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(io5.class), new s54(24), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(r36.class), new ec7(11), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(dx.class), new ec7(12), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(k0d.class), new ec7(13), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(xh9.class), new ec7(14), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(so5.class), new ec7(15), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(qwb.class), new ec7(16), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(s9d.class), new ec7(17), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(y1c.class), new ec7(18), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(lw0.class), new ec7(19), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(rw.class), new ec7(9), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(gdb.class), new ec7(10), l96Var2)));
                hu7.m(wq7Var2);
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(h1a.class), new pg2(21), l96Var2)));
                ima h5 = s21.h(new yj0(x3bVar2, cm9.a(gyb.class), new qp9(26), l96Var2), wq7Var2);
                gi1 a9 = cm9.a(fyb.class);
                yj0 yj0Var3 = h5.a;
                yj0Var3.e.add(a9);
                nf9 nf9Var3 = yj0Var3.a;
                StringBuilder sb6 = new StringBuilder();
                s21.v(a9, sb6, ':', "", ':');
                sb6.append(nf9Var3);
                linkedHashMap.put(sb6.toString(), h5);
                ima h6 = s21.h(new yj0(x3bVar2, cm9.a(gq5.class), new qp9(27), l96Var2), wq7Var2);
                gi1 a10 = cm9.a(fq5.class);
                yj0 yj0Var4 = h6.a;
                yj0Var4.e.add(a10);
                nf9 nf9Var4 = yj0Var4.a;
                StringBuilder sb7 = new StringBuilder();
                s21.v(a10, sb7, ':', "", ':');
                sb7.append(nf9Var4);
                linkedHashMap.put(sb7.toString(), h6);
                ima h7 = s21.h(new yj0(x3bVar2, cm9.a(yad.class), new qp9(28), l96Var2), wq7Var2);
                gi1 a11 = cm9.a(xad.class);
                yj0 yj0Var5 = h7.a;
                yj0Var5.e.add(a11);
                nf9 nf9Var5 = yj0Var5.a;
                StringBuilder sb8 = new StringBuilder();
                s21.v(a11, sb8, ':', "", ':');
                sb8.append(nf9Var5);
                linkedHashMap.put(sb8.toString(), h7);
                ima h8 = s21.h(new yj0(x3bVar2, cm9.a(i8b.class), new ec7(20), l96Var2), wq7Var2);
                gi1 a12 = cm9.a(f8b.class);
                yj0 yj0Var6 = h8.a;
                yj0Var6.e.add(a12);
                nf9 nf9Var6 = yj0Var6.a;
                StringBuilder sb9 = new StringBuilder();
                s21.v(a12, sb9, ':', "", ':');
                sb9.append(nf9Var6);
                linkedHashMap.put(sb9.toString(), h8);
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(yc4.class), new s54(25), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(pa8.class), new qp9(29), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(d3d.class), new zcb(0), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(s3d.class), new zcb(1), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(xcb.class), new zcb(2), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(m05.class), new zcb(3), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(d05.class), new zcb(4), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(l05.class), new zcb(5), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(ib4.class), new tsa(3, (byte) 0), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(zr0.class), new zcb(21), l96Var2)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(o84.class), new zcb(22), l96Var2)));
                zcb zcbVar = new zcb(7);
                gi1 a13 = cm9.a(llb.class);
                l96 l96Var3 = l96.b;
                wq7Var2.a(new yx5(new yj0(x3bVar2, a13, zcbVar, l96Var3)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(x44.class), new zcb(8), l96Var3)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(bz1.class), new zcb(9), l96Var3)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(k74.class), new zcb(10), l96Var3)));
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(cn6.class), new zcb(11), l96Var3)));
                yj0 yj0Var7 = new yj0(x3bVar2, cm9.a(z3a.class), new s54(26), l96Var3);
                yx5 yx5Var = new yx5(yj0Var7);
                wq7Var2.a(yx5Var);
                yj0Var7.e.add(cm9.a(u27.class));
                linkedHashMap.put(v66.a(a) + "::" + x3bVar2, yx5Var);
                yj0 yj0Var8 = new yj0(x3bVar2, cm9.a(ilb.class), new s54(27), l96Var3);
                yx5 yx5Var2 = new yx5(yj0Var8);
                wq7Var2.a(yx5Var2);
                yj0Var8.e.add(cm9.a(u27.class));
                linkedHashMap.put(v66.a(a2) + "::" + x3bVar2, yx5Var2);
                yj0 yj0Var9 = new yj0(x3bVar2, cm9.a(iz0.class), new s54(28), l96Var3);
                yx5 yx5Var3 = new yx5(yj0Var9);
                wq7Var2.a(yx5Var3);
                yj0Var9.e.add(cm9.a(u27.class));
                linkedHashMap.put(v66.a(a3) + "::" + x3bVar2, yx5Var3);
                yj0 yj0Var10 = new yj0(x3bVar2, cm9.a(qx5.class), new s54(29), l96Var3);
                yx5 yx5Var4 = new yx5(yj0Var10);
                wq7Var2.a(yx5Var4);
                yj0Var10.e.add(cm9.a(u27.class));
                linkedHashMap.put(v66.a(a4) + "::" + x3bVar2, yx5Var4);
                wq7Var2.a(new yx5(new yj0(x3bVar2, cm9.a(t27.class), new j35(13), l96Var3)));
                return pvcVar;
            case 19:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                x17 b = b27Var.c.b(1);
                if (b != null) {
                    return b.a + " T " + ((z17) b27Var.a()).get(2);
                }
                return ((z17) b27Var.a()).get(3) + " Z ";
            case 20:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                String str = (String) ((z17) b27Var2.a()).get(1);
                String str2 = (String) ((z17) b27Var2.a()).get(2);
                String str3 = (String) ((z17) b27Var2.a()).get(3);
                if (vi2.a(str3, str2)) {
                    Integer R = r4b.R(10, str2);
                    if (R != null) {
                        i = R.intValue();
                    } else {
                        i = 0;
                    }
                    if (i == 4) {
                        h = "tư";
                    } else {
                        h = vte.h(String.valueOf(i));
                    }
                    Integer R2 = r4b.R(10, str3);
                    if (R2 != null) {
                        i4 = R2.intValue();
                    }
                    String h9 = vte.h(String.valueOf(i4));
                    String h10 = vte.h(str);
                    StringBuilder y = nk2.y("ngày ", h9, " tháng ", h, " năm ");
                    y.append(h10);
                    return y.toString();
                }
                return b27Var2.c();
            case 21:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                String str4 = (String) ((z17) b27Var3.a()).get(1);
                String str5 = (String) ((z17) b27Var3.a()).get(2);
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (k4b.B0(lowerCase, 'q') && str4.length() <= 2) {
                    String substring = str4.substring(1);
                    i0 = "quý ";
                    if (substring.length() != 0) {
                        i0 = s21.m("quý ", vte.h(substring));
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int length = str4.length();
                    while (i4 < length) {
                        char charAt = str4.charAt(i4);
                        String valueOf = String.valueOf(Character.toLowerCase(charAt));
                        if ('0' <= charAt && charAt < ':') {
                            arrayList2.add(vte.h(String.valueOf(charAt)));
                        } else {
                            Map map = hr9.a;
                            if (map.get(valueOf) != null) {
                                Object obj2 = map.get(valueOf);
                                obj2.getClass();
                                arrayList2.add(obj2);
                            } else {
                                arrayList2.add(valueOf);
                            }
                        }
                        i4++;
                    }
                    i0 = sl1.i0(arrayList2, " ", null, null, null, 62);
                }
                return eub.o(k4b.N0(i0).toString(), " ", vte.i(str5));
            case 22:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                String str6 = (String) ((z17) b27Var4.a()).get(1);
                String str7 = (String) ((z17) b27Var4.a()).get(3);
                String str8 = (String) ((z17) b27Var4.a()).get(5);
                if (vi2.a(str6, str7)) {
                    Integer R3 = r4b.R(10, str7);
                    if (R3 != null) {
                        i2 = R3.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 4) {
                        h2 = "tư";
                    } else {
                        h2 = vte.h(String.valueOf(i2));
                    }
                    Integer R4 = r4b.R(10, str6);
                    if (R4 != null) {
                        i4 = R4.intValue();
                    }
                    String h11 = vte.h(String.valueOf(i4));
                    String h12 = vte.h(str8);
                    StringBuilder y2 = nk2.y("ngày ", h11, " tháng ", h2, " năm ");
                    y2.append(h12);
                    return y2.toString();
                }
                return b27Var4.c();
            case 23:
                return a(obj);
            case 24:
                return b(obj);
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                return hl5.n("lúc ", vte.h((String) ((z17) b27Var5.a()).get(1)), " giờ");
            case 28:
                n89 n89Var = (n89) obj;
                n89Var.getClass();
                return n89Var.a;
            default:
                xt4 xt4Var = (xt4) obj;
                xt4Var.getClass();
                xt4Var.invoke("DbAiTtsModel");
                return pvcVar;
        }
    }
}
