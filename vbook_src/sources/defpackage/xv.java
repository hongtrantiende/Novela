package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv  reason: default package */
/* loaded from: classes.dex */
public abstract class xv {
    public static pv6 a;
    public static final a00 b;
    public static final Object c;

    static {
        new ArrayDeque();
        a = null;
        b = new a00(0);
        c = new Object();
    }

    public static void a() {
        a00 a00Var = b;
        a00Var.getClass();
        uz uzVar = new uz(a00Var);
        while (uzVar.hasNext()) {
            if (((WeakReference) uzVar.next()).get() != null) {
                vm1.h();
                return;
            }
        }
    }
}
