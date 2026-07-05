package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe4  reason: default package */
/* loaded from: classes3.dex */
public abstract class pe4 implements Closeable {
    public static final m66 a;
    public static final hn8 b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [m66] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        a = r0;
        String str = hn8.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = fn8.d(property, false);
        ClassLoader classLoader = xq9.class.getClassLoader();
        classLoader.getClass();
        new xq9(classLoader);
    }

    public final void C(hn8 hn8Var) {
        hn8Var.getClass();
        rz rzVar = new rz();
        while (hn8Var != null && !j0(hn8Var)) {
            rzVar.addFirst(hn8Var);
            hn8Var = hn8Var.c();
        }
        Iterator<E> it = rzVar.iterator();
        while (it.hasNext()) {
            Q((hn8) it.next());
        }
    }

    public final void G(hn8 hn8Var) {
        hn8Var.getClass();
        C(hn8Var);
    }

    public abstract yd4 I0(hn8 hn8Var);

    public abstract x56 N0(hn8 hn8Var);

    public abstract void Q(hn8 hn8Var);

    public final void S(hn8 hn8Var) {
        hn8Var.getClass();
        V(hn8Var, false);
    }

    public abstract void V(hn8 hn8Var, boolean z);

    public abstract x56 V0(hn8 hn8Var);

    public final yma b1(hn8 hn8Var) {
        hn8Var.getClass();
        return g1(hn8Var, false);
    }

    public final void g0(hn8 hn8Var) {
        hn8Var.getClass();
        c9a O = h9a.O(new d(this, hn8Var, null, 0));
        while (O.hasNext()) {
            V((hn8) O.next(), false);
        }
    }

    public abstract yma g1(hn8 hn8Var, boolean z);

    public final boolean j0(hn8 hn8Var) {
        hn8Var.getClass();
        if (I0(hn8Var) != null) {
            return true;
        }
        return false;
    }

    public abstract osa k1(hn8 hn8Var);

    public abstract List m0(hn8 hn8Var);

    public abstract yma o(hn8 hn8Var);

    public abstract List p0(hn8 hn8Var);

    public abstract void q(hn8 hn8Var, hn8 hn8Var2);

    public final yd4 y0(hn8 hn8Var) {
        hn8Var.getClass();
        yd4 I0 = I0(hn8Var);
        if (I0 != null) {
            return I0;
        }
        fb4.h(hn8Var, "no such file: ");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
