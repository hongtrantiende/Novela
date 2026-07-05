package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yr2  reason: default package */
/* loaded from: classes.dex */
public abstract class yr2 {
    public static final xy0 a = xpe.a(-2, 6, null);

    public static String a(String str, yk8... yk8VarArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("vbookapp://view?screen=".concat(str));
        for (yk8 yk8Var : yk8VarArr) {
            sb.append("&" + ((String) yk8Var.a) + "=" + ((String) yk8Var.b));
        }
        return sb.toString();
    }

    public static void b(kr2 kr2Var, lr2 lr2Var, String str) {
        str.getClass();
        kr2Var.getClass();
        lr2Var.getClass();
        try {
            a.j(new mr2(kr2Var, lr2Var, str));
        } catch (Throwable unused) {
        }
    }
}
