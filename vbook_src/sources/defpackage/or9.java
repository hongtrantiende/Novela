package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: or9  reason: default package */
/* loaded from: classes3.dex */
public final class or9<T> {
    public static final nr9 Companion = new Object();
    public static final n09 c;
    public final int a;
    public final Object b;

    /* JADX WARN: Type inference failed for: r0v0, types: [nr9, java.lang.Object] */
    static {
        n09 n09Var = new n09("com.reader.data.community.api.Response", null, 2);
        n09Var.k("code", true);
        n09Var.k("data", false);
        c = n09Var;
    }

    public /* synthetic */ or9(int i, Object obj, int i2) {
        if (2 == (i & 2)) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            this.b = obj;
            return;
        }
        w92.x(i, 2, c);
        throw null;
    }
}
