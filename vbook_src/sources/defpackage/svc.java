package defpackage;

import java.util.Locale;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: svc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class svc implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ svc(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        String h;
        int i = this.a;
        String str = "mét";
        pvc pvcVar = pvc.a;
        String str2 = "";
        switch (i) {
            case 0:
                String str3 = (String) obj;
                str3.getClass();
                if (str3.equals("M")) {
                    return "triệu";
                }
                if (str3.equals("m")) {
                    return "mét";
                }
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str4 = (String) ((Map) uvc.a.getValue()).get(lowerCase);
                if (str4 == null) {
                    return str3;
                }
                return str4;
            case 1:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                String str5 = (String) sl1.f0(1, b27Var.a());
                if (str5 != null) {
                    str2 = str5;
                }
                String a = uvc.a((String) ((z17) b27Var.a()).get(2));
                if (str2.length() > 0) {
                    return hl5.n(" âm ", a, " ");
                }
                return hl5.n(" ", a, " ");
            case 2:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                String c = b27Var2.c();
                boolean W = k4b.W(c, ',');
                boolean W2 = k4b.W(c, '.');
                int i2 = 0;
                for (int i3 = 0; i3 < c.length(); i3++) {
                    if (c.charAt(i3) == ',') {
                        i2++;
                    }
                }
                int f0 = k4b.f0(c, ',', 0, 6);
                int f02 = k4b.f0(c, '.', 0, 6);
                if (i2 <= 1 && (!W || !W2 || f0 >= f02)) {
                    if (W && W2) {
                        return r4b.N(r4b.N(c, false, ",", ""), false, ".", ",");
                    }
                    return c;
                } else if (W2) {
                    return r4b.N(r4b.N(c, false, ",", ""), false, ".", ",");
                } else {
                    return r4b.N(c, false, ",", "");
                }
            case 3:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                String str6 = (String) ((z17) b27Var3.a()).get(1);
                String str7 = (String) ((z17) b27Var3.a()).get(2);
                String str8 = (String) sl1.f0(3, b27Var3.a());
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = (String) hr9.g.get(str6);
                if (str9 != null) {
                    str2 = str9;
                }
                return k4b.N0(r4b.N(uvc.a(str7) + " " + str8 + " " + str2, false, "  ", " ")).toString();
            case 4:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                String str10 = (String) ((z17) b27Var4.a()).get(1);
                String str11 = (String) sl1.f0(2, b27Var4.a());
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = (String) hr9.g.get((String) ((z17) b27Var4.a()).get(3));
                if (str12 != null) {
                    str2 = str12;
                }
                return k4b.N0(r4b.N(uvc.a(str10) + " " + str11 + " " + str2, false, "  ", " ")).toString();
            case 5:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                mfb mfbVar = uvc.a;
                return nk2.u(uvc.a((String) ((z17) b27Var5.a()).get(1)), " phần trăm");
            case 6:
                b27 b27Var6 = (b27) obj;
                mfb mfbVar2 = uvc.a;
                b27Var6.getClass();
                String str13 = (String) ((z17) b27Var6.a()).get(1);
                String str14 = (String) sl1.f0(2, b27Var6.a());
                if (str14 != null) {
                    str2 = str14;
                }
                String str15 = (String) ((z17) b27Var6.a()).get(3);
                if (c16.i(str15, "G")) {
                    return b27Var6.c();
                }
                if (c16.i(str15, "M")) {
                    str = "triệu";
                } else if (!c16.i(str15, "m")) {
                    String lowerCase2 = str15.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str = (String) ((Map) uvc.a.getValue()).get(lowerCase2);
                    if (str == null) {
                        str = str15;
                    }
                }
                return k4b.N0(r4b.N(uvc.a(str13) + " " + str2 + " " + str, false, "  ", " ")).toString();
            case 7:
                b27 b27Var7 = (b27) obj;
                b27Var7.getClass();
                String str16 = (String) ((z17) b27Var7.a()).get(1);
                String lowerCase3 = str16.toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                String str17 = (String) ((Map) uvc.a.getValue()).get(lowerCase3);
                if (str17 != null) {
                    str16 = str17;
                }
                return hl5.n(" ", str16, " ");
            case 8:
                b27 b27Var8 = (b27) obj;
                b27Var8.getClass();
                String a2 = uvc.a((String) ((z17) b27Var8.a()).get(1));
                String N = r4b.N((String) ((z17) b27Var8.a()).get(2), false, "+", "");
                if (k4b.B0(N, '-')) {
                    h = s21.m("trừ ", vte.h(N.substring(1)));
                } else {
                    h = vte.h(N);
                }
                return hl5.o(" ", a2, " nhân mười mũ ", h, " ");
            case 9:
                b27 b27Var9 = (b27) obj;
                mfb mfbVar3 = uvc.a;
                b27Var9.getClass();
                String str18 = (String) sl1.f0(1, b27Var9.a());
                if (str18 != null) {
                    str2 = str18;
                }
                String str19 = (String) ((z17) b27Var9.a()).get(2);
                String str20 = (String) ((z17) b27Var9.a()).get(3);
                svc svcVar = new svc(0);
                if (str2.length() == 0) {
                    Locale locale = Locale.ROOT;
                    String lowerCase4 = str19.toLowerCase(locale);
                    lowerCase4.getClass();
                    String lowerCase5 = str20.toLowerCase(locale);
                    lowerCase5.getClass();
                    mfb mfbVar4 = uvc.a;
                    boolean containsKey = ((Map) mfbVar4.getValue()).containsKey(lowerCase4);
                    boolean containsKey2 = ((Map) mfbVar4.getValue()).containsKey(lowerCase5);
                    if (str19.length() == 1 && str20.length() == 1 && (!containsKey || !containsKey2)) {
                        Map map = hr9.a;
                        String str21 = (String) map.get(lowerCase4);
                        if (str21 != null) {
                            str19 = str21;
                        }
                        String str22 = (String) map.get(lowerCase5);
                        if (str22 != null) {
                            str20 = str22;
                        }
                        return hl5.o(" ", str19, " trên ", str20, " ");
                    }
                    return " " + svcVar.invoke(str19) + " trên " + svcVar.invoke(str20) + " ";
                }
                return uvc.a(str2) + " " + svcVar.invoke(str19) + " trên " + svcVar.invoke(str20) + " ";
            case 10:
                l8a l8aVar = (l8a) obj;
                l8aVar.getClass();
                f32.a.getClass();
                j8a.f(l8aVar, b32.c);
                return pvcVar;
            case 11:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 12:
                g1d g1dVar = (g1d) obj;
                g1dVar.getClass();
                fbe.w(g1dVar, ':');
                g1d.k(g1dVar);
                return pvcVar;
            case 13:
                g1d g1dVar2 = (g1d) obj;
                g1dVar2.getClass();
                g1d.k(g1dVar2);
                return pvcVar;
            case 14:
                g1d g1dVar3 = (g1d) obj;
                g1dVar3.getClass();
                g1dVar3.b().a(new f02("z"));
                return pvcVar;
            case 15:
                g1d g1dVar4 = (g1d) obj;
                g1dVar4.getClass();
                fbe.F(g1dVar4, "Z", new svc(18));
                return pvcVar;
            case 16:
                g1d g1dVar5 = (g1d) obj;
                g1dVar5.getClass();
                g1dVar5.b().a(new f02("z"));
                return pvcVar;
            case 17:
                g1d g1dVar6 = (g1d) obj;
                g1dVar6.getClass();
                fbe.F(g1dVar6, "Z", new svc(19));
                return pvcVar;
            case 18:
                g1d g1dVar7 = (g1d) obj;
                g1dVar7.getClass();
                g1d.i(g1dVar7);
                fbe.w(g1dVar7, ':');
                g1d.j(g1dVar7);
                fbe.F(g1dVar7, "", new svc(12));
                return pvcVar;
            case 19:
                g1d g1dVar8 = (g1d) obj;
                g1dVar8.getClass();
                g1d.i(g1dVar8);
                fbe.F(g1dVar8, "", new svc(20));
                return pvcVar;
            case 20:
                g1d g1dVar9 = (g1d) obj;
                g1dVar9.getClass();
                g1d.j(g1dVar9);
                fbe.F(g1dVar9, "", new svc(13));
                return pvcVar;
            case 21:
                return new fs(((Float) obj).floatValue());
            case 22:
                return new fs(((Integer) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((fs) obj).a);
            case 24:
                return new fs(((rg3) obj).a);
            case 25:
                return new rg3(((fs) obj).a);
            case 26:
                tg3 tg3Var = (tg3) obj;
                return new gs(tg3.a(tg3Var.a), tg3.b(tg3Var.a));
            case 27:
                gs gsVar = (gs) obj;
                return new tg3((Float.floatToRawIntBits(gsVar.a) << 32) | (Float.floatToRawIntBits(gsVar.b) & 4294967295L));
            case 28:
                dna dnaVar = (dna) obj;
                return new gs(Float.intBitsToFloat((int) (dnaVar.a >> 32)), Float.intBitsToFloat((int) (dnaVar.a & 4294967295L)));
            default:
                gs gsVar2 = (gs) obj;
                return new dna((Float.floatToRawIntBits(gsVar2.a) << 32) | (Float.floatToRawIntBits(gsVar2.b) & 4294967295L));
        }
    }
}
