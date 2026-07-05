package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d17  reason: default package */
/* loaded from: classes.dex */
public final class d17 {
    public static a17 a(Object obj, Object obj2) {
        a17 a17Var = (a17) obj;
        a17 a17Var2 = (a17) obj2;
        if (!a17Var2.isEmpty()) {
            if (!a17Var.a) {
                a17Var = a17Var.b();
            }
            a17Var.a();
            if (!a17Var2.isEmpty()) {
                a17Var.putAll(a17Var2);
            }
        }
        return a17Var;
    }
}
