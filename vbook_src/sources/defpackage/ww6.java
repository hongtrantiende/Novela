package defpackage;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ww6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ww6 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ ww6(nz6 nz6Var) {
        this.a = 4;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        te5 te5Var;
        String h;
        int i;
        int i2;
        Integer num;
        long j;
        Object[] objArr;
        Object[] objArr2;
        String str;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        boolean z2 = true;
        switch (i3) {
            case 0:
                ((te5) obj).getClass();
                return Boolean.valueOf(!af3.b(te5Var.d()));
            case 1:
                l8a l8aVar = (l8a) obj;
                l8aVar.getClass();
                f32.a.getClass();
                j8a.f(l8aVar, b32.c);
                return pvcVar;
            case 2:
                l8a l8aVar2 = (l8a) obj;
                l8aVar2.getClass();
                f32.a.getClass();
                j8a.f(l8aVar2, b32.b);
                return pvcVar;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf((((CharSequence) entry.getKey()).length() == 0 || ((String) entry.getKey()).charAt(0) == '#') ? true : true);
            case 4:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new yk8(r4b.N((String) entry2.getKey(), false, "{0}", "¿"), entry2.getValue());
            case 5:
                ((Long) obj).getClass();
                return pvcVar;
            case 6:
                return e97.l((Member) obj);
            case 7:
                obj.getClass();
                if (obj instanceof ff1) {
                    return Long.valueOf(((ff1) obj).a.b());
                }
                if (obj instanceof wb3) {
                    return Long.valueOf(((wb3) obj).a);
                }
                return 0;
            case 8:
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                ri6.y(ri6Var, null, gwe.b, 3);
                ri6.y(ri6Var, null, gwe.d, 3);
                ri6.y(ri6Var, null, gwe.f, 3);
                ri6.y(ri6Var, null, gwe.h, 3);
                ri6.y(ri6Var, null, gwe.j, 3);
                return pvcVar;
            case 9:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                String str2 = (String) ((Map) hr9.o.getValue()).get(b27Var.c());
                if (str2 == null) {
                    return b27Var.c();
                }
                return str2;
            case 10:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                String str3 = (String) ((z17) b27Var2.a()).get(1);
                if (!c16.i(str3, "\"") && !c16.i(str3, "”") && str3.length() <= 1) {
                    return " phẩy ";
                }
                return " phẩy phẩy ";
            case 11:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                String str4 = (String) ((z17) b27Var3.a()).get(1);
                String str5 = (String) ((z17) b27Var3.a()).get(2);
                if (k4b.B0(str5, '-')) {
                    h = s21.m("trừ ", vte.h(str5.substring(1)));
                } else {
                    h = vte.h(r4b.N(str5, false, "+", ""));
                }
                String lowerCase = str4.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str6 = (String) hr9.b.get(lowerCase);
                if (str6 == null) {
                    String str7 = (String) hr9.c.get(lowerCase);
                    if (str7 != null) {
                        str4 = str7;
                    }
                } else {
                    str4 = str6;
                }
                return hl5.o(" ", str4, " mũ ", h, " ");
            case 12:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                String str8 = (String) ((z17) b27Var4.a()).get(1);
                Map map = hr9.a;
                String lowerCase2 = ((String) ((z17) b27Var4.a()).get(3)).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                String str9 = (String) map.get(lowerCase2);
                if (str9 != null) {
                    return rs8.l(str8, " ", str9, " ");
                }
                return b27Var4.c();
            case 13:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                String lowerCase3 = ((String) ((z17) b27Var5.a()).get(1)).toLowerCase(Locale.ROOT);
                lowerCase3.getClass();
                String str10 = (String) hr9.f.get(lowerCase3);
                if (str10 == null || str10.length() == 0) {
                    str10 = (String) ((z17) b27Var5.a()).get(1);
                }
                return hl5.n(" chấm ", str10, " ");
            case 14:
                b27 b27Var6 = (b27) obj;
                b27Var6.getClass();
                String c = b27Var6.c();
                if (c.length() == 0) {
                    return "";
                }
                String upperCase = c.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = upperCase.length();
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    Map map2 = hr9.h;
                    Integer num2 = (Integer) map2.get(Character.valueOf(upperCase.charAt(i4)));
                    if (num2 != null) {
                        i = num2.intValue();
                    } else {
                        i = 0;
                    }
                    i4++;
                    if (i4 < upperCase.length() && (num = (Integer) map2.get(Character.valueOf(upperCase.charAt(i4)))) != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    if (i < i2) {
                        i5 -= i;
                    } else {
                        i5 += i;
                    }
                }
                if (i5 == 0) {
                    return c;
                }
                return hl5.n(" ", vte.h(String.valueOf(i5)), " ");
            case 15:
                b27 b27Var7 = (b27) obj;
                b27Var7.getClass();
                String lowerCase4 = ((String) ((z17) b27Var7.a()).get(1)).toLowerCase(Locale.ROOT);
                lowerCase4.getClass();
                String str11 = (String) ((z17) b27Var7.a()).get(2);
                String str12 = (String) hr9.a.get(lowerCase4);
                if (str12 != null) {
                    return eub.o(str12, " ", vte.h(str11));
                }
                return b27Var7.c();
            case 16:
                b27 b27Var8 = (b27) obj;
                b27Var8.getClass();
                List<String> z0 = k4b.z0((CharSequence) ((z17) b27Var8.a()).get(1), new String[]{"."});
                ArrayList arrayList = new ArrayList(tl1.s(z0, 10));
                for (String str13 : z0) {
                    ArrayList arrayList2 = new ArrayList(str13.length());
                    for (int i6 = 0; i6 < str13.length(); i6++) {
                        arrayList2.add(vte.j(String.valueOf(str13.charAt(i6))));
                    }
                    arrayList.add(sl1.i0(arrayList2, " ", null, null, null, 62));
                }
                return sl1.i0(arrayList, " chấm ", null, null, null, 62);
            case 17:
                b27 b27Var9 = (b27) obj;
                b27Var9.getClass();
                String str14 = (String) ((z17) b27Var9.a()).get(1);
                String str15 = (String) ((z17) b27Var9.a()).get(2);
                Long U = r4b.U(str14);
                if (U != null) {
                    j = U.longValue();
                } else {
                    j = 0;
                }
                if (j < 1000 && !k4b.W(str15, '.')) {
                    return hl5.o(" ", str14, " trên ", str15, " ");
                }
                return eub.o(str14, ", ", str15);
            case 18:
                String str16 = (String) obj;
                str16.getClass();
                String quote = Pattern.quote(str16);
                quote.getClass();
                return hl5.n("(?<![\\p{L}\\p{N}_])", quote, "(?![\\p{L}\\p{N}_])");
            case 19:
                b27 b27Var10 = (b27) obj;
                b27Var10.getClass();
                String str17 = (String) ((z17) b27Var10.a()).get(1);
                String lowerCase5 = str17.toLowerCase(Locale.ROOT);
                lowerCase5.getClass();
                String str18 = (String) ((z17) b27Var10.a()).get(2);
                String str19 = (String) hr9.a.get(lowerCase5);
                if (str19 != null) {
                    if (Character.isUpperCase(str17.charAt(0)) && c16.i(str18, ".")) {
                        return hl5.n(" ", str19, " ");
                    }
                    return eub.p(" ", str19, str18, " ");
                }
                return b27Var10.c();
            case 20:
                b27 b27Var11 = (b27) obj;
                b27Var11.getClass();
                String c2 = b27Var11.c();
                for (int i7 = 0; i7 < c2.length(); i7++) {
                    char charAt = c2.charAt(i7);
                    if ('0' > charAt || charAt >= ':') {
                        if (hr9.m.contains(c2)) {
                            String lowerCase6 = c2.toLowerCase(Locale.ROOT);
                            lowerCase6.getClass();
                            return hr9.a(lowerCase6);
                        } else {
                            int i8 = 0;
                            while (true) {
                                if (i8 < c2.length()) {
                                    char charAt2 = c2.charAt(i8);
                                    if (charAt2 > 127 && Character.isLetter(charAt2)) {
                                        objArr = 1;
                                    } else {
                                        i8++;
                                    }
                                } else {
                                    objArr = null;
                                }
                            }
                            int i9 = 0;
                            while (true) {
                                if (i9 < c2.length()) {
                                    if (Character.isLowerCase(c2.charAt(i9))) {
                                        for (int i10 = 0; i10 < c2.length(); i10++) {
                                            if (Character.isUpperCase(c2.charAt(i10))) {
                                                objArr2 = 1;
                                            }
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            objArr2 = null;
                            int i11 = 0;
                            while (true) {
                                if (i11 < c2.length()) {
                                    char charAt3 = c2.charAt(i11);
                                    if (8320 > charAt3 || charAt3 >= 8330) {
                                        i11++;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (objArr == null && objArr2 == null && !z2) {
                                for (int i12 = 0; i12 < c2.length(); i12++) {
                                    char charAt4 = c2.charAt(i12);
                                    if (('0' <= charAt4 && charAt4 < ':') || (8320 <= charAt4 && charAt4 < 8330)) {
                                        ArrayList arrayList3 = new ArrayList(c2.length());
                                        for (int i13 = 0; i13 < c2.length(); i13++) {
                                            char charAt5 = c2.charAt(i13);
                                            if ('0' <= charAt5 && charAt5 < ':') {
                                                str = vte.j(String.valueOf(charAt5));
                                            } else {
                                                Map map3 = hr9.l;
                                                if (map3.get(Character.valueOf(charAt5)) != null) {
                                                    Object obj2 = map3.get(Character.valueOf(charAt5));
                                                    obj2.getClass();
                                                    str = k4b.N0((String) obj2).toString();
                                                } else {
                                                    String str20 = (String) hr9.a.get(String.valueOf(Character.toLowerCase(charAt5)));
                                                    if (str20 == null) {
                                                        str = String.valueOf(charAt5);
                                                    } else {
                                                        str = str20;
                                                    }
                                                }
                                            }
                                            arrayList3.add(str);
                                        }
                                        return sl1.i0(arrayList3, " ", null, null, null, 62);
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                int length2 = c2.length();
                                for (int i14 = 0; i14 < length2; i14++) {
                                    char charAt6 = c2.charAt(i14);
                                    if (Character.isLetterOrDigit(charAt6)) {
                                        sb.append(charAt6);
                                    }
                                }
                                String sb2 = sb.toString();
                                ArrayList arrayList4 = new ArrayList(sb2.length());
                                for (int i15 = 0; i15 < sb2.length(); i15++) {
                                    arrayList4.add(String.valueOf(Character.toLowerCase(sb2.charAt(i15))));
                                }
                                String i0 = sl1.i0(arrayList4, " ", null, null, null, 62);
                                if (i0.length() > 0) {
                                    return hr9.a(i0);
                                }
                                return c2;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            int length3 = c2.length();
                            for (int i16 = 0; i16 < length3; i16++) {
                                char charAt7 = c2.charAt(i16);
                                String valueOf = String.valueOf(Character.toLowerCase(charAt7));
                                if ('0' <= charAt7 && charAt7 < ':') {
                                    arrayList5.add(vte.j(String.valueOf(charAt7)));
                                } else {
                                    Map map4 = hr9.a;
                                    if (map4.get(valueOf) != null) {
                                        Object obj3 = map4.get(valueOf);
                                        obj3.getClass();
                                        arrayList5.add(obj3);
                                    } else {
                                        Map map5 = hr9.l;
                                        if (map5.get(Character.valueOf(charAt7)) != null) {
                                            Object obj4 = map5.get(Character.valueOf(charAt7));
                                            obj4.getClass();
                                            arrayList5.add(k4b.N0((String) obj4).toString());
                                        } else if (Character.isLetter(charAt7)) {
                                            arrayList5.add(valueOf);
                                        }
                                    }
                                }
                            }
                            return sl1.i0(arrayList5, " ", null, null, null, 62);
                        }
                    }
                }
                return c2;
            case 21:
                b27 b27Var12 = (b27) obj;
                b27Var12.getClass();
                String lowerCase7 = ((String) ((z17) b27Var12.a()).get(1)).toLowerCase(Locale.ROOT);
                lowerCase7.getClass();
                char charAt8 = lowerCase7.charAt(0);
                if ('0' <= charAt8 && charAt8 < ':') {
                    lowerCase7 = vte.j(lowerCase7);
                } else {
                    String str21 = (String) hr9.a.get(lowerCase7);
                    if (str21 != null) {
                        lowerCase7 = str21;
                    }
                }
                return lowerCase7.concat(" phẩy");
            case 22:
                vl6 vl6Var = (vl6) obj;
                vl6Var.getClass();
                return vl6Var.a;
            case 23:
                return hl5.h(6, (Integer) obj);
            case 24:
                return hl5.h(6, (Integer) obj);
            case 25:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 26:
                sl5 sl5Var = (sl5) obj;
                sl5Var.getClass();
                return sl5Var.a;
            case 27:
                mq5 mq5Var = (mq5) obj;
                mq5Var.getClass();
                return mq5Var.a;
            case 28:
                return hl5.h(6, (Integer) obj);
            default:
                f76 f76Var = (f76) obj;
                f76Var.getClass();
                return f76Var.b();
        }
    }

    public /* synthetic */ ww6(int i) {
        this.a = i;
    }
}
