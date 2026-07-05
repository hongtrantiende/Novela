package defpackage;

import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mxd  reason: default package */
/* loaded from: classes.dex */
public abstract class mxd {
    public static final nxd a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [nxd] */
    static {
        txd txdVar;
        try {
            txdVar = uxd.a;
        } catch (NoClassDefFoundError unused) {
            txdVar = null;
        }
        if (txdVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = nxd.a[i];
                try {
                    txdVar = (nxd) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        a = txdVar;
    }
}
