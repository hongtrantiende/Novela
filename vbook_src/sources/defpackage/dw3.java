package defpackage;

import android.util.Log;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dw3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dw3 implements xt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ dw3(int i) {
        this.a = i;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return k4b.N0(str).toString();
            case 1:
                b27 b27Var = (b27) obj;
                b27Var.getClass();
                return "_{" + ((z17) b27Var.a()).get(1) + "}";
            case 2:
                b27 b27Var2 = (b27) obj;
                b27Var2.getClass();
                return rs8.i(((z17) b27Var2.a()).get(1), "\\left");
            case 3:
                b27 b27Var3 = (b27) obj;
                b27Var3.getClass();
                return rs8.i(((z17) b27Var3.a()).get(1), "\\right");
            case 4:
                b27 b27Var4 = (b27) obj;
                b27Var4.getClass();
                return hl5.n("\\begin{matrix} ", sl1.i0(k4b.z0((String) ((z17) b27Var4.a()).get(1), new String[]{"#"}), " & ", null, null, new dw3(7), 30), " \\end{matrix}");
            case 5:
                b27 b27Var5 = (b27) obj;
                b27Var5.getClass();
                return hl5.n("\\begin{cases} ", sl1.i0(k4b.z0((String) ((z17) b27Var5.a()).get(1), new String[]{"#"}), " \\\\ ", null, null, new dw3(0), 30), " \\end{cases}");
            case 6:
                b27 b27Var6 = (b27) obj;
                b27Var6.getClass();
                String str2 = (String) ((z17) b27Var6.a()).get(1);
                LinkedHashMap linkedHashMap = ew3.b;
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null) {
                    return str3;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str4 = (String) linkedHashMap.get(lowerCase);
                if (str4 != null || (str4 = (String) ew3.a.get(lowerCase)) != null) {
                    return str4;
                }
                return str2;
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                return k4b.N0(str5).toString();
            case 8:
                if (((sjc) obj).b.c == 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                if (((sjc) obj).b.c == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                ((j09) obj).getClass();
                return pvcVar;
            case 11:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 12:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 13:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 14:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 15:
                r14 r14Var = (r14) obj;
                r14Var.getClass();
                String str6 = r14Var.e;
                if (str6.length() == 0) {
                    return r14Var.a;
                }
                return str6;
            case 16:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 17:
                wq7 wq7Var = (wq7) obj;
                wq7Var.getClass();
                yr1 yr1Var = new yr1(24);
                x3b x3bVar = oaa.E;
                gi1 a = cm9.a(v84.class);
                l96 l96Var = l96.b;
                wq7Var.a(new yx5(new yj0(x3bVar, a, yr1Var, l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(p54.class), new yr1(25), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(m64.class), new yr1(26), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(n44.class), new yr1(27), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(i44.class), new yr1(28), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(o34.class), new yr1(29), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(rx5.class), new s54(0), l96Var)));
                wq7Var.a(new yx5(new yj0(x3bVar, cm9.a(tx5.class), new s54(1), l96Var)));
                return pvcVar;
            case 18:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 19:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 20:
                ((lg6) obj).getClass();
                return new i25(dpe.b(lg6.b));
            case 21:
                return a82.j(((Integer) obj).intValue(), "load_");
            case 22:
                u36 u36Var = (u36) obj;
                u36Var.getClass();
                z87.q(u36Var, "plugin");
                z87.q(u36Var, "src");
                return pvcVar;
            case 23:
                u36 u36Var2 = (u36) obj;
                u36Var2.getClass();
                z87.q(u36Var2, "plugin");
                z87.q(u36Var2, "src");
                z87.q(u36Var2, "input");
                return pvcVar;
            case 24:
                e56 e56Var = (e56) obj;
                e56Var.getClass();
                z87.y(e56Var, "type", "string");
                z87.y(e56Var, "description", "JSON { script, vararg } — the function to run and its args.");
                return pvcVar;
            case 25:
                qd2 qd2Var = (qd2) obj;
                qd2Var.getClass();
                return "[" + qd2Var + ']';
            case 26:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new pma(absolutePath);
            case 27:
                u82 u82Var = (u82) obj;
                u82Var.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", u82Var);
                return tn3.I;
            case 28:
                tj3 tj3Var = (tj3) obj;
                tj3Var.getClass();
                fm1.a(tj3Var);
                uaf.w(tj3Var, tj3Var.a * 4.0f);
                float f = tj3Var.a;
                rse.g(tj3Var, 12.0f * f, f * 32.0f, false, 12);
                return pvcVar;
            default:
                j8a.i((l8a) obj, 0);
                return pvcVar;
        }
    }
}
