package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f28  reason: default package */
/* loaded from: classes.dex */
public final class f28 {
    public static f28 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public f28(Context context) {
        Executor s = eg0.s();
        this.a = s;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        s.execute(new ex2(17, this, context));
    }

    public static synchronized f28 a(Context context) {
        f28 f28Var;
        synchronized (f28.class) {
            try {
                if (f == null) {
                    f = new f28(context);
                }
                f28Var = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f28Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            e28 e28Var = (e28) it.next();
            if (e28Var.a.get() == null) {
                copyOnWriteArrayList.remove(e28Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    e28 e28Var2 = (e28) it2.next();
                    e28Var2.b.execute(new x0(e28Var2, 27));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
