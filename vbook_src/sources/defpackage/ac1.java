package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac1  reason: default package */
/* loaded from: classes3.dex */
public abstract class ac1 {
    public static final k78 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        r01 r01Var;
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        if (z) {
            r01Var = new Object();
        } else {
            r01Var = new r01(4096, 1);
        }
        a = r01Var;
    }
}
