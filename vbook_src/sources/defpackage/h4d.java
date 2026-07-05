package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h4d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4d implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ h4d(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        gs gsVar;
        List list;
        String h;
        String str;
        String str2 = "";
        int i = 0;
        switch (this.a) {
            case 0:
                y78 y78Var = (y78) obj;
                return new gs(Float.intBitsToFloat((int) (y78Var.a >> 32)), Float.intBitsToFloat((int) (y78Var.a & 4294967295L)));
            case 1:
                float f = ((gs) obj).a;
                return new y78((Float.floatToRawIntBits(gsVar.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            case 2:
                long j = ((py5) obj).a;
                return new gs((int) (j >> 32), (int) (j & 4294967295L));
            case 3:
                gs gsVar2 = (gs) obj;
                return new py5((Math.round(gsVar2.b) & 4294967295L) | (Math.round(gsVar2.a) << 32));
            case 4:
                long j2 = ((zy5) obj).a;
                return new gs((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 5:
                gs gsVar3 = (gs) obj;
                int round = Math.round(gsVar3.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(gsVar3.b);
                if (round2 >= 0) {
                    i = round2;
                }
                return new zy5((round << 32) | (i & 4294967295L));
            case 6:
                rk9 rk9Var = (rk9) obj;
                return new is(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d);
            case 7:
                is isVar = (is) obj;
                return new rk9(isVar.a, isVar.b, isVar.c, isVar.d);
            case 8:
                return Float.valueOf(((fs) obj).a);
            case 9:
                Context context = (Context) obj;
                context.getClass();
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                return cacheDir;
            case 10:
                Context context2 = (Context) obj;
                context2.getClass();
                File cacheDir2 = context2.getCacheDir();
                cacheDir2.getClass();
                return cacheDir2;
            case 11:
                Context context3 = (Context) obj;
                context3.getClass();
                File dir = context3.getDir("korio", 0);
                dir.getClass();
                return dir;
            case 12:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                gm9 gm9Var = d78.a;
                return d78.c.i(b27Var.c(), " nhân ");
            case 13:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                return ((z17) b27Var2.a()).get(1) + " trừ " + ((z17) b27Var2.a()).get(2) + " =";
            case 14:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                return rs8.i(((z17) b27Var3.a()).get(1), "= âm ");
            case 15:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                return sl1.i0(k4b.y0(b27Var4.c(), new char[]{'-', 8211, 8212}, 0, 6), ", ", null, null, new h4d(20), 30);
            case 16:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                String c = b27Var5.c();
                Pattern compile = Pattern.compile("\\s+");
                compile.getClass();
                k4b.w0(0);
                Matcher matcher = compile.matcher(c);
                if (!matcher.find()) {
                    list = tl1.A(c.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    do {
                        arrayList.add(c.subSequence(i, matcher.start()).toString());
                        i = matcher.end();
                    } while (matcher.find());
                    arrayList.add(c.subSequence(i, c.length()).toString());
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                return sl1.i0(arrayList2, ", ", null, null, new h4d(23), 30);
            case 17:
                b27 b27Var6 = (b27) obj;
                b27Var6.getClass();
                return s21.q(nk2.y(" ", vte.j((String) ((z17) b27Var6.a()).get(1)), ", ", vte.j((String) ((z17) b27Var6.a()).get(2)), ", "), vte.j((String) ((z17) b27Var6.a()).get(3)), " ");
            case 18:
                b27 b27Var7 = (b27) obj;
                b27Var7.getClass();
                String str3 = (String) ((z17) b27Var7.a()).get(1);
                if (k4b.B0(str3, '-')) {
                    h = vte.h(str3.substring(1));
                    str = "mười mũ trừ ";
                } else {
                    h = vte.h(r4b.N(str3, false, "+", ""));
                    str = "mười mũ ";
                }
                return s21.m(str, h);
            case 19:
                b27 b27Var8 = (b27) obj;
                b27Var8.getClass();
                String c2 = b27Var8.c();
                if (!sc7.c.a(c2)) {
                    return n6d.A.i(c2, " ");
                }
                return c2;
            case 20:
                String str4 = (String) obj;
                str4.getClass();
                return vte.j(str4);
            case 21:
                String str5 = (String) obj;
                str5.getClass();
                return vte.i(str5);
            case 22:
                b27 b27Var9 = (b27) obj;
                b27Var9.getClass();
                String str6 = (String) ((z17) b27Var9.a()).get(1);
                String str7 = (String) ((z17) b27Var9.a()).get(3);
                String str8 = (String) ((z17) b27Var9.a()).get(4);
                if (((String) ((z17) b27Var9.a()).get(2)).length() > 0 && str7.length() == 0) {
                    return b27Var9.c();
                }
                if (Math.abs(r4b.N(r4b.N(str6, false, ",", ""), false, ".", "").length() - r4b.N(r4b.N(str8, false, ",", ""), false, ".", "").length()) <= 1) {
                    return hl5.o(" ", str6, " đến ", str8, " ");
                }
                return hl5.o(" ", str6, " ", str8, " ");
            case 23:
                String str9 = (String) obj;
                str9.getClass();
                return vte.j(str9);
            case 24:
                b27 b27Var10 = (b27) obj;
                b27Var10.getClass();
                String str10 = (String) ((z17) b27Var10.a()).get(2);
                if (((String) ((z17) b27Var10.a()).get(1)).length() > 0) {
                    str2 = "âm ";
                }
                return eub.p(" ", str2, vte.j(str10), " ");
            case 25:
                b27 b27Var11 = (b27) obj;
                b27Var11.getClass();
                return sl1.i0(k4b.z0((CharSequence) ((z17) b27Var11.a()).get(1), new String[]{","}), " phẩy ", null, null, new h4d(21), 30);
            case 26:
                b27 b27Var12 = (b27) obj;
                b27Var12.getClass();
                String h2 = vte.h(r4b.N((String) ((z17) b27Var12.a()).get(1), false, ".", ""));
                String Q0 = k4b.Q0((String) ((z17) b27Var12.a()).get(2), '0');
                if (Q0.length() != 0) {
                    h2 = eub.o(h2, " phẩy ", vte.i(Q0));
                }
                String str11 = (String) sl1.f0(3, b27Var12.a());
                if (str11 != null && str11.length() > 0) {
                    h2 = nk2.u(h2, " phần trăm");
                }
                return hl5.n(" ", h2, " ");
            case 27:
                b27 b27Var13 = (b27) obj;
                b27Var13.getClass();
                return r4b.N(b27Var13.c(), false, ".", "");
            case 28:
                b27 b27Var14 = (b27) obj;
                b27Var14.getClass();
                return ((z17) b27Var14.a()).get(1) + " chấm " + ((z17) b27Var14.a()).get(2);
            default:
                lbd lbdVar = (lbd) obj;
                lbdVar.getClass();
                return lbdVar.a;
        }
    }
}
